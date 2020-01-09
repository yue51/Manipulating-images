/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.io.IOException;
public class Comp202Photoshop {
  
  
  public static void main(String[] args) { 
    if(args.length < 4){
      System.err.println("the input is not enough");
    }
    if(args[3] != "-fh" || args[3] != "-fv" || args[3] != "-cr"||args[3] != "-gs"){
      System.err.println("the requested operation is not existed ,please try it again");
    }
    if(args[2] !="pgm"||args[2]!="pnm"){
      System.err.println("output format is invalid ,please try it again");
    }
    
    //print the error meesage if the args length is less than 4 or invalid operatio and output format
    try{
        String filename = args[0];
    Image picture  = ImageFileUtilities.read(filename);
    
    String nameOfoutput =args[1];
    //different operations
    
         if (args[3].equals("-fh")){
         picture.flip(true);
       }
       else if(args[3].equals("-fv")){
         picture.flip(false);
       }
       else if(args[3].equals("-gs")){
         picture.toGrey();
       }
       else if(args[3].equals("-cr")){
         try{
         picture.crop(Integer.parseInt(args[4]),Integer.parseInt(args[5]),Integer.parseInt(args[6]),Integer.parseInt(args[7]));
         }
         catch(IllegalArgumentException e){
            System.err.println("Exception:" + e.getMessage());
            //catch the IllegalArgumentException
         }
      
       }
      if(args[2].equals("pgm")){
      ImageFileUtilities.writePgm(picture,args[1]);
     }
       else{
         ImageFileUtilities.writePnm(picture,args[1]);
       }
         //see what is the output format and try to read it by calling ImageFileUtilities.writePgm method
       }
    catch(IOException e){
      System.err.println("IOException is caught,try it again" + e.getMessage());
    }
    catch(IllegalArgumentException e){
      System.out.println("IllegalArgumentException is caught,try it again!"+ e.getMessage());
    }
        
  }
}
      

       
      
  
   



    
      
       
     
       
      

           
           
           
           
       
       
  
    
  
  
  /* ADD YOUR CODE HERE */
  

