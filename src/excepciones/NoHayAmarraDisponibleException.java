package excepciones;

@SuppressWarnings("serial")
public class NoHayAmarraDisponibleException extends Exception {

	public NoHayAmarraDisponibleException(String mensaje) {
		super(mensaje);
	}
}
