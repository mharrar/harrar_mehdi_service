import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String path="http://0.0.0.0:9192/";
        Endpoint.publish(path,new BanqueService());
        System.out.println("web service déployé sur "+path);
    }}
