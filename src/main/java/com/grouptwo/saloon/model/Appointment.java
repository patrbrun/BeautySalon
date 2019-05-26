package com.grouptwo.saloon.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(generator = "appointment_generator", strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Appointment Id")
    private int appointmentID;

    @ApiModelProperty(notes = "Appointment start time", value = "Appointment start time")
    private Date startTime;

    @ApiModelProperty(notes = "Appointment end time")
    private Date endTime;

    @ApiModelProperty(notes = "Appointment cancelled")
    private boolean cancelled;

    @ApiModelProperty(notes = "appointment")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appointment")
    private Set<Service> service = new HashSet<>();

    @ApiModelProperty(notes = "user id")
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @ApiModelProperty(notes = "client id")
    @OneToOne(cascade = CascadeType.ALL)
    private Client client;

    public Appointment() {
    }

    public Appointment(Date startTime, Date endTime, boolean cancelled, User user, Client client) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.cancelled = cancelled;
        this.user = user;
        this.client = client;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Set<Service> getService() {
        return service;
    }

    public void setService(Set<Service> service) {
        this.service = service;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

