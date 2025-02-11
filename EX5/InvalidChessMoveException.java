package EX5;

public class InvalidChessMoveException extends RuntimeException{
    public InvalidChessMoveException(String message){
        super(message);
    }
}
