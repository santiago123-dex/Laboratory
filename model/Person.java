package model;

public class Person {
    private Long numeroDeDNI;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ciudadProcedencia;

    public Person() {
    }

    public Person(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion,
            String ciudadProcedencia) {
        this.numeroDeDNI = numeroDeDNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
        this.ciudadProcedencia = ciudadProcedencia;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Direccion: " + direccion);
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("Ciudad de procedencia: " + ciudadProcedencia);
        System.out.println("Documento de identidad: " + numeroDeDNI);
    }

    public void registrarPersona(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion, String ciudadProcedencia) {
        this.numeroDeDNI = numeroDeDNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
        this.ciudadProcedencia = ciudadProcedencia;
        System.out.println("Persona registrada exitosamente!");
    }

}
