
package acronymtranslator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class AcronymTranslator {

  
    public static void main(String[] args) throws FileNotFoundException {
        
         Map<String, String> acronyms = new HashMap<>();
        
        File inFile = new File("acronyms.txt");
        Scanner in = new Scanner(inFile);
        
        while(in.hasNextLine())
        {
            
            String[] split = in.nextLine().split("\\t");
            acronyms.put(split[0].toLowerCase(), split[1]);
        }
       
        
        System.out.println("Enter a sentence");
        Scanner inUser = new Scanner(System.in).useDelimiter("\\n");
        String userInput = inUser.next();
        
        String[] words = userInput.split(" ");
        String translated = "";

        
           for(int i = 0; i < words.length; i++)
           {
               if(acronyms.containsKey(words[i].toLowerCase()))
               {
                   
                  translated += acronyms.get(words[i].toLowerCase().toLowerCase()) + " ";
               }
               
               else
               {
                   translated += words[i] + " ";
               } 
           }
        
           System.out.println(translated);
    } 
   
        
    
}
    

