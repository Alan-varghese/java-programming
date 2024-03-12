import java.util.Scanner;

public class Complex {
    int r;
    int i;

    Complex(int real, int img) {
        r = real;
        i = img;
    }

    void display() {
        System.out.println(r + "+" + i + "i");
    }

    static Complex add(Complex c1, Complex c2) {
        int real = c1.r + c2.r;
        int img = c1.i + c2.i;
        return new Complex(real, img);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter real and imaginary parts of first complex number:");
        int real1 = sc.nextInt();
        int img1 = sc.nextInt();
        
        System.out.println("Enter real and imaginary parts of second complex number:");
        int real2 = sc.nextInt();
        int img2 = sc.nextInt();

        Complex first = new Complex(real1, img1);
        Complex second = new Complex(real2, img2);

        System.out.println("Complex Numbers are:");
        first.display();
        second.display();

        Complex result = add(first, second);
        System.out.println("After Addition=");
        result.display();

        sc.close();
    }
}
