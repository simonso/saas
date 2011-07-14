package org.apache.mdm_async_soap_http;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-07-14T13:15:58.940-07:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://apache.org/mdm_async_soap_http", name = "DeviceEnrollment")
@XmlSeeAlso({org.apache.mdm_async_soap_http.types.ObjectFactory.class})
public interface DeviceEnrollment {

    @RequestWrapper(localName = "deviceInfo", targetNamespace = "http://apache.org/mdm_async_soap_http/types", className = "org.apache.mdm_async_soap_http.types.DeviceInfo")
    @ResponseWrapper(localName = "deviceInfoResponse", targetNamespace = "http://apache.org/mdm_async_soap_http/types", className = "org.apache.mdm_async_soap_http.types.DeviceInfoResponse")
    @WebMethod(operationName = "deviceInfo")
    public Response<org.apache.mdm_async_soap_http.types.DeviceInfoResponse> deviceInfoAsync(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/mdm_async_soap_http/types")
        java.lang.String requestType
    );

    @RequestWrapper(localName = "deviceInfo", targetNamespace = "http://apache.org/mdm_async_soap_http/types", className = "org.apache.mdm_async_soap_http.types.DeviceInfo")
    @ResponseWrapper(localName = "deviceInfoResponse", targetNamespace = "http://apache.org/mdm_async_soap_http/types", className = "org.apache.mdm_async_soap_http.types.DeviceInfoResponse")
    @WebMethod(operationName = "deviceInfo")
    public Future<?> deviceInfoAsync(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/mdm_async_soap_http/types")
        java.lang.String requestType,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<org.apache.mdm_async_soap_http.types.DeviceInfoResponse> asyncHandler
    );

    @WebResult(name = "responseType", targetNamespace = "http://apache.org/mdm_async_soap_http/types")
    @RequestWrapper(localName = "deviceInfo", targetNamespace = "http://apache.org/mdm_async_soap_http/types", className = "org.apache.mdm_async_soap_http.types.DeviceInfo")
    @WebMethod
    @ResponseWrapper(localName = "deviceInfoResponse", targetNamespace = "http://apache.org/mdm_async_soap_http/types", className = "org.apache.mdm_async_soap_http.types.DeviceInfoResponse")
    public java.lang.String deviceInfo(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/mdm_async_soap_http/types")
        java.lang.String requestType
    );
}
