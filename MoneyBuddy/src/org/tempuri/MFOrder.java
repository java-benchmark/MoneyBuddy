
package org.tempuri;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MFOrder", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://www.bsestarmf.in/MFOrderEntry/MFOrder.svc?wsdl")
public class MFOrder
    extends Service
{

    private final static URL MFORDER_WSDL_LOCATION;
    private final static WebServiceException MFORDER_EXCEPTION;
    private final static QName MFORDER_QNAME = new QName("http://tempuri.org/", "MFOrder");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.bsestarmf.in/MFOrderEntry/MFOrder.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MFORDER_WSDL_LOCATION = url;
        MFORDER_EXCEPTION = e;
    }

    public MFOrder() {
        super(__getWsdlLocation(), MFORDER_QNAME);
    }

    public MFOrder(WebServiceFeature... features) {
        super(__getWsdlLocation(), MFORDER_QNAME, features);
    }

    public MFOrder(URL wsdlLocation) {
        super(wsdlLocation, MFORDER_QNAME);
    }

    public MFOrder(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MFORDER_QNAME, features);
    }

    public MFOrder(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MFOrder(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MFOrderEntry
     */
    @WebEndpoint(name = "WSHttpBinding_MFOrderEntry")
    public MFOrderEntry getWSHttpBindingMFOrderEntry() {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_MFOrderEntry"), MFOrderEntry.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MFOrderEntry
     */
    @WebEndpoint(name = "WSHttpBinding_MFOrderEntry")
    public MFOrderEntry getWSHttpBindingMFOrderEntry(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_MFOrderEntry"), MFOrderEntry.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MFORDER_EXCEPTION!= null) {
            throw MFORDER_EXCEPTION;
        }
        return MFORDER_WSDL_LOCATION;
    }

}
