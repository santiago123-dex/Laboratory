package model;

public class Medico extends EmpleadoPlantilla {

    private String especialidad;
    private int numeroConsultorio;

    

    public Medico(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion,
            String ciudadProcedencia, Long codigoEmpleado, Long horasExtras, String fechaIngreso, String area,
            String cargo, Double salarioMensual, Double porcentajeHorasExtras, String especialidad, int numeroConsultorio) {
        super(numeroDeDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo, salarioMensual, porcentajeHorasExtras);
        this.especialidad = especialidad;
        this.numeroConsultorio = numeroConsultorio;
    }

    public void registrarMedico(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion,
            String ciudadProcedencia, Long codigoEmpleado, Long horasExtras, String fechaIngreso, String area,
            String cargo, Double salarioMensual, Double porcentajeHorasExtras, String especialidad, int numeroConsultorio) {
        super.registrarEmpleadoPlantilla(numeroDeDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo, salarioMensual, porcentajeHorasExtras);
        this.especialidad = especialidad;
        this.numeroConsultorio = numeroConsultorio;
    }

    public void imprimirDatosMedico() {
        super.imprimirDatosEmpleadoPlantilla();
        System.out.println("La especialidad del medico es: " + especialidad);
        System.out.println("El numero de consultorio es: " + numeroConsultorio);
    }

}