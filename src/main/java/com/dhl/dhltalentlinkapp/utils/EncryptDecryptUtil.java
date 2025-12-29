package com.dhl.dhltalentlinkapp.utils;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.bouncycastle.bcpg.ArmoredOutputStream;
import org.bouncycastle.bcpg.CompressionAlgorithmTags;
import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openpgp.PGPCompressedData;
import org.bouncycastle.openpgp.PGPCompressedDataGenerator;
import org.bouncycastle.openpgp.PGPEncryptedDataGenerator;
import org.bouncycastle.openpgp.PGPEncryptedDataList;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.openpgp.PGPLiteralData;
import org.bouncycastle.openpgp.PGPLiteralDataGenerator;
import org.bouncycastle.openpgp.PGPPrivateKey;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPPublicKeyEncryptedData;
import org.bouncycastle.openpgp.PGPPublicKeyRing;
import org.bouncycastle.openpgp.PGPPublicKeyRingCollection;
import org.bouncycastle.openpgp.PGPSecretKey;
import org.bouncycastle.openpgp.PGPSecretKeyRingCollection;
import org.bouncycastle.openpgp.PGPUtil;
import org.bouncycastle.openpgp.jcajce.JcaPGPObjectFactory;
import org.bouncycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;
import org.bouncycastle.openpgp.operator.jcajce.JcePBESecretKeyDecryptorBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcePGPDataEncryptorBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcePublicKeyDataDecryptorFactoryBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcePublicKeyKeyEncryptionMethodGenerator;
import org.bouncycastle.util.io.Streams;
import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.masterconfig.MasterconfigManager;

public class EncryptDecryptUtil {

//	private static String privateKeyPath = null;
//	private static String publicKeyPath = null;
//	private static String passwordString = null;
	private static String errorMessage = null;
	private static String exportPublicKeyPath = null;// "/home/mathan/Documents/aTalent/DHL/SDH/Keys/dhlsdh_10B92D78_Public.asc";
	private static String sdhPublicKeyPath = null;

	private static String privateKeyPath = null;//   "/home/mathan/Documents/aTalent/DHL/SDH/Keys/SDH_Keys/dhlsdh_10B92D78_Secret.asc";
	private static String publicKeyPath = null;// "/home/mathan/Documents/aTalent/DHL/SDH/Keys/dhlsdh_10B92D78_Public.asc";
	private static String passwordString =   null;// "Aa4Sah7r";

	protected @Autowired MasterconfigManager masterConfigManager;

	@PostConstruct
	public void initializeData() {
		privateKeyPath = masterConfigManager.getValue(CommonConstants.PRIVATE_KEY_PATH);
		publicKeyPath = masterConfigManager.getValue(CommonConstants.PUBLIC_KEY_PATH);
		passwordString = masterConfigManager.getValue(CommonConstants.PRIVATE_KEY_PASSWORD);
		exportPublicKeyPath = masterConfigManager.getValue(CommonConstants.EXPORT_PUBLIC_KEY_PATH);
		sdhPublicKeyPath = masterConfigManager.getValue(CommonConstants.SDH_PUBLIC_KEY_PATH);
	}

