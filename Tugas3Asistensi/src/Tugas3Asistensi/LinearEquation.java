package Tugas3Asistensi;

public class LinearEquation {
    private double a, b, c, d, e, f, g, h, i;

    public LinearEquation() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public boolean cekSolusi() {
        if ((a*d)-(b*c) == 0)
            return false;
        else
            return true;
    }
    
    public void printInfo() {
        System.out.println("\nHasilnya : ");
        
        if (g==0 && h==0) {
            if (cekSolusi()==true) {
                double hasilX = ((e*d)-(b*f)) / ((a*d)-(b*c));
                double hasilY = ((a*f)-(e*c)) / ((a*d)-(b*c));
                System.out.println("x = " + String.format("%.2f",hasilX) + " , y = " + String.format("%.2f",hasilY));
            }
            else {
                System.out.println("Sistem tidak memiliki penyelesaian.");
            } 
        }
        else {
            double hasilX1 = ((g*d)-(b*h)) / ((a*d)-(b*c));
            double hasilY1= ((a*h)-(g*c)) / ((a*d)-(b*c));
            System.out.println("x = " + String.format("%.2f",hasilX1) + " , y = " + String.format("%.2f",hasilY1));
            
            double hasilX2 = ((g*f)-(b*i)) / ((a*f)-(b*e));
            double hasilY2= ((a*i)-(g*e)) / ((a*f)-(b*e));
            System.out.println("x = " + String.format("%.2f",hasilX2) + " , y = " + String.format("%.2f",hasilY2));
            
            double hasilX3 = ((h*f)-(d*i)) / ((c*f)-(d*e));
            double hasilY3= ((c*i)-(h*e)) / ((c*f)-(d*e));
            System.out.println("x = " + String.format("%.2f",hasilX3) + " , y = " + String.format("%.2f",hasilY3));
               
        }
        
    }
    
}
