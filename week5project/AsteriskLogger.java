package week5project;


class AsteriskLogger implements Logger {
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    public void error(String message) {
        String border = "***".repeat(message.length() + 10);
        System.out.println(border);
        System.out.println("***Error: " + message + "***");
        System.out.println(border);
    }
}