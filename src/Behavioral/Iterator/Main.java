package Behavioral.Iterator;

public class Main {

  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");

    StaffList staffList = new StaffList(zak, sarah, anna);
    StaffListIterator staffListIterator = new StaffListIterator(staffList);

    while(staffListIterator.hasNext()){
      Employee employee = staffListIterator.next();
      System.out.println(employee.getName());
    }
  }

}
