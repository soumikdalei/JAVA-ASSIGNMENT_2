import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three points for a triangle:-");
        Double x1=sc.nextDouble();
        Double y1=sc.nextDouble();
        Double x2=sc.nextDouble();
        Double y2=sc.nextDouble();
        Double x3=sc.nextDouble();
        Double y3=sc.nextDouble();
        double side1=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        double side2=Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2,2),0.5);
        double side3=Math.pow(Math.pow(x1-x3,2)+Math.pow(y1-y3,2),0.5);
        double s=(side1+side2+side3)/2f;
        double area=Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
        System.out.println("The area of the triangle is "+(float)area);


    }
}
