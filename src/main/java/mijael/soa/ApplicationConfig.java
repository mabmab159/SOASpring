package mijael.soa;


import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.soap.SOAPBinding;
import mijael.soa.impl.AutosServiceImpl;
import mijael.soa.impl.LoginServiceImpl;
import mijael.soa.impl.ReservaServiceImpl;
import mijael.soa.impl.SumServiceImpl;
import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ApplicationConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint1(SumServiceImpl sumServiceImpl) {
        Endpoint endpoint = new EndpointImpl(bus, sumServiceImpl, SOAPBinding.SOAP12HTTP_BINDING);
        endpoint.publish("/soap/SumService");
        return endpoint;
    }

    @Bean
    public Endpoint endpoint2(LoginServiceImpl loginServiceImpl) {
        Endpoint endpoint = new EndpointImpl(bus, loginServiceImpl, SOAPBinding.SOAP12HTTP_BINDING);
        endpoint.publish("/soap/LoginService");
        return endpoint;
    }

    @Bean
    public Endpoint endpoint3(ReservaServiceImpl reservaServiceImpl) {
        Endpoint endpoint = new EndpointImpl(bus, reservaServiceImpl, SOAPBinding.SOAP12HTTP_BINDING);
        endpoint.publish("/soap/ReservaService");
        return endpoint;
    }

    @Bean
    public Endpoint endpoint4(AutosServiceImpl autosServiceImpl) {
        Endpoint endpoint = new EndpointImpl(bus, autosServiceImpl, SOAPBinding.SOAP12HTTP_BINDING);
        endpoint.publish("/soap/AutosService");
        return endpoint;
    }
}
