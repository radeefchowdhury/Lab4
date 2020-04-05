
package palindrome;

import java.util.Scanner;


public class Palindrome {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String result = "";
        for(int i =input.length()-1; i>=0; i--){
        result = result + input.charAt(i);
 

}
        if(input.equals(result)){
       System.out.println("its a palindrome");
        }else{
       System.out.println("Its not a palindrome");
   }
        
}
    }
    

