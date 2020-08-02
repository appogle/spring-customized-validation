package com.example.controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ReqBodyDto;
import com.example.dto.Response;
import com.example.dto.UrlParamDto;

import io.swagger.annotations.ApiOperation;

@Validated
@RestController
@RequestMapping("/validations")
public class ExampleController {

	@ApiOperation("Path Variable Validation Example")
	@GetMapping("/pathVariable/{param}")
	public Response<String> validPathVariable(
			@PathVariable @NotBlank @Size(max=20) String param) {
		
		return new Response<>(200, "success");
	}
	
	@ApiOperation("Request Body Validation Example")
	@PostMapping("/requestBody")
	public Response<String> validRequestBody(
			@RequestBody @Validated ReqBodyDto dto) {
		
		return new Response<>(200, "success");
	}
	
	@ApiOperation("Url Parameter Validation Example")
	@PostMapping("/urlParameter")
	public Response<String> validUrlParameter(
			@Validated UrlParamDto dto) {
		
		return new Response<>(200, "success");
	}
}
