package model;

public class EmpleadoPlantilla extends Empleado{
    private Double salarioMensual;
    private Double porcentajeHorasExtras;

    public EmpleadoPlantilla(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion,
            String ciudadProcedencia, Long codigoEmpleado, Long horasExtras, String fechaIngreso, String area,
            String cargo, Double salarioMensual, Double porcentajeHorasExtras){
        super(numeroDeDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo);
        this.salarioMensual = salarioMensual;
        this.porcentajeHorasExtras = porcentajeHorasExtras;
    }

    public void registrarEmpleadoPlantilla(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion,
            String ciudadProcedencia, Long codigoEmpleado, Long horasExtras, String fechaIngreso, String area,
            String cargo, Double salarioMensual, Double porcentajeHorasExtras){
            super.registrarEmpleado(numeroDeDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo);
            this.salarioMensual = salarioMensual;
            this.porcentajeHorasExtras = porcentajeHorasExtras;
    }

    public void imprimirDatosEmpleadoPlantilla(){
        super.imprimirDatosEmpleado();
        System.out.println("El salario mensual del empleado es: " + salarioMensual);
        System.out.println("El porcentaje de horas extras es de: " + porcentajeHorasExtras);
    }
}
