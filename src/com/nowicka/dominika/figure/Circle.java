package com.nowicka.dominika.figure;

public class Circle extends Figure implements Printable {double a;
    double r;
    double area;
    double perimeter;

    public Circle(double r){
        if (r <= 0){
            throw new IllegalArgumentException("Promień musi być większy od zera!");
        }
        this.r = r;
        area = calculatePerimeter();
        perimeter = calculatePerimeter();
    }

    @Override
    double calculateArea(){
        return 3.14 * r * r;
    }

    @Override
    double calculatePerimeter(){
        return 2 * 3.14 * r;}

    @Override
    public void print(){
        System.out.println("Promień okręgu: " + r);
        System.out.println("Pole koła: " + area);
        System.out.println("Obwód okręgu: " + perimeter);
    }
}
