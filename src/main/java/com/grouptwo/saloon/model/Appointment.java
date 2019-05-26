package com.grouptwo.saloon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

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
    @ApiModelProperty(notes = "appointment id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "serviceId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Service service;

    @ApiModelProperty(notes = "user id")
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ApiModelProperty(notes = "client id")
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return appointmentID == that.appointmentID &&
                cancelled == that.cancelled &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(service, that.service) &&
                Objects.equals(user, that.user) &&
                Objects.equals(client, that.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentID, startTime, endTime, cancelled, service, user, client);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentID=" + appointmentID +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", cancelled=" + cancelled +
                ", service=" + service +
                ", user=" + user +
                ", client=" + client +
                '}';
    }
}

