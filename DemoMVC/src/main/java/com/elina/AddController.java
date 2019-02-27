package com.elina;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, 
			HttpServletRequest req, HttpServletResponse resp) {
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		AddService as = new AddService();
		int res = as.addInt(i, j);

		ModelAndView mv = new ModelAndView();
		
		// we do not want to mention extension names here since we 
		// might want to change technology or file format later
		mv.setViewName("display");
		mv.addObject("result", res);
		return mv;
	}

}
