package exceptions;

public class AreaException extends Exception{
    @Override
    public String getMessage() {
        return "Area should be > 5";
    }
}
