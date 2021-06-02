package com.gwf.book.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gwf
 * @version 1.0
 * @date 2021/6/2 9:18
 */
public interface FileService {
    public void uploadFile(@RequestParam(value = "myFileName", required = false) MultipartFile cardFile,
                           HttpServletRequest request, HttpServletResponse response);
}
