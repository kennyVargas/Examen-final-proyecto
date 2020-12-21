
package servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioClinica", targetNamespace = "http://servicios/", wsdlLocation = "http://localhost:8080/WebServiceJava/ServicioClinica?WSDL")
public class ServicioClinica_Service
    extends Service
{

    private final static URL SERVICIOCLINICA_WSDL_LOCATION;
    private final static WebServiceException SERVICIOCLINICA_EXCEPTION;
    private final static QName SERVICIOCLINICA_QNAME = new QName("http://servicios/", "ServicioClinica");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebServiceJava/ServicioClinica?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOCLINICA_WSDL_LOCATION = url;
        SERVICIOCLINICA_EXCEPTION = e;
    }

    public ServicioClinica_Service() {
        super(__getWsdlLocation(), SERVICIOCLINICA_QNAME);
    }

    public ServicioClinica_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOCLINICA_QNAME, features);
    }

    public ServicioClinica_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOCLINICA_QNAME);
    }

    public ServicioClinica_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOCLINICA_QNAME, features);
    }

    public ServicioClinica_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioClinica_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioClinica
     */
    @WebEndpoint(name = "ServicioClinicaPort")
    public ServicioClinica getServicioClinicaPort() {
        return super.getPort(new QName("http://servicios/", "ServicioClinicaPort"), ServicioClinica.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioClinica
     */
    @WebEndpoint(name = "ServicioClinicaPort")
    public ServicioClinica getServicioClinicaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios/", "ServicioClinicaPort"), ServicioClinica.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOCLINICA_EXCEPTION!= null) {
            throw SERVICIOCLINICA_EXCEPTION;
        }
        return SERVICIOCLINICA_WSDL_LOCATION;
    }

}
