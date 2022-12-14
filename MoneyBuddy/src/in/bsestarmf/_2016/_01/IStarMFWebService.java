
package in.bsestarmf._2016._01;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.datacontract.schemas._2004._07.starmfwebservice.ChildOrderRequest;
import org.datacontract.schemas._2004._07.starmfwebservice.ChildOrderResponse;
import org.datacontract.schemas._2004._07.starmfwebservice.MFAPIRequest;
import org.datacontract.schemas._2004._07.starmfwebservice.MandateDetailsRequest;
import org.datacontract.schemas._2004._07.starmfwebservice.MandateDetailsResponse;
import org.datacontract.schemas._2004._07.starmfwebservice.PasswordRequest;
import org.datacontract.schemas._2004._07.starmfwebservice.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IStarMFWebService", targetNamespace = "http://www.bsestarmf.in/2016/01/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    in.bsestarmf._2016._01.ObjectFactory.class,
    org.datacontract.schemas._2004._07.starmfwebservice.ObjectFactory.class
})
public interface IStarMFWebService {


    /**
     * 
     * @param password
     * @param passKey
     * @param userId
     * @param memberId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.bsestarmf.in/2016/01/IStarMFWebService/getPassword")
    @WebResult(name = "getPasswordResult", targetNamespace = "http://www.bsestarmf.in/2016/01/")
    @RequestWrapper(localName = "getPassword", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.GetPassword")
    @ResponseWrapper(localName = "getPasswordResponse", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.GetPasswordResponse")
    public String getPassword(
        @WebParam(name = "UserId", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        String userId,
        @WebParam(name = "MemberId", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        String memberId,
        @WebParam(name = "Password", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        String password,
        @WebParam(name = "PassKey", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        String passKey);

    /**
     * 
     * @param flag
     * @param param
     * @param userId
     * @param encryptedPassword
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MFAPI", action = "http://www.bsestarmf.in/2016/01/IStarMFWebService/MFAPI")
    @WebResult(name = "MFAPIResult", targetNamespace = "http://www.bsestarmf.in/2016/01/")
    @RequestWrapper(localName = "MFAPI", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.MFAPI")
    @ResponseWrapper(localName = "MFAPIResponse", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.MFAPIResponse")
    public String mfapi(
        @WebParam(name = "Flag", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        String flag,
        @WebParam(name = "UserId", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        String userId,
        @WebParam(name = "EncryptedPassword", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        String encryptedPassword,
        @WebParam(name = "param", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        String param);

    /**
     * 
     * @param param
     * @return
     *     returns org.datacontract.schemas._2004._07.starmfwebservice.Response
     */
    @WebMethod(operationName = "GetPasswordMobile", action = "http://www.bsestarmf.in/2016/01/IStarMFWebService/GetPasswordMobile")
    @WebResult(name = "GetPasswordMobileResult", targetNamespace = "http://www.bsestarmf.in/2016/01/")
    @RequestWrapper(localName = "GetPasswordMobile", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.GetPasswordMobile")
    @ResponseWrapper(localName = "GetPasswordMobileResponse", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.GetPasswordMobileResponse")
    public Response getPasswordMobile(
        @WebParam(name = "Param", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        PasswordRequest param);

    /**
     * 
     * @param param
     * @return
     *     returns org.datacontract.schemas._2004._07.starmfwebservice.Response
     */
    @WebMethod(operationName = "MFAPIMobile", action = "http://www.bsestarmf.in/2016/01/IStarMFWebService/MFAPIMobile")
    @WebResult(name = "MFAPIMobileResult", targetNamespace = "http://www.bsestarmf.in/2016/01/")
    @RequestWrapper(localName = "MFAPIMobile", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.MFAPIMobile")
    @ResponseWrapper(localName = "MFAPIMobileResponse", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.MFAPIMobileResponse")
    public Response mfapiMobile(
        @WebParam(name = "Param", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        MFAPIRequest param);

    /**
     * 
     * @param param
     * @return
     *     returns org.datacontract.schemas._2004._07.starmfwebservice.Response
     */
    @WebMethod(operationName = "GetPasswordForChildOrder", action = "http://www.bsestarmf.in/2016/01/IStarMFWebService/GetPasswordForChildOrder")
    @WebResult(name = "GetPasswordForChildOrderResult", targetNamespace = "http://www.bsestarmf.in/2016/01/")
    @RequestWrapper(localName = "GetPasswordForChildOrder", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.GetPasswordForChildOrder")
    @ResponseWrapper(localName = "GetPasswordForChildOrderResponse", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.GetPasswordForChildOrderResponse")
    public Response getPasswordForChildOrder(
        @WebParam(name = "Param", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        PasswordRequest param);

    /**
     * 
     * @param param
     * @return
     *     returns org.datacontract.schemas._2004._07.starmfwebservice.ChildOrderResponse
     */
    @WebMethod(operationName = "ChildOrderDetails", action = "http://www.bsestarmf.in/2016/01/IStarMFWebService/ChildOrderDetails")
    @WebResult(name = "ChildOrderDetailsResult", targetNamespace = "http://www.bsestarmf.in/2016/01/")
    @RequestWrapper(localName = "ChildOrderDetails", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.ChildOrderDetails")
    @ResponseWrapper(localName = "ChildOrderDetailsResponse", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.ChildOrderDetailsResponse")
    public ChildOrderResponse childOrderDetails(
        @WebParam(name = "Param", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        ChildOrderRequest param);

    /**
     * 
     * @param param
     * @return
     *     returns org.datacontract.schemas._2004._07.starmfwebservice.Response
     */
    @WebMethod(operationName = "GetAccessToken", action = "http://www.bsestarmf.in/2016/01/IStarMFWebService/GetAccessToken")
    @WebResult(name = "GetAccessTokenResult", targetNamespace = "http://www.bsestarmf.in/2016/01/")
    @RequestWrapper(localName = "GetAccessToken", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.GetAccessToken")
    @ResponseWrapper(localName = "GetAccessTokenResponse", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.GetAccessTokenResponse")
    public Response getAccessToken(
        @WebParam(name = "Param", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        PasswordRequest param);

    /**
     * 
     * @param param
     * @return
     *     returns org.datacontract.schemas._2004._07.starmfwebservice.MandateDetailsResponse
     */
    @WebMethod(operationName = "MandateDetails", action = "http://www.bsestarmf.in/2016/01/IStarMFWebService/MandateDetails")
    @WebResult(name = "MandateDetailsResult", targetNamespace = "http://www.bsestarmf.in/2016/01/")
    @RequestWrapper(localName = "MandateDetails", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.MandateDetails")
    @ResponseWrapper(localName = "MandateDetailsResponse", targetNamespace = "http://www.bsestarmf.in/2016/01/", className = "in.bsestarmf._2016._01.MandateDetailsResponse")
    public MandateDetailsResponse mandateDetails(
        @WebParam(name = "Param", targetNamespace = "http://www.bsestarmf.in/2016/01/")
        MandateDetailsRequest param);

}
