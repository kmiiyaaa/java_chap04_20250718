package ch04_2;



public class FourStarPrint00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int i = 1; i<=4; i++ ) {
		for(int j=1; j<=5; j++) {
			System.out.print("*");	
			   } 
		    System.out.println();
			 }	
 
	System.out.println(); 
	
	
    for (int i = 1; i<=4; i++) {
    	for(int j=1; j<(i+1); j++) {
        // for(int j=1; j<(i+1); j++) {
         System.out.print("*");
        }
	System.out.println(); 
    }
	
    
    System.out.println();
    
    for (int i =4; i>0; i--) {   //복습~!
    	for(int j=0; j<i; j++) {
         System.out.print("*");
        }
	System.out.println(); 
    }
    
    
	}
}
