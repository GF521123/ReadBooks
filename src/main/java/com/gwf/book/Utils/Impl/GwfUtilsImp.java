package com.gwf.book.Utils.Impl;

import com.gwf.book.Utils.GwfUtils;
import nl.siegmann.epublib.domain.*;
import nl.siegmann.epublib.epub.EpubReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

/**
 * @author gwf
 * @version 1.0
 * @date 2021/6/2 9:39
 */
@Repository
@PropertySource(value="classpath:config/SystemInfor.yml", encoding = "utf-8")
public class GwfUtilsImp implements GwfUtils {
    private final static Logger log = LoggerFactory.getLogger(GwfUtilsImp.class);

    @Value("${uploadFolderPath}")
    private String uploadFolderPath;

    /**
     *
     * @return
     */
    public String getUploadFilePath(){
        return uploadFolderPath;
    }

    /**
     *
     * @param FileSize
     * @return 文件大小
     */
    @Override
    public String getFileXSize(long FileSize) {
        DecimalFormat df = new DecimalFormat("#.00");
        String fileSizeStr = "";
        String wrongSize = "0B";
        if (FileSize == 0) {
            return wrongSize;
        }
        if (FileSize < 1024) {
            fileSizeStr = df.format((double) FileSize) + "B";
        } else if (FileSize < 1048576) {
            fileSizeStr = df.format((double) FileSize / 1024) + "KB";
        } else if (FileSize < 1073741824) {
            fileSizeStr = df.format((double) FileSize / 1048576) + "MB";
        } else {
            fileSizeStr = df.format((double) FileSize / 1073741824) + "GB";
        }
        return fileSizeStr;
    }

    /**
     *
     * @return
     */
    public boolean getEpubBookInfor(String fileName,String subffix) {
            String filePath = uploadFolderPath + "/" + fileName + "."+subffix;
        log.info(filePath);

        InputStream in = null;
        EpubReader reader = new EpubReader();
        try {
            in = new FileInputStream(new File(filePath));
            Book book = reader.readEpub(in);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //一定要关闭资源
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }
}
