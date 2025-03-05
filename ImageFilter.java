import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String fileName) {
    super(fileName);
  }

 public void makeNegative() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Get the pixels from the image, then traverse the 2D array of pixels. Set
     * the red, green, and blue color values of each Pixel object to the result of
     * 255 minus the current values.
     * -----------------------------------------------------------------------------
     */
    //2d array from ImagePlus
Pixel[][] pixels = getPixelsFromImage();

    //traverse the array of pixels
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
      Pixel currentPixel = pixels[row][col];

        // invert the color of the pixel
        int red = 255 - currentPixel.getRed();
        int green = 255 - currentPixel.getGreen();
        int blue = 255 - currentPixel.getBlue();
//set the new color 
        currentPixel.setColor(new Color(red, green, blue));
    }
    }


    
  }
  public void motionBlur(int length, String direction) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Get the pixels from the image, and traverse the 2D array of Pixel objects.
     * Find the average of the red, green, and blue color values of the current
     * Pixel object and a set of neighboring Pixel objects in a line segment.
     * -----------------------------------------------------------------------------
     */

    Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        int totalRed = 0;
        int totalGreen = 0;
        int totalBlue = 0;

        int x = col;
        int y = row;
        int count = 0;

        while (count < length && x < pixels[0].length && y < pixels.length) {
          Pixel currentPixel = pixels[y][x];
          totalRed += currentPixel.getRed();
          totalGreen += currentPixel.getGreen();
          totalBlue += currentPixel.getBlue();
          count++;

          if (direction.equals("horizontal")) {
            x++;
          }
          else if (direction.equals("vertical")) {
            y++;
          }
          else if (direction.equals("diagonal")) {
            x++;
            y++;
          }
        }

        int avgRed = totalRed / count;
        int avgGreen = totalGreen / count;
        int avgBlue = totalBlue / count;

        Pixel currentPixel = pixels[row][col];
        currentPixel.setRed(avgRed);
        currentPixel.setGreen(avgGreen);
        currentPixel.setBlue(avgBlue);
      }
    }

    
  }
   public void threshold(int value) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Get the pixels from the image, and traverse the 2D array of Pixel objects.
     * Calculate the average of the red, green, and blue value of each Pixel. If the
     * average is less than the parameter value, set the color of the Pixel to BLACK.
     * Otherwise, set the color of the Pixel to WHITE.
     * -----------------------------------------------------------------------------
     */
    //2d array
Pixel[][] pixels = getPixelsFromImage();

    //traverse the array of pixels
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
      Pixel currentPixel = pixels[row][col];

        // pixel value
        int red = currentPixel.getRed();
        int green = currentPixel.getGreen();
        int blue = currentPixel.getBlue();

        //calc avg
        int average = (red+ green + blue) / 3;

        // logic
          if (average < value) {
                currentPixel.setColor(new Color(0, 0, 0));  // Black color
            } else {
                currentPixel.setColor(new Color(255, 255, 255));  // White color
            }
    }
    }
  }
  
}