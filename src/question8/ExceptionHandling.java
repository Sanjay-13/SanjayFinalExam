/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author S541669
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		  int d = 0;
		  int n = 20;
		  try {
		   int fraction = n / d;
                   
		   System.out.println("This line will not be Executed");
		  } catch (ArithmeticException e) {
                   System.out.println("Sanjay Saripalli - S541669");
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  System.out.println("End Of Main");
		 }
}   
