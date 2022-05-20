package com.openintl.ws.product_service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2022-04-20T08:45:26.925-05:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "ProductService",
                  wsdlLocation = "file:/D:/Usuarios/AngieGuerrero/ws_NewOne/service-soap-camel/src/main/resources/productService.wsdl",
                  targetNamespace = "http://ws.openintl.com/product-service")
public class ProductService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.openintl.com/product-service", "ProductService");
    public final static QName ProductPort = new QName("http://ws.openintl.com/product-service", "ProductPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/Usuarios/AngieGuerrero/ws_NewOne/service-soap-camel/src/main/resources/productService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProductService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/Usuarios/AngieGuerrero/ws_NewOne/service-soap-camel/src/main/resources/productService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProductService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProductService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ProductService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ProductService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ProductService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Product
     */
    @WebEndpoint(name = "ProductPort")
    public Product getProductPort() {
        return super.getPort(ProductPort, Product.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Product
     */
    @WebEndpoint(name = "ProductPort")
    public Product getProductPort(WebServiceFeature... features) {
        return super.getPort(ProductPort, Product.class, features);
    }

}