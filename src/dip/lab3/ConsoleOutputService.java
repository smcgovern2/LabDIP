package dip.lab3;

public class ConsoleOutputService implements OutputService {

    public void outputMessage(InputSource input){
        System.out.println(input.getMessage());
    }

}
