
public class WeakPasswordException extends Exception {

	
	public WeakPasswordException(String e) {
		super(e);
	}
	public WeakPasswordException() {
		super("WeakPassword: ");
	}
}
