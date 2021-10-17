package com.nowicka.dominika.figure;

public class Prism implements Printable {
    Figure base;
    double height;
    double lateralSurfaceArea;
    double area;
    double volume;

    public Prism(Figure base, double height){
        this.base = base;
        this.height = height;
        lateralSurfaceArea = calculateLateralSurfaceArea();
        area = calculateArea();
        volume = calculateVolume();
    }

    double calculateLateralSurfaceArea(){
       if(base instanceof Triangle) {
           return 3 * ((Triangle)base).a * height;
       } else if (base instanceof Square){
           return 4 * ((Square)base).a * height;
       }
       else {throw new IllegalArgumentException("Podstawą musi być trójkąt lub kwadrat");
       }
    }

    double calculateArea(){
        return 2 * base.calculateArea() + lateralSurfaceArea;
    }

    double calculateVolume(){
        return base.calculateArea() * height;
    }

    @Override
    public void print(){
        System.out.println("Pole podstawy: " + base.calculateArea());
        System.out.println("Wysokość: " + height);
        System.out.println("Pole powierzchni graniastosłupa: " + area);
        System.out.println("Objętość graniastosłupa: " + volume);
    }
}
