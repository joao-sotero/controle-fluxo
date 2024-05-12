package exception;

public class ParametrosInvalidosException extends Exception{
	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException() {
		super("Parametros invalidos, valide se o segundo valor é maior que o primeiro!!");
	}
}