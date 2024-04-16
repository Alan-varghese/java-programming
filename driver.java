import graphics.circle;
import graphics.rectangle;
import graphics.square;
import graphics.triangle;
import java.util.Scanner;
public class driver
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int choice;
circle obj1=new circle();
rectangle obj2=new rectangle();
square obj3=new square();
triangle obj4=new triangle();
System.out.println("choose any 1.circle 2.rectangle 3.square 4.triangle");
choice=sc.nextInt();
switch (choice)
{
case 1:
obj1.area();
break;

case 2:
obj2.area();
break;

case 3:
obj3.area();
break;

case 4:
obj4.area();
break;

default:
break;
}
}
}