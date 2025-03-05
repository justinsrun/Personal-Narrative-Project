import org.code.theater.*;
import org.code.media.*;

public class myStory extends Scene {
  
  // Instantiate ImageFilter objects for various images
  ImageFilter justin = new ImageFilter("Russel.jpg");
  ImageFilter favfood1 = new ImageFilter("sushi.jpeg");
  ImageFilter favfood2 = new ImageFilter("chicken.jpeg");
  ImageFilter favdessert = new ImageFilter("McFlurry.jpg");

  // Method for the introduction scene
  public void intro() {
    // Clear the screen and set text properties
    clear("black");
    setTextHeight(30);
    setTextColor("white");
    drawText("Hi, my name is Justin!", 25, 140);
    pause(2.0);
    clear("black");
    
    // Draw the image of Justin
    drawImage(justin, 0, 0, justin.getWidth());
    // Pause for 2 seconds to show the image
    pause(2.0);  
    
    // Apply a threshold filter to Justin's image
    justin.threshold(128);
    
    // Draw the modified image (after applying threshold filter)
    drawImage(justin, 0, 0, justin.getWidth());
    pause(2.0);
    playSound("duck-quack-112941.wav");
  }

  // Method for showcasing the first favorite food
  public void favoriteFood() {
    // Clear the screen and set text properties
    clear("black");
    setTextHeight(30);
    setTextColor("white");
    drawText("My favorite food is...!", 25, 140);
    pause(2.0);
    clear("black");
    
    // Draw the first favorite food image
    drawImage(favfood1, 0, 0, favfood1.getWidth());
    // Pause for 2 seconds to show the original image
    pause(2.0);  
    
    // Apply a horizontal motion blur filter to the food image
    favfood1.motionBlur(10, "horizontal");
    
    // Draw the modified image (with motion blur applied)
    drawImage(favfood1, 0, 0, favfood1.getWidth());
    pause(2.0);
    playSound("duck-quack-112941.wav");
  }

  // Method for showcasing the second favorite food
  public void favoriteFood2() {
    // Clear the screen and set text properties
    clear("black");
    setTextHeight(30);
    setTextColor("white");
    drawText("My second favorite food is...!", 25, 140);
    pause(2.0);
    clear("black");
    
    // Draw the second favorite food image
    drawImage(favfood2, 0, 0, favfood2.getWidth());
    // Pause for 2 seconds to show the original image
    pause(2.0);  
    
    // Apply a threshold filter to the food image
    favfood2.threshold(128);
    
    // Draw the modified image (with threshold filter applied)
    drawImage(favfood2, 0, 0, favfood2.getWidth());
    pause(2.0);
    playSound("duck-quack-112941.wav");
  }

  // Method for showcasing the favorite dessert
  public void favoriteDessert() {
    // Clear the screen and set text properties
    clear("black");
    setTextHeight(30);
    setTextColor("white");
    drawText("My favorite dessert is...!", 25, 140);
    pause(2.0);
    clear("black");
    
    // Draw the dessert image
    drawImage(favdessert, 0, 0, favdessert.getWidth());
    // Pause for 2 seconds to show the original image
    pause(2.0);  
    
    // Apply a threshold filter to the dessert image
    favdessert.threshold(128);
    
    // Draw the modified image (with threshold filter applied)
    drawImage(favdessert, 0, 0, favdessert.getWidth());
    pause(2.0);
    playSound("duck-quack-112941.wav");
  }
}
