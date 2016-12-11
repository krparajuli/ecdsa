import java.math.BigInteger;

public class KeyPair {
	public BigInteger[] publicKey;
	public BigInteger privateKey;

	public KeyPair(BigInteger[] point, BigInteger n, BigInteger a) {
		privateKey = BigIntExtend.randomLessThanN(n);
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