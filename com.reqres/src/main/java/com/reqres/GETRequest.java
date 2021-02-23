package com.reqres;

import io.restassured.response.Response;

public class GETRequest extends Request {
	
	public GETRequest(String host) {
		super(host);
	}
	
	
	@Override
	public Response Send() {
		return _req.get(_host);
	}

}
