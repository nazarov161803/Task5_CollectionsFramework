package com.foxminded.countUniqeChar;
  
import java.util.Scanner;

import com.foxminded.countUniqeChar.logicForCountUniqueChar.CountUniqueCharMaker;
 
public class CountUniqueCharUserInterface {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write words");
      
        String text = in.nextLine();
        
        CountUniqueCharMaker countUniqueCharMaker = new CountUniqueCharMaker();
        countUniqueCharMaker.writeCountUniqueSymbols(text); 
       
        in.close(); 
    }
}
