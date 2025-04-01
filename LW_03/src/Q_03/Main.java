package Q_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius inner circle:");
        double innerRadius=scanner.nextDouble();

        System.out.print("Enter the radius outer circle:");
        double outerRadius=scanner.nextDouble();

        Circle outerCircle = new Circle(outerRadius);
        Circle innerCircle = new Circle(innerRadius);

        double area = outerCircle.computeArea()-innerCircle.computeArea();
        System.out.println("The area is " +area);
    }
}
