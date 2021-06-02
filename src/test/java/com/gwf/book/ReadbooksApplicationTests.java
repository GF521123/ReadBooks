package com.gwf.book;

import com.gwf.book.Utils.GwfUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class ReadbooksApplicationTests {
    @Autowired
    private GwfUtils gwfUtils;
    @Test
    void contextLoads() {

        gwfUtils.getEpubBookInfor("般若波经","epub");
    }

}
