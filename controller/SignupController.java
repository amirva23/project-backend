package com.productData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productData.model.SignupModel;
import com.productData.service.SignupService;
@RestController
//@CrossOrigin(origins="http://localhost:3000")
public class SignupController {
	@Autowired
	SignupService serve;
	@PostMapping("/add")
	public SignupModel saveSignup(@RequestBody SignupModel s)
	{
		return serve.saveSignup(s);
//		return ();
	}
	@GetMapping("/getSign")
	public List<SignupModel>getAll()
	{
		List<SignupModel>b=serve.getAll();
		return  b;
	}
	 @PutMapping("/updateSignup")
	    public SignupModel updateSignupModel(@RequestBody SignupModel sm)
	    {
	    	return serve.updateSignup(sm);	
	    }
//	
//	@DeleteMapping("/delete/{Id}")
//	public String delete(@PathVariable int Id)
//	{
//		return serve.deleteById(Id);
//	}
	
}

//	@PostMapping("/signup")
//	public 	String signup(@RequestBody Map<String, String> signupData )
//	{
//		String username = signupData.get("username");
//		String password = signupData.get("password");
//		String result = serve.checksignup(username, password);
//		return result ;
//	}