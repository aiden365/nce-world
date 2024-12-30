package com.test;

import com.book.Sw;
import com.book.SwChinese;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.*;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

@Slf4j
public class Main {



    @SneakyThrows
    public static void main(String[] args) {


        //when 也可以引导让步状语从句
        //was supposed to do  应该做某事，其中be supposed to类似于should
        //present sb with sth 向某人提供某物
        //be sure (that) 确信...
        //letter writer [n.] 写信者
        //have trouble doing sth 做某事有困难
        //come into being [vp.] 形成，产生，开始存在
        //a human being [np.] 人
        //catch up with [vp.] 追上，赶上
        //Put Up With Sb [vp.] 忍受某人/某事
        //give sb away [vp.] 出卖某人
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }


    @Test
    public void main2() {
        //Sophie Amundsen went on her way home from school，
        //Sophie went on the first part of the way with Joanna, They had been discussing the robots.
        //
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.lock();
            FileLock fileLock1 = open.tryLock();
            fileLock1.release();
            Channel channel = fileLock1.acquiredBy();
            Sw.sector1();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            SwChinese.sector1();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
