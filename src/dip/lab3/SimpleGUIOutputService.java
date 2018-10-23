package dip.lab3;

import javax.swing.*;

public class SimpleGUIOutputService implements OutputService{

    public void outputMessage (InputService input){
        JOptionPane.showMessageDialog(null,input.getMessage());
    }

}
