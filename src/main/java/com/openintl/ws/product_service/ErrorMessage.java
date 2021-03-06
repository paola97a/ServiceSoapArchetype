
package com.openintl.ws.product_service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5
 * 2022-04-20T08:45:26.913-05:00
 * Generated source version: 3.2.5
 */

@WebFault(name = "error", targetNamespace = "http://ws.openintl.com/product-service/types")
public class ErrorMessage extends Exception {

    private com.openintl.ws.product_service.types.Error error;

    public ErrorMessage() {
        super();
    }

    public ErrorMessage(String message) {
        super(message);
    }

    public ErrorMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ErrorMessage(String message, com.openintl.ws.product_service.types.Error error) {
        super(message);
        this.error = error;
    }

    public ErrorMessage(String message, com.openintl.ws.product_service.types.Error error, java.lang.Throwable cause) {
        super(message, cause);
        this.error = error;
    }

    public com.openintl.ws.product_service.types.Error getFaultInfo() {
        return this.error;
    }
}
