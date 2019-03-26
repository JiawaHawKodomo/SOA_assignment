package Service.Impl;

import Service.Hello;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;

@WebService(endpointInterface = "Service.Hello")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloImpl implements Hello {
    @Override
    public void SayHelloDefaul() {
        System.out.println("hello");
    }

    @Override
    public void SayHello(String name) {
        System.out.println("hello " + name);
    }

    @Override
    public int CheckTime(Date clientTime) {
        return 0;
    }
}
