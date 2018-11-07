package org.jsp.firstspringwebapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController
{
	@RequestMapping("/home")
	public String getHome()
	{
		return "home";
	}
	
	@RequestMapping("/form")
	public String getForm()
	{
		return "form";
	}
	
	@RequestMapping("/formdata")
	public String getFormData()
	{
		return "formdata";
	}
	
	@RequestMapping("/formdataversionTwo")
	public String getFormDataModel(HttpServletRequest request,Model model)
	{
		String userName = request.getParameter("user");
		
		String upperName = userName.toUpperCase();
		
		model.addAttribute("upperName", upperName);
		
		return "formdatamodel";
	}
}
