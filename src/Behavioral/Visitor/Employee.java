package Behavioral.Visitor;

public interface Employee {

  int getSalary();
  void accept(Visitor visitor);

}
