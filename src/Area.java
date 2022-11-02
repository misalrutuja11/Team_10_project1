import java.util.Scanner;

public class Area {
	Scanner sc=new Scanner(System.in);
	
	public void circleArea() {
		System.out.println("Enter the radius of circle....");
		float r=sc.nextFloat();
		float ca=3.14f*r*r;
		System.out.println("[Area of circle] -:"+ca);
		}
	public void traingleArea() {
		System.out.println("Enter the base and height of a traingle..");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		float ta=0.5f*b*h;
		System.out.println("[Area of traingle] -: "+ta);
	    }
	public void reactangleArea() {
		System.out.println("Enter the length and breadth of reactangle:");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		float ra=l*b;
		System.out.println("[Area of reactangle]-:"+ra);
	    }
	public void squareArea() {
		System.out.println("Enter the length of side of square....");
		float l=sc.nextFloat();
	    float sa=l*l;
	    System.out.println("[Area of sqaure] -:"+sa);
	}
    
}
