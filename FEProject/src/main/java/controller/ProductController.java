package controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Product;
import model.ProductDAO;

@Controller
public class ProductController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String productsPage() {
		return "Product";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String productSuccess(@ModelAttribute("product1")Product p)
	{
		ProductDAO pd = new ProductDAO();
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






