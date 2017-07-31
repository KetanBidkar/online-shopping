package net.ket.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.ket.shoppingbackend.dao.CategoryDAO;
import net.ket.shoppingbackend.dto.Category;
//This controller will map all url to method handler HELPER Controller to FrontController
@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO; //for dependency injection no instance creation 

	@RequestMapping(value={"/","/index","/home"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");  //logical name of view= pages
//		mv.addObject("greeting","Welcome to spring MVC");//for fetching data to view using key greeting
		mv.addObject("title","Home");
		
		//passing list of category
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value={"/about"})
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("page");  //logical name of view= pages
		mv.addObject("title","About");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value={"/contact"})
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("page");  //logical name of view= pages
		mv.addObject("title","Contact");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	
	/*---Getting Products ---*/
	@RequestMapping(value={"/show/all/products"})
	public ModelAndView showAllProducts(){
		ModelAndView mv = new ModelAndView("page");  //logical name of view= pages
		mv.addObject("title","All Products");
		
		//passing list of category
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable ("id") int id){
		ModelAndView mv = new ModelAndView("page");  //logical name of view= pages
		//categoryDAO to fetch single category
		Category category= null;
		category = categoryDAO.get(id);
		mv.addObject("title",category.getName());
		
		//passing list of category for side bar
		mv.addObject("categories",categoryDAO.list());
		//passing single category
		mv.addObject("category",category);
		
		mv.addObject("userClickCagtegoryProducts",true);
		
		return mv;
	}
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam (value="greeting", required=false) String greeting) //variable of string type paased thru add object
//	{
//		if(greeting==null)
//		{
//			greeting="Hello Bro...!";
//		}
//		ModelAndView mv = new ModelAndView("page");  //logical name of view= pages
//		mv.addObject("greeting",greeting);//for fetching data to view using key greeting
//		return mv;
//	}
//	
//	@RequestMapping(value="/test/{greeting}")
//	public ModelAndView test(@PathVariable("greeting") String greeting) //variable of string type paased thru add object
//	{
//		if(greeting==null)
//		{
//			greeting="Hello Bro...!";
//		}
//		ModelAndView mv = new ModelAndView("page");  //logical name of view= pages
//		mv.addObject("greeting",greeting);//for fetching data to view using key greeting
//		return mv;
//	}
	
}
	

