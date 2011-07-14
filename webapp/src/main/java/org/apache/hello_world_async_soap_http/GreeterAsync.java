package org.apache.hello_world_async_soap_http;

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
 * 2011-06-07T23:18:21.191-07:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://apache.org/hello_world_async_soap_http", name = "GreeterAsync")
@XmlSeeAlso({org.apache.hello_world_async_soap_http.types.ObjectFactory.class})
public interface GreeterAsync {

    @RequestWrapper(localName = "greetMeSometime", targetNamespace = "http://apache.org/hello_world_async_soap_http/types", className = "org.apache.hello_world_async_soap_http.types.GreetMeSometime")
    @ResponseWrapper(localName = "greetMeSometimeResponse", targetNamespace = "http://apache.org/hello_world_async_soap_http/types", className = "org.apache.hello_world_async_soap_http.types.GreetMeSometimeResponse")
    @WebMethod(operationName = "greetMeSometime")
    public Response<org.apache.hello_world_async_soap_http.types.GreetMeSometimeResponse> greetMeSometimeAsync(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_async_soap_http/types")
        java.lang.String requestType
    );

    @RequestWrapper(localName = "greetMeSometime", targetNamespace = "http://apache.org/hello_world_async_soap_http/types", className = "org.apache.hello_world_async_soap_http.types.GreetMeSometime")
    @ResponseWrapper(localName = "greetMeSometimeResponse", targetNamespace = "http://apache.org/hello_world_async_soap_http/types", className = "org.apache.hello_world_async_soap_http.types.GreetMeSometimeResponse")
    @WebMethod(operationName = "greetMeSometime")
    public Future<?> greetMeSometimeAsync(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_async_soap_http/types")
        java.lang.String requestType,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<org.apache.hello_world_async_soap_http.types.GreetMeSometimeResponse> asyncHandler
    );

    @WebResult(name = "responseType", targetNamespace = "http://apache.org/hello_world_async_soap_http/types")
    @RequestWrapper(localName = "greetMeSometime", targetNamespace = "http://apache.org/hello_world_async_soap_http/types", className = "org.apache.hello_world_async_soap_http.types.GreetMeSometime")
    @WebMethod
    @ResponseWrapper(localName = "greetMeSometimeResponse", targetNamespace = "http://apache.org/hello_world_async_soap_http/types", className = "org.apache.hello_world_async_soap_http.types.GreetMeSometimeResponse")
    public java.lang.String greetMeSometime(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_async_soap_http/types")
        java.lang.String requestType
    );
}
