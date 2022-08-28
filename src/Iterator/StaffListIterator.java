package Iterator;

import java.util.Iterator;

public class StaffListIterator implements Iterator {
    private StaffList staffList;
    private int index;

    public StaffListIterator(StaffList staffList) {
        this.staffList = staffList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        Employee[] employees = staffList.getEmployees();
        return index < employees.length;
    }

    @Override
    public Employee next() {
        if(hasNext()){
            Employee[] employees = staffList.getEmployees();
            Employee employee = employees[index++];
            return employee;
        }
        else{
            return null;
        }
    }
}
