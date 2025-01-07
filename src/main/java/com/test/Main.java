package com.test;

import cn.hutool.Hutool;
import cn.hutool.core.util.ClassLoaderUtil;
import cn.hutool.core.util.ClassUtil;
import com.book.Sw;
import com.book.SwChinese;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

import java.io.*;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static com.words.TestFour4.*;
import static com.words.TestCz.*;
import static com.words.TestFour3.*;
import static com.words.TestFour8.*;
import static com.words.TestFour11.*;
import static com.words.TestFour9.*;
import static com.words.TestFour5.*;
import static com.words.TestFour2.*;
import static com.words.TestGz.*;
import static com.words.TestFour1.*;
import static com.words.TestFour6.*;
import static com.words.TestFour10.*;
import static com.words.TestIelts.*;
import static com.words.TestToefl.*;
import static com.words.TestFour7.*;


@Slf4j
public class Main {



    @SneakyThrows
    public static void main(String[] args) {

        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }




    @Test
    public void main2() {
        //Then the god Heimdall

        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.lock();
            FileLock fileLock1 = open.tryLock();
            fileLock1.release();
            Channel channel = fileLock1.acquiredBy();
            Sw.sector1();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Sw.sector1();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test66() {

        ClassUtil.scanPackage("com.words").stream().map(Class::getName).forEach(e -> System.out.println("import static " + e + ".*;"));

    }
}
