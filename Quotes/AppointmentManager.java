/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quotes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author andre
 */
public class AppointmentManager {
    private Map<String, Appointment> appointments;

    public AppointmentManager() {
        this.appointments = new HashMap<>();
    }

    // Agregar una nueva cita
    public void addAppointment(Appointment appointment) {
        appointments.put(appointment.getClient(), appointment);
    }

    // Buscar una cita registrada por cliente
    public Appointment searchAppointmentByClient(String client) {
        return appointments.get(client);
    }

    // Modificar la fecha y hora de una cita
    public void updateAppointmentDateAndTime(String client, LocalDate newDate, String newTime) {
        Appointment appointment = appointments.get(client);
        if (appointment != null) {
            appointment.setDate(newDate);
            appointment.setTime(newTime);
        }
    }

    // Cancelar una cita
    public void cancelAppointment(String client) {
        appointments.remove(client);
    }

    // Mostrar reportes de las citas del día
    public List<Appointment> getTodaysAppointments() {
        List<Appointment> todaysAppointments = new ArrayList<>();
        for (Appointment appointment : appointments.values()) {
            if (appointment.getDate().equals(LocalDate.now())) {
                todaysAppointments.add(appointment);
            }
        }
        return todaysAppointments;
    }

    // Mostrar reportes de las citas activas
    public List<Appointment> getActiveAppointments() {
        return new ArrayList<>(appointments.values());
    }
}
