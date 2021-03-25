import java.util.HashMap;
public class SnakesLadders {
    private Boolean gameOver;
  private int player;
  private int pos[];
  private HashMap<Integer, Integer> squares;
  
    public SnakesLadders() {
      pos = new int[2];
      gameOver = false;
      player = 0;
      squares = new HashMap<>();
      squares.put(2,38);
      squares.put(7,14);
      squares.put(8,31);
      squares.put(15,26);
      squares.put(21,42);
      squares.put(28,84);
      squares.put(36,44);
      squares.put(51,67);
      squares.put(71,91);
      squares.put(78,98);
      squares.put(87,94);
      squares.put(99,80);
      squares.put(95,75);
      squares.put(92,88);
      squares.put(89,68);
      squares.put(74,53);
      squares.put(64,60);
      squares.put(62,19);
      squares.put(49,11);
      squares.put(46,25);
      squares.put(16,6);
    }
  
    public String play(int dice1, int dice2) {
        if(gameOver){
          return "Game over!";
        }
      
      int newPos = dice1 + dice2 + pos[player];
      if(newPos > 100){
        pos[player] = 200-newPos;
        
        
      }
      else{
        pos[player] = newPos;
        if(newPos == 100){
          gameOver = true;
          return "Player " + (player + 1) + " Wins!";
        }
      }
      if(squares.containsKey(pos[player])){
        pos[player] = squares.get(pos[player]);
      }
      String result = "Player " + (player+1)+" is on square "+ pos[player];
      if(dice1 != dice2){
        player^=1;
      } 
      return result;
    }
}
