package org.rapidpm.microservice.demo.rest;

import com.google.gson.Gson;
import org.rapidpm.microservice.demo.model.DataHolder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Sven Ruppert on 07.06.15.
 */

@Path("pojo")
public class PojoResource {

  @GET()
  @Produces("text/plain")
  public String get() {
//    return  Arrays.asList("A", "B", service.doWork());
    final DataHolder dataHolder = new DataHolder();
    dataHolder.setTxtA("A");
    dataHolder.setTxtb("B");
    return new Gson().toJson(dataHolder);
  }


}
