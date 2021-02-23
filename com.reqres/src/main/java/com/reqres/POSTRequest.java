package com.reqres;

import io.restassured.response.Response;

public class POSTRequest extends RequestWithBody {

	public POSTRequest(String host, String body) {
		super(host, body);
	}
	
	@Override
	public Response Send() {
		return _req.post(_host);
	}

}
