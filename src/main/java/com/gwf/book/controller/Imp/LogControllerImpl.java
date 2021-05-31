package com.gwf.book.controller.Imp;

import com.gwf.book.controller.LogController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gwf
 * @version 1.0
 * @date 2021/5/31 17:24
 */
@Controller
public class LogControllerImpl implements LogController {
    @ResponseBody
    @RequestMapping("/login")
    public String login(){
        return "cess";

    }
}
