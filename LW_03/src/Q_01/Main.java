package Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperate in  celsuis value:");
        double celsius = scanner.nextDouble();

        Temperature temp = new Temperature();
        temp.setCelsius(celsius);
        System.out.println("The celsius is converted into fahrenheit :"+temp.toFahrenheit());

        //Q_02
        System.out.print("Enter the Temperate in fahrenheit :");
        double fahrengeit = scanner.nextDouble();

        Temperature temp1 = new Temperature();
        temp1.setFahrenheit(fahrengeit);
        System.out.println("The fahrenheit is converted into fahrenheit " +temp1.toCelsius());


    }
}
