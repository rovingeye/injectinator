package nl.rovingeye.injectinator.example;

public class AnotherLogger implements IAnotherLogger {

    @Override
    public void info(String message ) {
        System.out.println("Via AnotherLogger: " + message);
    }
}