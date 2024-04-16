package graphics;
import java.util.Scanner;
public class triangle implements area_cal
{
    double base,height;
    @Override
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input base of triangle:");
        base=sc.nextDouble();
        System.out.println("input height of triangle:");
        height=sc.nextDouble();
        System.out.println("Area of triangle ="+(0.5*base*height));
    }
}