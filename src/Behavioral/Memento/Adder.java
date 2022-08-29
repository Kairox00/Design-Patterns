package Behavioral.Memento;

public class Adder {

  private int result;
  private Memento memento;

  public Adder() {
    this.memento = new Memento(result);
  }

  public void add(int newNumber) {
    result += newNumber;
  }

  public int getResult() {
    return result;
  }

  public void save(){
    memento.setState(result);
  }

  public void undo(){
    result = memento.getState();
  }

}
