/*
 * Copyright (c) 2015 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package com.ge.app.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author   212312392
 */
@Path("/stj")
public interface STJDemo
{

	/**
	 * @param message Message
	 * @return Message
	 */
	@GET
    @Path("/sayHello")
	@Produces("text/plain")
	public String sayHello(@QueryParam("message") String message);
}
