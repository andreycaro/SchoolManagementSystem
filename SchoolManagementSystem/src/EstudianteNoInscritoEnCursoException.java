package src;

public class EstudianteNoInscritoEnCursoException extends Exception {
    public EstudianteNoInscritoEnCursoException(String message) {
        super(message);
    }

    public EstudianteNoInscritoEnCursoException(String message, Throwable cause) {
        super(message, cause);
    }

    public EstudianteNoInscritoEnCursoException(Throwable cause) {
        super(cause);
    }

    public EstudianteNoInscritoEnCursoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public EstudianteNoInscritoEnCursoException() {
    }
}
