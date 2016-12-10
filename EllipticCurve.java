import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class EllipticCurve {

	public BigInteger p;
	public BigInteger n;
	public BigInteger seed;
	public BigInteger c;
	public BigInteger b;
	public BigInteger[] xyG;
	public BigInteger xG;
	public BigInteger yG;

	public EllipticCurve() {
		try {	
			File f = new File("RandomFpCurves");
		    Scanner s = new Scanner(f);
	    	p = new BigInteger(s.nextLine());
	    	n = new BigInteger(s.nextLine());
	    	seed = new BigInteger(s.nextLine(), 16);
	    	c = new BigInteger(s.nextLine(), 16);
	    	b = new BigInteger(s.nextLine(), 16);
	    	xG = new BigInteger(s.nextLine(), 16);
	    	yG = new BigInteger(s.nextLine(), 16); 	
	    	xyG = new BigInteger[2];
	    	xyG[0] = xG;
	    	xyG[1] = yG;
		    s.close();
	    } catch (FileNotFoundException e) {
			System.out.println("Error!");	     
		}
	}

	public String toString() {
		//return "Good EllipticCurve";
		return "P = " + BigIntExtend.randomLessThanN(n).toString(2)
			 + "\nxyG = " + xyG[0].toString();
	}
}