import java.math.BigInteger;

public class KeyPair {
	public BigInteger[] publicKey;
	public BigInteger privateKey;

	public KeyPair(BigInteger[] point, BigInteger n, BigInteger a) {
		System.out.print("Initializing KeyPair");
		privateKey = BigIntExtend.randomLessThanN(n);
		System.out.print("Calculating Private Key");
		publicKey = ECOperations.pointMultiply(point, n, a, privateKey);
	}

	public BigInteger[] getPublicKey() {
		return this.publicKey;
	}

	public BigInteger getPrivateKey() {
		return this.privateKey;
 	}
 // public KeyValidation;

}