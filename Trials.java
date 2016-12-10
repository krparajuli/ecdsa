import java.math.BigInteger;

public class Trials {

	public static void main(String[] args) {
		BigInteger n = new BigInteger("23");
		BigInteger nume = BigInteger.valueOf(4);
		BigInteger deno = BigInteger.valueOf(9).modInverse(n);
		BigInteger exp = deno.multiply(nume).mod(n);
		BigInteger val = (exp.multiply(exp)).subtract(nume).subtract(BigInteger.valueOf(13)).mod(n);

		System.out.println(n);
		System.out.println(nume);
		System.out.println(val);
	}
}