package CONSOLA;

import java.util.Scanner;

public abstract class Persona {
    
    // Atributos
    
    private String nombreCompleto;
    private String numeroCedula;
    private int edad;
    
    // Objeto de Lectura
    
    Scanner leer = new Scanner(System.in);
    
    // Constructor

    public Persona() {
    }

    public Persona(String nombreCompleto, String numeroCedula, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCedula = numeroCedula;
        this.edad = edad;
    }
    
    // Metodos
    
    abstract public void registrarDatos();
    
    abstract public void mostrarDatos();

    // Getter and Setter
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
