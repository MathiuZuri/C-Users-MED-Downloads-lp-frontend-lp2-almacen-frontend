package pe.edu.upeu.sysasistencia.excepcion;

public class ModelNotFoundException extends RuntimeException{
    public ModelNotFoundException(String message) {
        super(message);
    }
}
