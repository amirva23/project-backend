package com.productData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productData.dao.SignupRepo;
import com.productData.model.SignupModel;

@Service
public class SignupService {
	@Autowired
	SignupRepo repo;
	public SignupModel saveSignup(SignupModel s)
	{
		 SignupModel a=repo.save(s);
		 return a;
	}
	public List<SignupModel>getAll()
	{
		List<SignupModel>b=repo.findAll();
		return b;
	}
	public SignupModel updateSignup(SignupModel s)
	{
		 SignupModel c=repo.save(s);
		 return c;
	}
}
//	 @Autowired
//	  public SignupRepo repo;
//	  public String checkSignup(String username,String password)
//		{
//		  SignupModel sign = repo.findByusername(username);
//			if(sign==null)
//			{
//				return "no user found";
//			}
//			else {
//				if(Signup.getPassword().equals(password))
//				{
//					return "Login Successful";
//				}
//				else {
//					
//					return "Login Failed.Try Again";
//				}
//				
//			}
//		}
//		public LoginModel addUser(SignupModel s)
//		{
//			return repo.save(s);
//		}
//		
//		public List<SignupModel> getUser()
//		{
//			return repo.findAll();
//		}
//		
//		public String deleteById(int Id)
//		{
//			repo.deleteById(Id);
//			return "Deleted Successfully";
//		}
//		public SignupModel updateSignup(SignupModel smodel)
//		{
//			SignupModel obj = repo.save(smodel);
//			return obj;
//		}
//	}
//   
