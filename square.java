package graphics;
import java.util.Scanner;
public class square implements area_cal
{
    double side;
    @Override
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side of square:");
        side=sc.nextDouble();
        System.out.println("Area of square ="+(side*side));
    }
}