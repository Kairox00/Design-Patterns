package Behavioral.ChainOfResponsibility;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("certificate")){
      System.out.println("handling client certificate request");
    }
    else{
      super.handleRequest(requestType);
    }
  }

}
