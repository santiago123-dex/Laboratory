package model;

public class Empleado extends Person {
    private Long codigoEmpleado;
    private Long horasExtras;
    private String fechaIngreso;
    private String area;
    private String cargo;

    public Empleado(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion,
            String ciudadProcedencia, Long codigoEmpleado, Long horasExtras, String fechaIngreso, String area,
            String cargo) {
        super(numeroDeDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia);
        this.codigoEmpleado = codigoEmpleado;
        this.horasExtras = horasExtras;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
    }

    public void registrarEmpleado(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento,
            String direccion, String ciudadProcedencia, Long codigoEmpleado, Long horasExtras, String fechaIngreso,
            String area,
            String cargo) {
        super.registrarPersona(numeroDeDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia);
        this.codigoEmpleado = codigoEmpleado;
        this.horasExtras = horasExtras;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
    }

    public void imprimirDatosEmpleado() {
        super.imprimirDatos();
        System.out.println("El codigo del empleado es: " + codigoEmpleado);
        System.out.println("Las horas extras del empleado fueron: " + horasExtras);
        System.out.println("La fecha de ingreso del empleado fue: " + fechaIngreso);
        System.out.println("El area del empleado es: " + area);
        System.out.println("EL cargo del empleado es: " + cargo);
    }
}
