package com.Admin_service;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Role {
	@JsonProperty("Super-Admin")
	Super_Admin,
	Manager,
	Staff
}
