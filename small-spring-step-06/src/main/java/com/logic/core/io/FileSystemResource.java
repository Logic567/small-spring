package com.logic.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
* @description 通过指定文件路径的方式读取文件信息
* @author Logic
* @date 2023/7/5 22:56
* @version 1.0
*/
public class FileSystemResource implements Resource{

    private final File file;

    private final String path;

    //只传入file
    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    //只传入path
    public FileSystemResource(String path){
        this.file = new File(path);
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    public final String getPath(){
        return this.path;
    }
}
