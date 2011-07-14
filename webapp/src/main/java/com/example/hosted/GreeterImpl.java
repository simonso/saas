
package com.example.hosted;

import com.example.mdm.persistence.device.AppleDeviceInfo;
import com.example.mdm.service.AppleDeviceInfoService;
import org.apache.hello_world_async_soap_http.GreeterAsync;
import org.apache.hello_world_async_soap_http.types.GreetMeSometimeResponse;

import java.lang.String;
import java.lang.System;
import java.util.Random;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;


@WebService(serviceName = "SOAPService",
            portName = "SoapPort", 
            endpointInterface = "org.apache.hello_world_async_soap_http.GreeterAsync",
            targetNamespace = "http://apache.org/org.apache.hello_world_async_soap_http")
                  
public class GreeterImpl  implements GreeterAsync {
    private static final Logger LOG = 
        Logger.getLogger(GreeterImpl.class.getPackage().getName());

    private static Random r = new Random(System.currentTimeMillis());

    private AppleDeviceInfoService deviceInfoService;

     /* (non-Javadoc)
     * @see org.apache.hello_world_soap_http.Greeter#greetMeSometime(java.lang.String)
     */
    public String greetMeSometime(String me) {
        LOG.info("Executing operation greetMeSometime");

        AppleDeviceInfo deviceInfo = deviceInfoService.getAppleDeviceInfo(Integer.parseInt(me));

        AppleDeviceInfo another = new AppleDeviceInfo();
        another.setUdid("2b6f0cc904d137be2e1730235f5664094b831185");
        another.setDeviceName("D_0");
        another.setIosVersion("4..3");
        another.setIosBuild("8A2233");
        deviceInfoService.setAppleDeviceInfo(another);

        return "Get DeviceName: " + deviceInfo.getDeviceName();
    }

    @Override
    public Response<GreetMeSometimeResponse> greetMeSometimeAsync(@WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_async_soap_http/types") String requestType) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Future<?> greetMeSometimeAsync(@WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_async_soap_http/types") String requestType, @WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<GreetMeSometimeResponse> asyncHandler) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setDeviceInfoService(final AppleDeviceInfoService service) {
        this.deviceInfoService = service;
    }
}
