package Tugas3Asistensi;

import java.util.Scanner;

public class TestLinearEquation {

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.print("Input : ");
        String input = baca.nextLine();
        String[] angka = input.split("\\s");
        double[] u = new double[angka.length];
        for (int i = 0; i < angka.length; i++) {
            u[i] = Double.parseDouble(angka[i]);
        }
        System.out.println("\nOutput : \nSistem persamaannya : ");
        
        
        if (angka.length==6) {
            System.out.println(angka[0] + "x + " + angka[1] + "y = " + u[4]);
            System.out.println(angka[2] + "x + " + angka[3] + "y = " + u[5]);
        
            LinearEquation LE = new LinearEquation(u[0],u[1],u[2],u[3],u[4],u[5]);
            LE.printInfo(); 
        }
        else {
            System.out.println(angka[0] + "x + " + angka[1] + "y = " + u[6]);
            System.out.println(angka[2] + "x + " + angka[3] + "y = " + u[7]);
            System.out.println(angka[4] + "x + " + angka[5] + "y = " + u[8]);
            LinearEquation LE1 = new LinearEquation();
            LE1.setA(u[0]);
            LE1.setB(u[1]);
            LE1.setC(u[2]);
            LE1.setD(u[3]);
            LE1.setE(u[4]);
            LE1.setF(u[5]);
            LE1.setG(u[6]);
            LE1.setH(u[7]);
            LE1.setI(u[8]);
            LE1.printInfo();
        }        
    }
    
}
