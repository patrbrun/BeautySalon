package com.grouptwo.saloon.api;

import com.grouptwo.saloon.dao.AppointmentDao;
import com.grouptwo.saloon.model.Appointment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("appointment")
@Api(value = "saloon appointment")
public class AppointmentController {
    private AppointmentDao appointmentDao;

    @Autowired
    public void setAppointmentDao(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }


    @ApiOperation(value = "List all appointments", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Appointment list retrieved successfully"),
            @ApiResponse(code = 401, message = "Authorization to view resource denied."),
            @ApiResponse(code = 403, message = "Access is forbidden"),
            @ApiResponse(code = 404, message = "Appointment absent")
    })

    @GetMapping("/list")
    public Iterable<Appointment> getAllAppointment(Model model) {
        return appointmentDao.listAppointments();
    }

    @ApiOperation(value = "Search Appointment using ID", response = Appointment.class)
    @GetMapping("/search/{appointmentId}")
    public Appointment searchAppointment(@PathVariable Integer appointmentId, Model model) {
        return appointmentDao.getAppointmentById(appointmentId);
    }

    @ApiOperation(value = "Book an appointment")
    @PostMapping("/book")
    public ResponseEntity<String> saveAppointment(@RequestBody Appointment appointment, Model model) {
        appointmentDao.save(appointment);
        return new ResponseEntity<>("Booking was  successfull", HttpStatus.OK);
    }

    @ApiOperation(value = "Update Appointment")
    @PutMapping(value = "/update/{appointmentId}")
    public ResponseEntity<String> updateAppointment(@PathVariable Integer appointmentId, @RequestBody Appointment appointment) {
        Appointment updateBooking = appointmentDao.getAppointmentById(appointmentId);
        updateBooking.setCancelled(appointment.isCancelled());
        updateBooking.setStartTime(appointment.getStartTime());
        updateBooking.setEndTime(appointment.getEndTime());
        updateBooking.setUser(appointment.getUser());
        updateBooking.setClient(appointment.getClient());
        updateBooking.setService(appointment.getService());
        return new ResponseEntity<>("Appointment updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete Appointment")
    @DeleteMapping("/delete/{appointmentId}")
    public ResponseEntity<String> deleteAppointment(@PathVariable Integer appointmentId, Model model) {
        appointmentDao.deleteAppointment(appointmentId);
        return new ResponseEntity<>("Appointment deleted successfully", HttpStatus.OK);
    }
}
