import src.Estudiante;

public class Main {

    public static <Estudent> void main(String args[]){

        Estudiante estu1 = new Estudiante(1014740734, "Miranda", "Caro", "Enero 2017", "Aprobado");

        System.out.println("El ID del Estudiente es: " + estu1.getId());
        System.out.println("El nombre del Estudiente es: " + estu1.getNombre());
        System.out.println("El Apellido del Estudiente es: " + estu1.getApellido());
        System.out.println("La fecha de Nacimiento es: " + estu1.getFechaDeNacimiento());
        System.out.println("Los Datos del Estudiente son: " + estu1.getEstado());


    }

}
