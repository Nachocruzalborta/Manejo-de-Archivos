package CONSOLA;

public class Medico extends Persona{
    
    // Atributos
    
    private String especialidad;
    
    // Constructor

    public Medico() {
    }

    public Medico(String especialidad, String nombreCompleto, String numeroCedula, int edad) {
        super(nombreCompleto, numeroCedula, edad);
        this.especialidad = especialidad;
    }
    
    // Metodos

    @Override
    public void registrarDatos() {
        System.out.println("DIGITE EL NOMBRE COMPLETO");
        super.setNombreCompleto(leer.nextLine());
        System.out.println("DIGITE EL NUMERO DE CEDULA");
        super.setNumeroCedula(leer.nextLine());
        System.out.println("DIGITE LA EDAD");
        super.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("DIGITE LA ESPECIALIDAD");
        especialidad = leer.nextLine();
        System.out.println("NUEVO MEDICO REGISTRADO");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("NOMBRE: " + super.getNombreCompleto());
        System.out.println("CEDULA: " + super.getNumeroCedula());
        System.out.println("EDAD: " + super.getEdad());
        System.out.println("ESPECIALIDAD: " + this.especialidad);
    }
    
    // Getter and Setter

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
