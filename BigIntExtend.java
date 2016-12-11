import java.math.BigInteger;
import java.util.Random;

public class BigIntExtend {

	public static BigInteger randomLessThanN(BigInteger n) {
		BigInteger r;
		Random rnd = new Random();
		do {
		    r = new BigInteger(n.bitLength(), rnd);
		} while (r.compareTo(n) >= 0); //ALSO greate than 0
		return r;
	}
}