/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quotes;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Appointment {
    private LocalDate date;      
    private String time;      
    private String client;    
    private String doctor;   
    private String reason; //motivo

    public LocalDate getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getClient() {
        return client;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getReason() {
        return reason;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Appointment(LocalDate date, String time, String client, String doctor, String reason) {
        this.date = date;
        this.time = time;
        this.client = client;
        this.doctor = doctor;
        this.reason = reason;
    }

    public Appointment(){
        this(null,null,null,null,null);
    }

    @Override
    public String toString() {
        return "Appointment{" + "date=" + date + ", time=" + time + ", client=" + client + ", doctor=" + doctor + ", reason=" + reason + '}';
    }

}
