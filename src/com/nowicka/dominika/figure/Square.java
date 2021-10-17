package com.nowicka.dominika.figure;

public class Square extends Figure implements Printable {
    double a;
    double area;
    double perimeter;

    public Square(double a){
        if (a <= 0){
            throw new IllegalArgumentException("Bok musi być większy od zera!");
        }
        this.a = a;
        area = calculatePerimeter();
        perimeter = calculatePerimeter();
    }
    @Override
    double calculateArea(){
       return a*a;
    }
    @Override
    double calculatePerimeter(){
        return 4*a;}

    @Override
    public void print(){
        System.out.println("Bok kwadratu: " + a);
        System.out.println("Pole kwadratu: " + area);
        System.out.println("Obwód kwadratu: " + perimeter);
    }

}
