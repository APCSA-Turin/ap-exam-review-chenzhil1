
public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    private boolean isBonus;
    private int playCounter;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Game(Level level1, Level level2, Level level3, boolean isBonus) {
        levelOne = level1;
        levelTwo = level2;
        levelThree = level3;
        this.isBonus = isBonus;
        playCounter = 0;
    }

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public boolean isBonus() {
        return isBonus;
    }

    public int getScore() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with GameTester
        /* to be implemented in part (a) */ 
int total = 0;
if(levelOne.goalReached()) {
  total += levelOne.getPoints();
  if(levelTwo.goalReached()) {
    total += levelTwo.getPoints();
    if(levelThree.goalReached()) {
      total += levelThree.getPoints();
    }
  }
}
if(isBonus()) {
  total *= 3;
}
return total;
    }

    public int playManyTimes(int num) {
        // TYPE UP YOUR PART B CODE HERE
        // then test with GameTester

int high = 0;
for(int i = 0; i < num; i ++ ) {
    play();
         int score = getScore();
  if(score > high) {
    high = score;
  }
}
return high;
    }

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public void play() {
        if (playCounter == 0) {
            levelOne = new Level(true, 10);
            levelTwo = new Level(true, 20);
            levelThree = new Level(true, 45);
        } else if (playCounter == 1) {
            levelOne = new Level(true, 15);
            levelTwo = new Level(true, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 2) {
            levelOne = new Level(true, 90);
            levelTwo = new Level(false, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 3) {
            levelOne = new Level(true, 5);
            levelTwo = new Level(true, 5);
            levelThree = new Level(true, 10);
        } else if (playCounter == 4) {
            levelOne = new Level(true, 50);
            levelTwo = new Level(true, 15);
            levelThree = new Level(true, 35);
        } else if (playCounter == 5) {
            levelOne = new Level(true, 110);
            levelTwo = new Level(false, 50);
            levelThree = new Level(true, 10);
        }
        playCounter++;
    }
}
