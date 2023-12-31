package src;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String estado;

    public Estudiante(int id, String nombre, String apellido, String fechaDeNacimiento, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void nombreEstudiante(){
        System.out.println("Nombre del Alumno");
    }

    public void apellidoEstudiante() {
        System.out.println("Nombre del Apellido");
    }

    public void fechaNacimiento() {
        System.out.println("Fecha de Nacimiento");
    }

    public void stateSystem() {
        System.out.println("Estado en el Sistema");
    }
}
