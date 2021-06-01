package com.gwf.book.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gwf
 * @version 1.0
 * @date 2021/6/1 10:18
 */
public interface FileController {

    public String uploadhtml();
    public void uploadFile(@RequestParam(value = "bookfile", required = false) MultipartFile cardFile, HttpServletRequest request, HttpServletResponse response);

}
