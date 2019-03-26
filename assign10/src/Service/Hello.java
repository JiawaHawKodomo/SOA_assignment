package Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Hello {
    @WebMethod
    void SayHelloDefaul();

    @WebMethod
    void SayHello(@WebParam(name = "name") String name);

    @WebMethod
    @WebResult(name = "valid")
    int CheckTime(@WebParam(name = "clientTime") Date clientTime);
}
