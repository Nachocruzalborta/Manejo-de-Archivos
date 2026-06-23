package VISUAL;

import CONSOLA.Cita;
import CONSOLA.Medico;
import CONSOLA.Paciente;
import java.util.ArrayList;
import java.util.List;

public class OperacionesSeguroVisual {
    
    List<Paciente> listaPacientes;
    List<Medico> listaMedicos;
    List<Cita> listaCitas;

    // Constructor
    
    public OperacionesSeguroVisual() {
        listaPacientes = new ArrayList<>();
        listaMedicos = new ArrayList<>();
        listaCitas = new ArrayList<>();
    }
    
    public void registrarPaciente(String nombre, String cedula, int edad, String empresa){
        Paciente p = new Paciente(empresa, nombre, cedula, edad);
        listaPacientes.add(p);
        System.out.println("PACIENTE REGISTRADO CON EXITO");
    }

    public void registrarMedico(String nombre, String cedula, int edad, String especialidad){
        Medico m = new Medico(especialidad, nombre, cedula, edad);
        listaMedicos.add(m);
        System.out.println("MEDICO REGISTRADO CON EXITO");
    }
    
    public Paciente buscarPacientePorNombre(String nombre) {
        Paciente paciente = null;
        if (!listaPacientes.isEmpty()) {
            for (Paciente p : listaPacientes) {
                if (p.getNombreCompleto().equalsIgnoreCase(nombre)) {
                    paciente = p;
                    break;
                }
            }
        }
        return paciente;
    }

    public Medico buscarMedicoPorNombre(String nombre) {
        Medico medico = null;
        if (!listaMedicos.isEmpty()) {
            for (Medico m : listaMedicos) {
                if (m.getNombreCompleto().equalsIgnoreCase(nombre)) {
                    medico = m;
                    break;
                }
            }
        }
        return medico;
    }

    public void registrarCita(String nombrePaciente, String nombreMedico, String fecha, String hora) {
        Paciente paciente = buscarPacientePorNombre(nombrePaciente);
        Medico medico = buscarMedicoPorNombre(nombreMedico);
        if (paciente != null && medico != null) {
            Cita c = new Cita(fecha, hora, paciente, medico);
            listaCitas.add(c);
            System.out.println("CITA REGISTRADA CON EXITO");
        } else {
            System.out.println("ERROR: NO SE ENCONTRO EL PACIENTE O EL MEDICO");
        }
    }
    
    public Paciente buscarPaciente(String cedula) {
        Paciente paciente = null;
        if (!listaPacientes.isEmpty()) {
            for (Paciente p : listaPacientes) {
                if (p.getNumeroCedula().equalsIgnoreCase(cedula)) {
                    paciente = p;
                }
            }
        }else{
            System.out.println("NO SE TIENEN PACIENTES REGISTRADOS");
        }
        return paciente;
    }
    
    public List<Paciente> buscarPacienteEmpresa(String empresa){
        List<Paciente> paciente = new ArrayList<>();
        if(!listaPacientes.isEmpty()){
            for (Paciente p : listaPacientes){
                if(p.getEmpresa().equalsIgnoreCase(empresa)){
                    paciente.add(p);
                }
            }
        }else{
            System.out.println("NO SE TIENEN PACIENTES REGISTRADOS");
            paciente = null;
        }
        return paciente;
    }

    public Medico buscarMedico(String cedula) {
        Medico medico = null;
        if (!listaMedicos.isEmpty()) {
            for (Medico m : listaMedicos) {
                if (m.getNumeroCedula().equalsIgnoreCase(cedula)) {
                    medico = m;
                }
            }
        }else{
            System.out.println("NO SE TIENEN MEDICOS REGISTRADOS");
        }
        return medico;
    }
    
    public List<Medico> buscarMedicoEspecialidad(String especialidad){
        List<Medico> medico = new ArrayList<>();
        if(!listaMedicos.isEmpty()){
            for (Medico m : listaMedicos){
                if(m.getEspecialidad().equalsIgnoreCase(especialidad)){
                    medico.add(m);
                }
            }
        }else{
            System.out.println("NO SE TIENEN MEDICOS REGISTRADOS");
            medico = null;
        }
        return medico;
    }
    
    public List<Cita> buscarCitaPaciente(String nombre){
        List<Cita> cita = new ArrayList<>();
        if(!listaCitas.isEmpty()){
            for (Cita c : listaCitas){
                if(c.getPaciente().getNombreCompleto().equalsIgnoreCase(nombre)){
                    cita.add(c);
                }
            }
        }else{
            System.out.println("NO SE TIENEN CITAS REGISTRADAS");
            cita = null;
        }
        return cita;
    }
    
    public List<Cita> buscarCitaMedico(String nombre){
        List<Cita> cita = new ArrayList<>();
        if(!listaCitas.isEmpty()){
            for (Cita c : listaCitas){
                if(c.getMedico().getNombreCompleto().equalsIgnoreCase(nombre)){
                    cita.add(c);
                }
            }
        }else{
            System.out.println("NO SE TIENEN CITAS REGISTRADAS");
            cita = null;
        }
        return cita;
    }

    public Cita buscarCitaEspecifica(String cedulaPaciente, String fecha) {
        Cita cita = null;
        if (!listaCitas.isEmpty()) {
            for (Cita c : listaCitas) {
                if (c.getPaciente().getNumeroCedula().equalsIgnoreCase(cedulaPaciente) && c.getFecha().equalsIgnoreCase(fecha)) {
                    cita = c;
                    break;
                }
            }
        } else {
            System.out.println("NO SE TIENEN CITAS REGISTRADAS");
        }
        return cita;
    }

    public void eliminarCita(String cedulaPaciente, String fecha) {
        if (!listaCitas.isEmpty()) {
            Cita cita = buscarCitaEspecifica(cedulaPaciente, fecha);
            if (cita != null) {
                listaCitas.remove(cita);
                System.out.println("CITA ELIMINADA CON EXITO");
            } else {
                System.out.println("ERROR: NO SE ENCONTRÓ LA CITA ESPECIFICADA");
            }
        } else {
            System.out.println("NO SE TIENEN CITAS REGISTRADAS");
        }
    }

    public void eliminarPaciente(String cedula) {
        if (!listaPacientes.isEmpty()) {
            Paciente p = buscarPaciente(cedula);
            if (p != null) {
                listaPacientes.remove(p);
                listaCitas.removeIf(c -> c.getPaciente().getNumeroCedula().equalsIgnoreCase(cedula));
                System.out.println("PACIENTE Y SUS CITAS ELIMINADOS CON EXITO");
            } else {
                System.out.println("ERROR: NO SE ENCONTRO AL PACIENTE DE CEDULA: " + cedula);
            }
        }else{
            System.out.println("NO SE TIENEN PACIENTES REGISTRADOS");
        }
    }

    public void eliminarMedico(String cedula) {
        if (!listaMedicos.isEmpty()) {
            Medico m = buscarMedico(cedula);
            if (m != null) {
                listaMedicos.remove(m);
                listaCitas.removeIf(c -> c.getMedico().getNumeroCedula().equalsIgnoreCase(cedula));
                System.out.println("MEDICO Y SUS CITAS ELIMINADOS CON EXITO");
            } else {
                System.out.println("ERROR: NO SE ENCONTRO AL MEDICO DE CEDULA: " + cedula);
            }
        }else{
            System.out.println("NO SE TIENEN MEDICOS REGISTRADOS");
        }
    }

    // Getter and Setter

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public List<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(List<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }
    
}
