package com.util.service.impl;


import com.util.service.GitReadService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Service
public class GitReadServiceImpl implements GitReadService {
    @Override
    public String readGitFile() {
        String str = null;
        try {

            File file = ResourceUtils.getFile("classpath:git.properties");
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes;
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            str = new String(bytes);
        }catch (Exception e){
            e.printStackTrace();
        }
        return str;
    }
}
