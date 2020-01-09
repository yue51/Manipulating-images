/**
 * Auto Generated Java Class.
 */
public class Pixel {
  private int red;
  private int green;
  private int blue;
  
  public Pixel(int red,int green,int blue) { 
    if( red>255 || red < 0 || green >255 || green < 0 || blue>255 || blue <0){
      throw new IllegalArgumentException();
    }
    this.red = red;
    this.green = green;
    this.blue = blue;
    //three attributes
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  public Pixel(int intensity){
     if( intensity>255 || intensity < 0){
      throw new IllegalArgumentException();
    }
     //throw exception if the input is invalid
    this.red = intensity;
    this.green = intensity;
    this.blue = intensity;
  }
  /* ADD YOUR CODE HERE */
        public int getRed(){
            return this.red;
  }
       public int getGreen(){
       return this.green;
  }
       public int getBlue(){
         return this.blue;
       }
       public int grey(){
       int average = (int)((0.3 * getRed()) + (0.59 * getGreen()) + (0.11 * getBlue()));
       return average;
       }
       //using a weighted average to get the greyscale
  
}
