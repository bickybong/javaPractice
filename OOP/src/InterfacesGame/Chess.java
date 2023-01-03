package InterfacesGame;

public class Chess implements GamingConsole {

  public static void main(String[] args) {
    GamingConsole[] games = { new Mario(), new Chess() };
    for (GamingConsole game : games) {
      game.up();
      game.down();
      game.right();
      game.left();
    }
  }

  @Override
  public void up() {
    // TODO Auto-generated method stub
    System.out.println("Piece up");
  }

  @Override
  public void down() {
    // TODO Auto-generated method stub
    System.out.println("Piece down");
  }

  @Override
  public void left() {
    // TODO Auto-generated method stub
    System.out.println("Piece left");
  }

  @Override
  public void right() {
    // TODO Auto-generated method stub
    System.out.println("Piece right");
  }
}
