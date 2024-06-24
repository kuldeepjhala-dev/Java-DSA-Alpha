import java.util.*;

class ComplexNumbers {
    int real;
    int imag;

    ComplexNumbers(int r, int i) {
        real = r;
        imag = i;
    }

    public static ComplexNumbers add(ComplexNumbers a, ComplexNumbers b) {
        ComplexNumbers c = new ComplexNumbers(0, 0);
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;

        return c;
    }

    public static ComplexNumbers sub(ComplexNumbers a, ComplexNumbers b) {
        ComplexNumbers c = new ComplexNumbers(0, 0);
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;

        return c;
    }

    public static ComplexNumbers multiply(ComplexNumbers a, ComplexNumbers b) {
        int x = a.real;
        int y = a.imag;

        int p = b.real;
        int q = b.imag;

        ComplexNumbers c = new ComplexNumbers(0, 0);
        c.real = x * p - y * q;
        c.imag = x * q + p * y;

        return c;
    }

    public static void printComplex(ComplexNumbers c) {
        if (c.real == 0 && c.imag != 0) {
            System.out.println();
        }

        System.out.println(c.real + " + " + c.imag + "i");
    }

}

public class Solution {
    public static void main(String[] args) {
        ComplexNumbers a = new ComplexNumbers(7, 8);
        ComplexNumbers b = new ComplexNumbers(2, 5);

        ComplexNumbers addition = ComplexNumbers.add(a, b);
        ComplexNumbers.printComplex(addition);

        ComplexNumbers subtraction = ComplexNumbers.sub(a, b);
        ComplexNumbers.printComplex(subtraction);

        ComplexNumbers multiplication = ComplexNumbers.multiply(a, b);
        ComplexNumbers.printComplex(multiplication);

    }
}