package com.verizon;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	

	@RequestMapping("/hello1")
    public String getData() {
		System.out.println("HelloWorldController ");
		return "home";
		//this first reauset

	}
	@ModelAttribute(value= "countrieslist")
    public List<String> populateCountries() {
 
        List<String> countries= new ArrayList<String>();
        countries.add("India");
        countries.add("United States");
        countries.add("Japan");
        countries.add("Australia");
        countries.add("Canda");     
 
        return countries;
    }
	@RequestMapping(value= "/getList", method= RequestMethod.GET)
    public ModelAndView initView(@ModelAttribute(value= "countrieslist") List<String> countries) {
 
        ModelAndView modelview = new ModelAndView();
        modelview.addObject("message", "This is an example of using the @ModelAttribute annotation .....!");
        modelview.setViewName("output");
 
        return modelview;
    }
	@ModelAttribute("numberList")
	 public List<String> populateNumberList() {
	  System.out.println("Method Level ModelAttriute is executed (populateNumberList)");
	  List<String> numberList = new ArrayList<String>();
	  numberList.add("Number 1");
	  numberList.add("Number 2");
	  numberList.add("Number 3");
	  numberList.add("Number 4");
	  numberList.add("Number 5");
	  return numberList;
	 }
}
