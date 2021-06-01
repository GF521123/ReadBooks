package com.gwf.book.controller.Imp;

import com.gwf.book.controller.FileController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gwf
 * @version 1.0
 * @date 2021/6/1 10:18
 */
@Controller
public class FileControllerImp implements FileController {
    @ResponseBody
    @RequestMapping("/uploadfile")
    public void uploadFile(@RequestParam(value = "myFileName", required = false) MultipartFile cardFile,
                           HttpServletRequest request, HttpServletResponse response){
        System.out.println("文件上传");
    }

    @RequestMapping("/uploadhtml")
    public String uploadhtml(){
        return "upload";
    }
}
