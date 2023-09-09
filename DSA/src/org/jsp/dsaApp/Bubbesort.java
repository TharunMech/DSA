package org.jsp.dsaApp;

public class Bubbesort {

	public static void main(String[] args) {
           int[ ]arr= {12,5,8,96,58};
           int n=arr.length-1;
           for(int i=0;i<n-1;i++) {
        	   for(int j=0;j<arr.length-1;j++) {
        		   if(arr[j]>arr[j+1]) {
        			   int temp=arr[j];
        			   arr[j]=arr[j+1];
        			   arr[j+1]=temp;
        		   }
        	   }
           }
           
           for(int a:arr) {
        	   System.out.println(a);
           }
	}

}
