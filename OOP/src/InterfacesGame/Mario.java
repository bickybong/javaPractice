package InterfacesGame;

public class Mario implements GamingConsole {

  public static void main(String[] args) {
    Mario game = new Mario();
    game.up();
    game.down();
    game.right();
    game.left();
  }

  @Override
  public void up() {
    // TODO Auto-generated method stub
    System.out.println("Jump");
  }

  @Override
  public void down() {
    // TODO Auto-generated method stub
    System.out.println("Crouch");
  }

  @Override
  public void left() {
    // TODO Auto-generated method stub
    System.out.println("move left");
  }

  @Override
  public void right() {
    // TODO Auto-generated method stub
    System.out.println("move right");
  }
}
