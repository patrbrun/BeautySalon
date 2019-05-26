package com.grouptwo.saloon.api;


import com.grouptwo.saloon.dao.UserDao;
import com.grouptwo.saloon.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@Api(value = "saloon user")
public class UsersController {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @ApiOperation(value = "List of all appointments", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Appointment list retrieved successfully"),
            @ApiResponse(code = 401, message = "Authorization to view resource denied."),
            @ApiResponse(code = 403, message = "Access is forbidden"),
            @ApiResponse(code = 404, message = "Appointment absent")
    })

    @GetMapping("/list")
    public Iterable<User> getAllUser(Model model) {
        return userDao.listUser();
    }

    @ApiOperation(value = "Search User using ID", response = User.class)
    @GetMapping("/search/{userId}")
    public User searchAppointment(@PathVariable Integer userId, Model model) {
        return userDao.getUserById(userId);
    }

    @ApiOperation(value = "save user")
    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody User user, Model model) {
        userDao.save(user);
        return new ResponseEntity<>("User saved successful", HttpStatus.OK);
    }

    @ApiOperation(value = "Update user")
    @PutMapping(value = "/update/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable Integer userId, @RequestBody User user) {
        User userDetails = userDao.getUserById(userId);
        userDetails.setUserName(user.getUserName());
        userDetails.setEmail(user.getEmail());
        userDetails.setPassword(user.getPassword());
        userDetails.setPhoneNumber(user.getPhoneNumber());
        userDetails.setUserType(user.getUserType());
        return new ResponseEntity<>("user updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete user")
    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer userId, Model model) {
        userDao.deleteUser(userId);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }
}
