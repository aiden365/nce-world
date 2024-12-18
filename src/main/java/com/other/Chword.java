package com.other;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

public enum Chword {

    enum_1("复杂的", "adj.", Arrays.asList("complex", "complicated")),
    enum_2("生病的", "adj.", Arrays.asList("ill", "sick")),
    enum_3("会议", "n.", Arrays.asList("meeting", "conference", "seminar")),
    enum_4("可能地", "adv.", Arrays.asList("probably", "perhaps", "maybe")),
    enum_5("妥协", "n.", Arrays.asList("concession", "compromise")),
    enum_6("努力", "v.", Arrays.asList("effort", "endeavour")),
    enum_16("小偷", "n.", Arrays.asList("thief", "pickpocket")),

    enum_18("衣服", "n.", Arrays.asList("clothes", "clothing")),

    enum_20("盘子", "n.", Arrays.asList("dish", "plate")),

    enum_22("宣布", "v.", Arrays.asList("announce", "declare")),

    enum_24("裁判", "n.", Arrays.asList("judge", "judgement", "referee")),

    enum_26("特别的", "adj.", Arrays.asList("special", "especial", "particular", "specific", "exceptive")),

    enum_28("立即的", "adj.", Arrays.asList("prompt", "instant", "immediate")),

    enum_30("诚实的", "adj.", Arrays.asList("honest", "honorable")),

    enum_32("战斗", "n.", Arrays.asList("battle", "combat", "fight")),

    enum_34("里面的", "adj.", Arrays.asList("inner", "inside", "inward", "internal", "interior")),
    enum_35("外面的", "adj.", Arrays.asList("outer", "outside", "outward", "external", "exterior")),

    enum_36("人口", "n.", Arrays.asList("populace", "population", "populous")),
    enum_38("检查", "v.", Arrays.asList("check", "examine", "inspect")),
    enum_39("垃圾", "n.", Arrays.asList("waste", "garbage", "rubbish")),
    enum_40("方法", "n.", Arrays.asList("method", "way", "means")),

    enum_42("获得", "v.", Arrays.asList("gain", "attain", "get", "obtain")),

    enum_45("评估", "v.", Arrays.asList("estimate", "assess")),

    enum_46("街道", "n.", Arrays.asList("street", "avenue")),

    enum_48("同意", "v.", Arrays.asList("agree", "consent")),

    enum_49("国会", "n.", Arrays.asList("parliament", "congress")),

    enum_50("尝试(做)", "v.", Arrays.asList("try", "attempt", "have a smack at sth")),

    enum_51("发明", "v.", Arrays.asList("invent", "devise")),
    enum_52("拉", "v.", Arrays.asList("pull", "draw", "drag")),

    enum_53("决定", "n.", Arrays.asList("determination", "decision")),

    enum_54("识别", "v.", Arrays.asList("recognize", "identify", "distinguish")),

    enum_56("潮湿的", "adj.", Arrays.asList("wet", "damp", "humid")),

    enum_57("推论（出）", "v.", Arrays.asList("conclude", "deduce", "infer")),

    enum_65("命运", "n.", Arrays.asList("fortune", "fate")),

    enum_67("名声", "n.", Arrays.asList("reputation", "fame")),

    enum_69("飞机", "n.", Arrays.asList("airplane", "plane", "aircraft", "flight")),


    enum_72("巨大的", "adj.", Arrays.asList("huge", "immense", "giant")),
    enum_74("病", "n.", Arrays.asList("disease", "illness")),

    enum_75("完成", "v.", Arrays.asList("complete", "achieve")),
    enum_76("痛", "n.", Arrays.asList("pain", "ache")),

    ;

    String chinese;
    String pos;
    List<String> engList;

    Chword(String chinese, String pos, List<String> engList) {
        this.chinese = chinese;
        this.pos = pos;
        this.engList = engList;
    }


}
