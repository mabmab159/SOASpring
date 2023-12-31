
package pe.mijael.autosservice.schema;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.mijael.autosservice.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.mijael.autosservice.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutosResponse }
     * 
     */
    public AutosResponse createAutosResponse() {
        return new AutosResponse();
    }

    /**
     * Create an instance of {@link AutosRequest }
     * 
     */
    public AutosRequest createAutosRequest() {
        return new AutosRequest();
    }

    /**
     * Create an instance of {@link AutosResponse.Autos }
     * 
     */
    public AutosResponse.Autos createAutosResponseAutos() {
        return new AutosResponse.Autos();
    }

}
