package com.backbone.core;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // 원하는 방식으로 에러 처리
    	System.out.println("[Error의 E] handleError()");
        return "error.html"; // error.html과 같은 뷰를 반환
    }

    public String getErrorPath() {
    	System.out.println("[Error의 E] getErrorPath()");
        return "/error";
    }
}
