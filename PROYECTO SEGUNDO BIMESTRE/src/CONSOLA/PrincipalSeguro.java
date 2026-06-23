package CONSOLA;

import java.util.Scanner;

public class PrincipalSeguro {

    public static void main(String[] args) {
        int opc;
        boolean continuar = true;
        
        OperacionesSeguro obj = new OperacionesSeguro();
        
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println(" 1. REGISTRAR PACIENTE");
            System.out.println(" 2. REGISTRAR MEDICO");
            System.out.println(" 3. REGISTRAR CITA");
            System.out.println(" 4. MOSTRAR PACIENTES");
            System.out.println(" 5. MOSTRAR MEDICOS");
            System.out.println(" 6. MOSTRAR CITAS");
            System.out.println(" 7. BUSCAR PACIENTE POR NOMBRE");
            System.out.println(" 8. BUSCAR PACIENTES POR EMPRESA");
            System.out.println(" 9. BUSCAR MEDICOS POR NOMBRE");
            System.out.println("10. BUSCAR MEDICOS POR ESPECIALIDAD");
            System.out.println("11. BUSCAR CITAS POR PACIENTE");
            System.out.println("12. BUSCAR CITAS POR MEDICO");
            System.out.println("13. ELIMINAR PACIENTE");
            System.out.println("14. ELIMINAR MEDICO");
            System.out.println("15. MODIFICAR CITA");
            System.out.println("16. SALIR");
            System.out.println("DIGITE UNA OPCION");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    obj.registrarPaciente();
                    break;
                case 2:
                    obj.registrarMedico();
                    break;
                case 3:
                    obj.registrarCita();
                    break;
                case 4:
                    obj.mostrarPacientes();
                    break;
                case 5:
                    obj.mostrarMedicos();
                    break;
                case 6:
                    obj.mostrarCitas();
                    break;
                case 7:
                    obj.buscarPaciente();
                    break;
                case 8:
                    obj.buscarPacientesEmpresa();
                    break;
                case 9:
                    obj.buscarMedico();
                    break;
                case 10:
                    obj.buscarMedicoEspecialidad();
                    break;
                case 11:
                    obj.buscarCitaPaciente();
                    break;
                case 12:
                    obj.buscarCitaMedico();
                    break;
                case 13:
                    obj.eliminarPaciente();
                    break;
                case 14:
                    obj.eliminarMedico();
                    break;
                case 15:
                    obj.modificarCita();
                    break;
                default:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}
