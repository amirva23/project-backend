package com.productData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productData.model.Product;
import com.productData.service.ProductDataService;

@RestController
@CrossOrigin
//("http://localhost:3000")
public class ProductDatacontroller {
 
	@Autowired
	ProductDataService proService;
	@GetMapping("/showproduct")
	public List<Product>getAllProduct(){
	         List<Product>proList=proService.getAllProduct();
	       return proList;
	}
    @PostMapping("/SaveProduct")
    public Product saveProductData(@RequestBody Product p)
    {
    	return proService.saveProduct(p);
}
    @PutMapping("/updateproduct")
    public Product updateProductData(@RequestBody Product p)
    {
    	return proService.updateProduct(p);	
    }
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProductData (@PathVariable("id")int id)
    {
         proService.deleteProduct(id);
         return "Deleted successfully";
    }
    //sorting
    @GetMapping("/sortProduct/{field}")
     public List<Product>sortProduct(@PathVariable String field)
     {
    	return proService.sortProduct(field);
     }
    //Paging
    @GetMapping("/pagingProduct/{offset}/{pagesize}")
    public List<Product>pagingProduct(@PathVariable int offset,@PathVariable int pagesize)
    {
    	return proService.pagingProduct(offset,pagesize);
    }
    //pagingandSorting
    @GetMapping("/pagingandSorting/{offset}/{pagesize}/{field}")
    public List<Product>pagingandSortingProduct(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
    	return proService.pagingAndSortingProduct(offset,pagesize,field);
    }
    @DeleteMapping("/deleteStudentByName")
    public String deleteProducttByName(String name)
    {
    int result=proService.deleteProductByName(name)	;
    if(result >0)
    	return "Product record deleted";
    else
    	return "Problem occured while deleting";
    }
    @DeleteMapping("/deleteProductByName/{name}")
    public String deleteProductByName(@PathVariable String name)
    {
    int result=proService.deleteProductByName(name)	;
    if(result >0)
    	return "Product record deleted";
    else
    	return "Problem occured while deleting";
    }
    @GetMapping("/GetProductData")
    public  List<Product>getProductData(@RequestParam String name)
    {
    	return proService.getProductData(name);
    }
    public Product saveAll(@RequestBody Product z)
    {
    	return proService.saveAll(z);
    }
}