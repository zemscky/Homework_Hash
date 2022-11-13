package product;

public class RecipeAlreadyExistsException extends RuntimeException{
    public RecipeAlreadyExistsException() {
    }

    public RecipeAlreadyExistsException(String message) {
        super(message);
    }
}
