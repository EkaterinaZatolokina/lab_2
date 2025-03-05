package exceptions;

public class RadiusException extends Exception{
    @Override
    public String getMessage() {
        return "Radius should be positive";
    }
}
