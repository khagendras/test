package com.first.git.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/first")
public class FirstController {

	@RequestMapping(method = RequestMethod.GET)
	public String getLandingContents (
			Map<String, Object> model,
			HttpSession session,
			HttpServletRequest request) {
		
		return "pages/first";
		
	}
}