	public static Set<String> listFilesUsingDirectoryStream(String dir) throws IOException {
		Set<String> fileList = new HashSet<>();
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir))) {
			for (Path path : stream) {
				if (!Files.isDirectory(path)) {
					fileList.add(path.getFileName().toString());
				}
			}
		}
		return fileList;
	}

	public static void main(String args[]) {

		try {

			/*
			 * Set<String> fileList = listFilesUsingDirectoryStream(
			 * "/home/mathan/Documents/aTalent/DHL/mar22/inputfiles3/");
			 * 
			 * for (String fileName : fileList) {
			 * 
			 * System.out.println(fileName);
			 * 
			 * Path orginalPath =
			 * Paths.get("/home/mathan/Documents/aTalent/DHL/mar22/inputfiles3/" +
			 * fileName); byte[] orginalData = Files.readAllBytes(orginalPath); byte[]
			 * encryptedData = encryptInbound(orginalData);
			 * 
			 * Path encryptedPath =
			 * Paths.get("/home/mathan/Documents/aTalent/DHL/mar22/inputfiles3/encrypted/" +
			 * fileName);
			 * 
			 * Files.write(encryptedPath, encryptedData);
			 * 
			 * }
			 */
			/*
			 * EncryptDecryptUtil util = new EncryptDecryptUtil(); Path orginalPath =
			 * Paths.get( "/home/mathan/Documents/aTalent/DHL/SDH/sample.txt"); Path
			 * encryptedPath = Paths.get(
			 * "/home/mathan/Documents/aTalent/DHL/SDH/sample.txt.encrypted"); byte[]
			 * originalData = Files.readAllBytes(orginalPath);
			 * 
			 * System.out.println(new String(originalData)); byte[] encrypteData =
			 * util.encrypt(originalData); System.out.println(new String(encrypteData));
			 * Files.write(encryptedPath,encrypteData);
			 */

			// Path orginalPath = Paths.get(
			// "/home/mathan/Documents/aTalent/DHL/SDH/sample.txt");
			Path encryptedPath = Paths.get("/home/mathan/Documents/aTalent/DHL/SDH/sample.txt.encrypted");
			byte[] encryptedData = Files.readAllBytes(encryptedPath);

			System.out.println(new String(encryptedData));
			byte[] decryptedData = decrypt(encryptedData);
			System.out.println(new String(decryptedData));
			// Files.write(encryptedPath,encrypteData);

			// EncryptDecryptUtil util = new EncryptDecryptUtil();
			// util.decryptFile("/home/mathan/Desktop/encrypted/Talentlink_MyHR_IN_Details_20230118.csv","/home/mathan/Desktop/encrypted/Talentlink_MyHR_IN_Details_20230118_dec.csv");
			/*
			 * Path orginalPath = Paths.get(
			 * "/home/mathan/Desktop/encrypted/Talentlink_MyHR_IN_Details_20230118.csv");
			 * Path decryptedPath = Paths.get(
			 * "/home/mathan/Desktop/encrypted/Talentlink_MyHR_IN_Details_20230118_enc.csv")
			 * ;
			 * 
			 * byte[] encryptedData2 = Files.readAllBytes(orginalPath);
			 * 
			 * byte[] decryptedData2 = decrypt(encryptedData2);
			 * 
			 * 
			 * System.out.println(new String(decrypt(decryptedData2)));
			 * 
			 * Files.write(decryptedPath, decryptedData2);
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean decryptFile(String encryptedFileName, String decryptedFileName) {

		boolean decryptFlag = false;
		errorMessage = "";
		try {

			Path encryptedPath = Paths.get(encryptedFileName);

			System.out.println("####################################################");

			byte[] encryptedData = Files.readAllBytes(encryptedPath);

			byte[] decryptedData = decrypt(encryptedData);

			Path decryptedPath = Paths.get(decryptedFileName);

			Files.write(decryptedPath, decryptedData);
			decryptFlag = true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMessage = e.toString();
			e.printStackTrace();
			decryptFlag = false;
		}

		return decryptFlag;

	}

	public byte[] encrypt(final byte[] message) throws PGPException {
		try {
			boolean armored = true;

			final PGPPublicKey publicKey = readPublicKey(new FileInputStream(exportPublicKeyPath));
			final BouncyCastleProvider provider = new BouncyCastleProvider();
			final ByteArrayInputStream in = new ByteArrayInputStream(message);
			final ByteArrayOutputStream bOut = new ByteArrayOutputStream();
			final PGPLiteralDataGenerator literal = new PGPLiteralDataGenerator();
			final PGPCompressedDataGenerator comData = new PGPCompressedDataGenerator(CompressionAlgorithmTags.ZIP);
			final OutputStream pOut = literal.open(comData.open(bOut), PGPLiteralData.BINARY, "filename",
					in.available(), new Date());
			Streams.pipeAll(in, pOut);
			comData.close();
			final byte[] bytes = bOut.toByteArray();
			final PGPEncryptedDataGenerator generator = new PGPEncryptedDataGenerator(
					new JcePGPDataEncryptorBuilder(SymmetricKeyAlgorithmTags.AES_256).setWithIntegrityPacket(true)
							.setSecureRandom(new SecureRandom()).setProvider(provider));
			generator.addMethod(new JcePublicKeyKeyEncryptionMethodGenerator(publicKey).setProvider(provider));
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			OutputStream theOut = armored ? new ArmoredOutputStream(out) : out;
			OutputStream cOut = generator.open(theOut, bytes.length);
			cOut.write(bytes);
			cOut.close();
			theOut.close();
			return out.toByteArray();
		} catch (Exception e) {
			System.out.println("Exception occured " + e.getMessage());
			throw new PGPException("Error in encrypt", e);
		}
	}

	public byte[] encryptForSDH(final byte[] message,String filename) throws PGPException {
		try {
			boolean armored = true;

			final PGPPublicKey publicKey = readPublicKey(new FileInputStream(sdhPublicKeyPath));
			final BouncyCastleProvider provider = new BouncyCastleProvider();
			final ByteArrayInputStream in = new ByteArrayInputStream(message);
			final ByteArrayOutputStream bOut = new ByteArrayOutputStream();
			final PGPLiteralDataGenerator literal = new PGPLiteralDataGenerator();
			final PGPCompressedDataGenerator comData = new PGPCompressedDataGenerator(CompressionAlgorithmTags.ZIP);
			final OutputStream pOut = literal.open(comData.open(bOut), PGPLiteralData.BINARY, filename,
					in.available(), new Date());
			Streams.pipeAll(in, pOut);
			comData.close();
			final byte[] bytes = bOut.toByteArray();
			final PGPEncryptedDataGenerator generator = new PGPEncryptedDataGenerator(
					new JcePGPDataEncryptorBuilder(SymmetricKeyAlgorithmTags.AES_256).setWithIntegrityPacket(true)
							.setSecureRandom(new SecureRandom()).setProvider(provider));
			generator.addMethod(new JcePublicKeyKeyEncryptionMethodGenerator(publicKey).setProvider(provider));
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			OutputStream theOut = armored ? new ArmoredOutputStream(out) : out;
			OutputStream cOut = generator.open(theOut, bytes.length);
			cOut.write(bytes);
			cOut.close();
			theOut.close();
			return out.toByteArray();
		} catch (Exception e) {
			throw new PGPException("Error in encrypt", e);
		}
	}

	public static byte[] encryptInbound(final byte[] message) throws PGPException {
		try {
			boolean armored = true;

			final PGPPublicKey publicKey = readPublicKey(new FileInputStream(publicKeyPath));
			final BouncyCastleProvider provider = new BouncyCastleProvider();
			final ByteArrayInputStream in = new ByteArrayInputStream(message);
			final ByteArrayOutputStream bOut = new ByteArrayOutputStream();
			final PGPLiteralDataGenerator literal = new PGPLiteralDataGenerator();
			final PGPCompressedDataGenerator comData = new PGPCompressedDataGenerator(CompressionAlgorithmTags.ZIP);
			final OutputStream pOut = literal.open(comData.open(bOut), PGPLiteralData.BINARY, "filename",
					in.available(), new Date());
			Streams.pipeAll(in, pOut);
			comData.close();
			final byte[] bytes = bOut.toByteArray();
			final PGPEncryptedDataGenerator generator = new PGPEncryptedDataGenerator(
					new JcePGPDataEncryptorBuilder(SymmetricKeyAlgorithmTags.AES_256).setWithIntegrityPacket(true)
							.setSecureRandom(new SecureRandom()).setProvider(provider));
			generator.addMethod(new JcePublicKeyKeyEncryptionMethodGenerator(publicKey).setProvider(provider));
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			OutputStream theOut = armored ? new ArmoredOutputStream(out) : out;
			OutputStream cOut = generator.open(theOut, bytes.length);
			cOut.write(bytes);
			cOut.close();
			theOut.close();
			return out.toByteArray();
		} catch (Exception e) {
			throw new PGPException("Error in encrypt", e);
		}
	}

	public static PGPPublicKey readPublicKey(InputStream in) throws IOException, PGPException {
		in = org.bouncycastle.openpgp.PGPUtil.getDecoderStream(in);

		PGPPublicKeyRingCollection pgpPub = new PGPPublicKeyRingCollection(PGPUtil.getDecoderStream(in),
				new JcaKeyFingerprintCalculator());

		PGPPublicKey key = null;

		Iterator<PGPPublicKeyRing> rIt = pgpPub.getKeyRings();

		while (key == null && rIt.hasNext()) {
			PGPPublicKeyRing kRing = rIt.next();
			Iterator<PGPPublicKey> kIt = kRing.getPublicKeys();
			while (key == null && kIt.hasNext()) {
				PGPPublicKey k = kIt.next();

				if (k.isEncryptionKey()) {
					key = k;
				}
			}
		}

		if (key == null) {
			throw new IllegalArgumentException("Can't find encryption key in key ring.");
		}

		return key;
	}

	public static byte[] decrypt(byte[] encrypted) throws IOException, PGPException, NoSuchProviderException {
		Security.addProvider(new BouncyCastleProvider());

		System.out.println(privateKeyPath);
		InputStream keyIn = new BufferedInputStream(new FileInputStream(privateKeyPath));
		char[] password = passwordString.toCharArray();
		// char[] password = "".toCharArray();
		InputStream in = new ByteArrayInputStream(encrypted);
		in = PGPUtil.getDecoderStream(in);
		JcaPGPObjectFactory pgpF = new JcaPGPObjectFactory(in);
		PGPEncryptedDataList enc;
		Object o = pgpF.nextObject();
		if (o instanceof PGPEncryptedDataList) {
			enc = (PGPEncryptedDataList) o;
		} else {
			enc = (PGPEncryptedDataList) pgpF.nextObject();
		}
		Iterator it = enc.getEncryptedDataObjects();
		PGPPrivateKey sKey = null;
		PGPPublicKeyEncryptedData pbe = null;
		PGPSecretKeyRingCollection pgpSec = new PGPSecretKeyRingCollection(PGPUtil.getDecoderStream(keyIn),
				new JcaKeyFingerprintCalculator());
		while (sKey == null && it.hasNext()) {
			pbe = (PGPPublicKeyEncryptedData) it.next();
			sKey = findSecretKey(pgpSec, pbe.getKeyID(), password);
		}
		if (sKey == null) {
			throw new IllegalArgumentException("secret key for message not found.");
		}
		InputStream clear = pbe
				.getDataStream(new JcePublicKeyDataDecryptorFactoryBuilder().setProvider("BC").build(sKey));
		JcaPGPObjectFactory plainFact = new JcaPGPObjectFactory(clear);
		PGPCompressedData cData = (PGPCompressedData) plainFact.nextObject();
		JcaPGPObjectFactory pgpFact = new JcaPGPObjectFactory(cData.getDataStream());
		PGPLiteralData ld = (PGPLiteralData) pgpFact.nextObject();
		InputStream unc = ld.getInputStream();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		int ch;
		while ((ch = unc.read()) >= 0) {
			out.write(ch);
		}
		byte[] returnBytes = out.toByteArray();
		out.close();
		return returnBytes;
	}

	static PGPPrivateKey findSecretKey(PGPSecretKeyRingCollection pgpSec, long keyID, char[] pass)
			throws PGPException, NoSuchProviderException {
		PGPSecretKey pgpSecKey = pgpSec.getSecretKey(keyID);

		if (pgpSecKey == null) {
			return null;
		}

		return pgpSecKey.extractPrivateKey(new JcePBESecretKeyDecryptorBuilder().setProvider("BC").build(pass));
	}

	public static String getErrorMessage() {
		return errorMessage;
	}

}
