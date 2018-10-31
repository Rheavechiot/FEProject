package controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Product;
import model.ProductDAO;
import model.Supplier;
import model.SupplierDAO;

@Controller
public class ProductController {

	@RequestMapping(value="/productPage",method=RequestMethod.GET)
	public String productsPage() {
		return "Product";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String addProduct(@Valid @ModelAttribute("product1")Product p,@Valid @ModelAttribute("supplier1")Supplier s)
	{

		Supplier s1 = new Supplier();
		ProductDAO pd = new ProductDAO();
		s1.setsId(2);
		p.getSupplier().add(s);
		p.getSupplier().add(s1);
		boolean b = pd.insertProduct(p);
		if(b)
		{
			return "Success";
		}
		else
		{
			return "Product";
		}
	}
	
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	@ResponseBody
	public List<Product> getProducts()
	{
		ProductDAO pd = new ProductDAO();
		List<Product> lp = null;
		try
		{
			lp = (List<Product>)pd.getProducts();
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return lp;
	}
	
	@RequestMapping(value="/listprod", method=RequestMethod.GET)
	public String listProductView()
	{
		return "listproducts";
	}
	
}






