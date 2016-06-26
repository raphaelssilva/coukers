package biz.r2s.coukers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/start")
public class StartController {
	
	@RequestMapping(value="/home")
	public String index() {
		return "start/home";
	}

}
