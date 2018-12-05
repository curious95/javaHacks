package javaHacks;

import java.util.HashSet;

public class LongestSubstring {

	public static void main(String args[]) {

		// String str = "dvdf";
		// String str = "pwwkew";
		String str = "aabaab!bb";

		HashSet<Character> charHash = new HashSet<Character>();

		int max = 0;
		int ctr = 0;

		for (int i = 0; i < str.length(); i++) {

			Character tempChar = str.charAt(i);

			// System.out.println(str.charAt(i));

			if (charHash.contains(tempChar)) {

				if (charHash.size() > max) {
					max = charHash.size();
				}

				while (ctr < i) {
					if (str.charAt(ctr) == tempChar) {
						charHash.remove(tempChar);
						ctr++;
						break;
					} else {
						charHash.remove(str.charAt(ctr));
						ctr++;
					}
				}
				charHash.add(tempChar);

			} else {
				charHash.add(tempChar);
				if (charHash.size() > max) {
					max = charHash.size();
				}
			}

		}

		System.out.println(max + "    " + charHash.toString());

	}

}
