package exceptions;

public class WidthException extends Exception{
    @Override
    public String getMessage() {
        return "Width should be positive";
    }
}
