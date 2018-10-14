package controller;
import java.util.List;

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
	public String addProduct(@ModelAttribute("product1")Product p, @ModelAttribute("supplier1")Supplier s)
	{
		ProductDAO pd = new ProductDAO();
		p.setSupplier(s);
		pd.insertProduct(p);
		return "Success";
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






