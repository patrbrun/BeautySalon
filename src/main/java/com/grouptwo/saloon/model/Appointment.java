package com.grouptwo.saloon.model;

public class Appointment {

    private int appointmentID
    private int startTime
    private int endTime
    private boolean cancelled
    int serviceID // FK
    int clientID // FK
    int userID // FK

    @java.lang.Override
    public java.lang.String toString() {
        return "Appointment{" +
                "appointmentID=" + appointmentID +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", cancelled=" + cancelled +
                ", serviceID=" + serviceID +
                ", clientID=" + clientID +
                ", userID=" + userID +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Appointment that = (Appointment) object;
        return appointmentID == that.appointmentID &&
                startTime == that.startTime &&
                endTime == that.endTime &&
                cancelled == that.cancelled &&
                serviceID == that.serviceID &&
                clientID == that.clientID &&
                userID == that.userID;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), appointmentID, startTime, endTime, cancelled, serviceID, clientID, userID);
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

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    }
}

