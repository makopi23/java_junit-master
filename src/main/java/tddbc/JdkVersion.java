package tddbc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JdkVersion {

	public JdkVersion(int familyNumber, int updateNumber) {
		this.familyNumber = familyNumber;
		this.updateNumber = updateNumber;
	}

	private static Pattern REGEXP_JDK_VERSION = Pattern.compile("^[jJ][dD][kK]([1-9][0-9]*)[uU](0|[1-9][0-9]*)$");

	private int familyNumber;
	private int updateNumber;

	public static boolean isValid(String version){

		if (REGEXP_JDK_VERSION.matcher(version).find()) {
			return true;
		}

		return false;
	}

	public static JdkVersion parse(String version) {

		if(!isValid(version)){
			throw new IllegalArgumentException();
		}

		Matcher matcher = REGEXP_JDK_VERSION.matcher(version);

		matcher.find();
		String familyNumber = matcher.group(1);
		String updateNumber = matcher.group(2);

		return new JdkVersion(Integer.parseInt(familyNumber), Integer.parseInt(updateNumber));
	}

	public int getFamilyNumber() {
		return familyNumber;
	}

	public int getUpdateNumber() {
		return updateNumber;
	}


}
