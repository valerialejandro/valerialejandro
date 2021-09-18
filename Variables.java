import java.util.Scanner;//import scanner
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);//create scanner class 
		double dnum;//declare double
		float fnum;//declare float
		int inum;//declare integer
		long lnum;//declare long
		short snum;//declare short
		int num1, num2;//declare 2 integer inputs
		
		System.out.print("Enter two integer numberes separated by a space");//prompt the user to enter 2 numbers
		num1 =in.nextInt();
		num2 = in.nextInt();
		
		//multiply both numbers for each type
		dnum = num1*num2;
		fnum = num1*num2;
		inum =num1*num2;
		lnum = num1*num2; 
		snum = (short)(num1*num2);//use numbers 66 and 100 to see what happens when it is over the max
		
		//print out all results for multiplication
		System.out.println("Doubles: " + num1+"*"+num2+"="+dnum);
		System.out.println("Floats: " + num1+"*"+num2+"="+fnum);
		System.out.println("Integers: " + num1+"*"+num2+"="+inum);
		System.out.println("Longs: " + num1+"*"+num2+"="+lnum);
		System.out.println("Shorts: " + num1+"*"+num2+"="+snum);
		//divide both numbers for each type
		dnum = (double) num1/num2;
		fnum = (float)num1/num2;
		inum =num1/num2;
		lnum = num1/num2;
		snum = (short)(num1/num2);
		//print out all result
		System.out.println("Doubles: " + num1+"/"+num2+"="+dnum);
		System.out.println("Floats: " + num1+"/"+num2+"="+fnum);
		System.out.println("Integers: " + num1+"/"+num2+"="+inum);
		System.out.println("Longs: " + num1+"/"+num2+"="+lnum);
		System.out.println("Shorts: " + num1+"/"+num2+"="+snum);
	}

}
