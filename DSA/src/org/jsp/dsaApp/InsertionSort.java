package org.jsp.dsaApp;

public class InsertionSort {

	public static void main(String[] args) {
         int []arr= {12,58,78,56,788,87,2};
         for(int i=1;i<arr.length;i++) {
        	 int key=arr[i];
        	 int j=i-1;
        	 while(j!=-1&& key<arr[j]) {
        		 arr[j+1]=arr[j];
        		 j--;
        	 }
        	 arr[j+1]=key;
         }
         for(int a:arr) {
        	 System.out.println(a);
         }
	}

}
