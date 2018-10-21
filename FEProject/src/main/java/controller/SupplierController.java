package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Supplier;
import model.SupplierDAO;

@Controller
public class SupplierController {

	@RequestMapping(value="/supplier",method=RequestMethod.GET)
	public String supplierPage()
	{
		return "supplier";
	}
	
	@RequestMapping(value="/addSupplier", method=RequestMethod.POST)
	public String AddSupplier(@Valid @ModelAttribute("supplier1")Supplier s, BindingResult result)
	{
		SupplierDAO sd = new SupplierDAO();
		boolean b = sd.insertSupplier(s);
		if(result.hasErrors())
		{
			return "supplier";
		}
		else
		{
			return "Success";
		}
	}
	
}
