package com.nowicka.dominika;

import com.nowicka.dominika.figure.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            readFromConsole();
        } catch (IllegalArgumentException a) {
            System.out.println("Podano niepoprawny parametr, parametry muszą być większe od 0!");
        } catch (InputMismatchException a) {
            System.out.println("Podano parametr niepoprawnego typu!");
        }
    }

    private static void readFromConsole() throws IllegalArgumentException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        Printable figure;
        boolean exit = false;

        while (!exit) {

            System.out.println("Wybierz figure i naciśnij enter: ");
            System.out.println("1 - Kwadrat");
            System.out.println("2 - Okrąg");
            System.out.println("3 - Trójkąt");
            System.out.println("4 - Graniastosłup prawidłowy");
            int myInt = scanner.nextInt();

            switch (myInt) {
                case 1:
                    System.out.println("Podaj długość boku:");
                    double d = scanner.nextDouble();
                    figure = new Square(d);
                    figure.print();
                    break;
                case 2:
                    System.out.println("Podaj promień: ");
                    double r = scanner.nextDouble();
                    figure = new Circle(r);
                    figure.print();
                    break;
                case 3:
                    System.out.println("Podaj bok a: ");
                    double a = scanner.nextDouble();
                    System.out.println("Podaj bok b: ");
                    double b = scanner.nextDouble();
                    System.out.println("Podaj bok c: ");
                    double c = scanner.nextDouble();

                    figure = new Triangle(a, b, c);
                    figure.print();
                    break;
                case 4:
                    System.out.println("Wybierz podstawe:");
                    System.out.println("1 - Kwadrat");
                    System.out.println("2 - Trójkąt");
                    int baseFigure = scanner.nextInt();

                    switch (baseFigure) {
                        case 1:
                            System.out.println("Podaj długość boku podstawy:");
                            double y = scanner.nextDouble();
                            System.out.println("Podaj wysokość graniastosłupa:");
                            double height1 = scanner.nextDouble();

                            Figure square = new Square(y);
                            figure = new Prism(square, height1);
                            figure.print();
                            break;

                        case 2:
                            System.out.println("Podaj długość boku trójkąta: ");
                            double l = scanner.nextDouble();

                            Figure triangle = new Triangle(l, l, l);

                            System.out.println("Podaj wysokość graniastosłupa: ");
                            double height2 = scanner.nextDouble();
                            figure = new Prism(triangle, height2);
                            figure.print();
                            break;
                    }

            }
            System.out.println("Co chcesz zrobić?");
            System.out.println("1 - zakończ");
            System.out.println("2 - inna figura");
            int nextAction = scanner.nextInt();

            if (nextAction == 1) {
                exit = true;
            }
        }
    }
}
