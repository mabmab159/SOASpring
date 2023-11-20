package pe.joedayz.sumservice.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.3
 * 2023-11-19T19:46:01.776-05:00
 * Generated source version: 4.0.3
 *
 */
@WebServiceClient(name = "SumService",
                  wsdlLocation = "file:/C:/Users/Miguel/Desktop/soa/src/main/resources/wsdl/SumService.wsdl",
                  targetNamespace = "http://joedayz.pe/SumService/wsdl")
public class SumService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://joedayz.pe/SumService/wsdl", "SumService");
    public final static QName SumServiceSOAPBinding = new QName("http://joedayz.pe/SumService/wsdl", "SumServiceSOAPBinding");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Miguel/Desktop/soa/src/main/resources/wsdl/SumService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SumService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Miguel/Desktop/soa/src/main/resources/wsdl/SumService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SumService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SumService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SumService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SumService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SumService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SumService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SumServicePort
     */
    @WebEndpoint(name = "SumServiceSOAPBinding")
    public SumServicePort getSumServiceSOAPBinding() {
        return super.getPort(SumServiceSOAPBinding, SumServicePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SumServicePort
     */
    @WebEndpoint(name = "SumServiceSOAPBinding")
    public SumServicePort getSumServiceSOAPBinding(WebServiceFeature... features) {
        return super.getPort(SumServiceSOAPBinding, SumServicePort.class, features);
    }

}