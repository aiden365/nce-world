package com.test;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.unit.DataSize;
import cn.hutool.core.io.unit.DataSizeUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.system.SystemUtil;
import com.alibaba.fastjson.JSONObject;
import com.other.Welcome10;
import com.words.*;
import kotlin.reflect.KParameter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
import static com.words.TestYschzj.*;

@Slf4j
public class TestMain2 {


    private TestCz testCz = new TestCz();
    private TestGz testGz = new TestGz();
    private TestIelts testIelts = new TestIelts();
    private TestToefl testToefl = new TestToefl();


    static final List<String> keywords = Arrays.asList("abstract", "assert", "boolean",

            "break", "byte", "case", "catch", "char", "class", "const",

            "continue", "default", "do", "double", "else", "extends", "false",

            "final", "finally", "float", "for", "goto", "if", "implements",

            "import", "instanceof", "int", "interface", "long", "native",

            "new", "null", "package", "private", "protected", "public",

            "return", "short", "static", "strictfp", "super", "switch",

            "synchronized", "this", "throw", "throws", "transient", "true",

            "try", "void", "volatile", "while");


    @Test
    public void showMethods() throws NoSuchMethodException, SocketException, UnknownHostException {

        Class<TestToefl> TestFourClass = TestToefl.class;
        List<Method> methodList = Arrays.asList(TestFourClass.getMethods());

        methodList.stream().forEach(e -> {

            if (e.getDeclaringClass().getName().equals("com.demo.text.TestToefl")) {
                log.info("TestToefl." + e.getName() + "();");
            }
        });

        String address = SystemUtil.getHostInfo().getAddress();
        System.out.println(address);

        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        networkInterfaces.asIterator().forEachRemaining(networkInterface -> {
            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress inetAddr = (InetAddress) inetAddresses.nextElement();
                if (!inetAddr.isLoopbackAddress() && !inetAddr.isLinkLocalAddress() && !inetAddr.isMulticastAddress()) {
                    System.out.println(networkInterface.getName() + ":" + inetAddr.getHostAddress() + ":" + getMacByInetAddress(networkInterface.getInetAddresses().nextElement()));
                }
            }
        });

    }

    protected static String getMacByInetAddress(InetAddress inetAddr) {
        try {
            byte[] mac = NetworkInterface.getByInetAddress(inetAddr).getHardwareAddress();
            StringBuffer stringBuffer = new StringBuffer();

            for (int i = 0; i < mac.length; ++i) {
                if (i != 0) {
                    stringBuffer.append("-");
                }

                String temp = Integer.toHexString(mac[i] & 255);
                if (temp.length() == 1) {
                    stringBuffer.append("0" + temp);
                } else {
                    stringBuffer.append(temp);
                }
            }

            return stringBuffer.toString().toUpperCase();
        } catch (SocketException var6) {
            return null;
        }
    }


    @SneakyThrows
    @Test
    public void generationMethods() {

        Class<TestFour1> testFour1Class = TestFour1.class;
        Method[] methods = testFour1Class.getMethods();
        Set<String> collect = Arrays.stream(methods).map(e -> e.getName()).collect(Collectors.toSet());

        Class<TestGz> testFourClass2 = TestGz.class;
        Method[] method2 = testFourClass2.getMethods();
        Set<String> collect2 = Arrays.stream(method2).map(e -> e.getName()).collect(Collectors.toSet());

        Class<TestCz> testFourClass3 = TestCz.class;
        Method[] method3 = testFourClass3.getMethods();
        Set<String> collect3 = Arrays.stream(method3).map(e -> e.getName()).collect(Collectors.toSet());

        Class<TestIelts> testFourClass4 = TestIelts.class;
        Method[] method4 = testFourClass4.getMethods();
        Set<String> collect4 = Arrays.stream(method4).map(e -> e.getName()).collect(Collectors.toSet());

        File file = new File("E:\\个人资料\\我的阅读\\dict-master\\book\\1521164640451_TOEFL_2\\TOEFL_2.json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        String temp = null;
        List<Welcome10> all = new ArrayList<>();
        while ((temp = bufferedReader.readLine()) != null) {
            all.add(JSONObject.parseObject(temp, Welcome10.class));
        }

        all.parallelStream().forEach(welcome10 -> {

            synchronized (TestMain2.class) {
                String headWord = welcome10.getHeadWord();
                Welcome10.Welcome10Content content = welcome10.getContent();
                Welcome10.ContentWord word = content.getWord();
                Welcome10.WordContent content1 = word.getContent();

                headWord = headWord.replaceAll(" ", "_").replaceAll("-", "_");

                if (collect.contains(headWord) || collect2.contains(headWord) || collect3.contains(headWord) || collect4.contains(headWord)) {
                    return;
                }


                log.info("/**");

                log.info("* @pronounce " + content1.getUkphone());

                for (Welcome10.Tran tran : content1.getTrans()) {
                    log.info("* @explain " + tran.getPos() + "." + tran.getTranCN());
                }

                if (content1.getSentence() != null && content1.getSentence().getSentences() != null) {
                    for (int i = 0; i < content1.getSentence().getSentences().length; i++) {

                        Welcome10.SentenceSentence sentence = content1.getSentence().getSentences()[i];
                        int i_temp = i + 1;
                        log.info("* @e.g." + i_temp + " " + sentence.getSContent() + "." + sentence.getSCN());
                    }
                }

                Welcome10.RelWord relWord = content1.getRelWord();
                if (relWord != null) {
                    String rwtxt = "";
                    rwtxt += "* @same ";
                    for (int i = 0; i < relWord.getRels().length; i++) {
                        Welcome10.Rel rel = relWord.getRels()[i];
                        rwtxt += rel.getPos() + ". " + CollUtil.join(Arrays.asList(rel.getWords()).stream().map(Welcome10.WordElement::getHwd).collect(Collectors.toList()), "、");
                        rwtxt += "，";
                    }

                    if (StrUtil.isNotBlank(rwtxt)) {
                        log.info(rwtxt);
                    }
                }

                log.info("*/");
                if (keywords.contains(headWord)) {
                    headWord += "_";
                }

                log.info("public static void " + headWord + "(){}");
                log.info("\n");
            }
        });
        log.info("总数量" + all.size());
    }


    @SneakyThrows
    public static void methodListFour2(String[] args) {
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4);
        integers1.subList(0, 3);

        List<Integer> integers2 = Arrays.asList(3, 4, 5, 6);

        Collection<Integer> subtract1 = CollUtil.subtract(integers1, integers2);
        System.out.println(subtract1);

        Collection<Integer> subtract2 = CollUtil.subtract(integers2, integers1);
        System.out.println(subtract2);

        TestFour4.ribbon();
        TestFour5.scholar();
        TestFour5.scissors();
        TestFour4.rotten();
        TestFour5.score();
        TestFour4.route();
        TestFour4.roller();
        TestFour4.revolt();
        TestFour5.practice();
        TestFour5.praise();
        TestFour5.precaution();
        TestFour5.preceding();
        TestFour4.sail();
        TestFour5.pray();
        TestFour5.scenery();
        TestFour5.precise();
        TestFour5.predict();
        TestFour4.rotary();
        TestFour5.preface();
        TestFour4.reward();
        TestFour4.routine();
        TestFour4.saddle();
        TestFour5.scientific();
        TestFour4.ripe();
        TestFour4.rhythm();
        TestFour4.satellite();
        TestFour4.ridiculous();
        TestFour4.rural();
        TestFour4.rouse();
        TestFour5.saw();
        TestFour5.practise();
        TestFour4.rigid();
        TestFour4.sample();
        TestFour5.precious();
        TestFour4.risk();
        TestFour4.revise();
        TestFour4.rib();
        TestFour4.robot();
        TestFour4.ridge();
        TestFour4.revolution();
        TestFour4.romantic();
        TestFour4.rough();
        TestFour4.row();
        TestFour4.roast();
        TestFour4.rotation();
        TestFour4.rid();
        TestFour4.rival();
        TestFour4.rocket();
        TestFour4.royal();
        TestFour4.roar();
        TestFour4.rug();
        TestFour4.rush();
        TestFour4.rust();
        TestFour4.sacrifice();
        TestFour5.scarcely();
        TestFour4.rod();
        TestFour5.sausage();
        TestFour4.Roman();
        TestFour4.sack();
        TestFour4.rifle();
        TestFour5.say();
        TestFour4.sake();
        TestFour5.scatter();
        TestFour5.saucer();
        TestFour11.thoughtful();
        TestFour4.trap();
        TestFour4.tray();
        TestFour11.tolerate();
        TestFour4.treasure();
        TestFour11.torture();
        TestFour11.tissue();
        TestFour4.treatment();
        TestFour4.tremble();
        TestFour4.tremendous();
        TestFour4.trend();
        TestFour4.trial();
        TestFour4.tragedy();
        TestFour4.trick();
        TestFour4.treat();
        TestFour4.triumph();
        TestFour4.troop();
        TestFour11.toilet();
        TestFour4.tropical();
        TestFour4.trumpet();
        TestFour11.touch();
        TestFour4.traffic();
        TestFour4.treaty();
        TestFour11.thrust();
        TestFour11.thickness();
        TestFour4.triangle();
        TestFour11.thrive();
        TestFour11.towel();
        TestFour11.torch();
        TestFour4.trunk();
        TestFour4.trust();
        TestFour11.throughout();
        TestFour4.transistor();
        TestFour4.truth();
        TestFour11.thunder();
        TestFour11.textile();
        TestFour11.thorough();
        TestFour11.tin();
        TestFour11.threaten();
        TestFour11.thereby();
        TestFour11.toe();
        TestFour11.tone();
        TestFour11.tough();
        TestFour11.tidy();
        TestFour11.tolerance();
        TestFour11.threat();
        TestFour11.terrible();
        TestFour11.thus();
        TestFour11.territory();
        TestFour11.tide();
        TestFour11.tip();
        TestFour11.tour();
        TestFour11.tourist();
        TestFour11.tower();
        TestFour11.track();
        TestFour11.tire();
        TestFour11.therefore();
        TestFour11.toast();
        TestFour11.tractor();
        TestFour11.throat();
        TestFour11.terror();
        TestFour4.trade();
        TestFour4.transmit();
        TestFour4.transport();
        TestFour4.question();
        TestFour4.unless();
        TestFour4.uneasy();
        TestFour4.typewriter();
        TestFour4.puzzle();
        TestFour4.quality();
        TestFour4.typical();
        TestFour4.qualify();
        TestFour4.quarrel();
        TestFour4.quiet();
        TestFour4.quit();
        TestFour4.quotation();
        TestFour4.rabbit();
        TestFour4.ultimate();
        TestFour4.race();
        TestFour4.universal();
        TestFour4.racial();
        TestFour4.quarter();
        TestFour4.radar();
        TestFour4.twin();
        TestFour4.unite();
        TestFour4.quick();
        TestFour4.rack();
        TestFour4.radio();
        TestFour4.rag();
        TestFour4.quite();
        TestFour4.rail();
        TestFour4.radiation();
        TestFour4.railway();
        TestFour4.uncover();
        TestFour4.rain();
        TestFour4.rainbow();
        TestFour4.rainy();
        TestFour4.railroad();
        TestFour4.underneath();
        TestFour4.rat();
        TestFour4.rate();
        TestFour4.tune();
        TestFour4.uniform();
        TestFour4.twist();
        TestFour4.undertake();
        TestFour4.rapid();
        TestFour4.rank();
        TestFour4.rational();
        TestFour4.undo();
        TestFour4.unique();
        TestFour4.tunnel();
        TestFour4.tyre();
        TestFour4.unity();
        TestFour4.undergo();
        TestFour4.queen();
        TestFour4.rarely();
        TestFour4.tube();
        TestFour4.rare();
        TestFour4.turbine();
        TestFour4.rather();
        TestFour4.ratio();
        TestFour4.ray();
        TestFour4.reach();
        TestFour4.react();
        TestFour4.quantity();
        TestFour4.radius();
        TestFour4.underline();
        TestFour4.typist();
        TestFour4.reflection();
        TestFour4.reflect();
        TestFour4.relativity();
        TestFour4.recently();
        TestFour4.refusal();
        TestFour4.refuse();
        TestFour4.relieve();
        TestFour4.religion();
        TestFour4.eighty();
        TestFour4.elbow();
        TestFour4.reality();
        TestFour4.regular();
        TestFour4.reject();
        TestFour4.receipt();
        TestFour4.recommend();
        TestFour4.realize();
        TestFour4.reasonable();
        TestFour4.refer();
        TestFour4.rebel();
        TestFour4.refine();
        TestFour4.relate();
        TestFour4.regulate();
        TestFour4.regret();
        TestFour4.relax();
        TestFour4.relevant();
        TestFour4.reliable();
        TestFour4.either();
        TestFour4.elect();
        TestFour4.election();
        TestFour4.electrical();
        TestFour4.reaction();
        TestFour4.regulation();
        TestFour4.elaborate();
        TestFour4.reduction();
        TestFour4.regardless();
        TestFour4.reception();
        TestFour4.religious();
        TestFour4.elastic();
        TestFour4.elder();
        TestFour4.reform();
        TestFour4.electric();
        TestFour4.electron();
        TestFour4.really();
        TestFour4.reflexion();
        TestFour4.real();
        TestFour4.realm();
        TestFour4.recognize();
        TestFour4.regard();
        TestFour4.regarding();
        TestFour4.reinforce();
        TestFour4.relation();
        TestFour4.reluctant();
        TestFour4.rely();
        TestFour4.refresh();
        TestFour4.electronic();
        TestFour4.elementary();
        TestFour4.receive();
        TestFour4.recent();
        TestFour4.recall();
        TestFour4.relief();
        TestFour4.rear();
        TestFour4.recorder();
        TestFour4.recover();
        TestFour4.recovery();
        TestFour4.engine();
        TestFour4.repetition();
        TestFour4.represent();
        TestFour4.reserve();
        TestFour4.reservior();
        TestFour4.enough();
        TestFour4.elephant();
        TestFour4.reputation();
        TestFour4.residence();
        TestFour4.remedy();
        TestFour4.render();
        TestFour4.else_();
        TestFour4.emergency();
        TestFour4.empire();
        TestFour4.emerge();
        TestFour4.employ();
        TestFour4.embarrass();
        TestFour4.employee();
        TestFour4.eliminate();
        TestFour4.emphasize();
        TestFour4.employer();
        TestFour4.emotion();
        TestFour4.encounter();
        TestFour4.eleven();
        TestFour4.emperor();
        TestFour4.endure();
        TestFour4.energy();
        TestFour4.emit();
        TestFour4.remark();
        TestFour4.remarkable();
        TestFour4.employment();
        TestFour4.encourage();
        TestFour4.ending();
        TestFour4.enemy();
        TestFour4.enjoy();
        TestFour4.remember();
        TestFour4.endless();
        TestFour4.enforce();
        TestFour4.remind();
        TestFour4.elevator();
        TestFour4.emotional();
        TestFour4.engage();
        TestFour4.engineer();
        TestFour4.removal();
        TestFour4.renew();
        TestFour4.eleventh();
        TestFour4.rent();
        TestFour4.repeatedly();
        TestFour4.reply();
        TestFour4.reporter();
        TestFour4.emphasis();
        TestFour4.enclose();
        TestFour4.repair();
        TestFour4.English();
        TestFour4.Englishman();
        TestFour4.reproduce();
        TestFour4.elsewhere();
        TestFour4.republic();
        TestFour4.rescue();
        TestFour4.embrace();
        TestFour4.England();
        TestFour4.require();
        TestFour4.resemble();
        TestFour4.enormous();
        TestFour4.reveal();
        TestFour4.resist();
        TestFour4.response();
        TestFour4.resident();
        TestFour4.restless();
        TestFour4.resistant();
        TestFour4.retain();
        TestFour4.review();
        TestFour4.resign();
        TestFour4.resistance();
        TestFour4.respective();
        TestFour4.respond();
        TestFour4.restraint();
        TestFour4.resort();
        TestFour4.restrict();
        TestFour4.retire();
        TestFour4.restrain();
        TestFour4.restore();
        TestFour4.retreat();
        TestFour4.request();
        TestFour11.describe();
        TestFour8.assign();
        TestFour4.remain();
        TestFour8.comparison();
        TestFour7.expert();
        TestFour6.formal();
        TestFour10.include();
        TestFour6.mess();
        TestFour9.additional();
        TestFour7.different();
        TestFour3.visual();
        TestFour9.bean();
        TestFour7.January();
        TestFour10.February();
        TestFour3.March();
        TestFour9.April();
        TestFour7.June();
        TestFour7.July();
        TestFour8.August();
        TestFour8.October();
        TestFour8.November();
        TestFour11.December();
        TestFour10.Monday();
        TestFour6.Friday();
        TestFour11.water();
        TestFour11.widow();
        TestFour11.wing();
        TestFour11.tension();
        TestFour11.worthy();
        TestFour11.weed();
        TestFour11.wooden();
        TestFour11.youth();
        TestFour11.terminal();
        TestFour11.welfare();
        TestFour11.whip();
        TestFour3.vivid();
        TestFour3.volcano();
        TestFour11.wheat();
        TestFour11.whistle();
        TestFour11.wicked();
        TestFour11.withdraw();
        TestFour11.weld();
        TestFour11.weep();
        TestFour11.whisper();
        TestFour11.waggon();
        TestFour11.volume();
        TestFour11.willing();
        TestFour11.withstand();
        TestFour11.worth();
        TestFour11.wave();
        TestFour11.wander();
        TestFour11.worthless();
        TestFour11.wreck();
        TestFour11.worthwhile();
        TestFour11.volt();
        TestFour11.voluntary();
        TestFour11.voyage();
        TestFour11.waken();
        TestFour11.wear();
        TestFour11.wheel();
        TestFour11.wage();
        TestFour11.want();
        TestFour11.whilst();
        TestFour11.waterproof();
        TestFour11.warmth();
        TestFour11.workshop();
        TestFour11.worship();
        TestFour11.worst();
        TestFour11.wind();
        TestFour11.workman();
        TestFour11.wound();
        TestFour11.wrist();
        TestFour11.yard();
        TestFour11.yawn();
        TestFour11.yearly();
        TestFour11.voltage();
        TestFour11.wholly();
        TestFour11.weaken();
        TestFour11.weakness();
        TestFour11.tend();
        TestFour11.tendency();
        TestFour11.wire();
        TestFour11.tender();
        TestFour11.wool();
        TestFour11.wax();
        TestFour11.worm();
        TestFour11.tense();
        TestFour11.weave();
        TestFour2.gown();
        TestFour3.niece();
        TestFour3.nine();
        TestFour3.noble();
        TestFour3.night();
        TestFour3.noisy();
        TestFour3.nonsense();
        TestFour3.noon();
        TestFour3.grain();
        TestFour3.grasp();
        TestFour2.neutral();
        TestFour3.grass();
        TestFour2.goods();
        TestFour2.newly();
        TestFour2.nephew();
        TestFour3.gracious();
        TestFour3.grape();
        TestFour3.grateful();
        TestFour3.gratitude();
        TestFour3.nobody();
        TestFour2.goodness();
        TestFour2.nervous();
        TestFour2.nice();
        TestFour2.government();
        TestFour3.grandson();
        TestFour3.grave();
        TestFour3.gravity();
        TestFour3.gray();
        TestFour3.greatly();
        TestFour2.Negro();
        TestFour3.grade();
        TestFour3.gradual();
        TestFour2.govern();
        TestFour3.graduate();
        TestFour2.nest();
        TestFour2.good();
        TestFour3.grammar();
        TestFour3.ninth();
        TestFour3.grand();
        TestFour2.network();
        TestFour2.neither();
        TestFour3.noise();
        TestFour2.never();
        TestFour3.greedy();
        TestFour2.nerve();
        TestFour3.gramme();
        TestFour3.nitrogen();
        TestFour3.graceful();
        TestFour3.grant();
        TestFour3.gradually();
        TestFour3.great();
        TestFour3.Greek();
        TestFour3.ninety();
        TestFour3.green();
        TestFour2.news();
        TestFour3.nineteen();
        TestFour2.grace();
        TestFour2.neighbour();
        TestFour2.golf();
        TestFour2.governor();
        TestFour2.newspaper();
        TestFour2.goose();
        TestFour2.new_();
        TestFour2.golden();
        TestFour3.guilty();
        TestFour3.grip();
        TestFour3.guide();
        TestFour3.grieve();
        TestFour3.gymnasium();
        TestFour3.habit();
        TestFour3.greeting();
        TestFour3.manly();
        TestFour3.marine();
        TestFour3.Marxism();
        TestFour3.maid();
        TestFour3.greet();
        TestFour3.grey();
        TestFour3.guidance();
        TestFour3.grocer();
        TestFour3.hamburger();
        TestFour3.guest();
        TestFour3.mail();
        TestFour3.majority();
        TestFour3.manage();
        TestFour3.many();
        TestFour3.magnet();
        TestFour3.grind();
        TestFour3.hall();
        TestFour3.marriage();
        TestFour3.greenhouse();
        TestFour3.married();
        TestFour3.groan();
        TestFour3.marvellous();
        TestFour3.grocery();
        TestFour3.magnetic();
        TestFour3.marble();
        TestFour3.Marxist();
        TestFour3.guess();
        TestFour3.haircut();
        TestFour3.manner();
        TestFour3.margin();
        TestFour3.market();
        TestFour3.marry();
        TestFour3.gum();
        TestFour3.master();
        TestFour3.mat();
        TestFour3.gulf();
        TestFour3.mainland();
        TestFour3.mainly();
        TestFour3.manual();
        TestFour3.habitual();
        TestFour3.gunpowder();
        TestFour3.hair();
        TestFour3.mass();
        TestFour3.brighten();
        TestFour3.brilliant();
        TestFour3.brim();
        TestFour3.gun();
        TestFour3.bring();
        TestFour3.brisk();
        TestFour3.management();
        TestFour3.mankind();
        TestFour3.male();
        TestFour3.bristle();
        TestFour3.gross();
        TestFour3.maintain();
        TestFour3.ground();
        TestFour3.guarantee();
        TestFour3.burn();
        TestFour3.cake();
        TestFour3.calculator();
        TestFour3.candy();
        TestFour3.cannon();
        TestFour3.butter();
        TestFour3.camp();
        TestFour3.canoe();
        TestFour3.canteen();
        TestFour3.buy();
        TestFour3.cabinet();
        TestFour3.broken();
        TestFour3.bruise();
        TestFour3.brown();
        TestFour3.broad();
        TestFour3.brush();
        TestFour3.British();
        TestFour3.brute();
        TestFour3.brow();
        TestFour3.butterfly();
        TestFour3.bull();
        TestFour3.brood();
        TestFour3.bud();
        TestFour3.button();
        TestFour3.broom();
        TestFour3.bury();
        TestFour3.bunch();
        TestFour3.bronze();
        TestFour3.cable();
        TestFour3.cafe();
        TestFour3.bubble();
        TestFour3.building();
        TestFour3.bulb();
        TestFour3.bullet();
        TestFour3.but();
        TestFour3.cabbage();
        TestFour3.bulk();
        TestFour3.burden();
        TestFour3.cabin();
        TestFour3.brook();
        TestFour3.bureau();
        TestFour3.burst();
        TestFour3.cage();
        TestFour3.calculate();
        TestFour3.camel();
        TestFour3.camera();
        TestFour3.campus();
        TestFour3.can();
        TestFour3.Canadian();
        TestFour3.canal();
        TestFour3.brother();
        TestFour3.bucket();
        TestFour3.cafeteria();
        TestFour3.bush();
        TestFour3.business();
        TestFour3.cancer();
        TestFour3.Britain();
        TestFour3.calm();
        TestFour3.candle();
        TestFour3.brittle();
        TestFour3.bus();
        TestFour3.campaign();
        TestFour3.Canada();
        TestFour3.butcher();
        TestFour3.castle();
        TestFour3.vacant();
        TestFour3.vacuum();
        TestFour3.continuous();
        TestFour3.van();
        TestFour3.captive();
        TestFour3.contempt();
        TestFour3.careful();
        TestFour3.carrot();
        TestFour3.unlikely();
        TestFour3.vague();
        TestFour3.capital();
        TestFour3.care();
        TestFour3.vain();
        TestFour3.career();
        TestFour3.vapour();
        TestFour3.utilize();
        TestFour3.continual();
        TestFour3.vanish();
        TestFour3.case_();
        TestFour3.upright();
        TestFour3.variable();
        TestFour3.variation();
        TestFour3.variety();
        TestFour3.cash();
        TestFour3.various();
        TestFour3.cathedral();
        TestFour3.captain();
        TestFour3.unlike();
        TestFour3.urge();
        TestFour3.vary();
        TestFour3.consistent();
        TestFour3.carbon();
        TestFour3.utmost();
        TestFour3.construct();
        TestFour3.carriage();
        TestFour3.capable();
        TestFour3.cassette();
        TestFour3.catch_();
        TestFour3.cart();
        TestFour3.contact();
        TestFour3.continent();
        TestFour3.car();
        TestFour3.contract();
        TestFour3.continue_();
        TestFour3.casual();
        TestFour3.contain();
        TestFour3.canvas();
        TestFour3.cargo();
        TestFour3.carpenter();
        TestFour3.consult();
        TestFour3.upset();
        TestFour3.upward();
        TestFour3.urban();
        TestFour3.urgent();
        TestFour3.usage();
        TestFour3.carve();
        TestFour3.card();
        TestFour3.careless();
        TestFour3.cattle();
        TestFour3.carpet();
        TestFour3.contest();
        TestFour3.utility();
        TestFour3.utter();
        TestFour3.vision();
        TestFour3.vital();
        TestFour3.vitamin();
        TestFour3.vessel();
        TestFour3.via();
        TestFour3.venture();
        TestFour3.vehicle();
        TestFour3.vice();
        TestFour3.vigorous();
        TestFour3.vinegar();
        TestFour3.violent();
        TestFour3.vast();
        TestFour3.vertical();
        TestFour3.velocity();
        TestFour3.violet();
        TestFour3.virtually();
        TestFour3.veteran();
        TestFour3.vibrate();
        TestFour3.virtue();
        TestFour8.pause();
        TestFour1.stir();
        TestFour1.strap();
        TestFour1.drought();
        TestFour1.sufficient();
        TestFour1.sulphur();
        TestFour1.strange();
        TestFour1.structural();
        TestFour1.supplement();
        TestFour1.suspicious();
        TestFour1.submerge();
        TestFour1.substitute();
        TestFour1.succession();
        TestFour1.subsequent();
        TestFour1.suck();
        TestFour1.survive();
        TestFour1.suspect();
        TestFour1.sweater();
        TestFour1.submarine();
        TestFour1.stuff();
        TestFour1.subway();
        TestFour1.steer();
        TestFour1.suit();
        TestFour1.superior();
        TestFour1.swallow();
        TestFour1.swell();
        TestFour1.stocking();
        TestFour1.stiff();
        TestFour1.strengthen();
        TestFour1.sweep();
        TestFour1.suspicion();
        TestFour1.stem();
        TestFour1.steamer();
        TestFour1.steel();
        TestFour1.stove();
        TestFour1.stroke();
        TestFour1.substance();
        TestFour1.steep();
        TestFour1.stimulate();
        TestFour1.surgery();
        TestFour1.stock();
        TestFour1.sting();
        TestFour1.stranger();
        TestFour1.straw();
        TestFour1.survey();
        TestFour1.sulfur();
        TestFour1.supreme();
        TestFour1.sustain();
        TestFour1.sway();
        TestFour1.swear();
        TestFour1.swift();
        TestFour1.swing();
        TestFour1.sword();
        TestFour1.successive();
        TestFour1.storage();
        TestFour1.storey();
        TestFour1.stretch();
        TestFour1.stripe();
        TestFour1.summarize();
        TestFour1.switch_();
        TestFour1.suppose();
        TestFour1.stoop();
        TestFour1.stress();
        TestFour1.surrender();
        TestFour1.strain();
        TestFour1.centigrade();
        TestFour1.near();
        TestFour1.nearly();
        TestFour1.neat();
        TestFour1.necessity();
        TestFour1.charming();
        TestFour1.champion();
        TestFour1.sympathize();
        TestFour1.tame();
        TestFour1.necklace();
        TestFour1.need();
        TestFour1.needle();
        TestFour1.chemistry();
        TestFour1.needless();
        TestFour1.necessary();
        TestFour1.geography();
        TestFour1.geometry();
        TestFour1.chapter();
        TestFour1.knock();
        TestFour1.cellar();
        TestFour1.chart();
        TestFour1.chemist();
        TestFour1.neck();
        TestFour1.certain();
        TestFour1.cement();
        TestFour1.chess();
        TestFour1.centre();
        TestFour1.cheek();
        TestFour1.charity();
        TestFour1.nearby();
        TestFour1.neglect();
        TestFour1.ceremony();
        TestFour1.cherry();
        TestFour1.knot();
        TestFour1.certainly();
        TestFour1.talk();
        TestFour1.cent();
        TestFour1.chalk();
        TestFour1.central();
        TestFour1.celebrate();
        TestFour1.change();
        TestFour1.charge();
        TestFour1.chase();
        TestFour1.chairman();
        TestFour1.character();
        TestFour1.centimetre();
        TestFour1.challenge();
        TestFour1.tailor();
        TestFour1.tale();
        TestFour1.chair();
        TestFour1.cheap();
        TestFour1.cheat();
        TestFour1.cheer();
        TestFour1.cheerful();
        TestFour1.chemical();
        TestFour1.chamber();
        TestFour1.cell();
        TestFour1.chance();
        TestFour1.cheese();
        TestFour1.century();
        TestFour1.talent();
        TestFour1.cheque();
        TestFour1.knob();
        TestFour1.genuine();
        TestFour1.lamp();
        TestFour1.lap();
        TestFour1.lab();
        TestFour1.lamb();
        TestFour1.lame();
        TestFour1.laugh();
        TestFour1.lately();
        TestFour1.launch();
        TestFour1.lawn();
        TestFour1.landing();
        TestFour1.laundry();
        TestFour1.lag();
        TestFour1.lavatory();
        TestFour1.know();
        TestFour1.law();
        TestFour1.lead();
        TestFour1.laughter();
        TestFour1.latter();
        TestFour1.leader();
        TestFour1.landlady();
        TestFour1.landlord();
        TestFour1.lantern();
        TestFour1.lawyer();
        TestFour1.lack();
        TestFour1.lake();
        TestFour1.late();
        TestFour1.large();
        TestFour1.lay();
        TestFour1.ladder();
        TestFour1.land();
        TestFour1.largely();
        TestFour1.lane();
        TestFour1.lace();
        TestFour1.laser();
        TestFour1.labour();
        TestFour1.lady();
        TestFour1.knowledge();
        TestFour1.later();
        TestFour1.Latin();
        TestFour1.laboratory();
        TestFour2.loyalty();
        TestFour2.lung();
        TestFour2.magazine();
        TestFour2.lover();
        TestFour2.lord();
        TestFour2.giant();
        TestFour2.loyal();
        TestFour2.gift();
        TestFour2.girl();
        TestFour2.give();
        TestFour2.locomotive();
        TestFour2.glance();
        TestFour2.lonely();
        TestFour2.lucky();
        TestFour2.liver();
        TestFour2.ghost();
        TestFour2.glide();
        TestFour2.glare();
        TestFour2.glitter();
        TestFour2.love();
        TestFour2.Germany();
        TestFour2.loaf();
        TestFour2.logic();
        TestFour2.loose();
        TestFour2.glimpse();
        TestFour2.globe();
        TestFour2.gloomy();
        TestFour2.glorious();
        TestFour2.glory();
        TestFour2.lumber();
        TestFour2.luggage();
        TestFour2.lunch();
        TestFour2.madam();
        TestFour2.glove();
        TestFour2.loan();
        TestFour2.luxury();
        TestFour2.glow();
        TestFour2.lot();
        TestFour2.germ();
        TestFour2.locate();
        TestFour2.lovely();
        TestFour2.machine();
        TestFour2.lodge();
        TestFour2.glue();
        TestFour2.living();
        TestFour2.mad();
        TestFour2.loud();
        TestFour2.luck();
        TestFour2.German();
        TestFour2.lump();
        TestFour2.gesture();
        TestFour2.glass();
        TestFour2.loss();
        TestFour2.goal();
        TestFour2.long_();
        TestFour2.lose();
        TestFour2.goat();
        TestFour2.God();
        TestFour2.look();
        TestFour2.loosen();
        TestFour2.glad();
        TestFour2.gold();
        TestFour2.logical();
        TestFour2.lorry();
        TestFour1.less();
        TestFour1.learning();
        TestFour1.childhood();
        TestFour1.learn();
        TestFour1.letter();
        TestFour1.lever();
        TestFour1.leadership();
        TestFour1.leak();
        TestFour1.chest();
        TestFour1.chin();
        TestFour1.license();
        TestFour1.league();
        TestFour1.lean();
        TestFour1.liberation();
        TestFour1.leather();
        TestFour1.lick();
        TestFour1.life();
        TestFour1.light();
        TestFour1.lifetime();
        TestFour1.childish();
        TestFour1.Chinese();
        TestFour1.liberty();
        TestFour1.learned();
        TestFour1.liberate();
        TestFour1.tank();
        TestFour1.leaf();
        TestFour1.taste();
        TestFour1.least();
        TestFour1.legend();
        TestFour1.leave();
        TestFour1.lend();
        TestFour1.lens();
        TestFour1.librarian();
        TestFour1.chill();
        TestFour1.liberal();
        TestFour1.chew();
        TestFour1.chimney();
        TestFour1.China();
        TestFour1.tap();
        TestFour1.technical();
        TestFour1.technician();
        TestFour1.telegram();
        TestFour1.lid();
        TestFour1.chicken();
        TestFour1.library();
        TestFour1.lie();
        TestFour1.leisure();
        TestFour1.let();
        TestFour1.liable();
        TestFour1.lessen();
        TestFour1.liar();
        TestFour1.chief();
        TestFour1.tedious();
        TestFour1.lesson();
        TestFour1.lest();
        TestFour1.telescope();
        TestFour1.lighten();
        TestFour1.lemon();
        TestFour1.lift();
        TestFour1.lightly();
        TestFour1.lecture();
        TestFour1.lieutenant();
        TestFour1.legal();
        TestFour1.leading();
        TestFour2.secretary();
        TestFour2.secure();
        TestFour2.seize();
        TestFour2.senate();
        TestFour2.educate();
        TestFour2.education();
        TestFour1.temple();
        TestFour2.senior();
        TestFour2.sensible();
        TestFour2.sensitive();
        TestFour2.scout();
        TestFour1.drum();
        TestFour1.dull();
        TestFour1.dwelling();
        TestFour1.due();
        TestFour1.dye();
        TestFour1.dry();
        TestFour1.dying();
        TestFour1.drown();
        TestFour1.duty();
        TestFour1.eager();
        TestFour1.durable();
        TestFour1.early();
        TestFour1.tempt();
        TestFour1.dusk();
        TestFour2.earthquake();
        TestFour2.easily();
        TestFour1.dumb();
        TestFour2.eat();
        TestFour2.echo();
        TestFour1.eagle();
        TestFour1.earn();
        TestFour2.earnest();
        TestFour2.ease();
        TestFour2.efficient();
        TestFour2.effort();
        TestFour2.earth();
        TestFour1.drug();
        TestFour2.east();
        TestFour1.temporary();
        TestFour1.during();
        TestFour2.egg();
        TestFour2.eight();
        TestFour2.eighteen();
        TestFour2.eighth();
        TestFour1.temptation();
        TestFour2.eastern();
        TestFour2.edition();
        TestFour2.effect();
        TestFour2.economical();
        TestFour1.dust();
        TestFour1.ear();
        TestFour2.efficiency();
        TestFour2.economy();
        TestFour2.edge();
        TestFour2.scrape();
        TestFour1.drunk();
        TestFour2.easy();
        TestFour2.scratch();
        TestFour1.duck();
        TestFour2.screw();
        TestFour2.seal();
        TestFour2.secondary();
        TestFour2.economic();
        TestFour2.slope();
        TestFour2.sometime();
        TestFour2.somewhat();
        TestFour2.sheet();
        TestFour2.sore();
        TestFour2.soluble();
        TestFour2.shoot();
        TestFour2.sorrow();
        TestFour2.sound();
        TestFour2.somebody();
        TestFour2.shade();
        TestFour2.shave();
        TestFour2.shriek();
        TestFour2.silence();
        TestFour2.simplicity();
        TestFour2.simplify();
        TestFour2.serve();
        TestFour2.simply();
        TestFour2.shed();
        TestFour2.shot();
        TestFour2.similarly();
        TestFour2.silk();
        TestFour2.sincere();
        TestFour2.shortage();
        TestFour2.silver();
        TestFour2.skilled();
        TestFour2.sleeve();
        TestFour2.silent();
        TestFour2.slide();
        TestFour2.soak();
        TestFour2.singular();
        TestFour2.setting();
        TestFour2.shelf();
        TestFour2.skillful();
        TestFour2.settle();
        TestFour2.shear();
        TestFour2.sew();
        TestFour2.shower();
        TestFour2.skim();
        TestFour2.shore();
        TestFour2.silly();
        TestFour2.slam();
        TestFour2.slender();
        TestFour2.slippery();
        TestFour2.slit();
        TestFour2.shortly();
        TestFour2.separate();
        TestFour2.shelter();
        TestFour2.smart();
        TestFour2.shiver();
        TestFour2.similar();
        TestFour2.sketch();
        TestFour2.solemn();
        TestFour2.solar();
        TestFour2.sole();
        TestFour2.solution();
        TestFour2.sideways();
        TestFour2.series();
        TestFour2.solve();
        TestFour2.somehow();
        TestFour2.soil();
        TestFour2.settlement();
        TestFour2.shield();
        TestFour2.solid();
        TestFour2.class_();
        TestFour2.sow();
        TestFour2.closely();
        TestFour2.clothing();
        TestFour2.spray();
        TestFour2.church();
        TestFour2.specific();
        TestFour2.circulate();
        TestFour2.cloak();
        TestFour2.spoil();
        TestFour2.sour();
        TestFour2.sponsor();
        TestFour2.Christian();
        TestFour2.circuit();
        TestFour2.specialist();
        TestFour2.circular();
        TestFour2.cloud();
        TestFour2.clothe();
        TestFour2.choke();
        TestFour2.clap();
        TestFour2.spacecraft();
        TestFour2.specialize();
        TestFour2.club();
        TestFour2.claw();
        TestFour2.clarify();
        TestFour2.clue();
        TestFour2.classify();
        TestFour2.Christmas();
        TestFour2.cloudy();
        TestFour2.sportsman();
        TestFour2.clumsy();
        TestFour2.classroom();
        TestFour2.spite();
        TestFour2.chocolate();
        TestFour2.cinema();
        TestFour2.sphere();
        TestFour2.spin();
        TestFour2.chop();
        TestFour2.civil();
        TestFour2.civilize();
        TestFour2.clasp();
        TestFour2.clay();
        TestFour2.cigaret();
        TestFour2.clever();
        TestFour2.spade();
        TestFour2.specimen();
        TestFour2.classical();
        TestFour2.choose();
        TestFour2.citizen();
        TestFour2.clearly();
        TestFour2.clerk();
        TestFour2.cliff();
        TestFour2.climate();
        TestFour2.cloth();
        TestFour2.clothes();
        TestFour2.climb();
        TestFour2.claim();
        TestFour2.spark();
        TestFour2.circle();
        TestFour2.specify();
        TestFour2.city();
        TestFour2.spill();
        TestFour2.classmate();
        TestFour2.span();
        TestFour2.lip();
        TestFour2.liquid();
        TestFour2.liquor();
        TestFour2.limitation();
        TestFour2.literature();
        TestFour2.lively();
        TestFour2.lime();
        TestFour2.lightning();
        TestFour2.lion();
        TestFour2.liner();
        TestFour2.coach();
        TestFour2.likely();
        TestFour2.coal();
        TestFour2.like();
        TestFour2.limb();
        TestFour2.literary();
        TestFour2.live();
        TestFour2.likewise();
        TestFour2.linen();
        TestFour7.example();
        TestFour8.computer();
        TestFour3.contemporary();
        TestFour1.characteristic();
        TestFour3.granddaughter();
        TestFour4.transformation();
        TestFour2.civilization();
        TestFour11.theoretical();
        TestFour2.sophisticated();
        TestFour1.statistical();
        TestFour1.nationality();
        TestFour1.superficial();
        TestFour1.sympathetic();
        TestFour2.sightseeing();
        TestFour2.significant();
        TestFour3.maintenance();
        TestFour11.thermometer();
        TestFour2.nevertheless();
        TestFour3.constitution();
        TestFour4.transmission();
        TestFour4.transparent();
        TestFour4.troublesome();
        TestFour4.transportation();
        TestFour4.unconscious();
        TestFour4.undergraduate();
        TestFour4.undoubtedly();
        TestFour4.radioactive();
        TestFour4.recognition();
        TestFour1.substantial();
        TestFour1.surroundings();
        TestFour1.necessarily();
        TestFour2.classification();
        TestFour2.neighbourhood();
        TestFour3.grammatical();
        TestFour3.grandfather();
        TestFour3.grandmother();
        TestFour1.certificate();
        TestFour2.circumstance();
        TestFour3.magnificent();
        TestFour3.manufacture();
        TestFour3.masterpiece();
        TestFour3.calculation();
        TestFour2.loudspeaker();
        TestFour3.construction();
        TestFour2.semiconductor();
        TestFour1.systematical();
        TestFour2.significance();
        TestFour2.circumference();
        TestFour3.manufacturer();
        TestFour3.consumption();
        TestFour7.intellectual();
        TestFour4.electricity();
        TestFour5.preposition();
        TestFour5.professional();
        TestFour5.pronunciation();
        TestFour7.interaction();
        TestFour7.interference();
        TestFour5.practically();
        TestFour4.respectively();
        TestFour6.materialism();
        TestFour6.installation();
        TestFour7.instruction();
        TestFour7.international();
        TestFour7.interpretation();
        TestFour5.probability();
        TestFour5.publication();
        TestFour5.preliminary();
        TestFour5.convenience();
        TestFour6.furthermore();
        TestFour7.interpreter();
        TestFour5.corporation();
        TestFour4.engineering();
        TestFour7.insufficient();
        TestFour4.recommendation();
        TestFour5.correspondent();
        TestFour5.progressive();
        TestFour6.fortunately();
        TestFour7.introduction();
        TestFour7.intentional();
        TestFour7.investigate();
        TestFour4.elimination();
        TestFour7.intelligence();
        TestFour5.preparation();
        TestFour5.pessimistic();
        TestFour5.conventional();
        TestFour4.relationship();
        TestFour6.headquarters();
        TestFour4.refrigerator();
        TestFour6.mathematical();
        TestFour5.proportional();
        TestFour6.measurement();
        TestFour6.institution();
        TestFour5.philosopher();
        TestFour6.mathematics();
        TestFour5.contradiction();
        TestFour4.revolutionary();
        TestFour4.representative();
        TestFour4.reliability();
        TestFour5.satisfactory();
        TestFour5.corresponding();
        TestFour5.handkerchief();
        TestFour4.electronics();
        TestFour8.concentrate();
        TestFour8.complicated();
        TestFour8.composition();
        TestFour8.congratulate();
        TestFour8.consciousness();
        TestFour8.perspective();
        TestFour8.communicate();
        TestFour8.conservation();
        TestFour7.enthusiastic();
        TestFour8.comprehensive();
        TestFour8.conservative();
        TestFour7.participate();
        TestFour8.conjunction();
        TestFour7.exceedingly();
        TestFour7.possibility();
        TestFour9.approximate();
        TestFour9.approximately();
        TestFour8.consequence();
        TestFour9.architecture();
        TestFour9.acceleration();
        TestFour8.operational();
        TestFour8.consideration();
        TestFour9.accommodation();
        TestFour7.investigation();
        TestFour7.experimental();
        TestFour8.opportunity();
        TestFour8.communication();
        TestFour8.concentration();
        TestFour8.consequently();
        TestFour8.considerate();
        TestFour9.alternative();
        TestFour9.appropriate();
        TestFour9.accommodate();
        TestFour8.considerable();
        TestFour9.accordingly();
        TestFour9.achievement();
        TestFour9.acquaintance();
        TestFour8.atmospheric();
        TestFour7.exclusively();
        TestFour7.combination();
        TestFour6.honest();
        TestFour6.herd();
        TestFour6.honey();
        TestFour6.honour();
        TestFour6.honourable();
        TestFour6.hopeful();
        TestFour6.hope();
        TestFour6.hire();
        TestFour6.honesty();
        TestFour6.horn();
        TestFour6.hence();
        TestFour6.healthy();
        TestFour6.honeymoon();
        TestFour6.hedge();
        TestFour6.heroic();
        TestFour6.hopeless();
        TestFour6.heavy();
        TestFour6.horror();
        TestFour6.heel();
        TestFour6.headline();
        TestFour6.hear();
        TestFour6.hell();
        TestFour6.heating();
        TestFour6.hesitate();
        TestFour6.heat();
        TestFour6.heir();
        TestFour6.holy();
        TestFour6.helmet();
        TestFour6.heal();
        TestFour6.helpless();
        TestFour6.heavily();
        TestFour6.hillside();
        TestFour6.hobby();
        TestFour5.probably();
        TestFour5.prior();
        TestFour5.primary();
        TestFour5.proceed();
        TestFour5.prescribe();
        TestFour5.prize();
        TestFour5.procedure();
        TestFour5.profession();
        TestFour5.prefer();
        TestFour5.principle();
        TestFour5.promote();
        TestFour5.prompt();
        TestFour5.pronounce();
        TestFour5.proportion();
        TestFour5.proposal();
        TestFour5.procession();
        TestFour5.preferable();
        TestFour5.prospect();
        TestFour5.pretty();
        TestFour5.primarily();
        TestFour5.proof();
        TestFour5.prevent();
        TestFour5.prohibit();
        TestFour5.prominent();
        TestFour5.primitive();
        TestFour5.pronoun();
        TestFour5.propose();
        TestFour5.prosperous();
        TestFour5.pride();
        TestFour5.prince();
        TestFour5.preference();
        TestFour5.presently();
        TestFour5.principal();
        TestFour5.pretend();
        TestFour5.probable();
        TestFour5.proper();
        TestFour5.prosperity();
        TestFour5.protest();
        TestFour5.prejudice();
        TestFour5.protein();
        TestFour5.provide();
        TestFour5.provided();
        TestFour5.proud();
        TestFour5.privilege();
        TestFour5.prevail();
        TestFour5.presence();
        TestFour5.pet();
        TestFour5.pillar();
        TestFour5.pine();
        TestFour5.physician();
        TestFour5.picnic();
        TestFour5.pulse();
        TestFour5.punch();
        TestFour5.pie();
        TestFour5.phrase();
        TestFour5.purpose();
        TestFour5.pile();
        TestFour5.petroleum();
        TestFour5.pursue();
        TestFour5.pilot();
        TestFour5.pinch();
        TestFour5.pity();
        TestFour5.punctual();
        TestFour5.purchase();
        TestFour5.purse();
        TestFour5.purple();
        TestFour5.provision();
        TestFour5.pioneer();
        TestFour5.pit();
        TestFour5.pitch();
        TestFour5.pill();
        TestFour5.pint();
        TestFour5.punish();
        TestFour5.pierce();
        TestFour5.plantation();
        TestFour5.philosophy();
        TestFour5.plastic();
        TestFour5.plate();
        TestFour5.pillow();
        TestFour5.play();
        TestFour5.phenomenon();
        TestFour5.correction();
        TestFour5.convention();
        TestFour5.correspond();
        TestFour5.conversely();
        TestFour5.contrary();
        TestFour5.corridor();
        TestFour5.cottage();
        TestFour5.plenty();
        TestFour5.costly();
        TestFour5.could();
        TestFour5.council();
        TestFour5.convey();
        TestFour5.cordial();
        TestFour5.political();
        TestFour5.county();
        TestFour5.cooperate();
        TestFour5.court();
        TestFour5.cousin();
        TestFour5.polite();
        TestFour5.politician();
        TestFour5.plural();
        TestFour5.poison();
        TestFour5.plentiful();
        TestFour5.pleasure();
        TestFour5.pond();
        TestFour5.contribute();
        TestFour5.convenient();
        TestFour5.plough();
        TestFour5.politics();
        TestFour5.pollute();
        TestFour5.convince();
        TestFour5.plot();
        TestFour5.coordinate();
        TestFour5.contrast();
        TestFour5.cope();
        TestFour5.polish();
        TestFour5.plunge();
        TestFour5.cord();
        TestFour5.corn();
        TestFour5.cultivate();
        TestFour5.crop();
        TestFour5.creative();
        TestFour5.crush();
        TestFour5.creature();
        TestFour5.crust();
        TestFour5.cube();
        TestFour5.cunning();
        TestFour5.crack();
        TestFour5.crew();
        TestFour5.curiosity();
        TestFour5.craft();
        TestFour5.crude();
        TestFour5.cubic();
        TestFour5.crowd();
        TestFour5.inquiry();
        TestFour5.insect();
        TestFour5.inside();
        TestFour5.cupboard();
        TestFour5.crane();
        TestFour5.crime();
        TestFour5.cricket();
        TestFour5.cripple();
        TestFour5.criticize();
        TestFour5.handful();
        TestFour5.critic();
        TestFour5.handsome();
        TestFour5.handy();
        TestFour5.coward();
        TestFour5.cream();
        TestFour5.happiness();
        TestFour5.criticism();
        TestFour5.crown();
        TestFour5.criminal();
        TestFour5.harden();
        TestFour5.crawl();
        TestFour5.hardship();
        TestFour6.hare();
        TestFour6.harm();
        TestFour5.crisis();
        TestFour6.hazard();
        TestFour6.headache();
        TestFour6.heading();
        TestFour6.harsh();
        TestFour6.hasty();
        TestFour6.hat();
        TestFour6.harness();
        TestFour6.harvest();
        TestFour6.haste();
        TestFour6.hatred();
        TestFour6.harmony();
        TestFour6.hatch();
        TestFour6.hasten();
        TestFour6.harmful();
        TestFour6.hay();
        TestFour6.hawk();
        TestFour4.unexpected();
        TestFour10.fatal();
        TestFour11.diverse();
        TestFour11.dose();
        TestFour11.desire();
        TestFour11.doubt();
        TestFour11.domestic();
        TestFour11.despite();
        TestFour11.doubtful();
        TestFour11.doubtless();
        TestFour11.dorm();
        TestFour11.desert();
        TestFour11.deserve();
        TestFour11.ought();
        TestFour11.disgust();
        TestFour11.disguise();
        TestFour11.displease();
        TestFour11.dependent();
        TestFour11.desirable();
        TestFour11.orphan();
        TestFour11.disorder();
        TestFour11.dishonour();
        TestFour11.disposal();
        TestFour11.oriental();
        TestFour11.dislike();
        TestFour11.dispute();
        TestFour11.dissatisfy();
        TestFour11.dish();
        TestFour11.disturb();
        TestFour11.divorce();
        TestFour11.dissolve();
        TestFour11.deposit();
        TestFour11.distress();
        TestFour11.depress();
        TestFour11.descend();
        TestFour11.otherwise();
        TestFour11.distribute();
        TestFour11.district();
        TestFour11.ditch();
        TestFour11.division();
        TestFour11.ornament();
        TestFour11.departure();
        TestFour11.despair();
        TestFour11.despise();
        TestFour11.dismiss();
        TestFour11.distant();
        TestFour11.dock();
        TestFour11.ounce();
        TestFour11.depend();
        TestFour11.dormitory();
        TestFour11.derive();
        TestFour11.desperate();
        TestFour9.beginning();
        TestFour9.bend();
        TestFour9.beneath();
        TestFour9.beneficial();
        TestFour9.benefit();
        TestFour9.berry();
        TestFour8.baggage();
        TestFour8.bang();
        TestFour9.bat();
        TestFour8.bare();
        TestFour9.bay();
        TestFour9.beam();
        TestFour8.ball();
        TestFour9.beginner();
        TestFour9.behalf();
        TestFour8.balloon();
        TestFour9.bath();
        TestFour9.beard();
        TestFour9.bathe();
        TestFour8.basically();
        TestFour8.bake();
        TestFour8.basin();
        TestFour9.beast();
        TestFour9.believe();
        TestFour9.bell();
        TestFour9.belong();
        TestFour9.beloved();
        TestFour9.belt();
        TestFour8.barn();
        TestFour8.barrel();
        TestFour8.bargain();
        TestFour9.beat();
        TestFour9.better();
        TestFour9.blanket();
        TestFour9.bleed();
        TestFour9.bowl();
        TestFour9.bomb();
        TestFour9.bloom();
        TestFour9.bosom();
        TestFour9.biscuit();
        TestFour9.blade();
        TestFour9.bite();
        TestFour9.blind();
        TestFour9.boil();
        TestFour9.bold();
        TestFour9.blast();
        TestFour9.bore();
        TestFour9.bough();
        TestFour9.bolt();
        TestFour9.besides();
        TestFour9.boat();
        TestFour9.bond();
        TestFour9.bitter();
        TestFour9.bet();
        TestFour9.bitterly();
        TestFour9.beyond();
        TestFour9.betray();
        TestFour9.boast();
        TestFour9.booth();
        TestFour9.bother();
        TestFour9.blaze();
        TestFour9.blow();
        TestFour9.boundary();
        TestFour9.brake();
        TestFour9.blame();
        TestFour9.bike();
        TestFour9.bounce();
        TestFour9.brand();
        TestFour9.blossom();
        TestFour9.biology();
        TestFour9.alphabet();
        TestFour9.annoy();
        TestFour9.alter();
        TestFour9.alloy();
        TestFour9.anxiety();
        TestFour9.American();
        TestFour9.anticipate();
        TestFour9.anxious();
        TestFour9.brandy();
        TestFour9.America();
        TestFour9.breathe();
        TestFour9.brass();
        TestFour9.ampere();
        TestFour9.aluminium();
        TestFour9.analysis();
        TestFour9.amongst();
        TestFour9.breed();
        TestFour9.brief();
        TestFour9.brave();
        TestFour9.alone();
        TestFour9.altitude();
        TestFour9.altogether();
        TestFour9.bridge();
        TestFour9.aloud();
        TestFour9.breadth();
        TestFour9.breeze();
        TestFour9.bright();
        TestFour9.amaze();
        TestFour9.anger();
        TestFour9.alike();
        TestFour9.analyse();
        TestFour9.almost();
        TestFour9.ambition();
        TestFour9.breast();
        TestFour9.amplify();
        TestFour9.among();
        TestFour9.amuse();
        TestFour9.aside();
        TestFour9.aspect();
        TestFour9.appeal();
        TestFour9.arbitrary();
        TestFour9.artistic();
        TestFour9.above();
        TestFour9.absent();
        TestFour9.appetite();
        TestFour9.absolutely();
        TestFour9.abundant();
        TestFour9.academic();
        TestFour9.apology();
        TestFour9.assemble();
        TestFour9.absence();
        TestFour9.arrest();
        TestFour9.arise();
        TestFour9.abstract_();
        TestFour9.arouse();
        TestFour9.abnormal();
        TestFour9.asleep();
        TestFour9.appliance();
        TestFour9.absorb();
        TestFour9.academy();
        TestFour9.arrival();
        TestFour9.Arabian();
        TestFour9.arithmetic();
        TestFour9.appreciate();
        TestFour9.apparatus();
        TestFour9.ashamed();
        TestFour9.apartment();
        TestFour9.approve();
        TestFour9.applicable();
        TestFour9.arrow();
        TestFour9.approval();
        TestFour9.apologize();
        TestFour9.ability();
        TestFour9.able();
        TestFour9.adequate();
        TestFour9.adverb();
        TestFour9.accumulate();
        TestFour9.acre();
        TestFour9.advisable();
        TestFour9.afford();
        TestFour9.afraid();
        TestFour9.ache();
        TestFour9.accord();
        TestFour9.acceptable();
        TestFour9.adventure();
        TestFour9.African();
        TestFour9.advanced();
        TestFour9.accessary();
        TestFour9.accompany();
        TestFour9.affection();
        TestFour9.accuracy();
        TestFour9.Africa();
        TestFour9.aeroplane();
        TestFour9.actually();
        TestFour9.admission();
        TestFour9.accident();
        TestFour9.adjective();
        TestFour9.accustomed();
        TestFour9.accidental();
        TestFour9.accent();
        TestFour9.agency();
        TestFour10.agent();
        TestFour9.acceptance();
        TestFour9.achieve();
        TestFour9.activity();
        TestFour9.acute();
        TestFour9.affair();
        TestFour10.aggressive();
        TestFour10.agony();
        TestFour9.accordance();
        TestFour9.accelerate();
        TestFour10.ago();
        TestFour9.accustom();
        TestFour9.accomplish();
        TestFour10.imaginary();
        TestFour10.aid();
        TestFour10.hurry();
        TestFour10.illness();
        TestFour10.imply();
        TestFour10.imagine();
        TestFour10.incident();
        TestFour10.hostile();
        TestFour10.hunger();
        TestFour10.idiom();
        TestFour10.hostess();
        TestFour10.household();
        TestFour10.illustrate();
        TestFour10.importance();
        TestFour10.ideal();
        TestFour10.hurt();
        TestFour10.ignorant();
        TestFour10.immigrant();
        TestFour10.imitate();
        TestFour10.humble();
        TestFour10.hut();
        TestFour10.important();
        TestFour10.impose();
        TestFour10.impossible();
        TestFour10.impress();
        TestFour10.impression();
        TestFour10.impressive();
        TestFour10.imprison();
        TestFour10.hungry();
        TestFour10.humid();
        TestFour10.hydrogen();
        TestFour10.identical();
        TestFour10.faith();
        TestFour10.fame();
        TestFour10.fearful();
        TestFour10.favourable();
        TestFour10.faculty();
        TestFour10.Fahrenheit();
        TestFour10.famine();
        TestFour10.fault();
        TestFour10.feather();
        TestFour10.indeed();
        TestFour10.faithful();
        TestFour10.indication();
        TestFour10.feasible();
        TestFour10.faulty();
        TestFour10.miner();
        TestFour10.mineral();
        TestFour10.indefinite();
        TestFour10.incorrect();
        TestFour10.increase();
        TestFour10.fasten();
        TestFour10.facility();
        TestFour10.fare();
        TestFour10.factor();
        TestFour10.indicate();
        TestFour10.fatigue();
        TestFour10.minimum();
        TestFour10.minority();
        TestFour10.feast();
        TestFour10.ministry();
        TestFour10.miracle();
        TestFour10.incline();
        TestFour10.faint();
        TestFour10.indignant();
        TestFour10.indirect();
        TestFour10.miserable();
        TestFour10.fear();
        TestFour10.familiar();
        TestFour10.favourite();
        TestFour10.farewell();
        TestFour10.missing();
        TestFour10.mixture();
        TestFour10.moan();
        TestFour10.fifth();
        TestFour10.mislead();
        TestFour10.mistress();
        TestFour10.fist();
        TestFour10.fit();
        TestFour10.mist();
        TestFour10.feeble();
        TestFour10.festival();
        TestFour10.flame();
        TestFour10.missile();
        TestFour10.flash();
        TestFour10.fertilizer();
        TestFour10.flare();
        TestFour10.mission();
        TestFour10.fetch();
        TestFour10.Mister();
        TestFour10.modest();
        TestFour10.modern();
        TestFour10.federal();
        TestFour10.fellow();
        TestFour10.fiction();
        TestFour10.fibre();
        TestFour10.moisture();
        TestFour10.mistake();
        TestFour10.molecule();
        TestFour10.fever();
        TestFour10.fierce();
        TestFour10.moist();
        TestFour10.moderate();
        TestFour10.fee();
        TestFour10.moment();
        TestFour10.fertile();
        TestFour10.injury();
        TestFour10.curtain();
        TestFour10.infer();
        TestFour10.injection();
        TestFour11.daring();
        TestFour11.dash();
        TestFour11.dawn();
        TestFour11.deaf();
        TestFour10.infect();
        TestFour10.flock();
        TestFour10.influence();
        TestFour10.inn();
        TestFour11.damage();
        TestFour10.inherit();
        TestFour10.dairy();
        TestFour10.fluent();
        TestFour10.inferior();
        TestFour11.damp();
        TestFour10.flesh();
        TestFour10.curious();
        TestFour10.curse();
        TestFour10.customer();
        TestFour10.flourish();
        TestFour10.curve();
        TestFour11.dark();
        TestFour10.inform();
        TestFour10.cycle();
        TestFour10.flight();
        TestFour10.flow();
        TestFour10.initial();
        TestFour10.flood();
        TestFour10.cushion();
        TestFour10.inhabit();
        TestFour10.curl();
        TestFour10.daily();
        TestFour11.dam();
        TestFour11.darling();
        TestFour10.infant();
        TestFour10.inhabitant();
        TestFour10.fleet();
        TestFour10.flexible();
        TestFour10.inevitable();
        TestFour10.flavour();
        TestFour11.debt();
        TestFour11.decrease();
        TestFour11.deduce();
        TestFour11.defect();
        TestFour11.delivery();
        TestFour11.dense();
        TestFour11.density();
        TestFour11.decay();
        TestFour11.decorate();
        TestFour11.define();
        TestFour11.definitely();
        TestFour11.delicate();
        TestFour11.defeat();
        TestFour11.defend();
        TestFour11.deepen();
        TestFour11.defence();
        TestFour11.definition();
        TestFour11.demand();
        TestFour11.democracy();
        TestFour11.deed();
        TestFour11.definite();
        TestFour11.delegation();
        TestFour11.delight();
        TestFour11.deliver();
        TestFour11.depart();
        TestFour11.deceive();
        TestFour11.decent();
        TestFour11.demonstrate();
        TestFour10.agriculture();
        TestFour10.implication();
        TestFour10.industrialize();
        TestFour11.destruction();
        TestFour11.distribution();
        TestFour11.distinction();
        TestFour10.misunderstand();
        TestFour10.fashionable();
        TestFour10.indispensable();
        TestFour11.distinguish();
        TestFour10.increasingly();
        TestFour10.illustration();
        TestFour10.influential();
        TestFour11.dew();
        TestFour11.drag();
        TestFour11.drawer();
        TestFour11.devise();
        TestFour11.dread();
        TestFour11.drop();
        TestFour11.devote();
        TestFour11.drawing();
        TestFour8.assembly();
        TestFour8.conscience();
        TestFour8.associate();
        TestFour8.attend();
        TestFour8.attention();
        TestFour8.attentive();
        TestFour8.attitude();
        TestFour8.attraction();
        TestFour8.conquest();
        TestFour8.attempt();
        TestFour8.auto();
        TestFour8.attractive();
        TestFour8.automation();
        TestFour8.automobile();
        TestFour8.confusion();
        TestFour8.attack();
        TestFour8.conscious();
        TestFour8.aural();
        TestFour8.autumn();
        TestFour8.congress();
        TestFour8.consent();
        TestFour8.auxiliary();
        TestFour8.aviation();
        TestFour8.Atlantic();
        TestFour8.awake();
        TestFour8.astonish();
        TestFour8.aware();
        TestFour8.assignment();
        TestFour8.astronaut();
        TestFour8.awkward();
        TestFour8.assess();
        TestFour8.axis();
        TestFour8.atomic();
        TestFour8.assume();
        TestFour8.assure();
        TestFour8.bacteria();
        TestFour8.badminton();
        TestFour8.bag();
        TestFour8.attract();
        TestFour8.award();
        TestFour8.confuse();
        TestFour6.mature();
        TestFour6.mention();
        TestFour6.maximum();
        TestFour6.medium();
        TestFour6.melon();
        TestFour6.mental();
        TestFour6.mercury();
        TestFour6.merchant();
        TestFour6.mercy();
        TestFour6.meadow();
        TestFour6.mere();
        TestFour6.mechanics();
        TestFour6.mend();
        TestFour6.merely();
        TestFour6.merry();
        TestFour6.meantime();
        TestFour6.measurable();
        TestFour6.metric();
        TestFour6.material();
        TestFour6.measure();
        TestFour6.microscope();
        TestFour6.midst();
        TestFour6.means();
        TestFour6.memorial();
        TestFour6.military();
        TestFour6.mild();
        TestFour6.mill();
        TestFour6.millimetre();
        TestFour6.mate();
        TestFour6.fruitful();
        TestFour6.fry();
        TestFour6.forecast();
        TestFour6.fortunate();
        TestFour6.fuel();
        TestFour6.foundation();
        TestFour6.fulfil();
        TestFour6.fun();
        TestFour6.fund();
        TestFour6.folk();
        TestFour6.formula();
        TestFour6.following();
        TestFour6.foolish();
        TestFour6.fortnight();
        TestFour6.fourth();
        TestFour6.frank();
        TestFour6.freight();
        TestFour6.frequent();
        TestFour6.fridge();
        TestFour6.fog();
        TestFour6.forever();
        TestFour6.forehead();
        TestFour6.formation();
        TestFour6.forth();
        TestFour6.fountain();
        TestFour6.frequently();
        TestFour6.frighten();
        TestFour6.fond();
        TestFour6.foreign();
        TestFour6.fold();
        TestFour6.foreigner();
        TestFour6.fortune();
        TestFour6.friction();
        TestFour6.frog();
        TestFour6.frost();
        TestFour6.frown();
        TestFour6.for_();
        TestFour6.foremost();
        TestFour6.forgive();
        TestFour6.forty();
        TestFour6.gasp();
        TestFour7.intention();
        TestFour7.insult();
        TestFour7.insurance();
        TestFour6.gallery();
        TestFour6.gap();
        TestFour6.gather();
        TestFour7.intend();
        TestFour6.institute();
        TestFour6.garage();
        TestFour6.gaseous();
        TestFour6.gauge();
        TestFour7.invisible();
        TestFour6.instantly();
        TestFour6.furnish();
        TestFour6.inspire();
        TestFour6.instinct();
        TestFour6.instruct();
        TestFour7.interpret();
        TestFour6.gasoline();
        TestFour7.intensity();
        TestFour7.interfere();
        TestFour7.intensive();
        TestFour7.introduce();
        TestFour6.furious();
        TestFour6.furnace();
        TestFour7.intense();

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir").concat("/doc/a4.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));


    }

    @Test
    public void main3() {
        List<String> integers = Arrays.asList("1, 2, 3".split(","));
    }


    @SneakyThrows
    @Test
    public void test2848() {
        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir").concat("/doc/a4.txt");


        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
        String line = null;
        List<JSONObject> jsonObjectList = new ArrayList<>();
        StringBuffer teBuff = null;
        StringBuffer peBuff = null;
        StringBuffer pcBuff = null;
        JSONObject json = null;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.contains("Lesson ")) {

                if (json == null) {
                    json = new JSONObject();
                } else {
                    json.put("pc", pcBuff);
                    pcBuff = null;
                    jsonObjectList.add(json);
                    json = new JSONObject();
                }
            }

            if (line.contains("Lesson ")) {
                teBuff = new StringBuffer();
            }

            if (line.contains("First listen")) {
                json.put("te", teBuff.toString());
                teBuff = null;
                peBuff = new StringBuffer();
            }

            if (line.contains("生词和短语")) {
                json.put("pe", peBuff.toString());
                peBuff = null;
            }

            if (line.contains("参考译文")) {
                pcBuff = new StringBuffer();
            }

            if (teBuff != null) {
                teBuff.append(line);
            }

            if (peBuff != null) {
                if (!line.contains("First listen") && !line.contains("听录音，")) {
                    if (!((line.startsWith("W") || line.startsWith("H")) && line.endsWith("?"))) {
                        peBuff.append(line);
                    }
                }

            }

            if (pcBuff != null) {
                pcBuff.append(line);
            }

        }


        for (int i = 1; i <= jsonObjectList.size(); i++) {

            JSONObject e = jsonObjectList.get(i - 1);

            String te = e.getString("te");
            //String tc = e.getString("tc");
            String pe = e.getString("pe");
            String pc = e.getString("pc");

            String aa = "/**\n" +
                    " * @te " + te + "\n" +
                    " * @pe " + pe + "\n" +
                    //      " * @tc "+tc+"\n" +
                    " * @pc " + pc + "\n" +
                    " */\n" +
                    "public static void lesson" + i + "(){};";
            log.info("\n");
            log.info(aa);
        }

    }

    @SneakyThrows
    @Test
    public void methodListFour() {

        List<Method> methods = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            Class<?> aClass = Class.forName("com.words.TestFour" + i);
            methods.addAll(Arrays.asList(aClass.getDeclaredMethods()));
        }

        Map<String, Method> methodMap = methods.stream().collect(Collectors.toMap(Method::getName, e -> e));

        String filePath = System.getProperty("user.dir").concat("/doc/a3");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {

            try {

                String substring = line.substring(line.indexOf(".") + 1, line.indexOf("("));
                Method method = methodMap.get(substring);
                if (method != null) {
                    log.info(method.getDeclaringClass().getSimpleName() + "." + method.getName() + "();");
                }
                // As the water dripped from my balcony and accumulated into free-flowing rivers on the road beneath, I was reminded of the extreme weather that affected the residents of North America. (5 minutes ago)
            } catch (StringIndexOutOfBoundsException e) {

            }

        }
    }


    @SneakyThrows
    public static void main(String[] args) {
        int a = 3;
        System.out.println(65 & 64);
        System.out.println(0 & 1);
        System.out.println(0 & 2);
        System.out.println(0 & 3);

        System.out.println(String.format("%05d", 123456));

        String aa = "f0b8011fd18948ce963c9b2c5f498546.docx";
        String string = new StringBuffer(aa).insert(aa.lastIndexOf("."), "-copy-read").toString();
        System.out.println(string);

        List<String> list = Arrays.asList("111101", "000102", "001103", "101104", "105");
        list.sort(String::compareTo);
        for (String s : list) {
            System.out.println(s);
        }

        CountDownLatch latch = new CountDownLatch(1);


        new Thread(() -> {
            try {
                FileInputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\slicing (3).log");
                System.out.println("文件大小" + inputStream.available());
                latch.countDown();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
        String replace = StrUtil.replace("111122223333", 4, 8, "8888");
        System.out.println(replace);
        System.out.println("111122223333".substring(8));
    }


    @Test
    public void main2() {
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Map<String, String> map1 = new HashMap<>();

    CountDownLatch latch = new CountDownLatch(3);

    @Test
    public void main5() throws InterruptedException {

        map1.put("A", "A");
        map1.put("B", "B");
        map1.put("C", "C");

        new Thread(() -> {


            Set<String> keys = map1.keySet();

            log.info("读取元素，当前key.size=" + keys.size());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (String aaa : keys) {
                log.info(map1.get(aaa));
            }

            latch.countDown();

            log.info("读取完毕");

        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map1.remove("A");
            latch.countDown();
            log.info("删除元素");
        }).start();

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                map1.put(Integer.toString(finalI), Integer.toString(finalI));
            }).start();
        }

        latch.await();
        ;

    }

    @Test
    public void main6() throws InterruptedException {

        // 初始化数据
        for (int i = 0; i < 100; i++) {
            map1.put(Integer.toString(i), "Value-" + i);
        }

        // 线程1：遍历读取
        Thread reader = new Thread(() -> {
            try {
                Set<Map.Entry<String, String>> entries = map1.entrySet();
                for (Map.Entry<String, String> entry : entries) {
                    System.out.println("Read: " + entry.getKey() + " -> " + entry.getValue());
                    Thread.sleep(10); // 故意加点延迟，制造并发
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // 线程2：删除
        Thread remover = new Thread(() -> {
            // 通过输入主要食材给出推荐菜品及其制作步骤，在推荐会时结合用户年龄，地区等信息推荐符合用户的菜品
            // 通过输入菜品名称给出菜品的主要食材及其制作步骤
            // 管理员可以对大模型给出的菜品制作步骤进行二次编辑，例如补充制作细节，添加配图等，用户搜索菜品时将优先检索本地数据库
            // 管理员可以维护食材、菜品、菜品照片、菜品制作步骤，菜品营养成分，食材与菜品关系，食材与菜品照片关系，食材与菜品制作步骤关系
            // 管理员可以维护人体每日所需营养成分标准，如膳食指南标准所需的各类食物标准
            // 管理员可以维护用户信息，查看用户用餐记录
            // 食材与菜品之间的关系，食材、菜品与菜品照片的关系，食材、菜品与制作步骤的关系，食材、菜品与营养成分的关系，
            // 提供用户注册登录功能，允许用户维护个人信息，如年龄，所在地区系统可根据用户信息因地制宜的推荐当地常见食材及菜品
            // 用户可以维护自身健康信息，如月经状况、基础疾病，系统再推荐菜品时会避免用户服用相关食物
            // 如果用户确认某个菜品则将其记录到用户的一餐选择中，
            // 通过大模型分析用户近几次的用餐，并结合中国居民膳食指南，给出下一次用餐推荐，为用户提供合理健康的饮食
            // 用户可根据大模型给出的制作步骤上传自己的制作菜品的过程以及成品图，管理员可对用户分享的图片加精处理
            // 系统要确保系统的回答宁缺毋滥，宁可少而精，也不贪多求全
            // 文献综述-研究背景：对于饮食与健康的思考，X年以前人们的认识和实践，现代人的认识和实践，
            // 文献综述-课题现状：基于上述的背景，带着X的问题，现代人做出了那些活动（UGC，PGC），这些活动又解决那些问题，带来了那些好处，同时又产生了那些坏处
            // 文献综述-发展趋势：为了解决这些从活动中带来的坏处，现存的解决方案，以及当前科技发展又带来了那些潜在的解决思路（AIGC）
            // 主要研究-内容：顺着这样的背景，基于现存的解决方案，利用新的手段去落实潜在的解决方案。新的解决方案有哪些问题，怎么克服这些问题
            // 主要研究-方法：解决方案的落实步骤，1从现有数据的收集开始，2分析提炼这些数据得到预处理数据，3存储这些预处理数据，4收集用户的个性化信息（饮食与状况），5将用户信息与预处理数据结合交由大模型分析，6将分析结果呈现给用户，7对用户的数据再次收集使分析结果更加准确（评论与用餐记录）
            // 主要研究-预期：基于以上的步骤，对比现存解决方案，系统解决了那些问题，带来了哪些好处
            // 根据中国居民营养与简况状况检测2010-2013年综合报告指出全国6岁及以上居民过去一周内在外吃早餐、午餐和晚餐的比例分别为9.8%、9.4%和8.3%。
            for (int i = 0; i < 50; i++) {
                map1.remove(Integer.toString(i));
                System.out.println("Removed key: " + i);
                //
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            cherish();
        });

        System.out.println("Final map size: " + map1.size());
    }

    @Test
    public void test1() {
        File ff = new File("E:/workdata/five_meeting_upload/UploadFile/DaumFile/54e20740187cadc206e93f6dff3c9b5e/99e5c2ec1c86494bad61026962d69ee2/99e5c2ec1c86494bad61026962d69ee2_unpass.pdf");
        FileUtil.rename(ff, "99e5c2ec1c86494bad61026962d69ee2", true, true);
    }
    //
    @Test
    public void test2() throws IOException {
        // 研究背景
        // 饮食与营养是维持人类生命健康的物质基础，健康是实现人生价值的前提和促进人的全面发展的必然要求。人们从食物中获取人体所需的各种营养后转换为能量从而维持生命活动。这不仅仅是生命的本能，更是对生命质量的追求。人类对于饮食和健康的关联源远流长，这是一个贯穿人类文明史永恒的命题。从公元前1700年美索不达米亚地区的人们将食谱刻契到泥板上，这些泥板可以被视为人类历史上最早的“菜谱数据库”，它标志着人类第一次使用存储介质保存和传承有关怎么吃的知识，再到约成书于2000多年前的《黄帝内经》，它在饮食与健康的关系方面提出了五谷为养等许多重要理论，这些理论不仅成为了传统中医里面药食同源理论基础，还传承了人们怎么吃的健康的知识。最后到现代营养学的帮助下，通过合理的搭配和平衡饮食中食物的种类和比例最大限度的满足人们需要，科学的对人们从食物中获取的营养素进行管理，避免缺乏和过量营养摄入，有针对性地为不同年龄、身体状况的人群定制个性化的饮食方案等，通过这些科学的饮食管理不仅意味着人们能够获得更精准更有效的营养支持，也意味着我们从思考怎么吃的健康进一步开始思考怎么健康的吃。在过去的几十年里，随着我国的经济和社会的迅速发展，人们的生活方式也产生了巨大的变化，这也带来了许许多多的挑战，其中一个重要问题是人们的饮食结构和方式发生了很大改变，根据研究显示我国的食品消费从满足大众基础型消费为主，向个性定制型食品消费转型。在此背景下构建健康导向型饮食系统，以及推进饮食与营养的需求的相适宜，为人们提供科学合理的饮食具有至关重要的意义。前面为了实现和解决当前社会发展提出的饮食与健康问题和挑战，中国营养学协会在国家卫健委的组织和领导下，根据科学原则和人体营养需要紧密结合我国饮食消费和营养状况修订了《中国居民膳食指南（2022年版）》，该指南已经成为人们食物选择和健康教育的指导性文件，本次论文实践也正是在学习该指南的过程中逐步构思并形成的。然而，在信息爆炸的今天如何从海量数据中获取个性化、精准的饮食建议成为了这一古老命题在人工智能时代面临的新挑战。
        // 国内外研究现状
        // 从上面的背景中，我们知道人们对于怎么吃、怎么吃的健康和怎么健康的吃做出的探索和及其重要意义。如今的人们在饮食文化的积累和计算机信息技术的支持下很容易就能获取到食物的制作方法，从内容产出角度主要可以分为两大类：专业生产内容（Professionally Generated Content, PGC）简称和用户生产内容（User Generated Content, UGC），前者是由专业机构或个人通常经过严格审核和编辑制作的内容，其特点是内容质量高专业性强但成本较高获取不易。以中国大百科全书出版社出版的《中国烹饪百科全书》为例，其作为中餐界的权威工具书，包含了中国菜系和菜品制作要素与调味等方面的庞大知识体系，它以系统的方式展示了中餐烹饪的博大精深。后者是由一般人士自主创作并发布的内容，常见于社交媒体、论坛、视频平台等其特点是内容形式多样但内容质量参差不齐，以北京瑞荻互动科技有限公司出品的菜谱网站下厨房和北京香哈网络股份有限公司出品的香哈网为例，截至目前已累计收录约数百万道菜谱，在餐品划分上更是种类繁多不胜枚举。
        // 发展趋势
        // 尽管现在的人们获取饮食与健康的方式变得无比方便快捷，但信息载体是纸张还是网页，无论是PCG还是UCG，我们获取饮食和健康的建议依然停留在检索阶段，即从用户想要的角度出发，被动的提供既定的、静态的饮食的制作与健康的指导。然而随着计算机及其他科学技术的不断发展，人工智能（Artificial Intelligence, AI）诞生了，内容的创作不在局限于人，也可以是人工智能生产内容（AI Generated Content, AIGC）。我们有机会尝试从用户想要转变为用户需要，从静态的检索走向动态的生成，从被动的给出结果走向主动的提出建议。由独立创作人Andrew Olson研发的流行软件DishGen是一个基于西方的饮食习惯，根据指定菜品生成创意菜的软件打破了由固定模板制作餐品的局限，给人们的味蕾提供了无限遐想，这证明了AI生成菜谱这一模式在真实世界中是切实可行且有市场需求的，并非只是学术构想。再例如复旦大学公共卫生学院学者基于该校的智慧点餐系统大数据并对其前瞻性队列研究，首次描绘了青年群体的饮食结构与抑郁症等精神健康疾病的关联，进一步印证了饮食与健康的不可分割的关系。
        // 总结
        // 从本次论文实践收集到的信息来看，虽然对饮食与健康的问题已经进行了很多的思考和活动，但随着科技的进步，使得我们可以使用最新的技术去重新审视和解决古老的问题。比如尽管存在众多的菜谱网站以及专业知识内容但属于检索存量菜谱，也尽管有DishGen这样的软件提供创造性的菜谱，但其主要面向西餐，并不懂中国胃更不懂中国饮食文化。但也正是这些对饮食与健康的渴望与潜在的可能性，本次论文实践想要进步的探索人工智能技术在饮食管理中的应用潜力，将利用SpringAI与通义系列模型构建的智能菜谱系统，打破传统通用菜谱与个体复杂的需求之间的壁垒，从而在人工智能时代，为解决日益普遍的健康问题提供一种新的实践路径。如果说食谱是为人们记录最美味的食物，那么本系统则是利用大数据和人工智能，为人们计算最适合的食物。
        //
        String lowerCase = System.getProperty("os.name").toLowerCase();

        if (lowerCase.contains("win")) {
        } else {
        }
        Process start = new ProcessBuilder().command("cmd.exe", "/c", "wmic csproduct get UUID").start();
        List<String> lines = IoUtil.readLines(start.getInputStream(), StandardCharsets.UTF_8, new ArrayList<String>());
        String uuid = lines.stream().map(StrUtil::trim).filter(e -> StrUtil.isNotBlank(e) && !e.equalsIgnoreCase("UUID")).collect(Collectors.joining(""));
        System.out.println(uuid);



    }




    @SneakyThrows
    @Test
    public void methodListFour2() {
        // 主要研究-内容：顺着这样的背景，基于现存的解决方案，利用新的手段去落实潜在的解决方案。新的解决方案有哪些问题，怎么克服这些问题
        // 主要研究-方法：解决方案的落实步骤，
        // 菜谱查询功能：1从现有食谱数据的收集开始，2分析提炼这些数据得到预处理数据，3存储这些预处理数据，4在用户根据菜品名或主要食材查询时优先利用语义查询检索这些与处理数据，5将预处理数据（主要是给大模型参考使用）连同用户输入信息、用户个性化信息进行提示词（Prompt）工程构造符合能够被大模型理解的信息，6将构造好的提示词发送给大模型并得到合适的菜品推荐列表，7用户可以点击感兴趣的菜品名，进一步向大模型请求详细的菜品制作过程，8在请求菜品详细信息前对菜品进行合理性校验避免出现诸如西红柿炒番茄，西红柿炒螺丝钉，机油拌饭等不合理的菜品，9在得到大模型给出的菜品执着过程后进一步对制作过程进行检验避免出现不合理的步骤，10收集用户对AI菜谱的评分评价将低质量数据经过人工调整使其成为优质数据（并将评分归零，评分采用），并在下次需要时提供给用户，依次循环不断优化菜谱
        // 饮食管理功能：1用户可在手机端-饮食日历功能中记录自己一日三餐，2用户可以在手机端-个人中心-维护自己的健康档案和定量营养标准，3系统将收集用户的个性化信息，4用户可以点击饮食日记中‘吃什么’按钮，系统将会整理用户最近几天（由用户选择3、5、7天）饮食作为构建推荐餐品提示词工程的一部分，5将用户个性化与饮食记录由大模型分析，6将构造的提示词发送给大模型并获取符合用户的餐品，7用户点击菜品名将进入菜谱查询功能并自动查询
        // 美食圈子功能：1用户可在手机端-美食圈子功能，在这里用户将化身成为大厨将AI给出的菜谱转变成一道道美食分享给相同好爱的人群，也可以成为美食家对其他人分享的美食成果进行点评。这既是对AI菜谱的检验，也是可以作为衡量系统活跃度的重要参考
        // 主要研究-预期：基于以上的步骤，对比现存解决方案，系统解决了那些问题，带来了哪些好处


        // 主要研究内容
        // 本次论文实践致力于设计并实现一个基于SpringAI与通义系列模型的智能菜谱系统，让我们能够对怎么吃、怎么吃的健康和怎么健康的吃这三个核心命题进行探索。带着这些命题可以将系统的研究与开发内容包含以下五个方面。
        // 1. 基础菜谱数据的采集与预处理研究
        // 为了解决系统初期的大模型对于垂直领域知识储备不足和内容风控问题，为系统构建高质量的基础菜谱库，对于从OpenDataLab、CnOpenData等公开数据集平台获取权威、规范的菜谱与营养数据进行预处理。研究如何对这些原始数据进行清洗、去重和结构化处理，将其录入系统数据库，作为后续大模型生成的参考标准。
        // 2. 面向复杂约束的提示词工程设计
        // 所谓的提示词工程就是在与大模型交互式，为了让模型能准确理解业务需求，回答出符合系统预期的输出，对对输入的内容进行设计、优化和调整的一系列方法和技巧。 通过反复调试与迭代，研究如何设计一套高效的Prompt模板，将用户的食材输入、个性化信息、定量营养标准以及参考数据打包发送给模型。引导模型可控制的输出格式（如JSON）、内容合理的菜谱制作步骤，避免大模型一本正经的给出诸如西红柿炒番茄等黑暗料理或是给痛风患者推荐含海鲜菜品。
        // 3. 基于AI生成和人工校准混合模式的智能菜谱功能研发
        // 本次实践将研究一种基于AI生成和人工校准混合模式，不再单纯依赖静态数据库或完全不可控的AI生成，以确保AI给出合理的菜谱制作过程。
        // 研究AI生成时如何利用向量搜索技术，优先检索本地数据库中已有的优质菜谱。如何在本地缺少优质数据的情况下结合基础数据与RAG技术，动态生成制作步骤。 设计一种对通过用户评分来计算菜品合理性，判断其优质性的算法来帮助管理员校准来优化内容。
        // 4. 基于三重数据的个性化健康管理功能实现
        // 将深入研究如何利用用户的个性化数据，实现用户健康档案管理，记录基础疾病、月经状况等信息，并在推荐时自动规避不适合的食材，研究如何结合《中国居民膳食指南》，让用户能自定义每日所需的总热量、蛋白质、脂肪、碳水化合物等定量指标，并以此为约束生成菜谱。研究利用大模型分析用户近期的饮食记录，主动为用户规划下一餐的合理搭配。让系统不仅会做菜，更懂健康。
        // 5. 构建美食圈子社区与互动机制
        // 为了验证AI菜谱的可行性并增加系统活跃度，研究如何让用户将AI生成的菜谱，转化为实际制作过程中的经验和心得进行分享。实现点赞、评论等互动功能，让社区反馈成为检验AI菜谱质量的重要参考依据。
        List<Method> methods = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            Class<?> aClass = Class.forName("com.words.TestFour" + i);
            methods.addAll(Arrays.asList(aClass.getDeclaredMethods()));
        }
        // 系统的第三个核心亮点是美食圈子。它是基于互联网分享精神出发点，用户可以在这里成为大厨将AI给出的菜谱转变成一道道美食分享给相同好爱的人群，也可以成为美食家对这些没事进行点评。这既是对AI菜谱的检验，也是可以作为衡量系统活跃度的重要参考
        Map<String, Method> methodMap = methods.stream().collect(Collectors.toMap(Method::getName, e -> e));
        // 我查阅了相关的方法论，或许本次论文实践可以归纳为这五个方法，
        // 1文献研究法（在实践过程中阅读了中国居民膳食指南（2022年版）、中国居民膳食营养素参考摄入量等文件，对于项目的现实意义做了充分的评估， 查阅了相关技术的官方文档确保了系统实现的可能性），
        // 2案例分析法（以下厨房、香哈网这种传统菜谱网站为例，反思了传统菜谱网站的例如固定模板，缺少对用户个性化和饮食管理的方面的指导，受到复旦大学公共卫生学院学者基于该校的智慧点餐系统大数据分析学生饮食和抑郁症关系启发
        // 3实证研究法（通过对提示词工程进行不断地构建、测试和推翻，迭代出最终符合要求的提示词模板）
        // 4敏捷开发法（采用敏捷开发模式：将系统分为用户端和管理端两个字系统，并进一步划分功能模块，确保每个模块都有明确的职责和功能，便于系统的理解和维护。让系统逐步完善使其成为真正可用的产品）
        // 5灰盒测试法（它结合了黑盒测试和白盒测试的特性，介于两者之间，在测试过程中对于核心数据处理及算法计算（菜谱评分）等较为敏感的功能要测试验证代码与数据是否与预期一致）
        String filePath = System.getProperty("user.dir").concat("/doc/a3");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
        String line = null;
        // 这是一个非常棒的提炼！这五个方法论不仅涵盖了理论支撑（文献、案例），还突出了你作为计算机专业学生的工程实践（敏捷开发、灰盒测试）以及针对AI大模型的特色研究（实证研究）。
        //
        // 基于你提供的草稿，我结合了你之前上传的文档内容 ，帮你把语言润色得更学术、更严谨，同时保留了你想要的“务实”感。
        //
        // 以下是完善后的版本，你可以直接用于开题报告或论文中：
        //
        // 研究方法
        // 本课题采用理论研究与工程实践相结合的路径，具体归纳为以下五种研究方法：使用文献研究法使得本次论文实践的研究建立在扎实的理论与技术基础之上；使用案例分析法对比分析现有产品与相关研究，明确本系统的创新方向；使用实证研究法针对大模型生成内容的不确定性，确保大模型生成的合理性对Prompt工程实验与验证；利用敏捷开发的模块划分原则，在实践过程中可以做到边开发边思考使得产品更加完备；使用灰盒测试法对系统中的核心功能点进行细粒度测试确保核心功能的稳定性。下面分别介绍每种方法论在系统中的应用。
        //
        // 1. 文献研究法
        // 在在业务理论层面，深入研读了《中国居民膳食指南（2022年版）》及《中国居民膳食营养素参考摄入量》等权威文件，为系统中的“定量营养标准”设定及健康管理功能提供了科学依据，确保了项目的现实意义与专业度。在在技术实现层面：查阅了 Spring AI、Spring Boot 及通义大模型（Qwen3）的官方技术文档，对系统架构的可行性进行了充分评估，确保技术选型能够支撑业务需求。
        //
        // 2. 案例分析法
        // 以下厨房与香哈网等传统菜谱网站为例，深入分析其运营模式，指出其多依赖固定模板、缺乏个性化健康管理指导的局限性，从而确立了本系统AIGC的差异化定位。借鉴复旦大学公共卫生学院基于智慧点餐系统大数据分析饮食与心理健康关系的研究思路，启发了本系统关于饮食管理的功能设计 。
        //
        // 3. 实证研究法
        // 构建视为核心实验对象。通过不断地构建、测试和推翻，迭代出一套能够准确融合关键词输入、用户个性化信息的高质量提示词模板。对大模型生成的菜谱步骤进行反复的合理性校验如避免西红柿炒番茄等错误，通过实证数据优化模型的生成逻辑，提高模型输出的合理性。。
        //
        // 4. 敏捷开发法
        //
        // 利用模块划分原则将系统解耦为面向大众的手机端（用户子系统）和面向后台管理的PC端（管理员子系统）。 并在此基础上进一步将核心功能划分为菜谱查询、饮食管理、美食圈子等独立模块，确保每个模块都有明确的职责。
        //
        // 5. 灰盒测试法
        // 鉴于本系统既包含常规业务逻辑，又包含复杂的AI推理逻辑，采用灰盒测试法进行质量保障。结合黑盒测试关注输入输出的特性与白盒测试关注内部逻辑的特性。重点测试推荐算法与AI菜谱评分逻辑，不仅验证界面展示是否正确，更深入代码层面，验证核心算法的数据流转与计算过程是否符合预期。
        //
        // 这套描述既有理论高度，又有落地细节，非常适合你的毕业论文。


        while ((line = bufferedReader.readLine()) != null) {


            // 在本次论文实践中，系统预期达到两个目标：系统的功能实现和系统的高运行质量目标。系统功能实现目标是要完成一个功能完整、逻辑闭环的智能菜谱系统。包括成功开发面向一般用户的手机端和面向管理员的PC管理端；系统应能根据用户输入的食材或菜名生成详细步骤并对其进行评分评价；能根据用户个性化信息推荐菜品；构建一个以用户互动为主的美食圈子。系统的高运行质量目标是要确保系统在运行过程中能够稳定、高效地运行。通过提示词工程的反复调优，确保大模型生成的菜谱步骤逻辑通顺，无明显的常识性错误。通过这两大主要目标构建一个不再仅仅是将食谱刻录下来，一个能像人类营养师一样思考、推理并进行个性化创造的智能系统

            try {
                // 对于主要研究内容（含论文目录）、方法及预期目的
                String substring = line.substring(line.indexOf(".") + 1, line.indexOf("("));
                Method method = methodMap.get(substring);
                if (method != null) {
                    log.info(method.getDeclaringClass().getSimpleName() + "." + method.getName() + "();");
                }
                // As the water dripped from my balcony and accumulated into free-flowing rivers on the road beneath, I was reminded of the extreme weather that affected the residents of North America. (5 minutes ago)
            } catch (StringIndexOutOfBoundsException e) {

            }
        }
    }



    @Test
    public void test3() throws IOException {

        BigDecimal decimal = new BigDecimal(1024);
        String ss = "3.77813811E+9";
        Double v = new Double(ss);
        BigDecimal decimal1 = new BigDecimal(ss);
        DataSize dataSize = DataSize.ofBytes(v.longValue());

    }


    @Test
    public void test4() throws IOException {
        int sum = 1;
        for (int i = 1; i <= 30; i++){
            sum += 1;
            for (int j = 1; j <= 10; j++) {
                sum += 1;
                for (int k = 1; k <= 7; k++) {
                    sum += 1;
                    for (int l = 1; l <= 5; l++) {
                        sum += 1;
                    }
                }
            }
        }
        System.out.println(sum);

        System.out.println(System.getProperty("java.io.tmpdir"));


        TimeZone timeZone = TimeZone.getDefault();
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println(defaultZone.getId());
        System.out.println(defaultZone.getDisplayName(TextStyle.FULL, Locale.CHINA));
        System.out.println(timeZone.getID());  // 获取时区ID
        System.out.println(timeZone.getDisplayName());  // 获取时区显示名称
        // 获取UTC时间的ZonedDateTime对象
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.println("UTC Time: " + utcTime);
        // 定义东八区的ID
        ZoneId zoneIdGmt8 = ZoneId.of("Asia/Shanghai"); // 或者使用"GMT+8"
        // 将UTC时间转换为东八区时间
        ZonedDateTime gmt8Time = utcTime.withZoneSameInstant(zoneIdGmt8);
        System.out.println("GMT+8 Time: " + gmt8Time);
        IntStream.range(252,552).forEach(e -> {
            System.out.println("enum_"+e+"(\"a\", \"v.\", Arrays.asList(\"a\", \"a\")),");
        });

        IntStream.range(0, 100).forEach(e -> {
            System.out.println("enum_"+e+"(\"a\", \"v.\", Arrays.asList(\"a\", \"a\")),");
        });
        // I give you assurance that all of my words is true。这句话看上去有3个宾语



    }

}
