package com.grouptwo.saloon.api;


import com.grouptwo.saloon.dao.AppointmentDao;
import com.grouptwo.saloon.model.Appointment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("appointment")
@Api(value = "saloon appointment")
public class AppointmentController {
    private AppointmentDao appointmentDao;

    @Autowired
    public void setAppointmentDao(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }


    @ApiOperation(value = "List of all appointments", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Appointment list retrieved successfully"),
            @ApiResponse(code = 401, message = "Authorization to view resource denied."),
            @ApiResponse(code = 403, message = "Access is forbidden"),
            @ApiResponse(code = 404, message = "Appointment absent")
    })

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Appointment> getAllAppointment() {
        return appointmentDao.listAppointments();
    }

}
