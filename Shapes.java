import java.util.Scanner;

public class Shapes
{
void area(int r1)
{
double Area_val = 3.14*r1*r1;
System.out.println("\nArea of circle with Radius " + r1 + " = " + Area_val);
}

void area(int a1, int b1, int c1) {
int Area_val = a1 * b1 * c1;
System.out.println("\nArea of Cuboid with dimensions " + a1 + " X " + b1 + " X " + c1 + " = " + Area_val);
}

public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the Radius");
int r = sc.nextInt();
System.out.println("Enter the length");
int l = sc.nextInt();
System.out.println("Enter the breadth");
int b = sc.nextInt();
System.out.println("Enter the Height");
int h = sc.nextInt();

Shapes obj1 = new Shapes();
obj1.area(r);
obj1.area(l, b, h);
}
}
