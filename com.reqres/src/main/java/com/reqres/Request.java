package com.reqres;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public abstract class Request {
	protected RequestSpecification _req;
	protected String _host;
	
	protected Request(String host) {
		this._host = host;
		
		this._req = RestAssured.given();
	}
	
	public abstract Response Send();
}