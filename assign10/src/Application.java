import Service.Impl.HelloImpl;
import Service.Impl.InfoServiceImpl;
import Service.Impl.LoginImpl;
import Service.Impl.ScoreServiceImpl;

import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8000/assign10/Service/Hello", new HelloImpl());
        Endpoint.publish("http://localhost:8000/assign10/Service/Login", new LoginImpl());
        Endpoint.publish("http://localhost:8000/assign10/Service/InfoService", new InfoServiceImpl());
        Endpoint.publish("http://localhost:8000/assign10/Service/ScoreService", new ScoreServiceImpl());
    }
}
