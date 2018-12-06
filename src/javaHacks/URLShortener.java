package javaHacks;

public class URLShortener {

	public static void main(String[] args) {

		String strArray[] = { "madam", "maddam", "mad" };
		String strMap = "abcdefghijklmnopqrstuvqwxyz";

		String turl = "";
		int base = 26;
		

		int number = 1025;

		while (number % base != 0) {
			//System.out.println(number);
			System.out.println(number % 26);
			turl = turl + strMap.charAt((number % base) - 1);
			number = number / base;
			//System.out.println(number);

		}

		System.out.println(turl);

		int decodedNumber = 0;
		
		if (turl != null) {

			for (int i = turl.length()-1,j=0; i >= 0; i--,j++) {

				int indx = strMap.indexOf(turl.charAt(i))+1;
				System.out.println(indx);
				 decodedNumber = decodedNumber + (int)(indx*Math.pow(26, i));

			}

		}
		
		System.out.println(decodedNumber);

	}

}
