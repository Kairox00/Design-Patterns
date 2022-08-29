package Behavioral.Strategy;

//Functional Interface
public interface Account {

    void makePayment(int amount);

    Account bankAccount = (int amount) -> System.out.println("Payment of $"+amount+" made from bank account");
    Account paypalAccount = (int amount) -> System.out.println("Payment of $"+amount+" made from paypal account");

}
