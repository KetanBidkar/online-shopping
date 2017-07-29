package net.ket.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//This controller will map all url to method handler HELPER Controller to FrontController
@Controller
public class PageController {

	@RequestMapping(value={"/","/index","/home"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");  //logical name of view= pages
		mv.addObject("greeting","Welcome to spring MVC");//for fetching data to view using key greeting
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
	

