package com.example.demo.model;

public class JwtResonse {
	String token;
	

	public JwtResonse() {
	}

	public JwtResonse(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	

}
