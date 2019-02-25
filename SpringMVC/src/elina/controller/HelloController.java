package elina.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/greetings")
public class HelloController {
	
	// will display the username included in URL on current webpage
	@RequestMapping("/welcome/{contryName}/{userName}")
	protected ModelAndView hello(@PathVariable("userName") String name,
			@PathVariable ("contryName") String cname) {
 
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Hi " + name + ", you are from " + cname);
		
		return modelandview;
	}
	
	
	
	// to use a map to get all the path variables
	// have to add <mvc:annotation-driven/> in web.xml
	@RequestMapping("/welcome/{contryName}/{userName}")
	protected ModelAndView greeting(@PathVariable Map<String, String> pathVars) {
 
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Hi " + pathVars.get("userName") 
			+ ", you are from " + pathVars.get("contryName"));
		
		return modelandview;
	}
	
	
	
	
	
	@RequestMapping("/elina")
	protected ModelAndView elina() {
 
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Hi Elina, welcome!");
		
		return modelandview;
	}
}
