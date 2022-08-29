package Behavioral.ChainOfResponsibility;

public class BasicAuthenticationHandler extends AuthenticationHandler {

  public BasicAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("basic")){
      System.out.println("handling basic request");
    }
    else{
      super.handleRequest(requestType);
    }


  }

}
