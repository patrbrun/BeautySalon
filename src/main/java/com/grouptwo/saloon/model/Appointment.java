package com.grouptwo.saloon.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(generator = "kid_generator", strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Appointment Id")
    private int appointmentID;

    @ApiModelProperty(notes = "Appointment start time", value = "Appointment start time")
    private Date startTime;

    @ApiModelProperty(notes = "Appointment end time")
    private Date endTime;

    @ApiModelProperty(notes = "Appointment cancelled")
    private boolean cancelled;

    public Appointment() {
    }

    public Appointment(Date startTime, Date endTime, boolean cancelled) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.cancelled = cancelled;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return appointmentID == that.appointmentID &&
                startTime == that.startTime &&
                endTime == that.endTime &&
                cancelled == that.cancelled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentID, startTime, endTime, cancelled);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentID=" + appointmentID +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", cancelled=" + cancelled +
                '}';
    }
}

