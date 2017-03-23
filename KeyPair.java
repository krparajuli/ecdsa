/*
 * File: KeyPair.java
 * Author: Kalyan Parajuli
 * Role: Generate the random ECDSA key pair using the order variable and base point
 */

import java.math.BigInteger;

public class KeyPair {
	public BigInteger privateKey;
	public BigInteger[] publicKey;


	public KeyPair(BigInteger[] point, BigInteger n, BigInteger a) {
		System.out.println("Creating Key Pair .......");
		privateKey = BigIntExtend.randomLessThanN(n);
		publicKey = ECOperations.pointMultiply(point, n, a, privateKey);
		System.out.println("Key Pair CREATED");
	}

	public BigInteger[] getPublicKey() {
		return this.publicKey;
	}

	public BigInteger getPrivateKey() {
		return this.privateKey;
 	}
}