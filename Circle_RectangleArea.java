import java.util.Scanner;//input scanner
public class Circle_RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);//construct scanner object
		
		//initialize variables
		
		double fTemp = 0.0; //variable for original temperature
		double cTemp = 0.0; //variable for celsius conversion
		double fTemp2 = 0.0; //variable for converting back to fahrenheit
		
		System.out.print("Enter your temperature in fahrenheit: ");//prompt user to input original temperature in f
		fTemp = in.nextInt();//assign input to variable
		
		cTemp = (fTemp - 32.0)*(5.0/9.0);//set equation for conversion
		fTemp2 = ((cTemp * (9.0/5.0)+32.0));//convert back to fahrenheit

		System.out.printf("Original temperature: %.0f degrees F.\n", fTemp);//output original temp in F
		System.out.printf("Equivalent to: %.0f degrees C.\n", cTemp); // print output of celsius conversion
		System.out.printf("Converted back: %.0f degrees F.\n", fTemp2); // print output conversion back
	}

}
