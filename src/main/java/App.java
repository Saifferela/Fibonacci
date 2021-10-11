import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        System.out.print("Введите число от 0 до 91: ");

        DataEntry dataEntry = new DataEntry(console);

        //Выполнения ввода пользователя
        dataEntry.setNumber();

        CalculateFibonacciNumber calculate = new CalculateFibonacciNumber();
        if(calculate.fibonacci(dataEntry.getNumber())==-1)
            System.out.println("Нужно ввести число в диапазоне от 0 до 91!");
        else
            System.out.printf("fibonacci(%d) возращает %d%n",dataEntry.getNumber(), calculate.fibonacci(dataEntry.getNumber()));

    }
}
