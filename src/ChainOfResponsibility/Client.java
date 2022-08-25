package ChainOfResponsibility;

public class Client {

  public static void main(String[] args) {
    AuthenticationHandler handler = new BasicAuthenticationHandler(new ClientCertificateAuthenticationHandler(new DigestAuthenticationHandler(null)));
    handler.handleRequest("digest");
    handler.handleRequest("basic");
    handler.handleRequest("certificate");
  }

}
