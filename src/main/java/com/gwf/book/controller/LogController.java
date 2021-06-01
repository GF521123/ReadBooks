package com.gwf.book.controller;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletResponse;

/**
 * @author gwf
 * @version 1.0
 * @date 2021/5/31 17:24
 */
public interface LogController {
    public String index(Model model, HttpServletResponse response);
    public String login();
}
