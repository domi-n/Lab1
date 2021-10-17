package com.nowicka.dominika.figure;

public class Triangle extends Figure implements Printable{
    double a;
    double b;
    double c;
    double area;
    double perimeter;

    public Triangle(double a, double b, double c){
        if (a <= 0 || b<=0 || c<=0){
            throw new IllegalArgumentException("Boki muszą być większe od zera!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        area = calculatePerimeter();
        perimeter = calculatePerimeter();
    }

    @Override
    double calculateArea(){
        double p = this.calculatePerimeter()/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    @Override
    double calculatePerimeter(){
        return a + b + c;}

    @Override
    public void print(){
        System.out.println("Boki trójkąta: " + a + ", "+ b +", "+c);
        System.out.println("Pole trójkąta: " + area);
        System.out.println("Obwód trójkąta: " + perimeter);
    }

}
