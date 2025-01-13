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
import java.util.Arrays;
import java.util.List;

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
        //in the direction of 朝...方向，沿...方向
        //现在分词除了可以做伴随状语还可以做结果状语，常搭配thereby + 现在分词构成结果状语从句，例如he has redesigned the workflow thereby rising work efficiency
        //of what the natural philosophers said and wrote 做
        //what 除了可以引导名词性疑问分句，做疑问代词例如I am not sure what you mean，或疑问限定词例如Do you know what excuse he gave。还可以引导名词性关系分句，它相当于the thing that + 定语从句，做融合型关系代词，例如What (=the thing that) we need is a commitment。又可以做融合型关系限定词，仅限定不可数名词或可数名词复数的形式，虽意为“全部”，但暗含little、few之意，译为“仅有的全部”，例如1what little (=the little money that) he had spent on study. 2what little free time (= the little free time that) he had was spent with his wife and children。
        //he 做代词除了表示他，还可以表示无生命物体的事物
        //it is likely + [(to do) / (that + 从句)] 译为：可能...
        //full of 译为：充满...
        //mean sth1. by sth2. 通过某物(sth2)表达某种意思(sth1)，或者某物(sth2)的意思是某意思(sth1)，例如:what do you mean by happiness? I mean health by happiness
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }




    @Test
    public void main2() {
        // but it seems clear that he was not thinking of a known substance in the way that Thales had envisaged. Perhaps he meant that the substance which is the source of all things had to be something other than the things created. Because all created things are limited, that which comes before and after them must be “boundless.” It is clear that this basic stuff could not be anything as ordinary as water.
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.lock();
            fileLock.release();

            cock();
            FileLock fileLock1 = open.tryLock();
            fileLock1.release();
            Channel channel = fileLock1.acquiredBy();
            //only the book is mine on the shelf
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream os = new ByteArrayOutputStream();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test66() {

        //ClassUtil.scanPackage("com.words").stream().map(Class::getName).forEach(e -> System.out.println("import static " + e + ".*;"));
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> integers1 = Arrays.asList(2, 4, 6, 8);


    }
}
