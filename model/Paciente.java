package model;

public class Paciente extends Person {
    private Long numberHistoryClinic;
    private String sex;
    private String bloodType;
    private String allergyMedications;

    public Paciente(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion,
            String ciudadProcedencia, Long numberHistoryClinic, String sex, String bloodType, String allergyMedications) {
        super(numeroDeDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia);
        this.numberHistoryClinic = numberHistoryClinic;
        this.sex = sex;
        this.bloodType = bloodType;
        this.allergyMedications = allergyMedications;
    }


    public void registrarPaciente(Long numeroDeDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion,
            String ciudadProcedencia, Long numberHistoryClinic, String sex, String bloodType, String allergyMedications) {
        super.registrarPersona(numeroDeDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia);
        this.numberHistoryClinic = numberHistoryClinic;
        this.sex = sex;
        this.bloodType = bloodType;
        this.allergyMedications = allergyMedications;
    }


    public void imprimirDatosPaciente() { 
        super.imprimirDatos();
        System.out.println("El numero de historia clinica es: " + numberHistoryClinic);
        System.out.println("El sexo del paciente es: " + sex);
        System.out.println("El tipo de sangre es: " + bloodType);
        System.out.println("El paciente es alergico a los medicamentos: " + allergyMedications);
    }
}
