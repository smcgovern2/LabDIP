package dip.lab3;

public class Startup {

    public static void main(String[] args) {

        OutputService gui = new SimpleGUIOutputService();
        OutputService console = new ConsoleOutputService();

        InputService welcome = new WelcomeMessageInputService();
        InputService keyboard = new KeyboardInputService();
        MessageWriter mw = new MessageWriter();

        mw.writeMessage(welcome,gui);
        mw.writeMessage(welcome, console);

        mw.writeMessage(keyboard, gui);
        mw.writeMessage(keyboard, console);

    }
}
