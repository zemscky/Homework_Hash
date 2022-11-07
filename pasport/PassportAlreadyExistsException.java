package pasport;

public class PassportAlreadyExistsException extends Exception{
    public PassportAlreadyExistsException() {
    }

    public PassportAlreadyExistsException(String message) {
        super(message);
    }
}
