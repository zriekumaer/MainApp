package com.ustglobal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ust.UserAuthentication.service.UserService;
import com.ustglobal.forms.FormPOItem;
import com.ustglobal.forms.mapper.FormPOItemMapper;
import com.ustglobal.integration.login.service.LoginService;
import com.ustglobal.integration.login.to.LoginRequestTO;
import com.ustglobal.integration.login.to.LoginResponseTO;
import com.ustglobal.model.POItem;
import com.ustglobal.service.ReceiptService;

@Controller
public class RecieptController {

	@Autowired
	private UserService userService;

	@Autowired
	ReceiptService receiptService;

	@RequestMapping(value = "/reciept/get", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new LoginRequestTO());
		return mav;
	}

	@RequestMapping(value = "/reciept/get/{recieptno}", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("recieptno") String recieptno) {
		
		ModelAndView mav = null;
		if (userService.isValidToken("js37wewh")) {

			
		} else {
			
		}
		return mav;
	}

	@RequestMapping(value = "/receive", method = RequestMethod.POST)
	public ModelAndView receive(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("formPoItems") List<FormPOItem> formPOItems) {
		ModelAndView mav = null;
		receiptService.receiveToWareHouse(formPOItems);
		mav = new ModelAndView("successful");
		return mav;
	}
}
