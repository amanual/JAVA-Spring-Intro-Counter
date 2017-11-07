package com.amanuel.counter.controllers;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class HomeController {
	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count += count;
	}
	@RequestMapping("")
	public String counter(HttpSession session) {
		setCount(1);
		session.setAttribute("count", getCount());
		
		return "index";
	}
	@RequestMapping("/counter")
	public String counter () {
		return "count";
	}
	@RequestMapping("/clear")
	public String clearSession(HttpSession session) {
		this.count = 0;
		session.setAttribute("count",this.count);
		return "redirect:/counter";
	}
//	public static final Session.Status COMPLETED;
}
