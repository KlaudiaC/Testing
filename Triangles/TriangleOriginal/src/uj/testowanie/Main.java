package uj.testowanie;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a,b,c;

        try {
            System.out.println("Input a:");
            a = in.nextInt();
            System.out.println("Input b:");
            b = in.nextInt();
            System.out.println("Input c:");
            c = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
            return;
        }

        Triangle t = new Triangle(a,b,c);

        System.out.println(t.type());
    }



}
