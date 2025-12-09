public class InputException extends Exception {
    public InputException(final String message) {
        super(message);
    }

    public String getDetailMessage() {
        return "Ошибка ввода: " + getMessage();
    }
}