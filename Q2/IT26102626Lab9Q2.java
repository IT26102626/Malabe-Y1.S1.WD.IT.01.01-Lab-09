import java.util.Scanner;
public class IT26102626Lab9Q2{
 public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter radius :");
  double radius = input.nextDouble();
  
  double area = circleArea(radius);
  System.out.print("Circle Area is: " + area);
 }
	
 public static double circleArea(double radius){
  double Area = 3.14*radius*radius;
  return Area;
 }
}