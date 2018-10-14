package controller;

import org.springframework.stereotype.Controller;
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
	public String AddSupplier(@ModelAttribute("supplier1")Supplier s)
	{
		SupplierDAO sd = new SupplierDAO();
		sd.insertSupplier(s);
		return "Success";
	}
	
}
