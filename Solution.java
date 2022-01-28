//coded by harish
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int a1 [] = new int[256];
        int b1 [] = new int[256];
        
        
        if(a.length()==b.length())
        {
            for(int i=0;i<a.length();i++)
            {
                a1[(int) a.charAt(i)]+=1;
                b1[(int) b.charAt(i)]+=1;
            }    
            
            for(int i=0;i<256;i++)
            if(a1[i]!=b1[i])
            return false;
            
            
            return true;
        }
        
        return false;
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
