// 1. Follow the recipe instructions inside the Segment class.
// This class will be used to represent each part of the moving snake.
class Segment {

  //2. Create x and y member variables to hold the location of each segment.
private  int x;
  private int y;
  // 3. Add a constructor with parameters to initialize each variable.
  public Segment(int x,int y){
    this.x=x;
    this.y=y;
  }
  // 4. Add getter and setter methods for both the x and y member variables.
  public void setX(int x1){
    x=x1;

}
public void setY(int y1){
  y=y1;
}
public int getX(){
  return x;
}
public int getY(){
  return y;
}
}
// Constants that represent right, left, up, and down directions
final int R = 0;
final int L = 1;
final int U = 2;
final int D = 3;

// 5. Create and initialize an ArrayList of Segments. (This will be your snake!)
ArrayList<Segment> snake = new ArrayList<Segment>();

// 6. Create (but do not initialize) a Segment variable to hold the head of the Snake
Segment head;

// 7. Create and initialize a variable to hold how many pieces of food the snake has eaten.
int food=1;
// 8. Create and initialize foodX and foodY variables to hold the location of the food.
// (Hint: use the random method to set both the x and y to random locations within the screen size (500 by 500).)
int foodX=(int)random(500);
int foodY=(int)random(500);

// 9. Create a direction variable to hold the direction your snake is moving.
// Initialize it to one of the direction constant variables provided above (R, L, U, or D)
int dir=U;

void setup() {
  // 10. Set the size of your sketch (500 by 500).
  size(500,500);
  // 11. Add a Segment object to your snake ArrayList
snake.add(new Segment((int)random(500), (int)random(500)));
  // 12. Use the frameRate(int rate) method to set the rate to 30.
frameRate(15);
}

void draw() {
 background(0);
 //13. Set the head of your snake to the last segment in your ArrayList.
head=snake.get(snake.size()-1);
 //14. Call the drawFood, drawSnake, move, and collision methods.
drawFood();
drawSnake();
move();
collision();
}

// 15. Complete the drawFood method below. (Hint: each piece of food should be a 10 by 10 rectangle).
void drawFood() {
  rect(foodX, foodY, 10,10);
}

//16. Complete the drawSnake method below.
void drawSnake() {
  
  // 16a. Draw a 10 by 10 rectangle for each Segment in your snake ArrayList.
  for(Segment s:snake){
    rect(s.getX(),s.getY(),10,10);
  }
  
  // 16b. While the snake size is greater than your food, remove the first Segment in your snake.
while(snake.size()>food){
 snake.remove(snake.get(0)); 
}
}

// 17. Complete the missing parts of the collision method below.
void collision() {
  // For each segment in the snake,
  for (Segment s: snake) {
    // If the segment is colliding with a piece of food...
    if (s.getX() + 10 > foodX && s.getX() < foodX + 10 && s.getY() + 10 > foodY && s.getY() < foodY + 10) {
      //17a. Increase the amount of food eaten and set foodX and foodY to new random locations.
      food+=1;
      foodX=(int)random(500);
      foodY=(int)random(500);
    }
    
    for (Segment c : snake) {
     if (c != s) {
       // If different segments have the same value...
       if (c.getX() == s.getX() && c.getY() == s.getY() ) {
         // 17b. Set food to 3.
         food=3;
       }
     }
    }

  }
}

void checkBoundaries() {
  if (head.getX() > width)
    head.setX(0);
  if (head.getY() > height)
    head.setY(0);
  if ( head.getX() < 0)
    head.setX(width);
  if (head.getY() < 0)
    head.setY(height);
}

// 18. Complete the move method below.
void move() {
  // 18a. Call the checkBoundaries method to make sure the snake doesn't go off the screen.
  checkBoundaries();
  // 18b. Create a switch statement using your direction variable. Depending on the direction, add a new segment to your snake.
  
  // The first case is done for you.
  switch(dir) {
    case U:
      snake.add(new Segment(head.x, head.y-10));
      break;
      case D:
      snake.add(new Segment(head.x, head.y+10));
      break;
      case L:
      snake.add(new Segment(head.x-10, head.y));
      break;
      case R:
      snake.add(new Segment(head.x+10, head.y));
      break;
  }
  
}
// 19. Complete the keyPressed method below. Use if statements to set your direction variable depending on what key is pressed.
void keyPressed() {
  if(keyCode==UP){
    dir=U;
  }
  if(keyCode==DOWN){
    dir=D;
  }
  if(keyCode==LEFT){
    dir=L;
  }
  if(keyCode==RIGHT){
    dir=R;
  }
}
  