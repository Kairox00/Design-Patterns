package Behavioral.Visitor;

public interface Visitor {
    void visit(SalesPerson salesPerson);
    void visit(Manager manager);
    void visit(StaffList staffList);

}
