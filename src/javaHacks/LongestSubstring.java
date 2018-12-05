package javaHacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubstring {

	public static void main(String args[]) {

		//String str = "au";
		//String str = "pwwkew";
		//String str = "kamal";
		String str = "abcabcbb";
		
		List<String> arrayList = new ArrayList<String>(Arrays.asList(str.split("")));
		int lindx = 0;
		int findx = 0;
		for(int i=0; i<arrayList.size(); i++) {
			
			String s = arrayList.get(i);
			String subString = str.substring(0, i);
			//System.out.println(subString);
			//System.out.println(arrayList.lastIndexOf(s));
			if(subString.lastIndexOf(s)<i && subString.lastIndexOf(s)!=-1) {
				if(subString.lastIndexOf(s)!=-1)
					findx = subString.lastIndexOf(s);
					lindx = i;
			}else {
				lindx = i+1;
			}
			
			System.out.println(s+"  "+findx+"  "+lindx);
		}
		
		System.out.println(lindx-findx);


	}

}
