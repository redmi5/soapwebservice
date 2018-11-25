package ws;


//Service Implementation Bean

import javax.jws.WebService;

@WebService(endpointInterface = "ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
       @Override
    public String getHelloWorldAsString(String name) {
        return "Hi, "+name;
    }
}
