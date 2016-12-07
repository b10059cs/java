package chegg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.MessageDigest;

public class Agility {
	public static void main(String[] args) throws IOException {
		String base = "TEAM09";
		int count = 0;

		String userHome = System.getProperty("user.home");
		userHome = userHome + "/Desktop";

		File f = new File(userHome, "Agility.txt");

		FileWriter writer = new FileWriter(f); // file output stream creating

		while (true) {
			count++;
			String trial = base + "STORY" + count;
			String trial2 = base + "STORY" + count + "DONE" + count;

			String trial3 = base + "STORY" + count + "DONE" + "VALID" + count;
			String trialHash = getSHA256Hash(trial);
			String trialHash2 = getSHA256Hash(trial2);

			String trialHash3 = getSHA256Hash(trial3);

			if (trialHash.startsWith("55555")) {
				writer.write(trial);
				writer.write(System.lineSeparator());
				writer.flush();
				System.out.print("\n" + trial);

			}
			if (trialHash2.startsWith("666666")) {
				System.out.print("\n" + trial2);
				writer.write(trial2);
				writer.write(System.lineSeparator());
				writer.flush();
			}
			if (trialHash3.startsWith("7777777")) {
				System.out.print("\n" + trial3);
				writer.write(trial3);
				writer.write(System.lineSeparator());
				writer.flush();
			}
			PrintLineToFile(trial, "Agility.txt");
			writer.flush();
		}
	}
/**
 * This method is used to write lineinto file
 * */
	private static void PrintLineToFile(String trial, String file) throws IOException {
		// creating file output Stream for writing output into file
		FileOutputStream fos = new FileOutputStream(new File(file));
		// creating bufferedWriter instance
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		// Writing trial into file
		bw.write(trial);

	}

	public static String getSHA256Hash(String data) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(data.getBytes("UTF-8"));
			return bytesToHex(hash);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static String bytesToHex(byte[] bytes) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			stringBuffer.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		return stringBuffer.toString();
	}
}
