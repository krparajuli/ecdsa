import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class EllipticCurve {

	private BigInteger p;
	private BigInteger n;
	private BigInteger seed;
	private BigInteger a = BigInteger.valueOf(-3);
	private BigInteger c;
	private BigInteger b;
	private BigInteger[] xyG;
	private BigInteger xG;
	private BigInteger yG;

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

	public BigInteger getP() {return p;}
	public BigInteger getN() {return n;}
	public BigInteger getSeed() {return seed;}
	public BigInteger getA() {return a;}
	public BigInteger getB() {return b;}
	public BigInteger getC() {return c;}
	public BigInteger[] getXyG() {return xyG;}
	public BigInteger getXG() {return xG;}
	public BigInteger getyG() {return yG;}

	public String toString() {
		//return "Good EllipticCurve";
		return "P = " + BigIntExtend.randomLessThanN(n).toString(2)
			 + "\nxyG = " + xyG[0].toString();
	}
}