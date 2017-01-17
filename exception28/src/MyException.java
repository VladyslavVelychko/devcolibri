import java.io.PrintStream;

public class MyException extends Exception{

    @Override
    public void printStackTrace(PrintStream printStream) {
        System.err.println("It's my first exception");
    }
}