import java.util.ArrayList;
import java.util.Scanner;

import model.EmpleadoEventual;
import model.EmpleadoPlantilla;
import model.Paciente;

public class Main {
    private static ArrayList<Paciente> paciente = new ArrayList<>();
    private static ArrayList<EmpleadoPlantilla> empleadoPlantilla = new ArrayList<>();
    private static ArrayList<EmpleadoEventual> empleadoEventuals = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("--------------------------------");
            System.out.println("Ingrese el numero de desea");
            System.out.println("--------------------------------");
            System.out.println("1. Imprimir los datos del Paciente");
            System.out.println("2. Ingresar datos para registrar al paciente");
            System.out.println("3. Imprimir los datos del empleado de plantilla");
            System.out.println("4. Ingresar datos para registrar al Empleado de plantilla");

            System.out.println("--------------------------------");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:

                    imprimirDatosPaciente();
                    break;
                case 2:
                    registrarPaciente();
                    break;
                case 3:
                    imprimirDatosEmpleadoPlantilla();
                    break;
                case 4:
                    registrarEmpleadoPlantilla();
                    break;
                case 5:
                    imprimirDatosEmpleadoEventual();
                    break;
                case 6:
                    registrarEmpleadoEventual();
                    break;
                default:
                    break;
            }

        } while (opcion != 7);
    }

    /* Metodos para los pacientes */
    public static void imprimirDatosPaciente() {
        for (int i = 0; i < paciente.size(); i++) {
            System.out.println("\n--- Paciente " + (i + 1) + " ---");
            paciente.get(i).imprimirDatosPaciente();
            System.out.println("--------------------------------");
        }
    }

    public static void registrarPaciente() {
        System.out.println("Ingrese su DNI");
        Long dni = scan.nextLong();
        scan.nextLine();

        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();

        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();

        System.out.println("Ingrese su fecha de nacimiento");
        String fechaDeNacimiento = scan.nextLine();

        System.out.println("Ingrese su direccion");
        String direccion = scan.nextLine();

        System.out.println("Ingrese su ciudad de procedencia");
        String ciudadProcedencia = scan.nextLine();

        System.out.println("Ingrese el numero de historia clinica");
        Long numberHistoryClinic = scan.nextLong();
        scan.nextLine();

        System.out.println("Ingrese el sexo del paciente");
        String sex = scan.nextLine();

        System.out.println("Ingrese el tipo de sangre del paciente");
        String bloodType = scan.nextLine();

        System.out.println("Ingrese los medicamentos alergicos");
        String allergyMedications = scan.nextLine();

        Paciente nuevoPaciente = new Paciente(dni, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia,
                numberHistoryClinic, sex, bloodType, allergyMedications);
        paciente.add(nuevoPaciente);
        System.out.println("Paciente registrado con exito");
    }

    /* Metodos para los empleados por plantilla */

    public static void imprimirDatosEmpleadoPlantilla() {
        for (int i = 0; i < empleadoPlantilla.size(); i++) {
            System.out.println("\n--- Empleado plantilla " + (i + 1) + " ---");
            empleadoPlantilla.get(i).imprimirDatosEmpleadoPlantilla();
            System.out.println("--------------------------------");
        }
    }

    public static void registrarEmpleadoPlantilla() {
        System.out.println("Ingrese su DNI");
        Long dni = scan.nextLong();
        scan.nextLine();

        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();

        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();

        System.out.println("Ingrese su fecha de nacimiento");
        String fechaDeNacimiento = scan.nextLine();

        System.out.println("Ingrese su direccion");
        String direccion = scan.nextLine();

        System.out.println("Ingrese su ciudad de procedencia");
        String ciudadProcedencia = scan.nextLine();

        System.out.println("Ingrese el codigo del empleado");
        Long codigoEmpleado = scan.nextLong();
        scan.nextLine();

        System.out.println("Ingrese las horas extras del empleado");
        Long horasExtras = scan.nextLong();
        scan.nextLine();

        System.out.println("Ingrese la fecha de ingreso del empleado (dd/mm/aaaa)");
        String fechaIngreso = scan.nextLine();

        System.out.println("Ingrese el area del empleado");
        String area = scan.nextLine();

        System.out.println("Ingrese el cargo del empleado");
        String cargo = scan.nextLine();

        System.out.println("Ingrese el salario mensual del empleado");
        Double salarioMensual = scan.nextDouble();
        scan.nextLine();

        System.out.println("Ingrese el porcentaje de horas extras");
        Double porcentajeHorasExtras = scan.nextDouble();
        scan.nextLine();

        EmpleadoPlantilla nuevoEmpleadoPlantilla = new EmpleadoPlantilla(dni, nombre, apellido, fechaDeNacimiento,
                direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo, salarioMensual,
                porcentajeHorasExtras);
        empleadoPlantilla.add(nuevoEmpleadoPlantilla);
        System.out.println("Empleado registrado correctamente");
    }

    /* Metodo para empleado eventual */

    public static void imprimirDatosEmpleadoEventual() {
        for (int i = 0; i < empleadoEventuals.size(); i++) {
            /* Para saber el numero del empleado */
            System.out.println("\n--- Empleado Eventual " + (i + 1) + " ---");
            empleadoEventuals.get(i).imprimirDatosEmpleadoEventual();
            System.out.println("--------------------------------");
        }
    }

    public static void registrarEmpleadoEventual() {
        System.out.println("Ingrese su DNI");
        Long dni = scan.nextLong();
        scan.nextLine();

        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();

        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();

        System.out.println("Ingrese su fecha de nacimiento");
        String fechaDeNacimiento = scan.nextLine();

        System.out.println("Ingrese su direccion");
        String direccion = scan.nextLine();

        System.out.println("Ingrese su ciudad de procedencia");
        String ciudadProcedencia = scan.nextLine();

        System.out.println("Ingrese el codigo del empleado");
        Long codigoEmpleado = scan.nextLong();
        scan.nextLine();

        System.out.println("Ingrese el numero de horas extras del empleado");
        Long horasExtras = scan.nextLong();
        scan.nextLine();

        System.out.println("Ingrese la fecha de ingreso del empleado(dd/mm/aaaa)");
        String fechaIngreso = scan.nextLine();

        System.out.println("Ingrese el area del empleado");
        String area = scan.nextLine();

        System.out.println("Ingrese el cargo del empleado");
        String cargo = scan.nextLine();

        System.out.println("Ingrese los ingresos del empleado");
        Long honorariosHora = scan.nextLong();
        scan.nextLine();

        System.out.println("Ingrese la fecha del contrato (dd/mm/aaaa)");
        String fechaContrato = scan.nextLine();

        EmpleadoEventual nEmpleadoEventual = new EmpleadoEventual(dni, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo, honorariosHora, fechaContrato);
        empleadoEventuals.add(nEmpleadoEventual);
        System.out.println("Empleado eventual registrado correctamente");
    }
}