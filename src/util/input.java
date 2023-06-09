package util;
import java.util.Scanner;

public class input {
    private Scanner myScanner;

    public input(){
        myScanner = new Scanner(System.in);
        String userInput = myScanner.next();
    }

    public String getString(){
        System.out.println("Enter a String");
        return myScanner.next();
    }

    public boolean yesNo(){
        System.out.println("Yes or No");
        String userInput = myScanner.next();
        return userInput.equalsIgnoreCase("Yes");
    }

    public int getInt(){
        System.out.printf("%nEnter an integer: 0 - 2%n");
        while(!myScanner.hasNextInt()) {
            System.out.println("Enter a valid integer: ");
            myScanner.next();
        }
        return myScanner.nextInt();
    }

    public int getInt(int min, int max) {
        int num = -1;
        while(num < min || num > max) {
            num = getInt();
            System.out.println("Pick a number between 0 - 2");
        }
        return num;
    }

    public double getDouble(){
        System.out.println("Enter a Double: ");
        while(!myScanner.hasNextDouble()) {
            System.out.println("Enter a valid Double: ");
            myScanner.next();
        }
        return myScanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        double num = 0;
        while(num < min || num > max) {
            num = getDouble();
            System.out.println("Pick a number between 2 - 9");
        }
        return num;
    }
}
