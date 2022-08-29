package Structural.Composite;

import java.util.ArrayList;

public class BookCollection implements LibraryItem{

  private ArrayList<LibraryItem> libraryItems = new ArrayList<>();

  public void addItem(LibraryItem libraryItem) {libraryItems.add(libraryItem); }

  public void checkout() {
    libraryItems.forEach(LibraryItem::checkout);
  }

  public void returnBook() {
    libraryItems.forEach(LibraryItem::returnBook);
  }


}
