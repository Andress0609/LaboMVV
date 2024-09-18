/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctors;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class MedicoController {
    private List<Medico> medicos;
    private MedicoView view;

    public MedicoController(MedicoView view) {
        this.view = view;
        this.medicos = new ArrayList<>();
    }

    public void insertMedico(Medico medico) {
        medicos.add(medico);
    }

    public void eliminarMedico(int id) {
        for (Medico medico : medicos) {
            if (medico.getId() == id) {
                medicos.remove(medico);
                break;
            }
        }
    }

    public void updateMedico(Medico medico) {
        for (Medico m : medicos) {
            if (m.getId() == medico.getId()) {
                m.setNumeroMedico(medico.getNumeroMedico());
                m.setNombre(medico.getNombre());
                m.setFechaNacimiento(medico.getFechaNacimiento());
                m.setTelefono(medico.getTelefono());
                m.setCorreo(medico.getCorreo());
                m.setEspecialidad(medico.getEspecialidad());
                m.setSalario(medico.getSalario());
                break;
            }
        }
    }

    public List<Medico> buscarMedicos(String nombre) {
        List<Medico> resultado = new ArrayList<>();
        for (Medico medico : medicos) {
            if (medico.getNombre().contains(nombre)) {
                resultado.add(medico);
            }
        }
        return resultado;
    }
}