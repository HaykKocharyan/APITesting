package com.reqres;

import io.restassured.response.Response;

public class PUTRequest extends RequestWithBody {

	public PUTRequest(String host, String body) {
		super(host, body);
	}
	
	@Override
	public Response Send() {
		return _req.put(_host);
	}

}
