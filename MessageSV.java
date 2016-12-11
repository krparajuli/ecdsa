import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;



public class MessageSV {
	
	public static void messageSign(String msg, BigInteger n, BigInteger[] g, BigInteger a) throws NoSuchAlgorithmException {
		BigInteger k = BigIntExtend.randomLessThanN(n);

		BigInteger[] kG = ECOperations.pointMultiply(g, n, a, k);
		BigInteger r;
		do {
			r = kG[0].mod(n);
		} while (r.compareTo(BigInteger.ZERO) == 0);
		BigInteger kInv = k.modInverse(n);

		BigInteger bi = new BigInteger(SHAsum(msg.getBytes()), 16);



	}

	public static String SHAsum(byte[] convertme) throws NoSuchAlgorithmException {
	    MessageDigest md = MessageDigest.getInstance("SHA-1"); 
	    return byteArray2Hex(md.digest(convertme));
	}

	private static String byteArray2Hex(final byte[] hash) {
	    Formatter formatter = new Formatter();
	    for (byte b : hash) {
	        formatter.format("%02x", b);
	    }
	    return formatter.toString();
	}
}