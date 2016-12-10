import java.math.BigInteger;

public class ECOperations {

	
	public static BigInteger[] negation(BigInteger[] p) {
		BigInteger[] q = new BigInteger[2];
		q[0] = p[0];
		q[1] = p[1].multiply(BigInteger.valueOf(-1));
		return q;
	}

	public static BigInteger[] pointAddition(BigInteger[] a, BigInteger[] b) {


		return a;
	}
}