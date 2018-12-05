package javaHacks;

import java.util.Arrays;

public class TwoLists {

	public static void main(String args[]) {
		
		int lista[] = {1,2,3,4,5};
		int listb[] = {1,5,6,7,8};
		
		
		
		int listaLength = lista.length;
		int listbLength = listb.length;
		
		int mergedList[] = new int[listaLength+listbLength];
		
		int i=0,j=0,c=0;
		
		//System.out.println(mergedList.length);
		
		while(i<listaLength && j<listbLength) {
			if(lista[i]<listb[j]) {
				mergedList[c]=lista[i];
				i++;
			}else {
				mergedList[c]=listb[j];
				j++;
			}
			c++;
		}
		
		
		while(i<listaLength) {
			mergedList[c] = lista[i];
			i++;
			c++;
		}
		while(j<listbLength) {
			mergedList[c] = listb[j];
			j++;
			c++;
		}
		
		System.out.println(Arrays.toString(mergedList));
		
		
	}
}
