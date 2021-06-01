package com.gwf.book.controller.Imp;

import com.gwf.book.controller.LogController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @author gwf
 * @version 1.0
 * @date 2021/5/31 17:24
 */
@Controller
@PropertySource(value="classpath:config/SystemInfor.yml", encoding = "utf-8")
@ConfigurationProperties(prefix = "system")
public class LogControllerImpl implements LogController {
    @Value("${systemName}")
    private String systemName;
    @RequestMapping("/")
    public String index(Model model, HttpServletResponse response) {
        model.addAttribute("systemName", systemName);
        return "/index";
    }
    @ResponseBody
    @RequestMapping("/login")
    public String login(){
        return "cess";

    }
}
