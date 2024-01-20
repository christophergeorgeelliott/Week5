package week5project;

class SpacedLogger implements Logger {
    public void log(String message) {
        System.out.println(message.replace("", " ").trim());
    }

    public void error(String message) {
        System.out.println("ERROR: " + message.replace("", " ").trim());
    }
}