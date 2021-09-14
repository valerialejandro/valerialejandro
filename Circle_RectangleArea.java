import java.util.Scanner; //import scanner input
public class Circle_RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);//create a scanner object
		
		//declaration and initialization of variables
		
		double radiusC = 0.0;//variable stores radius of circle
		double widthR = 0.0; //variable to store width of rectangle
		double lengthR = 0.0; //variable to store length of rectangle
		final double piConstant = Math.PI;//create a constant for pi
		double areaC = 0.0; //variable for area of a circle
		double areaR = 0.0; //variable for area of rectangle
		
		System.out.print("Enter your circle's radius: ");//prompt the user to input the radius
		radiusC = in.nextDouble();//input the radius
		
		
		areaC = piConstant*Math.pow(radiusC,2);//calculate area of circle pi*radius^2
		
		System.out.print("Enter your rectangle's width: ");//prompt user to input width
		widthR = in.nextDouble();//input the width
		
		System.out.print("Enter your rectangles's length: ");//prompt user to input the length
		lengthR = in.nextDouble();//input the length
		
		areaR = widthR*lengthR;//calculate the area of a rectangle width*length
		
		System.out.printf("The area of a circle with a radius of %.1f is: %.2f\n", radiusC, areaC );//output the circle's area
		System.out.printf("The area of a rectangle with a width of %.1f and a length of %.1f is: %.2f", widthR, lengthR, areaR);//output the rectangles's area
	}

}