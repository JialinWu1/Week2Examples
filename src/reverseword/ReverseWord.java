/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;
import java.util.Scanner;
/**
 *
 * @author k.w
 */
public class ReverseWord 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //take a word input for the user
      Scanner input = new Scanner(System.in);
      String word = input.next();  //difference remind: nextLine used for string not character
      //split char from word and store in array
      char[] reverse = new char [word.length()]; //what's the length of the array? ()is used for finding the length of a string
      for(int i = 0; i < word.length(); i++)
      {
        reverse[i] = word.charAt(i);   //store value in the char, charAt is a pre-defined method, find the seperate char
      }
      for(int i = reverse.length - 1; i >=0 ; i--)
      {
          System.out.print(reverse[i]);
      }
    }
    
}
//hello from the 1st change in Remote repo
