package com.github.jorgesartori;

import org.tempuri.CalculatorSoap;

import io.quarkiverse.cxf.annotation.CXFClient;
import io.quarkus.logging.Log;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class CalculatorResource {

	@CXFClient
	CalculatorSoap client;

	@Path("multiply")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String multiply(@QueryParam("a") int a, @QueryParam("b") int b) {
		Log.infof("calling soap client to multiply %d with %d", a, b);
		return String.format("The multiply between %d and %d is %d", a, b, client.multiply(a, b));
	}

	/**
	 * This client ADD method was modified to be reactive!
	 */
	@Path("sum")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Uni<String> sum(@QueryParam("a") int a, @QueryParam("b") int b) {
		Log.infof("calling soap client to sum %d with %d", a, b);
		return client.add(a, b).onItem().transform(i -> String.format("The sum between %d and %d is %d", a, b, i));
	}

}
