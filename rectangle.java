package graphics;
import java.util.Scanner;
public class rectangle implements area_cal
{
    int length,breadth;
    @Override
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input length of rectangle:");
        length=sc.nextInt();
        System.out.println("input breadth of rectangle:");
        breadth=sc.nextInt();
        System.out.println("area of rectangle ="+(length*breadth));
    }
}