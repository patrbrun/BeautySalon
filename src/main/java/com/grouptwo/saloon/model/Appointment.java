package com.grouptwo.saloon.model;
import javax.persistence.Entity;

@Entity
public class Appointment {

    private int appointmentID;
    private int startTime;
    private int endTime;
    private boolean cancelled;
//    private int serviceID; // FK
//    private int clientID; // FK
//    private int userID; // FK

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentID=" + appointmentID +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", cancelled=" + cancelled +
                '}';
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    // Constructor
    public Appointment(int appointmentID, int startTime, int endTime, boolean cancelled, int serviceID, int clientID, int userID) {
        this.appointmentID = appointmentID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.cancelled = cancelled;
    }
}
