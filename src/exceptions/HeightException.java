package exceptions;

public class HeightException extends Exception{
    @Override
    public String getMessage() {
        return "Height should be positive";
    }
}
