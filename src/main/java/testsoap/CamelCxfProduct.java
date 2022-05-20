package testsoap;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelExecutionException;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.openintl.ws.product_service.types.ProductRequest;
import com.openintl.ws.product_service.types.ProductResponse;

public class CamelCxfProduct {

  private static ProducerTemplate template;

  public static void main(String[] args) throws Exception {
    System.setProperty("port1", "10203");
    ApplicationContext appContext = new ClassPathXmlApplicationContext("file:src/main/resources/META-INF/ApplicationContext.xml");
    CamelContext camelContext = SpringCamelContext.springCamelContext(appContext, true);

    try {
      template = camelContext.createProducerTemplate();
      System.out.println("Start camel context");
      camelContext.start();
      

      printProductDetails("A01");
      //printProductDetails("A02");
      //printProductDetails("A03");
      camelContext.stop();
    } finally {
      System.out.println("Stop Camel Context");
      camelContext.stop();
    }


  }

  private static void printProductDetails(String id) {
    try {
      System.out.println("Request: Get "+id+ " details");
      ProductRequest request = new ProductRequest();
      request.setId(id);

      System.out.println("hii " + request.getId() );
      ProductResponse response = template.requestBody("direct:start2",
        request,ProductResponse.class);
      
     
      System.out.println("Response:Id: " + response.getId().toString() + " Product: "
          + response.getDescription() + " Price" + response.getPrice());
    } catch (Exception e) {
      System.out.println("Advertencia "+ e.getMessage());
     
    }

  }

}
