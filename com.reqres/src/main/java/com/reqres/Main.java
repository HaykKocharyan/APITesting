package com.reqres;

import io.restassured.response.Response;

public class Main {

	public static void main(String[] args) {
		Request[] requestes = { 
				new GETRequest("https://reqres.in/api/users?page=1"),
				new POSTRequest("https://reqres.in/api/users", "{\"name\": \"morpheus\", \"job\": \"leader\"}"),
				new PUTRequest("https://reqres.in/api/users/2", "{\"name\": \"morpheus\", \"job\": \"zion resident\"}"),
				new DELETERequest("https://reqres.in/api/users/2")
		};
		
		for (Request request : requestes) {
			Response response = request.Send();
			System.out.println(response.asPrettyString());
		}
	}

}
