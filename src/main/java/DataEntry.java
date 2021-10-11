import java.util.Scanner;

public class DataEntry {

    Scanner console;
    private byte fibonacciNumber;

    public DataEntry(Scanner console) {
        this.console = console;
    }

    //Setter - Getter number
    public void setNumber(){

        while(!console.hasNextByte())
        {
            System.out.print("Введите число от 0 до 91 или Ctrl+C для выхода: ");
            console.next();
        }

        fibonacciNumber = console.nextByte();
    }

    public byte getNumber() {
        return fibonacciNumber;
    }
}
