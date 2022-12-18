package com.passwordgenerator;

import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Generator {
	public static final String AES = "AES";

	public SecretKey genPass() throws Exception {
		// Creating the object
		SecureRandom random = new SecureRandom();
		// We can invoke the following method
		// to retrieve random bytes
		byte bytes[] = new byte[20];
		random.nextBytes(bytes);
		KeyGenerator keygenerator = KeyGenerator.getInstance(AES);

		// Initializing the KeyGenerator
		// with 256 bits.
		keygenerator.init(256, random);
		SecretKey key = keygenerator.generateKey();
		return key;

	}
}
