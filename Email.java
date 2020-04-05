import java.util.*;
public class Email {
    
    
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = sc.next();
        
        boolean foundAt = false;
        boolean foundDot = false;
        
            for(int i=0; i< email.length(); i++){
                if ( !foundAt) {
                    if(email.charAt(i)=='@'){
                        foundAt = true;
                    }
                } else if (!foundDot){
                    if(email.charAt(i)== '.'){
                        foundDot = true;
                    }
                }
            }
            if (foundAt && foundDot) {
                    System.out.println("It's a valid email.");
                } 
            else {
                    System.out.println(" It's an invalid email");
                }
}
}
