import src.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ServiciosAcademicosI {

    List<Estudiante> estudiantes = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();
    Map<Integer, List<Estudiante>> estudiantesPorCurso = new HashMap<>();

    void matricularEstudiante(Estudiante estudiante) throws MatriculaNoAprobadaException;

    void agregarCurso(Curso curso);

    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException;

    void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException;

    public static <matricula> void main(String args[]){

    }
}
