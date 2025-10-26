package model;

public class EmpleadoEventual extends Empleado {
    private Long honorariosHora;
    private String fechaContrato;

    public EmpleadoEventual(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion, String ciudadProcedencia, Long codigoEmpleado, Long horasExtras, String fechaIngreso, String area, String cargo, Long honorariosHora, String fechaContrato) {
        super(numeroDeDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia, codigoEmpleado,
                horasExtras, fechaIngreso, area, cargo);
        this.honorariosHora = honorariosHora;
        this.fechaContrato = fechaContrato;
    }

    public void registrarEmpleadoEventual(Long numeroDeDNI, String nombre, String apellido,
            String fechaDeNacimiento, String direccion,
            String ciudadProcedencia, Long codigoEmpleado, Long horasExtras, String fechaIngreso, String area,
            String cargo, Long honorariosHora, String fechaContrato) {
            super.imprimirDatosEmpleado();
            this.honorariosHora = honorariosHora;
            this.fechaContrato = fechaContrato;
    }

    public void imprimirDatosEmpleadoEventual(){
        super.imprimirDatosEmpleado();
        System.out.println("Los honorarios del empleado eventual son: " + honorariosHora);
        System.out.println("La fecha del contrato del empleado eventual es: " + fechaContrato);
    }
}
