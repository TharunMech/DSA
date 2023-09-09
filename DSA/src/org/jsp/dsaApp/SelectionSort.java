package org.jsp.dsaApp;

public class SelectionSort {

	public static void main(String[] args) {
		int []arr= {2,58,45,78,98,568};
          for(int i=0;i<arr.length-1;i++) {
        	  int si=i;
        	  for(int j=i+1;j<arr.length;j++) {
        		  if(arr[si]>arr[j]) {
        			  si=j;
        		  }
        		  
        		  int temp=arr[si];
        		  arr[si]=arr[i];
        		  arr[i]=temp;
        	  }
          }
          
          for(int a:arr) {
        	  System.out.println(a);
          }
	}

}
