package CONSOLA;

import java.util.Scanner;

public class Cita implements Agendamiento{
    
    // Atributos
    
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Medico medico;
    
    // Objeto Lectura
    
    Scanner leer = new Scanner(System.in);
    
    // Constructor

    public Cita() {
    }

    public Cita(String fecha, String hora, Paciente paciente, Medico medico) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
    }
    
    // Metodos
    
    @Override
    public void registrarCita(Paciente p, Medico m){
        this.paciente = p;
        this.medico = m;
        System.out.println("DIGITE LA FECHA: ");
        this.fecha=leer.nextLine();
        System.out.println("DIGITE LA HORA: ");
        this.hora=leer.nextLine();
        System.out.println("CITA REGISTRADA");
    }
    
    @Override
    public void mostrarCita(){
        System.out.println("PACIENTE: " + paciente.getNombreCompleto());
        System.out.println("DOCTOR: " + medico.getNombreCompleto());
        System.out.println("ESPECIALIDAD: " + medico.getEspecialidad());
        System.out.println("FECHA: " + this.fecha);
        System.out.println("HORA: " + this.hora);
    }
    
    // Getter and Setter

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
