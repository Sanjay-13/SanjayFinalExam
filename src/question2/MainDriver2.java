/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author S541669
 */
public class MainDriver2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] squares = {new Square(1.5,"White",true), new Square(3,"Red",true), 
			new Square(2,"yellow",true), new Square(7,"no color",false), new Square(6,"blue",true)};

		// Display the area and invoke the howToColor 
		// method for each GeometricObject
                System.out.println("Sanjay Saripalli - S541669");
		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nThe Square " +(i + 1) +" is" );
                        System.out.println(squares[i]);
                        if(squares[i].isFilled()){
                           squares[i].howToColor();
                        }
		 	
		 }
    }
    
}
