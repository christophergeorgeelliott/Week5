package week5project;

public class App {
    public static void main(String[] args) {
        // Instantiate an instance of each logger class
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test both methods on both instances
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}