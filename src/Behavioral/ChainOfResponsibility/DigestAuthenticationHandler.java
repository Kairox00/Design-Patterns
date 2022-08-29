package Behavioral.ChainOfResponsibility;

public class DigestAuthenticationHandler extends AuthenticationHandler {

  public DigestAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("digest")){
      System.out.println("handling digest request");
    }
    else{
      super.handleRequest(requestType);
    }
  }

}
