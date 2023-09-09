package org.jsp.dsaApp;

public class BinarySearch {

	public static void main(String[] args) {
           int []arr= {2,5,8,78,96,101,158};
           int low=0;
           int high=arr.length-1;
           int k=500;
           
           while(low<=high) {
        	   
        	   int mid=(high+low)/2;
        	   
        	   if(k==arr[mid]) {
        		   System.out.println("Found  "+k);
        		   return;
        	   }
        	   else if(k>arr[mid]) {
        		   low=mid+1;
        	   }
        	   else if(k<arr[mid]) {
        		   high=mid-1;
        	   }
           }
           System.out.println("not found");
	}

}
