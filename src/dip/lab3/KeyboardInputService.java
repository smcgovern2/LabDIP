package dip.lab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardInputService implements InputService {

    @Override
    public String getMessage() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Input Message:");
        try{
            String message = br.readLine();
            return message;
        } catch (Exception e) {
            return "Invalid Keyboard Input";
        }
    }
}
