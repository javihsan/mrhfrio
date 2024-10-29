package com.mrhfrio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value={"/"})
public class InicioController {
	
	private String view;
	
	@RequestMapping("")
	private ModelAndView initDefault(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
			
		ModelAndView mav = new ModelAndView(getView());
	
		String path = arg0.getRequestURI();
		if (path.indexOf(ConstantsController.ADMIN)!=-1){
			mav = new ModelAndView(getView()+ConstantsController.ADMIN);
		} else if (path.indexOf(ConstantsController.MANAGER)!=-1){
			mav = new ModelAndView(getView()+ConstantsController.MANAGER);
		}
				
		return mav;
	}
		
	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}
	
}
