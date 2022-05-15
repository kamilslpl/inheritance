package pl.sda.arp4.inheritance.IShape;
/*

Zadanie IShape (interfejs):
        Napisz interfejs IShape który posiada metody:
public double calculateArea() - oblicza pole
public double calculateCircumference() - oblicza obwód
        Stwórz klasę Circle, Square i Rectangle które powinny posiadać
        odpowiednią ilość pól. Wszystkie powinny
        implementować interfejs IShape
        (napisz obie metody we wszystkich klasach końcowych).
        Stwórz w mainie (stwórz oddzielną klasę Main)
        pętlę parsującą komendy. Dopuszczalne komendy to:
        square
        rectangle
        circle
        Po wpisaniu kształtu poproś użytkownika o podanie:
        1 parametru dla Square i Circle
        2 parametrów dla Rectangle
        Oblicz i wypisz pole i obwód kształtu na ekran.
*/

import java.util.Scanner;

public class MainIShapeRozwiazanie2MniejKodu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select shape: (square, circle, rectangle)");
        String shapeName = scanner.next();

        IShape shape = null;
        if (shapeName.equalsIgnoreCase("circle")) {
            System.out.println("Please provide radius:");
            double inputRadius = scanner.nextDouble();

            shape = new Circle(inputRadius);
        } else if (shapeName.equalsIgnoreCase("square")) {
            System.out.println("Please provide length of the edge:");
            double inputEdge = scanner.nextDouble();

            shape = new Square(inputEdge);
        } else if (shapeName.equalsIgnoreCase("rectangle")) {
            System.out.println("Please provide length of the edge A:");
            double inputEdgeA = scanner.nextDouble();
            System.out.println("Please provide length of the edge B:");
            double inputEdgeB = scanner.nextDouble();

            shape = new Rectangle(inputEdgeA, inputEdgeB);
        } else {
            System.err.println("Provided shape can't be calculated.");
        }

        if (shape != null) {
            System.out.println("Area          is : " + shape.calculateArea());
            System.out.println("Circumference is : " + shape.calculateCircumference());
        }
    }
}




