/**
 * Auto Generated Java Class.
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.util.*;


public class ImageFileUtilities {
  
  /* ADD YOUR CODE HERE */
  public static Image read(String filename) throws IOException{
    Scanner sc = new Scanner(new File(filename));
    //import a file
    String t = sc.nextLine();
    //scans the type of the image P2 or P3
      String comments = " ";
      while(sc.hasNext("#")){
        //find the comments
       comments += sc.nextLine();
      }
      int width = sc.nextInt();
      int height = sc.nextInt();
    //get the picture's width and height
     Pixel[][] imageArr = new Pixel[height][width];
      int maxRange = sc.nextInt();
      if(t.equals("P3")){
        for(int i= 0;i<height;i++){
          for(int j =0;j<width;j++){
          int red = sc.nextInt();
          int green=sc.nextInt();
          int blue = sc.nextInt();
          
          imageArr[i][j] =new Pixel(red,green,blue);
          }
        }
      }
         else{
           int intensity = sc.nextInt();
           for(int i= 0;i<height;i++){
          for(int j =0;j<width;j++){
                imageArr[i][j]=new Pixel(intensity);
               
          }
           }
         }
         Image picture = new Image(comments,maxRange,imageArr);
         return picture;
  }
         public static void writePnm(Image image,String filename) throws IOException{
          BufferedWriter bw = null;
          //creat a new file
           File file = new File(filename);
           FileWriter fw = new FileWriter(file);
           bw = new BufferedWriter(fw);
           String type = "P3";
           String comments2 = image.getmetaData();
           bw.write(type);
           bw.newLine();
           // using newLine to seperate differnts data
           bw.write(comments2);
           bw.newLine();
           bw.write(image.getWidth() + " ");
           bw.write(image.getHeight()+ " ");
           bw.newLine();
           bw.write(image.getmaxRange()+ " ");
           bw.newLine();
           int r;
           int g;
           int b;
           for(int i = 0;i<image.getHeight();i++){
             for(int j = 0;j<image.getWidth();j++){
               Pixel secPixel = image.getPixel(i,j);
                r = secPixel.getRed();
                g = secPixel.getGreen();
                b = secPixel.getBlue();
               
           bw.write(r+ " " + g +" " + b + " ");
           bw.newLine();
             }
           }
           bw.close();
           fw.close();
           }
         
         public static void writePgm(Image image,String filename) throws IOException{
          
           BufferedWriter bw = null;
           File file = new File(filename);
           FileWriter fw = new FileWriter(file);
          bw = new BufferedWriter(fw);
           String type = "P2";
           String comments3 = image.getmetaData();
           bw.write(type);
           bw.newLine();
           bw.write(comments3);
           bw.newLine();
           bw.write(image.getWidth() + " ");
           bw.write(image.getHeight()+ " ");
           bw.newLine();
           bw.write(image.getmaxRange()+ " ");
           bw.newLine();
           for(int i = 0;i<image.getHeight();i++){
             for(int j = 0;j<image.getWidth();j++){
               Pixel thirdPixel = image.getPixel(i,j);
                 int intensity1 = thirdPixel.getRed();
                 bw.write(intensity1 + " ");
             }
           }
           bw.close();
           fw.close();
         }
           //the same as writepnm
            
               
               
           
           
           
           
           
        
       
        
        
      
   
      
      
       
       
    
    
}

