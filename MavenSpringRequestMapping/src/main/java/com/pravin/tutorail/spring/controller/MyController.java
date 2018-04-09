package com.pravin.tutorail.spring.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MyController {
    // This handler method work as default handler
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	LocalDate date = LocalDate.now();
	model.addAttribute("date", dateTimeFormatter.format(date));
	return "index";
    }

    // Handle GET or POST request
    @RequestMapping("/one")
    public @ResponseBody String handlerOne() {
	return "<h1>Inside handlerOne() method of MyController</h1>";
    }

    // Handle POST request only
    @RequestMapping(value = "/two", method = RequestMethod.POST)
    public @ResponseBody String handlerTwo() {
	return "<h1>Inside handlerTwo() method of MyController</h1>";
    }

    // Handle GET request only
    @RequestMapping(value = "/three", method = RequestMethod.GET)
    public @ResponseBody String handlerThree() {
	return "<h1>Inside handlerThree() method of MyController</h1>";
    }

    // Handle POST request if the request header
    // contains 'content-type=application/x-www-form-urlencoded'
    @RequestMapping(value = "/four", method = RequestMethod.POST, headers = {
	    "content-type=application/x-www-form-urlencoded" })
    public @ResponseBody String handlerFour() {
	return "<h1>Inside handlerFour() method of MyController</h1>";
    }

    // Handle POST request if the request content type
    // is 'application/x-www-form-urlencoded'
    @RequestMapping(value = "/five", method = RequestMethod.POST, consumes = {
	    MediaType.APPLICATION_FORM_URLENCODED_VALUE })
    public @ResponseBody String handlerFive() {
	return "<h1>Inside handlerFive() method of MyController</h1>";
    }

    // Handle POST or GET request and produce content type of "text/plain"
    @RequestMapping(value = "/six", produces = { MediaType.TEXT_PLAIN_VALUE })
    public @ResponseBody String handlerSix() {
	return "<h1>Inside handlerSix() method of MyController</h1>";
    }

    @GetMapping(value = "/seven")
    public @ResponseBody String handlerSeven() {
	return "<h1>Inside handlerSeven() method of MyController</h1>";
    }

    @PostMapping("/eight")
    public @ResponseBody String handlerEight() {
	return "<h1>Inside handlerEight() method of MyController</h1>";
    }

}
