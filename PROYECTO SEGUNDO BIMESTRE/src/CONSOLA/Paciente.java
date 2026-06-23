package CONSOLA;

public class Paciente extends Persona{

    // Atributos
    
    private String empresa;
    
    // Constructor

    public Paciente() {
    }

    public Paciente(String empresa, String nombreCompleto, String numeroCedula, int edad) {
        super(nombreCompleto, numeroCedula, edad);
        this.empresa = empresa;
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
        System.out.println("DIGITE LA EMPRESA");
        empresa = leer.nextLine();
        System.out.println("NUEVO PACIENTE REGISTRADO");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("NOMBRE: " + super.getNombreCompleto());
        System.out.println("CEDULA: " + super.getNumeroCedula());
        System.out.println("EDAD: " + super.getEdad());
        System.out.println("EMPRESA: " + this.empresa);
    }
    
    // Getter and Setter

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
