package com.reqres;

public abstract class RequestWithBody extends Request {
	protected String _body;
	
	protected RequestWithBody(String host, String body) {
		super(host);
		this._body = body;
		
		this._req.body(body);
	}

}
