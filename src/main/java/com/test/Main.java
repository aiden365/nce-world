package com.test;

import cn.hutool.Hutool;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
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
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.YearMonth;
import java.util.*;
import java.util.stream.Stream;

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
        //see to + ([n.] / [doing] / [that + 从句]) 确保某事完成
        //appreciated by sb. 收到某人的感激感谢，但但最好翻译为主动语态，例如your generous help was greatly appreciated by us，译为我们非常感谢您慷慨的帮助
        //in return [adv.] 作为报答
        //care to do 意思上等价于want to do 但语气更委婉
        //extend [vt.] 提供
        //in advance [adv.] 提前
        //turn out 结果是...，其中turn是系动词表示变得，变成
        //a worry to sb. 让某人担心
        //it is/was + 形容词 + of + sb. + to do sth. 对某人行为的品质评价，例如，it is generous of him to donate a lot of money，译为他真是慷慨捐了一大笔钱，通过捐款评价人的品质，其中的形容词表示人的品质。与之易混淆的句型it is/was + adj. + for sb. + to do sth. 例如its important for you to learn english.译为学习英语对你来说很重要，其中的形容词表示动作的性质
        //check up on sb. 调查某人的身份
        //that is final
        //here in通常用于表示在某个具体地点或位置。‌例如，“I'm here in the office”表示“我在办公室里”。这种用法强调了说话者当前的位置或存在的具体环境。
        //give sb. / sth. free rein 让某人或某个事物自由的发挥（不受限制），从语法角度这其实是一个简单的give双宾语结构 sb./sth.是间接宾语，free rein是直接宾语，例如：the director gaven the actors free rein to interpret their roles. if you give your creativity free rein, you will be amazed by the results
        //be going on 表示某事正在发生，例如the party is still going on even though it is midnight. be going to 计划打算做某事，强调未来的计划或打算, 例如I`m going to study abroad next year，be going for 强调去做某项活动，通常是短期的、休闲的活动 I`m going for a coffee
        //consult sb. about sth. 向某人请教咨询某事，I consult him about buying a car
        //put sb. in sth. 把某人安排在某职位或角色中the manager put her in charge in the project 使某人进入某个状态the problem put her in a reflective mood
        //function as 起...作用
        //process of ...过的过程，例如process of thinking思考的过程
        //divine [adj.] 神的，上帝的
        //be unique to sb. 为某人所特有的，his way of thinking is unique to him
        //in no way 介词短语，译为绝不
        //concurrently with sth. 与...同时发生，类似的还有at the same time as sth. 都强调时间上的并行
        //safeguard against sth. 用于防止问题发生的措施
        //go off 离开，而course可以表示航线，航向，合计来就是偏离航向
        //certain ethical rules 某些道德准则，其中certain做做代词表示某个，某些，某种
        //go back (to sth.) 表示回到，回溯, 跟to sth. 表示回到具体的地点
        //go for sth. 努力获取
        //条件状语从句的省略形式，如果从句的主语和主句主语一致且从句中含有be动词或被动语态，则可以省略主语和be动词，例如If (I am) invited, I will attend the meeting.
        //awake with a start 猛然醒来，突然醒来
        //either 在否定含义的句中either表示两种情况都不成立，但这种用法依赖句中的否定词（no,not,never）与neither...nor...含义相同，但neither自带否定含义，例如I dont like either tea or coffee和I like neither tea nor coffee
        //with可以表示具有，带有
        //a couple of 几个
        //with regard to sth. 关于...
        //in person 亲自
        //personally 亲自地
        //from now on 介词短语做时间状语，译为从现在开始，后跟一般将来时，表示从现在开始，直到未来的某个时间或持续一段时间内发生的事情
        //in the long run/term 从长远来看，归根到底，终究
        //be embarrassed about sth. 对某事感到尴尬
        //have an insight into
        //so far so good 迄今为止，一切顺利
        //could not help sth. 忍不住做某事，
        //those things against they better judgement 其中against they better judgement发挥定语作用
        //get by with 靠某物勉强应付 get by without 在没有某物的情况下勉强维持
        //struggle to do sth. 尽力做某事
        //shatter [v] 摧毁
        //reservists [n] 后备军人
        //shade [v] 遮挡
        //care [vi] 关心
        //troop 军队
        //secure [v] (尤指经过努力）获得，取得，实现，保卫
        //enemy [n] 敌人
        //pursue [v] 抓捕，追捕
        //hesitate [v] 犹豫
        //keep sb. adj. 使某人保持某种状态
        //enough 对……足够的
        //prosper [v] 繁荣，使繁荣
        //alongside [prep] 与...一起
        //ingredient [n] 成分
        //这里的“saga”指的是一个家族或民族的长篇叙事，通常包含多个世代的故事和历史
        //connect [adj] 联在一起的，有关系的
        //prescription [n] 处方
        //poor [adj] 没有价值
        //due [adj] 适当的
        //attorney [n] 律师，代理人
        //round up [v] 使逮捕，使聚集
        //work [v] (使)工作
        //what 融合性关系代词，等价于the thing what
        //even as [prep] 正巧在…的时候
        //the spin masters [n] 舆论专家，其中spin表示有导向性的陈述
        //peddlers [n] <主新闻>不法商贩;(尤指)毒贩
        //the politics of anything goes 是一个习语，意思是任何事情都可以接受，没有任何限制或规矩，所以这句话就是 什么都可以的政治观点
        //conservative [adj] 保守的
        //pundit [n] 专家
        //slice [vt] 把...切成片
        //dice [vt] 把...切块
        //disillusioned with 对...感到失望
        //purpose 目标
        //defining [adj] 决定性的
        //consumed [v] 吞噬
        //that`s how 其中的how是一个名词引导定语从句，有点像what=the thing that，而how=the way that
        //face [v] 应对
        //take sth. back 拿回某物
        //honest about 对...坦诚，诚实
        //to get the job done 这里的get表示使变得，done [adj] 完成的
        //by 与后面的by bring 视为相同的并列结构，做方式状语
        //deserve [v] 应得
        //like [v] 想要
        //staff [n] 工作人员
        //give it up for sb. 把掌声给某人， 让我们欢迎某人
        //may 表示
        //inevitable [n] 不可避免的，必然发生的
        //instead of [prep] 而不是...
        //tear sb. down 拆某人的太，意为贬低某人
        //enormity [n] 虽然常用来指“极大的不道德的行为”或者“巨大的规模”，但在这种上下文中，它指的是任务的艰巨性和挑战性。
        //sit on the sideline 其中sideline表示球场的界外区域，字面意思是坐在场外，意为袖手旁观
        //shirk (from) [vi/vt] 逃避
        //live out 住在外面，实践，实现
        //safe [adj] 安全的
        //rise up against sth 反抗某事
        //the greatest of generations 这里，“最伟大的一代人”通常是指在第二次世界大战期间为自由和正义而战的那一代美国人
        //brave sth. [vt] 勇敢的面对某事
        //fire hose 消防水管 hose [n] 软管，胶管
        //settle for sth 勉强接受某事，
        //as 像...一样，比较状语从句，例如I hope things are as they should be
        //bother [v] 操心，花费时间精力(做某事)
        //not for the moment 暂时不考虑
        //keep sb.from sb. 使
        //herewith [adv] 随同此信
        //well-behaved [adj] 表现良好的，举止得体
        //break with sth.  与...决裂/断绝关系，
        //Each in his own way 每个人用自己的方式
        //A. as well as B. 不仅A而且B，例如she has a degree in English as well as History
        //fare 作为动词，"fare" 是不及物动词，表示表现、进展或结果如何。它不直接带宾语，自身也没有感情色彩，而是通过副词或介词短语来补充意义。 例如i regret how you fare here和I  delight how you fare here
        //be hounded out 被迫离开，其中hound有追赶的意思，例如the dog was hounding a rabbit
        //assembly [n] 除了表示装配，也可以表示集会，例如national popular assembly
        //to take part in [vt] 参加
        //itinerant [adj] 游走的，四处旅行的
        //informed [adj] 见多识广的
        //flock [vi] 成群而行 [n] 群 例如a flock of birds
        //made a living out of sth. 靠...为生，类似于live on sth.
        //riddle [n] 谜，等价于puzzle, enigma
        //skepticism [n] 怀疑论
        //in relation to 与...有关
        //agnostic [n/adj] 不可知论
        //whether or not ‌是一个固定短语，其词性为‌从属连词‌，主要用于引导名词性从句或让步从句
        //categorically [adv] 直截了当地
        //as a rule 赋词短语，译为一般来说
        //socially induced [adj.] 由社会引起的
        //pave the way for sth. 为...铺平道路
        //for example [adv] 例如
        //for 引导原因状语从句
        //naked 做show这个动作的补语
        //a matters of n. 一个...问题
        //wrangle [vi./n.] 争吵
        //norm [n] 标准
        //stand [link.] 不是表示字面上的“站立”，而是作为一种表达状态或情境的系动词，常常用来描述一个人处于某种心理或情感状态。例如she stands corrected译为她纠正了自己的错误
        //lost in thought 陷入沉思
        //fairly/quite soon 很快
        //hold [v] 认为
        //make it possible
        //for a certainty [adv] 毫无疑问地，确定无疑地
        //be said of 被说成是...
        //equal [n] 同样的人
        //a number of 许多
        //ascribe sth. to sb. [vt] 把某事归因于某人
        //shroud a. in b. 把A包裹在B中
        //confine to [sth] 限制于...之内
        //give birth to sb. 生下某人
        //put [v] 表达
        //grasp [vt] 抓住，领会
        //end up 译为最终成为/变成，最终做某事。表示某人或某事在一段时间或一系列事件之后，最终的状态或结果。end up + 动词-ing：表示最终做某事。end up + 形容词：表示最终成为某种状态。end up + 名词：表示最终变成某个名词所代表的状态或位置。end up with：指最终得到某物或处于某种情况。
        //exasperating [adj] 惹人生气的; exasperate [vt] 激怒
        //fellow beings 同胞
        //inform [vt] 告诉 inform someone of/about something [vi] 告发 inform on/against sb. 检举告发某人的不当行为，she decided to inform on/against his colleagues having a part in the crime for police
        //cost sb. one`s life 是一个习语，意思是导致某人失去生命或者使某人丧命，其cost一般用法为sth. cost sb. money 某物花费某人多少钱
        //accepted [adj] 可接受的，公认的
        //majority [adj. / n.] 大多数（的），通常指代群体中占多数的人或事物，或者在某一特定群体中占优的部分。
        //accuse sb of sth vt.&vi.因某事指责某人
        //slender [adj.] 微弱的
        //leniency [n.] 宽大处理，等价于clemency
        //assure sb （of） sth 向某人保证某事
        //had only acted 这里使用过去完成时，是为了表达从句had acted发生在主句assured之前的
        //in the best interest of the state 这句话译为为了国家的最大利益，其中in不能替换为for尽管他们都表示目的，但后者的目的性更强，而后者则表示在某个环境、范围或标准内进行某种行为时，它更侧重于某种标准或原则，而非单纯的目标或目的。
        //condemn [vt.] 判刑，定罪，谴责
        //in the presence of sb. 在某人的面前，等价于 in sb.'s presence
        //thereafter [adv] 在那之后
        //现在完成进行时是英语中动词的一种基本时态，其构成为：主语+助动词（have/has）+been+动词的现在分词+其他成分。表示动作从过去某一时间开始，一直持续到现在，或者刚刚终止，或者可能仍然要继续下去。
        //句中的seen things是否应该理解成经历，而through作副词表示从头到尾，强调坚持到事情的结尾，然后to the bitter end表示直到最后，其中的to表示方向，合起来就是从头到尾的经历某事，直到最后。例如：she saw the project through, no matter how difficult it was, to the bitter end. She has seen many struggles through to the bitter end.
        //for the sake of sth. 为了...
        //句中的to表示对...而言，例如This explanation is clear to everyone.
        //speak with sth. 用......的语气/方式说话
        //characteristic [adj.] 特有的
        //self-assuredness [n.] 自信
        //on behalf of sth. 代表...
        //trial [n] 审判
        //"would have done" 是 虚拟语气 中的一种形式，表示对过去未发生的假设或推测，强调某种情况本可能发生，但实际上并未发生。
        //command [vt] 指挥，命令，赢得。例如to command respect 这里 "command" 在这个语境中并不是指“命令”或“指挥”的意思，而是表示自然而然地获得某种结果或状态。
        //draw one's attention to sth. 引起某人对某事的主意，使某人注意到某事，有时并不显式提及具体某人的注意，此时表示泛指人们的注意，例如I hope to draw attention to the issue of poverty 我希望引起人们对贫困问题的关注
        //inseparable [adj] 密不可分的
        //ethics [n] 伦理学
        //say sth. of sb. 对某人发表某种看法，但大多数场景下sth.内容较多所以常常将内容放到of sb.的后面
        //in the ture sense (of the word) 在真正意义上
        //be central to sth. 对于某事来说极为重要
        //hairsplitting [adj] 吹毛求疵的，咬文嚼字的
        //from time immemorial 自古以来，immemorial [adj] 远古的
        //be satisfied with sth. 对...感到满意
        //self-opinionated [adj] 自以为是的
        //know it all [n] <贬> 无所不知的人
        //a whole lot 等价于 a lot 作副词，译为很多，许多。而a whole lot of 等价于 a lot of 作形容词，修饰可数名词复数和不可数名词，译为很多的，许多的
        //boast of 自负
        //come across sb. 碰巧遇到某人
        //a different kettle of fish [n] 字面意思是不同壶的鱼，实际是一句习语，表示完全不同的人(或事)
        //reality [n] 实际，现实
        //strive [vi] 努力，奋斗
        //knowledge of sth. 对某事有了解，例如：she has a good knowledge of computer programming, 她对计算机编程有了解
        //previously [adv] 以前
        //subversive [adj] 颠覆性的
        //v. be not nearly as adj./adv. as + 相比的对象。用于比较两个事物或人在某方面的差距，例如he is not nearly as tall as his brother。有时第二个as可以被省略，例如The movie was not nearly as exciting.
        //stark [adj./adv/] 完全的，全然地
        //subject [n] （君主制国家的）臣民，国民。类似的citizen则表示（共和制国家）公民，市民
        //dare [v] 敢。可以做实义动词后跟不定式，表示敢于做某事例如she dare to challenge the fate。也可以做情态动词后跟动词原型，意思一样例如he dare swim in cold river
        //get + sth. + on 表示穿着什么衣服，例如he has got red shirt on. 他穿着一件红色的衬衫。
        //to be (more) precise 译为(更)确切的说，经常做插入语补充主句中的信息，例如：the meeting will be held at 10 o`clock, to be (more) precise, it will start at 10:15 o`clock.基本等价于to be accurate
        //shut one`s eyes to sth. 对某事视而不见，其中one`s是主语的所有格。例如：we can`t shut our eyes to the growing problem of education in our nation.
        //indifferent [adj] 漠不关心的，冷淡的
        //generally speaking [adv] 总的来说。例如He is generally speaking very friendly. 基本上等价于in general
        //deep down [adv] 表位置：深处，表程度：深深地
        //deck [n] 甲板，一副牌
        //into [prep.] 表结果：变成，分成
        //tu put it mildly 说得委婉些
        //excess [n] 过量，过度。[adj] 过量的，过度的。excessive [adj] 过分的，极度的。excessively [adv] 过分地，极度地。
        //turn out [vi.] 结果是：常用来表示某个事件、情况或行为最终的结果或发展，原来是：表示事物或情况的真正性质或状态，通常是与预期或假设不同。常见搭配：turn out that, turn out to be. 例如the movie turned out to be more interesting than I expected. it turned out that the project was completed ahead of schedule
        //necessary [adj.] 必要的，必须的
        //decidedly [adv] 确定无疑地
        //lead to [vt.] 通向，导致
        //insight [n] 深刻的理解（或见解、认识）。通常搭配介词into表示对某一事物的深刻认识，例如his insight into the economic situation helped him get through the economic crisis. 但在本句中并没有显式的指出对某个事物的见解，但通过逻辑应该理解成对目标（the right action）有真正的见解
        //virtuous [adj.] 有道德的，正直的
        //go on doing sth. 继续做某事（同一件事）。stop doing sth. 停止做某事。stop to do sth. 转去做另一件事，例如after studying for an hour, she decided to stop to have a cup of coffee。
        //speak ill of someone. 说某人的坏话。其中speak of sb.|sth. 表示谈论某人或某事。ill作副词表示不友善地，恶意地，也可以替换成well，如speak well of someone. 表示称赞某人
        //be aware [of. sth. | that sc.] 意识到...。其中aware是形容词表示意识到的
        //in order [to do sth. | that sc.] 为了...
        //to do the dishes. 去洗碗。这里的dish [n.] （待清洗的）餐具
        //stagger [v.] 步履蹒跚、摇摇晃晃地走
        //preoccupied [adj.] 心事重重，全神贯注的。be preoccupied with sth. 指某人专注于、全神贯注于某件事情，常用于描述一个人因某种事物而忽略其他事物或感到困扰。He seemed preoccupied with thinking about her future
        //rather [adv.] 程度副词，译为相当。
        //tumbled [vi.] 摔倒，跌倒，坠落，例如人从楼梯上摔倒 she tumbled downstairs. 或者价格等暴跌，如股价暴跌 the value of stocks tumbled. 在这里比喻这些话不受控制的从她嘴里出来。
        //as a result + sc. 副词，译为因此、结果，后面一般接句子，表示因果关系，例如 as a result he was sent away from school. 类似的还有 as a result of + sth. 介词短语，译为原因，例如the football match had to be put off as a result of a heavy rain.
        //thoughtfully [adv] 若有所思地，意味深长地;
        //speechless [adj. | adv. | n.] （由于强烈的感情、震惊等）说不出话
        //talk back 定罪
        //How on earth [adv] 鬼知道
        //passed judgement [vi.] 做出判决。此处的pass不表示通过、经过的含义，而表示：“做出”。类似于make a judgement但pass更具权威性和官方性，同时pass 后面跟的是不可数名词不加冠词表示“进行裁决/评判”这种行为，而make与要加冠词表示“做出一个具体的判断”
        //date back to 追溯到，从...开始有
        //olive [n.] 橄榄，[adj.] 橄榄色
        //subdued [adj.] 平静的
        //count on = look to + sb. + doing，译为指望某人做某事
        //as if by magic [adv.] 不可思议地
        //in person [adv.] 亲自
        //At any rate [adv.] 无论如何
        //over there/here [adv.] 在那边，在这边
        //unkempt [adj.] 不修边幅的，不整洁的
        //snub [adj.] 短扁上翘的
        //gimlet [n.] 吉姆雷特（一款鸡尾酒），点钻
        //chubby [adj.] 丰满的（形容人的身材）
        //from the start 从一开始
        //go too far [vi.] 做的过火
        //have (not) been to [vi] （不）曾去过某地
        //with a start 介词短语做状语，译为猛地一惊
        //wide awake 是一个固定搭配，表示“完全清醒”或“毫无睡意”
        //after all 毕竟，终究
        //never mind! 没关系
        //she was acting a bit nuts 这句话使用主语+不及物动词+形容词表状态结构，可以将act看作是系动词a bit 是副词修饰nuts 而nuts是形容词表示主语的状态，类似的还有the sun was rising red 其中的red表示太阳升起时的状态，译为太阳正红彤彤的升起
        //a drop of crystal 一滴水晶
        //wipe off 通常用于描述清除或去除某物表面的污渍，例如she wipes off the surface of the table
        //as if 可跟在look, seem等系动词后引导表语从句，表示好像、似乎、仿佛的意思。it seems as if it is raining. 外面看起来像是下雨了。（陈述语气表示真的下雨了），而it seems as if it was raining. 外面看起来像是下雨了。（虚拟语气表示推测或者并没有下雨）
        //be busy doing sth. 忙着做某事。
        //in a way. 状语，从某种意义上
        //on the contrary. 反面，相反
        //when译为：这时（突然）时主句中往往含有表示即将做某事如be about to do sth.或者ready等关键词，这时的when引导的从句表示发生了某事，从而打断了原来要做的事
        //but still 尽管如此
        //had something in common. 有共同之处
        //had yet to do sth. 还没有做某事
        //independently of 独立于...之外，与...无关
        //lessen [v.] 减少
        //这里的what可以理解为the time that，例如，she stood quite still for the time that seemed like an eternity
        //may/might as well do 不妨做某事
        //without further ado 介词短语状语表示：直接了当地
        //do more than + bare infinitive 是英语中的固定结构，译为：不仅仅做某事
        //endeavor [v.] 努力 [n.] 事业，活动
        //striking [adj.] 显著的
        //no doubt [adv.] 无疑，肯定
        //in addition to 介词短语，译为：除...之外。等价于besides
        //due to 介词短语，译为：因为
        //not least (of all) 副词短语，译为：尤其
        //named after 根据...命名，其中named是形容词，after在与named搭配时表示根据的含义，如the city is named after the famous explorer
        //not far from someplace. 离某地不远
        //known as 被称为
        //by chance [adv.] 偶然地，意外地
        //establish [vt.] 确定，建立
        //relation to = with relation to + sth. 译为：与...有关
        //and yet 可是
        //in one sense 从某种意义上说
        //very briefly 简而言之
        //vary from a. to b. 通常用来表示某事物在不同的范围、方面或条件下有所变化、差异
        //in fact [adv.] 事实上，实际上
        //then along comes Plato. 句子被到装了，正常语序是then Plato comes along.
        //as regards sth. 介词短语，译为：关于...
        //one and the same. 完全一样，一回事
        //topical affairs. 时事，topical [adj.] 时下关注的，热门话题的
        //at a time 每次，一次
        //subsequent [adj.] 后续的
        //as such 介词短语，跟在名词后作后置定语，译为：这样的...，例如the proposition as such. 这样的观点
        //belong to 表示某物属于某人或某个地方，强调的是所有权或者归属关系。例如：the book belongs to me. 类似的belong in 则表示这个短语通常用于描述某物“应该在”某个特定的空间、领域或范围内。例如the proposition that women belong in the kitchen has outdated
        //in time [adv.] 迟早。on time [adv.] 准时
        //let me put it like this. 让我这样说吧。put [v.] 说
        //without having to do sth. 不用做某事.
        //in the midst of 在...之中
        //building block [n.] 基本单元
        //for that matter [adv.] 而且，甚至
        //get at 某人试图传达某种信息或意图，等价于say 译为：说，表达。例如what are you getting at? 你在说什么？
        //just in case 以防万一
        //of one`s own accord. [adv.] 自愿地，自发地
        //be made from sth. 由...制成
        //remain [link.] 保持某种状态 + adj.
        //do with. 处理，等价于deal with
        //drop in [vi.] 突然到来，例如She dropped in last night. 她昨晚突然来访。也可以指明突然到哪里She dropped in at my place last night. 类型的搭配由 drop in on sb. 顺道拜访某人，若想表示正式访问可以使用call in on sb.
        //stumble into sth. 不经意间遇到某人或某事，译为：突然遇到，遇到某事， 例如I stumble on my friend in the street yesterday. 如果想表达不经意间做某事使用stumble upon doing sth. I stumbled upon picking one hundred dollars.
        //sb. catch sight/glimpse of sth. 不经意间看到某物
        //might well [adv.] 可能，例如I thought she might well have gone away. 我想象她可能已经走了。 形似的表达might (just) as well [adv.] 不妨， 例如 has it been rot, it might just as well throw away.
        //be formed in sth. 由...制成
        //in comparison with sth. 与...相比，例如this is more beautiful in comparison with these crude copies
        //irresistible [adj.] 不可抗力的
        //desire [n.] 欲望
        //seize [vt.] 抓住，控制, 例如I seized the opportunity to go to the party. 我抓住了这个机会去参加聚会。在本句中则表示：控制
        //come across [vt.] 遇到，遇到某事，例如I came across a man with a large amount of money. 我遇到了一个拥有大量钱的男人。
        //train of thought [n.] 思路
        //in the same way [adv.] 以同样地方式
        //mean to do 想要/打算做某事 I mean to call her tomorrow. mean doing 表示某个行为意味着某种后果，例如：his silence means breaking up.
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }


    @Test
    public void main2() {
        StringBuffer buffer = new StringBuffer();
        // Partly because one would hardly have time to study it in depth before it burst,
        // and partly because it would probably be rather difficult to find a market for a philosophic treatise on something nobody has ever seen, and which only existed for five seconds.
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        //
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.tryLock();
            FileChannel channel = fileLock.channel();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Data
    static class Peoson{
        private String name;
        private String address;


        @Override
        public int hashCode() {
            return 1;
        }
    }

    @Test
    public void test66() {
        // we must do it quickly before the guards discover us
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        //
        YearMonth yearMonth = YearMonth.of(2025, 3);
        int dayOfMonth = yearMonth.atEndOfMonth().getDayOfMonth();
        System.out.println(dayOfMonth);*/
        /*String aa = "/UploadFile/DaumFile/6bc6ca66789ee78af29b52ff961e506a/83b7d32963ab4fc4ae1b583cdefb8eeb/83b7d32963ab4fc4ae1b583cdefb8eeb.dwg";
        String png = aa.replaceAll("(?i)dwg", "png");
        System.out.println(png);
        String[] split = aa.split("/");

        System.out.println(split[split.length - 1]);*/


    }




}