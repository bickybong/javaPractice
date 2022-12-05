package Abstract;

public abstract class Recipe {

  public void execute() {
    getReady();
    doTheDish();
    cleanup();
  }

  abstract void cleanup();

  abstract void doTheDish();

  abstract void getReady();
}
