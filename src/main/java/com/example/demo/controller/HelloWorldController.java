package com.example.demo.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloWorldController {

	/**
	* メッセージ管理
	*/
	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloWorld(Model model) {
		
		model.addAttribute("message", messageSource.getMessage("hello", new String[] {"動的パラメータ1","動的パラメータ2"}, Locale.JAPAN));
		return "index";

	}
}
