package Behavioral.Strategy;

public class Customer {

  public void makePayment(Account account, int amount){
    account.makePayment(amount);
  }

}
