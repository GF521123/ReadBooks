package com.gwf.book.service.Imp;

import com.gwf.book.Utils.GwfUtils;
import com.gwf.book.service.FileService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.web.multipart.MultipartFile;
import org.slf4j.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gwf
 * @version 1.0
 * @date 2021/6/2 9:19
 */
@Service
public class FileServiceImp implements FileService {
    private final static Logger log = LoggerFactory.getLogger(FileServiceImp.class);

    @Autowired
    private GwfUtils gwfUtils;

//    HttpServletRequest request,@RequestParam( value="files",required=false)MultipartFile multipartFile
    public void uploadFile(MultipartFile uploadFile,HttpServletRequest request, HttpServletResponse response){

//        String fileName = path+"uploadFile";
//        log.info(fileName);
        String realpath="";
        //获取文件名
        String name="";
        if(uploadFile!=null){
            name=uploadFile.getOriginalFilename();//直接返回文件的名字
            log.info("上传文件:"+name+"; 文件大小"+gwfUtils.getFileXSize(uploadFile.getSize()));
            String subffix = name.substring(name.lastIndexOf(".") + 1, name.length());//我这里取得文件后缀
//            String fileName=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());//文件保存进来，我给他重新命名，数据库保存有原本的名字，所以输出的时候再把他附上原本的名字就行了。
//                        String filepath=request.getServletContext().getRealPath("/")+"files\\";//获取项目路径到webapp
            String filepath = gwfUtils.getUploadFilePath();

            File file=new File(filepath);
            if(!file.exists()){//目录不存在就创建
                file.mkdirs();
            }
            //文件保存
            try {
                uploadFile.transferTo(new File(file+"/"+name));//保存文件
                log.info(file+" 保存成功 ");
            } catch (IOException e) {
                log.info(" 文件保存失败 ");
                e.printStackTrace();
            }
//            realpath=file+"\\"+fileName+"."+subffix;
        }else{

        }

    }
}
