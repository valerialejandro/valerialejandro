import java.util.Scanner;//input scanner
public class CelsiusConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);//construct scanner object
		
		//initialize variables
		
		double fTemp = 0.0; //variable for original temperature
		double cTemp = 0.0; //variable for celsius conversion
		
		System.out.print("Enter your temperature in fahrenheit: ");//prompt user to input original temperature in f
		fTemp = in.nextInt();//assign input to variable
		
		cTemp = (fTemp - 32.0)*(5.0/9.0);//set equation for conversion

		System.out.printf("Original temperature: %d degrees F.\n", (int)fTemp);//output original temp in F
		System.out.printf("Equivalent to: %d degrees C.\n",(int) cTemp); // print output of celsius conversion
		System.out.printf("Converted back: %d degrees F.\n", (int)fTemp); // print output conversion back
	}

}
