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

/**
 * 
 * @author 212312392
 */

public class STJDemoImpl implements STJDemo
{

	@Override
	public String sayHello(String message){
		return "Welcome to STJ: "+ message; //$NON-NLS-1$
	}
}
