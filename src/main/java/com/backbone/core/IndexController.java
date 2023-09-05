package com.backbone.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
	final String CLASS_NAME = "[IndexController]";

    @GetMapping("/")
    public String index(HttpServletRequest request) {
    	System.out.println(CLASS_NAME);
    	
    	// device check
    	String userAgent = request.getHeader("User-Agent").toUpperCase();
    	String device = "";
    	
    	if(userAgent.indexOf("MOBILE") > -1)
    		device = "MOBILE";
    	else if(userAgent.indexOf("TABLET") > -1)
    		device = "TABLET";
    	else if(userAgent.indexOf("WINDOWS") > -1)
    		device = "WINDOWS";
    	else
    		device = "UNKOWN DEVICE!!";
    	
    	// client logs
    	System.out.println("- clientIp/clientPort	: " + request.getRemoteAddr() + "/" + request.getRemotePort());
    	System.out.println("- userAgent		: " + userAgent);
    	System.out.println("- device		: " + device);
    	
        return "index/index.html";
    }
    
    @GetMapping("/bp")
    public String indexBP() {
    	System.out.println(CLASS_NAME);
        return "blackPink/index_BP.html";
    }
    
    @ResponseBody
    @RequestMapping("/valueTest")
    public String valueTest(){
        String value = "테스트 String";
        System.out.println(CLASS_NAME + " : " + value);
        return value;
    }
    
    @RequestMapping("/roulette")
    public String roulette(){
        System.out.println("/roulette");
        return "roulette.html";
    }
    
    @RequestMapping("/section")
    public String section(){
        System.out.println("/section");
        return "section.html";
    }
    
    @RequestMapping("/uploadform")	//https://goodteacher.tistory.com/351
    public String uploadform(){
        System.out.println("/uploadform");
        return "uploadform.html";
    }
    
    //https://hello-bryan.tistory.com/330
    
}
