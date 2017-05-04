/**
*file: PuzzleGame.java
*author: Bo Fu
*course: CMPT220
*assignment: prj_2
*due date: April 24 2017
*version: 3.0
*/
import java.util.Random;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PuzzleGame extends Application {
  public int m;                              //The number which is not random generated.
  public ImageView emptimg = new ImageView();
  ImageView[] imageViews = new ImageView[9];
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage arg0) throws Exception {
    init(arg0);
  }
  
  
  /**
  *init:
  *
  * initialize the program
  * get image and add to the imageViews
  * add imageViews into GridPane
  * create VBox to show Original picture and ImageView[m]
  * add VBox to the Right of BorderPane
  * add Button at the Bottom of BorderPane
  * Button set event Alert("GameOver")
  * add BorderPane into Stage
  * set stage title "Puzzle Game"
  * set availabe for player to change the size of window
  * show the stage
  *
  *Parameter:
  *
  * stage
  *
  */
  public void init(Stage stage) {
    int[] n = random();              
    
    Image image = new Image("1.jpg");    // change the picture here!

    GridPane gridPane = new GridPane();
    
    for(int i = 0, k = 0; i <= 2; ++i) {
      for(int j = 0; j <= 2; ++j, ++k) {
        imageViews[k] = new ImageView(image);
        imageViews[k].setOnMouseClicked(new myevent());
        imageViews[k].setViewport(new Rectangle2D(100 * j, 100 * i, 100, 100));
      }
    }
    
    //Place the puzzles in the random order
    gridPane.add(imageViews[n[0]], 0, 0);
    gridPane.add(imageViews[n[1]], 1, 0);
    gridPane.add(imageViews[n[2]], 2, 0);
    gridPane.add(imageViews[n[3]], 0, 1);
    gridPane.add(imageViews[n[4]], 1, 1);
    gridPane.add(imageViews[n[5]], 2, 1);
    gridPane.add(imageViews[n[6]], 0, 2);
    gridPane.add(imageViews[n[7]], 1, 2);
    m = findnum(n);
    ImageView incomp = new ImageView(imageViews[m].getImage());
    ImageView comp = new ImageView(image);             // The empty picture
    incomp.setViewport(imageViews[m].getViewport());  //Place the original picture
    Image image2 = new Image("2.jpg");
    imageViews[m].setImage(image2);
    gridPane.add(imageViews[m], 2, 2);
    gridPane.setGridLinesVisible(true);
    BorderPane borderPane = new BorderPane(gridPane);
    
    VBox right = new VBox(20, incomp, comp);
    borderPane.setRight(right);
    
    Button button = new Button("Give Up!");  // Button to show you Game is over.
    button.setOnAction(new EventHandler<ActionEvent>() {   //A button click event.
    @Override
    public void handle(ActionEvent event) {
      Alert alert = new Alert(AlertType.WARNING, "Game Over£¡");
      alert.show();
      }
    });
    borderPane.setBottom(button);
    Scene scene = new Scene(borderPane, 640, 500);
    stage.setScene(scene);
    stage.setTitle("Puzzle Game");
    stage.setResizable(true);     // Allow to change the size of the window.
    stage.show();
    
       
    
    
  }
  
  
  /**
  *random():
  * 
  * Generate a array list length in 8 called ran[]
  * Call iso(ran) to get inversion random number
  *
  *return Value:
  * array list of number in ran[]
  *
  */
  public int[] random() {         //Generate Inversion sequence of number(no repeat number)
    int[] ran = new int[8];
    while(iso(ran) == false) {
      ran = random_num();
    }
    return ran;
    
  }
  
  
  /**
  *random_num():
  * 
  * Generate 8 number in array list ran[]
  * random place the order of the 8 numbers
  * make sure there is not repeat of the 8 numbers
  *
  *return Value:
  * array list of random placed number in r[]
  *
  */
  public int[] random_num() {    //8 number without repeat
    int r[] = new int[8];
    Random random = new Random();
    for(int i = 0; i < 8; ++i) {
      r[i] = random.nextInt(9);
      for(int j = 0;j < i; ++j) {
        while(r[i] == r[j]) {
          i--;
          break;
        }
      }
    }
    return r;
  }
  
  
  /**
  *iso():
  * 
  * get the array list num[]
  * judge if the number obey th inversion
  * the number of inversion number should be an even number 
  *
  *Parameter:
  * int[] num
  *
  *return Value:
  * boolean True(if number of inversion pair is even number and not zero)
  * boolean False(if number of inversion pair is odd)
  *
  */
  public boolean iso(int[] num) {    //identify the inversion pair is a even number
    int sum = 0;
    for(int i = 0; i <= 6; ++i) {
      for(int j = i; j <= 7; j++) {
        if(num[i] > num[j]) {
          sum++;
        }
      }
    }
    if((sum % 2) == 0 && sum != 0) {
      return true;
    }
    
    return false;
  }
  
  
  /**
  *Mouse Click Event
  * 
  * find the location of the click image
  * find the relationship of the image with the empty image
  * swap the click image and the empty image(only swap if the image is near to the empty image)
  * check after every swap, if the image is already repaired, if it is, then show the alert "Success"
  *
  *return Value:
  * array list of number in ran[]
  *
  */
  class myevent implements EventHandler<MouseEvent> {    //Click event, judge the location of the puzzle from 4 sides of the empty one.
    @Override
    public void handle(MouseEvent arg0) {
      // TODO Auto-generated method stub
      ImageView img = (ImageView) arg0.getSource();
      double sx = img.getLayoutX();
      double sy = img.getLayoutY();
      double dispx = sx - imageViews[m].getLayoutX();
      double dispy = sy - imageViews[m].getLayoutY();
      
      if((dispx == -100) && (dispy == 0 )) {           //Left one
        swapping(img, imageViews[m]);
        if(issucc(imageViews)) {
          Alert alert = new Alert(AlertType.WARNING, "Success!");
          alert.show();
        }
      }

      else if ((dispx == 0) && (dispy == -100)) {     //Top one
        swapping(img, imageViews[m]);
        if(issucc(imageViews)) {
          Alert alert = new Alert(AlertType.WARNING, "Success!");
          alert.show();
        }
      }
      
      else if((dispx == 100) && (dispy == 0)) {       //Right one
        swapping(img, imageViews[m]);
        if(issucc(imageViews)) {
          Alert alert = new Alert(AlertType.WARNING, "Success!");
          alert.show();
        }
      }
      
      else if((dispx == 0) && (dispy == 100)) {       //Bottom one
        swapping(img, imageViews[m]);
        if(issucc(imageViews)) {
          Alert alert = new Alert(AlertType.WARNING, "Success!");
          alert.show();
        }
      }
    }
    
    
    /**
    *swapping(image1, image2):
    * 
    * find the location of the two images(in xy coordinate)
    * the x and y value are represented by the index of their Row and Column in GridPane
    * exchange the value of x, y for both image(swap)
    *
    *Parameter:
    * image i1 and image i2
    *
    */
    public void swapping(ImageView i1, ImageView i2) { //Swap the image
      int row1 = GridPane.getRowIndex(i1);
      int colu1 = GridPane.getColumnIndex(i1);
      int row2 = GridPane.getRowIndex(i2);
      int colu2 = GridPane.getColumnIndex(i2);
      
      GridPane.setRowIndex(i1, row2);
      GridPane.setColumnIndex(i1, colu2);
      GridPane.setRowIndex(i2, row1);
      GridPane.setColumnIndex(i2, colu1);
    }
  }
  
  
  /**
  *issucc(imageViews):
  * 
  * check the location of each image in the GridPane
  * if the picture is not in the right locaation, the value i would not be the same with its ordinal
  * return false if not same
  * return true if i is same with its ordinal
  *
  *Parameter:
  * array list of imageViews (n[])
  *
  *Return Value:
  * boolean
  * if i == ordinal return true
  * if not return false
  *
  */  
  public boolean issucc(ImageView[] imageViews) {     //judge the puzzle is in right order or not.
    for(int i = 0; i <= 8; ++i) {
      if(i != 3 * GridPane.getRowIndex(imageViews[i]) + GridPane.getColumnIndex(imageViews[i])) {
        return false;
      }
    }
    return true;
  }
  
  
  /**
  *findnum(int[] n):
  * 
  * find the place for m(the empty image)
  * make sure it is not included in the array list n
  * 
  *
  *Parameter:
  * array list int[] n
  *
  *Return Value:
  * whcih is the value of m
  *
  */
  public int findnum(int[] n) {
    for(int j = 0; j <= 8; ++j) {
      if((j == n[0]) || (j == n[1]) || (j == n[2]) || (j == n[3]) || (j == n[4]) || (j == n[5]) || (j == n[6]) || (j == n[7])) {
      }
      else {
        return j;
      }
    }
    return -1;
  }
}
