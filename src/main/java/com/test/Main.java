package com.test;

import com.alibaba.fastjson.JSONObject;
import com.book.SophiesWorld;
import com.neclesson.ThirdVolume;
import com.word.ThirdWord;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.words.TestCz.*;
import static com.words.TestGz.*;
import static com.words.TestIelts.*;
import static com.words.TestToefl.*;
import static com.words.TestFour1.*;
import static com.words.TestFour2.*;
import static com.words.TestFour3.*;
import static com.words.TestFour4.*;
import static com.words.TestFour5.*;
import static com.words.TestFour6.*;
import static com.words.TestFour7.*;
import static com.words.TestFour8.*;
import static com.words.TestFour9.*;
import static com.words.TestFour10.*;
import static com.words.TestFour11.*;

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
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }


    @Test
    public void main2() {
        // “I’m not that interested in card games any more.” Joanna looked surprised.
        // “You’re not? Let’s play badminton then.” Sophie stared down at the pavement—then up at her friend.
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){

            FileLock fileLock = open.lock();
            FileLock fileLock1 = open.tryLock();
            fileLock1.release();
            Channel channel = fileLock1.acquiredBy();
            SophiesWorld.sector1();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
