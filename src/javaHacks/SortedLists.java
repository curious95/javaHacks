package javaHacks;

import java.util.Arrays;

public class SortedLists {

	public static void main(String args[]) {
	
		int a[] = {2,1,3,5,2,1,22,1,3,15,4,4};
		
		SortedLists sl = new SortedLists();
		sl.sort(a,0,a.length-1);
		
	}
	
	void sort(int a[],int l,int r) {
	
		if(l<r) {
			
			int m =  (l+r)/2;
			sort(a,l,m);
			sort(a,m+1,r);
			
			merge(a, l, m, r);
		}
		
	}
	
	 void merge(int a[],int l,int m, int r) {
		 
		int larrLength =  m-l+1;
		int rarrLength =  r-m;
		
		int larr[] = new int[larrLength];
		int rarr[] = new int[rarrLength];
		
		for(int i=0;i<larr.length;++i) {
			larr[i] = a[l+i];
		}
		for(int j=0;j<rarr.length;++j) {
			rarr[j] = a[m+j+1];
		}
		
		int lctr = 0;
		int rctr = 0;
		int cctr = l;
		
		while(lctr < larrLength && rctr < rarrLength) {
			
			if(larr[lctr] <= rarr[rctr]) {
				
				a[cctr] = larr[lctr];
				lctr++;
		
			}else {
				a[cctr] = rarr[rctr];
				rctr++;
			}
			//System.out.println(Arrays.toString(a));
			cctr++;
			
		}
		
		while(lctr < larrLength) {
			a[cctr] = larr[lctr];
			cctr++;
			lctr++;
		}
		while(rctr < rarrLength) {
			
			System.out.println(cctr);
			
			a[cctr] = rarr[rctr];
			cctr++;
			rctr++;
		}
		
		
		
		System.out.println(Arrays.toString(a));
		 
		 
	 }
	
}
