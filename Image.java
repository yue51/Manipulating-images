/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
import java.io.File;
public class Image {
  
  
      private String metaData ;
      private int maxRange;
      private Pixel[][] data;
  
  public Image(String metaData,int maxRange,Pixel[][] data){
    if(maxRange < 0){
      throw new IllegalArgumentException();
    }
    // throw exception if max range is invalid
             this.metaData = metaData;
             this.maxRange = maxRange;
             Pixel[][] newdata = new Pixel[data.length][data[0].length];
             //height is the array's length,width is the subarray's length
             for(int i = 0;i < data.length;i++){
               for(int j = 0;j<data[i].length;j++){
                
                 newdata[i][j] = data[i][j];
                 }
             }
             //creat a new array that copys the element in data array by using loop
             this.data = newdata;
             //update the new value for data array
               
    
                 

  }
       public String getmetaData(){
          return this.metaData;
  }
       public int getmaxRange(){
          return this.maxRange;
         
  }
                          
       public int getWidth(){
         return this.data[0].length;
       }
        public int getHeight(){
         return this.data.length;
       }
       
         public Pixel getPixel(int i,int j){
           Pixel pixelPos = data[i][j]; 
         return pixelPos;
         //return the position in data array
       }
       public void flip(boolean horizontal){
          Pixel[][] temp =new Pixel[getHeight()][getWidth()];
          //creat a new array that is the same height and width
         if ( horizontal == false ){
           //if boolean horizontal is false,then it filps vertically
           for(int i = 0;i < this.data.length;i++){
             for(int j =0;j <this.data[i].length;j++){
              temp[i][j]  = this.data[this.data.length-i-1][j];
               }
           }
           //it flips vertically by inversing the rows 
           
           
         }
         else{
           //else ,it flips horizontally by inversing the columns
           for(int rows = 0;rows < this.data.length;rows++){
             
             for(int col =0;col<this.data[rows].length;col++){
             
            
            temp[rows][col]=this.data[rows][this.data[rows].length-col-1];
            
             }
           }
          
         }
       
        this.data = temp; 
       }
       
       public void toGrey(){
         for(int i = 0;i<this.data.length;i++){
           for(int j = 0;j<this.data[i].length;j++){
           
        int red = (int)(getPixel(i,j).getRed() * 0.3);
        int green = (int)(getPixel(i,j).getGreen() * 0.59);
        int blue = (int)(getPixel(i,j).getBlue() *0.11);
        int sum = red + green + blue;
        Pixel image = new Pixel(sum,sum,sum);
        //greyscale has same value for red green blue
        //the value is the weighted average
         
       }
         }
       }
           public void crop(int startX,int startY,int endX,int endY){
    if(startX >= endX|| startY >=endY || endX-startX>=data[0].length || endY-startY >= data.length||startX<0||startY<0){
               throw new IllegalArgumentException();
             }
              int w = endX - startX;
              // w shows the width
              int h =endY - startY;
              //h showsy the height
              Pixel[][] newdata2 = new Pixel[h][w];
              //set a new array that has new width and height
              for(int i = 0; i< newdata2.length;i++){
              for(int j = 0;j < newdata2[0].length;j++){
               newdata2[i][j]=data[startX+i][startY+j];
               //loop through to get the rest element
               
                   
                }
               
            }
            this.data = newdata2;
            //update the value for data array
            
            
           }
           
                 
                 
          }
       
           
    
  /* ADD YOUR CODE HERE */
  


