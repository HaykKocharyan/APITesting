package com.reqres;

import static org.hamcrest.Matchers.*;

public class Main {

	public static void main(String[] args) {
		new GETRequest("https://reqres.in/api/users?page=1").Send()
			.then().statusCode(200)
			.log().body();
		
		new POSTRequest("https://reqres.in/api/users", "{\"name\": \"morpheus\", \"job\": \"leader\"}").Send()
			.then().statusCode(201)
			.body("name", equalTo("morpheus"))
			.log().body();
		
		new PUTRequest("https://reqres.in/api/users/2", "{\"name\": \"morpheus\", \"job\": \"zion resident\"}").Send()
			.then().statusCode(200)
			.log().body();
		
		new DELETERequest("https://reqres.in/api/users/2").Send()
			.then().statusCode(204)
			.log().body();
	}
}