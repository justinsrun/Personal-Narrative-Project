import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Creates an instance of the myStory class, which defines the scenes
    myStory images = new myStory();

    // Calls the methods to display the different scenes in sequence
    images.intro();            // Introductory scene
    images.favoriteFood();     // Scene showcasing the first favorite food
    images.favoriteFood2();    // Scene showcasing the second favorite food
    images.favoriteDessert();  // Scene showcasing the favorite dessert

    // Plays the scenes in the Theater
    Theater.playScenes(images);  // Starts the theater performance with the defined scenes
  }
}
