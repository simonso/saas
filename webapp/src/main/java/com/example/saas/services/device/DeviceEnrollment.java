package com.example.saas.services.device;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-07-14T23:19:25.190-07:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://example.com/saas/services/device", name = "DeviceEnrollment")
@XmlSeeAlso({com.example.saas.services.device.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DeviceEnrollment {

    @WebMethod(operationName = "enrollDevice")
    public Response<com.example.saas.services.device.types.DeviceInfoResponse> enrollDeviceAsync(
        @WebParam(partName = "in", name = "deviceInfo", targetNamespace = "http://example.com/saas/services/device/types")
        com.example.saas.services.device.types.DeviceInfo in
    );

    @WebMethod(operationName = "enrollDevice")
    public Future<?> enrollDeviceAsync(
        @WebParam(partName = "in", name = "deviceInfo", targetNamespace = "http://example.com/saas/services/device/types")
        com.example.saas.services.device.types.DeviceInfo in,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<com.example.saas.services.device.types.DeviceInfoResponse> asyncHandler
    );

    @WebResult(name = "deviceInfoResponse", targetNamespace = "http://example.com/saas/services/device/types", partName = "out")
    @WebMethod
    public com.example.saas.services.device.types.DeviceInfoResponse enrollDevice(
        @WebParam(partName = "in", name = "deviceInfo", targetNamespace = "http://example.com/saas/services/device/types")
        com.example.saas.services.device.types.DeviceInfo in
    );
}
