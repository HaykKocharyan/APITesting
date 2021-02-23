package com.reqres;

import io.restassured.response.Response;

public class DELETERequest extends Request {

	public DELETERequest(String host) {
		super(host);
	}
	
	
	@Override
	public Response Send() {
		return _req.delete(_host);
	}

}
