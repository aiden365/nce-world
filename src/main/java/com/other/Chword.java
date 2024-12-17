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
