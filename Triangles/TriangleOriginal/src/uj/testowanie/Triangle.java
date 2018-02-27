package uj.testowanie;


/**
 * (c) Maciej Mikulski
 * Jagiellonian University
 * Krakow 2017
 */


public class Triangle {

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle(){
        return (a + b > c)  &  (a + c > b)  &  (b + c > a);
    }

    public String type(){
        if(! isTriangle())
            return "Not a triangle";

        if ((a == b) & (b == c))
            return "Equilateral";

        else if (a == b | b == c)
            return "Isosceles";

        return "Scalene";
    }


    private int a, b, c;
}
