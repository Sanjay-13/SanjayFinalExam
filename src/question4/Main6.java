/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author S541669
 */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();
        System.out.println("Sanjay Saripalli - S541669");
        if(fruit instanceof Fruit){ //Change this line for test
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
