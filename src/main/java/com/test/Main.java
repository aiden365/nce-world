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
        //So far 迄今为止
        //take a glimpse 使用take + 具有动作意义的名词 可以表示做这个动作
        //Mythological notions of this kind 译为这种类型的宗教观念，他和this kind of Mythological notions 这种神话观念
        //tamper [vi.] 与with连用表示篡改
        //now that 从属连词，译为既然，由于，可引导让步或原因状语从句
        //in written form 方式状语，以书面形式
        //nothing but 等价于only译为只不过，类似的用法还有anything but 等价于not at all或never译为根本不；all but 等价于almost译为几乎；none but等价于no one except 译为只有
        //from about 570 B.C. from [prep.]表示时间的起点 about [prep.] 译为大约
        //recourse to sth. 求助，依赖
        //develop from a to b 从a到b的发展
        //rather than [conj.] 而不是
        //at all [adv.] 完全，根本
        //work out [vt.] 得出
        //but then [conj.] 表转折，常译为然而
        //and that [conj.] 表递进，常译为而且
        //come out [vt.] 出现
        //a few [locks/strands] of hair : 几缕头发
        //in the end [adv.] 常位于句末，译为最终
        //in the time before 介词短语，译为在某个时间之前
        //look over one's shoulder [vp.] 严密监视
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }




    @Test
    public void main2() {
        // Is there a basic substance that everything else is made of?
        //     * Can water turn into wine?
        //     * How can earth and water produce a live frog!
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.lock();
            fileLock.release();
            substance();


            FileLock fileLock1 = open.tryLock();
            fileLock1.release();
            Channel channel = fileLock1.acquiredBy();
            Sw.sector1();
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
