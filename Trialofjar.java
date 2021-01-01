/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trialofjar;
import java.io.File;
import java.util.*;
import asgnmt1.Asgnmt1;
import java.io.IOException;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Vanisri Kirubakaran
 */
public class Trialofjar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        // TODO code application logic hereAsgnmt1 obj=new Asgnmt1();
        Scanner input=new Scanner(System.in);
      Asgnmt1 obj=new Asgnmt1();
       for(;;) 
        {
            System.out.println("**************COLLEGE MANAGEMENT SYSTEM*****************");     
            System.out.println("Enter your choice id: 1)create 2)read 3)delete 4)exit");
            int choice=input.nextInt();
            switch(choice)
            {
                case 1:File file = new File("year2021.json");
                        if (file.exists() && file.isFile()&& (file.length() / (1024 * 1024 * 1024))<=1){
                          System.out.println("Entering values in file-");
                            obj.create();
                        }
                        break;
                case 2:System.out.println("Which value do you want to know?(Enetr key)");
                        String check_key=input.next();
                        obj.read(check_key);
                        break;
                case 3:System.out.println("Which value has to be deleted?(Enter key)");
                        String del_key=input.next();
                        obj.delete(del_key);
                        break;
                case 4:System.exit(0);
                default:System.out.println("Please enter correct choice");
                        
            }
            
            
    }
    }
    
}
