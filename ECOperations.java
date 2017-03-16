import java.math.BigInteger;
import java.lang.String;

public class ECOperations {

	
	public static BigInteger[] negation(BigInteger[] p) {
		BigInteger[] q = new BigInteger[2];
		q[0] = p[0];
		q[1] = p[1].multiply(BigInteger.valueOf(-1));
		return q;
	}

	public static BigInteger[] pointAddition(BigInteger[] p1, BigInteger[] p2, BigInteger n) {
		BigInteger[] val = new BigInteger[2];

		BigInteger a = (p2[1].subtract(p1[1]));
		BigInteger b = (p2[0].subtract(p1[0]));
		b = b.modInverse(n);
		a = a.multiply(b).mod(n);
		b = a.multiply(a);
		b = ((b.subtract(p1[0])).subtract(p2[0])).mod(n);
		val[0] = b;

		val[1] = (a.multiply(p1[0].subtract(b))).subtract(p1[1]).mod(n);

		return val;
	}

	public static BigInteger[] pointDoubling(BigInteger[] p1, BigInteger n, BigInteger a) {
		BigInteger[] val = new BigInteger[2];

		BigInteger i = p1[0].multiply(p1[0]).multiply(BigInteger.valueOf(3)).add(a);
		BigInteger j = (p1[1].multiply(BigInteger.valueOf(2))).modInverse(n);
		i = (i.multiply(j)).mod(n);
		j = i.multiply(i);
		j = (j.subtract(p1[0].multiply(BigInteger.valueOf(2)))).mod(n);
		val[0] = j;

		val[1] = (i.multiply(p1[0].subtract(j))).subtract(p1[1]).mod(n);

		return val;
	}

	public static BigInteger[] pointMultiply(BigInteger[] p1, BigInteger n, BigInteger a, BigInteger mult) {
		BigInteger[] val = new BigInteger[2];
		BigInteger[] doubledP = p1;

		boolean set = false;
		String binMult = mult.toString(2);
		int binMultLen = binMult.length();


		for (int c=binMultLen-1; c>= 0; c--) {
			// System.out.print("|"+c+"|");
			if (binMult.charAt(c) == '1') {
				if (set) {
					val = pointAddition(val, doubledP, n);
				} else {
					val = doubledP;
					set = true;
				}
			}
			doubledP = pointDoubling(doubledP, n, a);
		}
		return val;
	}


	
	
	//public addInfinity
 
	public static String printPoint(BigInteger[] p) {
		return "Result: ("+ p[0].toString() +","+p[1].toString()+")";
	}
}