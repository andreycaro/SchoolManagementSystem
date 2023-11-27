package src;

public class Curso {
    private int id;
    private String nombre;
    private int descriptionCursoAnterior;
    private boolean aprobo;
    private int descriptionNuevoCurso;

    public void newCurse(boolean verdadero) {
        if (verdadero) {
            System.out.println("Aprobado para el Siguiente Curso");
        } else {
            System.out.println("Debe repetir Curso");
        }

    }
}




