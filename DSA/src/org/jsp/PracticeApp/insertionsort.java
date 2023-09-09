package org.jsp.PracticeApp;

public class insertionsort {

	public static void main(String[] args) {
             int[]arr= {12,58,788,2,69,4,87};
             
             
             for(int i=1;i<arr.length;i++) {
            	 int key=arr[i];
            	 int j=i-1;
            	 while(j!=-1&&key<arr[j]) {
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
