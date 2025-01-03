package com.test;

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

@Slf4j
public class Main {



    @SneakyThrows
    public static void main(String[] args) {

        //stumble upon / on / across : 偶然发现...
        //give any thought to : 考虑，想到
        //new light : 新的眼光
        //过去分词做名词的前置定语，含有被动或完成的之意，可以译为：被...的... 例如：an enchanted slumber 被施了魔法的睡眠，a closed gate 关着的大门
        //stumble around : 跌跌撞撞地到处走，徘徊
        //in this manner : 以这种方式
        //aged two or three : aged [adj.] ...岁的，aged two 译为两岁的
        //business : 名词，除了表示生意，还可以表示事情
        //make (no) difference to sb. 这是一个固定搭配，译为：对某人(没)有影响/差别
        //hood :作名词，可以表示发动起的引擎盖，例如 the hood of car
        //turn :作名词，也可以表示依次的机会，例如：now it is my turn 现在轮到我了
        //have to do with sth. : 与...有关
        //medical attention : 医疗照顾
        //once 引导时间状语从句，从句用现在完成，主句用一般现在
        //what about 与 how about : [prep.] 后面跟跟代词、名词、动名词和不定式构成疑问句，用于提出建议、请求或者评论某人某事，例如 what about going for a walk? 但需要指出的是这种句子的主谓被省略了，其完整表达可以理解为是what do you think about going for a walk，但只能这样理解，因为英语中有些无法还原的省略句，what about 或 how about就是其中之一
        //caught up [in/with] : 陷入，被卷入
        //background [n.] 不显眼的位置，幕后
        //stay : 逗留，度过
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }


    @Test
    public void main2() {
        // Although philosophical questions concern us all,
        // we do not all become philosophers.
        // For various reasons most people get so caught up in everyday affairs that their astonishment at the world gets pushed into the background. (They crawl deep into the rabbit’s fur, snuggle down comfortably, and stay there for the rest of their lives.)
        // To children, the world and everything in it is new, something that gives rise to astonishment. It is not like that for adults. Most adults accept the world as a matter of course.
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
}
