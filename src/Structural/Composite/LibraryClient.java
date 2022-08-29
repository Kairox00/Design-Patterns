package Structural.Composite;

public class LibraryClient {

  public static void main(String[] args) {

    NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
    FictionBook fictionBookOne = new FictionBook("Hamlet", true);
    FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.addItem(nonfictionBook);
    bookCollection.addItem(fictionBookOne);
    bookCollection.addItem(fictionBookTwo);

    checkoutItem(nonfictionBook);
    checkoutItem(fictionBookOne);
    checkoutItem(bookCollection);

    returnItem(nonfictionBook);
    returnItem(fictionBookOne);
    returnItem(bookCollection);

  }

  public static void checkoutItem(LibraryItem libraryItem) {
    libraryItem.checkout();
  }

  public static void returnItem(LibraryItem libraryItem) {
    libraryItem.returnBook();
  }

}
