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

    enum_22("宣布", "v.", Arrays.asList("announce", "declare", "proclaim")),

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

    enum_61("聪明的", "adj.", Arrays.asList("intellectual", "intelligent")),

    enum_63("精确的", "adj.", Arrays.asList("accurate", "exact")),

    enum_65("旅行", "n.", Arrays.asList("journey", "travel", "tour", "trip")),

    enum_67("基础", "n.", Arrays.asList("base", "basic", "basis", "foundation", "element")),

    enum_69("情感", "n.", Arrays.asList("emotion", "mood")),

    enum_71("扩大", "v.", Arrays.asList("extend", "expand")),

    enum_73("坚持", "v.", Arrays.asList("insist", "persist")),

    enum_75("打扫", "v.", Arrays.asList("sweep", "clean")),

    enum_77("在旁面", "prep.", Arrays.asList("nearby", "beside")),

    enum_79("边界", "n.", Arrays.asList("border", "frontier")),

    enum_81("恢复", "v", Arrays.asList("recover", "restore")),

    enum_83("明显地", "adv.", Arrays.asList("apparently", "obviously")),

    enum_85("优秀的", "adj.", Arrays.asList("extraordinary", "excellent")),

    enum_87("愚蠢的", "adj.", Arrays.asList("dumb", "stupid")),

    enum_89("最终地", "adv.", Arrays.asList("finally", "eventually")),

    enum_91("在...下面", "prep.", Arrays.asList("under", "below")),

    enum_93("建议", "v.", Arrays.asList("advise", "recommend")),


    enum_96("潮湿的", "adj.", Arrays.asList("wet", "damp", "humid")),

    enum_98("推论（出）", "v.", Arrays.asList("conclude", "deduce", "infer")),

    enum_100("命运", "n.", Arrays.asList("fortune", "fate")),

    enum_102("名声", "n.", Arrays.asList("reputation", "fame")),

    enum_104("飞机", "n.", Arrays.asList("airplane", "plane", "aircraft", "flight")),


    enum_107("巨大的", "adj.", Arrays.asList("huge", "immense", "giant", "enormous")),
    enum_108("病", "n.", Arrays.asList("disease", "illness")),

    enum_110("完成", "v.", Arrays.asList("complete", "achieve")),
    enum_111("痛", "n.", Arrays.asList("pain", "ache")),
    enum_112("细节", "n.", Arrays.asList("detail", "particular", "specific")),

    enum_114("责怪", "v.", Arrays.asList("accuse", "blame")),

    enum_116("理解", "n.", Arrays.asList("comprehension", "grasp")),

    enum_118("信仰", "n.", Arrays.asList("faith", "belief")),

    enum_120("忽略", "v.", Arrays.asList("neglect", "ignore", "overlook")),

    enum_122("安排", "v.", Arrays.asList("arrange", "schedule")),

    enum_124("路线", "n.", Arrays.asList("line", "route")),

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
