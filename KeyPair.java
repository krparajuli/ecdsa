import java.math.BigInteger;

public class KeyPair {
	public BigInteger publicKey;
	public BigInteger privateKey;

	public KeyPair(BigInteger n, BigInteger[] xyG) {
		privateKey = BigIntExtend.randomLessThanN(n);
		publicKey = ECOperations.negation(privateKey.multiply(xyG[0]));
	}

	public BigInteger getPublicKey() {
		return this.publicKey;
	}

	public BigInteger getPrivateKey() {
		return this.privateKey;
 	}
 // public KeyValidation;

}