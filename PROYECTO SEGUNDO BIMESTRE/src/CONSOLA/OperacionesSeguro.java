package CONSOLA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacionesSeguro {
    
    List<Paciente> listaPacientes;
    List<Medico> listaMedicos;
    List<Cita> listaCitas;
    
    // Objeto de Lectura
    
    Scanner leer = new Scanner(System.in);
    
    // Constructor
    
    public OperacionesSeguro() {
        listaPacientes = new ArrayList<>();
        listaMedicos = new ArrayList<>();
        listaCitas = new ArrayList<>();
    }
    
    // Metodos
    
    public void registrarPaciente(){   
        Paciente p = new Paciente();
        p.registrarDatos();
        listaPacientes.add(p);
        System.out.println("SE REGISTRO AL PACIENTE CORRECTAMENTE");
    }
    
    public void registrarMedico(){   
        Medico m = new Medico();
        m.registrarDatos();
        listaMedicos.add(m);
        System.out.println("SE REGISTRO AL MEDICO CORRECTAMENTE");
    }
    
     public void registrarCita(){   
        String paciente;
        String medico;
        Paciente pacienteEncontrado = null;
        Medico medicoEncontrado = null;
        if(listaPacientes.isEmpty() || listaMedicos.isEmpty()){
            System.out.println("SE DEBE REGISTRAR ALMENOS UN PACIENTE Y UN DOCTOR");
        }else{
            System.out.println("DIGITE EL NOMBRE DEL PACIENTE");
            paciente = leer.nextLine();
            for(Paciente p : listaPacientes){
                if(p.getNombreCompleto().equalsIgnoreCase(paciente)){
                    pacienteEncontrado = p;
                }
            }
            System.out.println("DIGITE EL NOMBRE DEL MEDICO");
            medico = leer.nextLine();
            for(Medico m : listaMedicos){
                if(m.getNombreCompleto().equalsIgnoreCase(medico)){
                    medicoEncontrado = m;
                }
            }
            if(pacienteEncontrado!=null && medicoEncontrado!=null){   
                Cita c = new Cita();
                c.registrarCita(pacienteEncontrado, medicoEncontrado);
                listaCitas.add(c);
                System.out.println("SE REGISTRO LA CITA CORRECTAMENTE");
            }else{
                System.out.println("PACIENTE Y/O MEDICO NO ENCONTRADOS");
            }
        }
    }
    
    public void mostrarPacientes(){   
        if(listaPacientes.isEmpty()){
            System.out.println("NO SE TIENEN PACIENTES REGISTRADOS");
        }else{
            for(Paciente p : listaPacientes){
                p.mostrarDatos();
            }
        }
    }
    
    public void mostrarMedicos(){   
        if(listaMedicos.isEmpty()){
            System.out.println("NO SE TIENEN DOCTORES REGISRADOS");
        }else{
            for(Medico  m : listaMedicos){
                m.mostrarDatos();
            }
        }
    }
    
    public void mostrarCitas(){   
        if(listaCitas.isEmpty()){
            System.out.println("NO SE TIENEN CITAS REGISTRADAS");
        }else{
            for(Cita c : listaCitas){
                c.mostrarCita();
            }
        }
    }
    
    public void buscarPaciente(){
        String nombre;
        int sw = 0;
        if (!listaPacientes.isEmpty()) {
            System.out.println("DIGITE EL NOMBRE");
            nombre = leer.nextLine();
            for (Paciente p : listaPacientes) {
                if (p.getNombreCompleto().equalsIgnoreCase(nombre)) {
                    sw++;
                    p.mostrarDatos();
                }
            }
            if (sw == 0) {
                System.out.println("NO SE TIENE REGISTRADO AL PACIENTE: " + nombre);
            }
        } else {
            System.out.println("NO SE TIENEN PACIENTES REGISTRADOS");
        }
    }
    
    public void buscarPacientesEmpresa(){
        String empresa;
        int sw = 0;
        if (!listaPacientes.isEmpty()) {
            System.out.println("DIGITE EL NOMBRE DE LA EMPRESA");
            empresa = leer.nextLine();
            for (Paciente p : listaPacientes) {
                if (p.getEmpresa().equalsIgnoreCase(empresa)) {
                    sw++;
                    p.mostrarDatos();
                }
            }
            if (sw == 0) {
                System.out.println("NO SE TIENEN REGISTRADOS PACIENTES DE LA EMPRESA: " + empresa);
            }
        } else {
            System.out.println("NO SE TIENEN PACIENTES REGISTRADOS");
        }
    }
    
    public void buscarMedico(){
        String nombre;
        int sw = 0;
        if (!listaMedicos.isEmpty()) {
            System.out.println("DIGITE EL NOMBRE");
            nombre = leer.nextLine();
            for (Medico m : listaMedicos) {
                if (m.getNombreCompleto().equalsIgnoreCase(nombre)) {
                    sw++;
                    m.mostrarDatos();
                }
            }
            if (sw == 0) {
                System.out.println("NO SE TIENE REGISTRADO AL DOCTOR: " + nombre);
            }
        } else {
            System.out.println("NO SE TIENEN DOCTORES REGISTRADOS");
        }
    }
    
    public void buscarMedicoEspecialidad(){
        String especialidad;
        int sw = 0;
        if (!listaMedicos.isEmpty()) {
            System.out.println("DIGITE LA ESPECIALIDAD");
            especialidad = leer.nextLine();
            for (Medico m : listaMedicos) {
                if (m.getEspecialidad().equalsIgnoreCase(especialidad)) {
                    sw++;
                    m.mostrarDatos();
                }
            }
            if (sw == 0) {
                System.out.println("NO SE TIENE REGISTRADA LA ESPECIALIDAD: " + especialidad);
            }
        } else {
            System.out.println("NO SE TIENEN DOCCTORES REGISTRADOS");
        }
    }
    
    public void buscarCitaPaciente(){
        String nombre;
        int sw = 0;
        if (!listaCitas.isEmpty()) {
            System.out.println("DIGITE EL NOMBRE");
            nombre = leer.nextLine();
            for (Cita c : listaCitas) {
                if (c.getPaciente().getNombreCompleto().equalsIgnoreCase(nombre)){
                    sw++;
                    c.mostrarCita();
                }
            }
            if (sw == 0) {
                System.out.println("NO SE TIENEN CITAS REGISTRADAS AL PACIENTE: " + nombre);
            }
        } else {
            System.out.println("NO SE TIENEN CITAS REGISTRADAS");
        }
    }
    
    public void buscarCitaMedico(){
        String nombre;
        int sw = 0;
        if (!listaCitas.isEmpty()) {
            System.out.println("DIGITE EL NOMBRE");
            nombre = leer.nextLine();
            for (Cita c : listaCitas) {
                if (c.getMedico().getNombreCompleto().equalsIgnoreCase(nombre)){
                    sw++;
                    c.mostrarCita();
                }
            }
            if (sw == 0) {
                System.out.println("NO SE TIENEN CITAS REGISTRADAS AL MEDICO: " + nombre);
            }
        } else {
            System.out.println("NO SE TIENEN CITAS REGISTRADAS");
        }
    }
    
    public void eliminarPaciente(){
        String nombre;
        String res;
        int sw = 0, pos = 0;
        if (!listaPacientes.isEmpty()) {
            System.out.println("DIGITE EL NOMBRE");
            nombre = leer.nextLine();
            for (Paciente p : listaPacientes) {
                if (p.getNombreCompleto().equalsIgnoreCase(nombre)) {
                    p.mostrarDatos();
                    pos = listaPacientes.indexOf(p);
                    sw++;
                }
            }
            if (sw == 0) {
                System.out.println("NO SE TIENE REGISTRADO AL PACIENTE: " + nombre);
            }else{
                System.out.println("DESEA CONTINUAR Y ELIMINAR AL PACIENTE: " + nombre + "? S/N");
                res = leer.nextLine();
                if (res.equalsIgnoreCase("S")) {
                    listaPacientes.remove(pos);
                    for (int i = listaCitas.size() - 1; i >= 0; i--) {
                        if (listaCitas.get(i).getPaciente().getNombreCompleto().equalsIgnoreCase(nombre)) {
                            listaCitas.remove(i);
                        }
                    }
                    System.out.println("SE ELIMINO AL PACIENTE: " + nombre + " Y TODAS SUS CITAS CON EXITO");
                } else {
                    System.out.println("SE CANCELO LA ELIMINACION DEL PACIENTE: " + nombre);
                }
            }
        } else {
            System.out.println("NO SE TIENEN PACIENTES REGISTRADOS");
        }
    }

    public void eliminarMedico() {
        String nombre;
        String res;
        int sw = 0, pos = 0;
        if (!listaMedicos.isEmpty()) {
            System.out.println("DIGITE EL NOMBRE");
            nombre = leer.nextLine();
            for (Medico m : listaMedicos) {
                if (m.getNombreCompleto().equalsIgnoreCase(nombre)) {
                    m.mostrarDatos();
                    pos = listaMedicos.indexOf(m);
                    sw++;
                }
            }
            if (sw == 0) {
                System.out.println("NO SE TIENE REGISTRADO AL MEDICO: " + nombre);
            } else {
                System.out.println("DESEA CONTINUAR Y ELIMINAR AL MEDICO: " + nombre + "? S/N");
                res = leer.nextLine();
                if (res.equalsIgnoreCase("S")) {
                    listaMedicos.remove(pos);
                    for (int i = listaCitas.size() - 1; i >= 0; i--) {
                        if (listaCitas.get(i).getMedico().getNombreCompleto().equalsIgnoreCase(nombre)) {
                            listaCitas.remove(i);
                        }
                    }
                    System.out.println("SE ELIMINO AL MEDICO" + nombre + " Y TODAS SUS CITAS CON EXITO");
                } else {
                    System.out.println("SE CANCELO LA ELIMINACION DEL MEDICO: " + nombre);
                }
            }
        } else {
            System.out.println("NO SE TIENEN MEDICOS REGISTRADOS");
        }
    }

    public void modificarCita() {
        String paciente;
        String medico;
        String fecha;
        String hora;
        String res;
        int sw = 0;
        if (!listaCitas.isEmpty()) {
            System.out.println("DIGITE EL NOMBRE DEL PACIENTE");
            paciente = leer.nextLine();
            System.out.println("DIGITE EL NOMBRE DEL MEDICO");
            medico = leer.nextLine();
            for (Cita c : listaCitas) {
                if (c.getPaciente().getNombreCompleto().equalsIgnoreCase(paciente) && c.getMedico().getNombreCompleto().equalsIgnoreCase(medico)) {
                    sw++;
                    c.mostrarCita();
                }
            }
            if (sw == 0) {
                System.out.println("NO SE ENCONTRÓ NINGUNA CITA DEL PACIENTE " + paciente + " CON EL MEDICO " + medico);
            } else {
                System.out.println("DESEA CONTINUAR Y MODIFICAR ESTA CITA? S/N");
                res = leer.nextLine();
                if (res.equalsIgnoreCase("S")) {
                    for (Cita c : listaCitas) {
                        if (c.getPaciente().getNombreCompleto().equalsIgnoreCase(paciente) && c.getMedico().getNombreCompleto().equalsIgnoreCase(medico)) {
                            System.out.println("DIGITE LA NUEVA FECHA DE LA CITA");
                            fecha = leer.nextLine();
                            c.setFecha(fecha);
                            System.out.println("DIGITE LA NUEVA HORA DE LA CITA");
                            hora = leer.nextLine();
                            c.setHora(hora);
                            System.out.println("CITA MODIFICADA CON ÉXITO");
                        }
                    }
                } else {
                    System.out.println("SE CANCELO LA MODIFICACION DE LA CITA");
                }
            }
        } else {
            System.out.println("NO SE TIENEN CITAS REGISTRADAS");
        }
    }

}
