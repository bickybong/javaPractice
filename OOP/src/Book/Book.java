package Book;

import java.util.ArrayList;

public class Book {

  private int id;
  private String name;
  private String author;
  private ArrayList<Review> review = new ArrayList<>();

  public Book(int id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public static void main(String[] args) {
    Book book1 = new Book(243, "OOP with java", "Zephan");
    book1.addReview(new Review(10, "Great Book", 5));
    book1.addReview(new Review(101, "Amazing Book", 4));
    System.out.println(book1);
  }

  private void addReview(Review review) {
    this.review.add(review);
  }

  public String toString() {
    return String.format(
      "id - %d name - %s author - %s reviews - %s",
      id,
      name,
      author,
      review
    );
  }
}
