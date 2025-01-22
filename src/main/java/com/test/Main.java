package com.test;

import cn.hutool.Hutool;
import cn.hutool.core.util.ClassLoaderUtil;
import cn.hutool.core.util.ClassUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.book.Sw;
import com.book.SwChinese;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.hamcrest.core.Every;
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
import java.util.Objects;

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
        //In the way that 以...方式
        //that which 可以将that单纯的理解成代词并做后面which定语从句的先行词，然后which引导定语从句去补充说明that的信息呢，这样有点像一个what做融合性关系代词
        //anything常用于否定句中
        //familiar with 熟悉，熟知。注意不要和similar to 搞混，后者表示与...相似
        //even more [adv.] 更加，进一步
        //a far cry from  与...有很大差别、有天壤之别
        //as 指处于某种状态、 性质、情况、工作等之中
        //either 这里的either只是用来强调而这只能选择一个，也可以写成to choose between either relying on his senses or his reason, he chose reason.
        //equate a with b 把a和b视为相等
        //tally with 与...一致
        //perceptual knowledge 感性认识
        //a contemporary of sb. 与某人同时代。例如he is a contemporary of Einstein
        //for the + 序数词 + time 表示第几次
        //know 表示经历，例如 she had known both happiness and sadness
        //take [(a) / (no)] pleasure in sth. 从...中得到乐趣，she take a pleasure in reading books，类似的还有she take a living by selling books
        //full [adj.] 吃饱的
        //hydrogen and oxygen are part of water 可以理解为 氢和氧是水的一部分，或者氢和氧属于水，或者由氢和氧构成的水
        //be present in sp. 存在于某处，其中present是形容词
        //in a sense 在某种意义上，in a broad sense 在广义上，in a narrow sense 在狭义上
        //loosen 可以指“使某物从某个地方分离”或“使其松动”
        //and so on / and so forth 用在句尾表示等等，诸如此类，例如the holder
        //something of everything 译为每种事物的一部分，或者不同事物的某些元素。也可以将everything看作代词，代词身体部位，那就译为身体所有部位的一部分，
        //heavenly [adj.] 天上的。heavenly body 天体
        //unlikely [adv.] 不太可能地。it is unlikely 这不太可能。it is not unlikely 这不是不可能地
        //cost sb. no sth. 译为某人不需要花费任何东西，例如It cost him no money，它不需要花任何钱
        //other than [prep.] 除了...之外
        //common sense [n.] 常识
        //change in 在...方面改变，但在这里in应该译为以任何形式的变化
        //in a way [adv.] 在一定程度上
        //to come right out and (to) do sth. 直截了当的做某事
        //the way [conj.] 从属连词 译为用...的方法，
        //after all 位于句首译为毕竟，位于句尾译为终究
        //sth. occur to sb. 译为：某人想起（突然）某事，An idea occurs to me 我突然想起一个主意
        //what more could ask of a toy? 或许我可以把what more 作为疑问代词短语看成一个整体共同充当ask的宾语，而在这个短语中what和more都是代词，译为更多的什么，还有什么？
        //beyond sb. = beyond one`s ability 超出某人的能力 this problem is beyond [me / my ability]
        //much as [sconj.] 引导让步状语从句，译为即使，即便，就算
        //had been doing 过去完成进行时，表示某个动词在过去的某个时间点就已经开始，并且可能还没有完成，一直持续到这个时间点，例如she had been doing her homework when her mother got home，这里过去的动作就是做作业，在她妈妈到家前就已经开始了，而一直持续到母亲到家，可能还没结束
        //blurt out sth. 不假思索地脱口而出某事
        //too [adj. / adv.] to sth. 太...而不能...，其中too为副词，而to为介词
        //sigh [v.] 叹气
        //keep [an / one`s] eye on sth. [vt.] 对某物保持注意
        //moreover [adv.] 表示递进的副词
        //form [v.] 形成，构成
        //however 引导从句时，用作强调程度或特性（如“多么无限”），需要将 "however + 形容词/副词" 提前，以突出强调的内容。这是一种常见的倒装用法。
        //body [n.] 物体
        //ascribe something to someone/something 将某种原因、属性、责任等归属于某人、某物或某个因素，she ascribes her failure to bad luck，在本句中尽管表现出“赋予”的含义，但本质上它更偏向“归因于”或“认为某人/某物具有某种特质
        //the same + 名词 + as + 名词/代词，表示两者具有相同的事物或特性。 This car has the same color as that one.
        //out of [prep.] 用...材料，如 we can form things out of clay
        //establish [vt.] 证实
        //这里的that引导的是一个限定性定语从句，限定了different ”atom“ 的范围，译为（能）再次联合与分散的原子
        //somewhere along the line [adv.] 在某个阶段、某个时间点或者某个环节上
        //access to [n.] 译为：通道;途徑;（接近某地或某人的）機會（或方法）;（使用某物的）權利
        //come out of sth. 由...产生，从...出来
        //intervene in [vt.] 干涉，干预
        //nothing but + [名词（仅仅是某物）/ 动词原型（只做某事）] 例如：she wore nothing but a dress. 或者she does nothing but complain
        //sense perception [n.] 感觉
        //for the time being 暂且，暂时
        //go around someplace / doing 不只表示物理上的“走来走去”，它还有比喻的含义，表示反复进行某个活动或行为。
        //puzzle over sth. [vt.] 在思考、困惑、琢磨某件事
        //on one`s own 译为独自地，表示某人独立完成某事，没有别人的帮助
        //can [not/hardly] help （几乎）不能避免,I can [not/hardly] help missing you
        //nevertheless [adv.] 然而，仍然
        //just in case 以防万一
        //today of all days 直译：所有日子中的今天，意译：偏偏是今天
        //sneak up [vi.] 悄悄地靠近
        //much thought 名词短语，多少思考
        //give + 动作名词 表示做出某个动作，例如 She gave a speech to the audience. 她向观众做一次演讲
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }


    @Test
    public void main2() {
        // The idea of free will made Sophie think of something else.
        // Why should she put up with this mysterious philosopher playing cat and mouse with her?
        // Why couldn’t she write a letter to him.
        // He (or she) would quite probably put another big envelope in the mailbox during the night or sometime tomorrow morning.
        // She would see to it that there was a letter ready for this person.
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");constituent();
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.lock();
            fileLock.release();
            FileLock fileLock1 = open.tryLock();
            fileLock1.release();


            Channel channel = fileLock1.acquiredBy();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream os = new ByteArrayOutputStream();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Data
    static class Peoson{
        private String name;

        @Override
        public int hashCode() {
            return 1;
        }
    }

    @Test
    public void test66() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("aaa", Arrays.asList(1,2,3));

        JSONArray objects = jsonObject.getJSONArray("aaa");
        System.out.println(objects);
    }
}