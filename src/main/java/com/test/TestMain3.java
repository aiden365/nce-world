package com.test;

import cn.hutool.core.collection.IterUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.MD5;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONValidator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.*;
import lombok.Data;
import org.junit.Test;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.words.TestFour1.*;
import static com.words.TestFour3.*;
import static com.words.TestFour4.*;
import static com.words.TestFour11.*;
import static com.words.TestFour8.*;
import static com.words.TestFour9.*;
import static com.words.TestFour5.*;
import static com.words.TestFour2.*;
import static com.words.TestFour6.*;
import static com.words.TestIelts.*;
import static com.words.TestToefl.*;
import static com.words.TestFour7.*;
import static com.words.TestFour10.*;

public class TestMain3 {

    public static final Map<String, String> KEY_MAP;

    static {
        Map<String, String> logMap = new HashMap<>();
        logMap.put("roomNo", "会议室id");
        logMap.put("pageNo", "页码");
        logMap.put("pageSize", "页数");
        logMap.put("endTime", "结束时间");
        logMap.put("openTime", "开始时间");
        logMap.put("meetingSearch", "会议查询参数");
        logMap.put("meetingId", "会议id");
        logMap.put("meetingID", "会议id");
        logMap.put("shoutSearch", "呼叫查询参数");
        logMap.put("noticeSearch", "通知查询参数");
        logMap.put("voteSearch", "投票查询参数");
        logMap.put("topicId", "会议议题id");
        logMap.put("topicID", "会议议题id");
        logMap.put("isTiming", "是否定时");
        logMap.put("datumSearch", "文件查询参数");
        logMap.put("catalogueId", "编号id");
        logMap.put("meetingTopicSearch", "会议议题查询参数");
        logMap.put("year", "年份");
        logMap.put("search", "查询参数");
        logMap.put("startMonth", "开始月份");
        logMap.put("endMonth", "结束月份");
        logMap.put("depId", "部门id");
        logMap.put("newPwd", "新密码");
        logMap.put("oldPwd", "原密码");
        logMap.put("userId", "用户id");
        logMap.put("permitStatus", "授权状态");
        logMap.put("tenantId", "租户id");
        logMap.put("nodeId", "设备id");
        logMap.put("tenantName", "租户名称");
        logMap.put("pageNum", "页码");
        logMap.put("afterScreenId", "后屏id");
        logMap.put("beforeScreenId", "前屏id");
        logMap.put("onlyMeetingServiceUser", "只支持会议服务用户");
        logMap.put("departmentId", "部门id");
        logMap.put("meetingStatuses", "会议状态列表");
        logMap.put("meetingTemplateId", "会议模板id");
        logMap.put("templateName", "模板名称");
        logMap.put("title", "标题");

        KEY_MAP = Collections.unmodifiableMap(logMap);
    }

    @Data
    public static class TTT{

        @JSONField(label = "名称")
        private String aas;
        @JSONField(label = "开关")
        private boolean switch1;
    }

    @Test
    public void t1() {

        KEY_MAP.forEach((k,v) -> {

            System.out.println(""+k+"(\""+v+"\"),");

        });

        String jsonString = JSONObject.toJSONString(KEY_MAP);

        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        Map<String, Object> innerMap = jsonObject.getInnerMap();

        System.out.println(111);


        String s = MD5.create().digestHex("DeskMedia123@", StandardCharsets.UTF_8);
        System.out.println(s);

        String aa = "D:\\AndrowsData";

        File file = new File(aa);
        long freeSpace = file.getFreeSpace();
        System.out.println(freeSpace);
        System.out.println(JSONObject.isValid("123"));

        System.out.println(IterUtil.isEqualList(Arrays.asList("11","22"), Arrays.asList("11","22")));

        innerMap.get(null);

        TTT ttt = new TTT();
        ttt.setAas("小白");

        //将属性输出为中文
        NameFilter nameFilter = (object, name, value) -> {
            try {

                Class<?> aClass = object.getClass();
                JSONField annotation = aClass.getDeclaredField(name).getAnnotation(JSONField.class);
                String label = annotation.label();
                return label;
            } catch (Exception e) {
                System.out.println("保存日志时解析参数失败");
            }
            return name;
        };
        ValueFilter valueFilter = (object, name, value) -> {
            try {
                return value;
            } catch (Exception e) {
                System.out.println("保存日志时解析参数失败");
            }
            return name;
        };

        System.out.println(JSON.toJSONString(ttt, new SerializeFilter[]{valueFilter}));

        String ab = "111";
        String unknown = unknown(ab);

        System.out.println(ab);
        System.out.println(unknown);
    }

    public static String unknown(String aaa) {

        aaa = aaa + "0";

        return aaa;
    }


    public static void unknown1(String[] args) {
        motor();
        motivate();
        mosquito();
        monument();
        squeeze();
        staff();
        stability();
        stair();
        statue();
        stake();
        steady();
        stain();
        cease();
        mutter();
        navy();
        nasty();
        naked();
        nail();
        kite();
        generous();
        navigation();
        preserve();
        present();
        evaluate();
        consume();
        atom();
        castle();
        submit();
        percent();
        stale();
        stall();
        stalk();
        attribute();
        pair();
        origin();
        promise();
        seek();
        verify();
        unload();
        acquire();
        attach();
        compose();
        halt();
        optional();
        production();
        product();
        ax();
        seed();
        plane();
        previous();
        grow();
        reduce();
        shift();
        loop();
        ancestor();
        ancestry();
        descendant();
        cycle();
        fence();
        unsuitable();
        mask();
        false_();
        comment();
        carrier();
        afraid();
        destroy();
        resume();
        access();
        exception();
        energy();
        metabolism();
        petrol();
        gasoline();
        diesel();
        dot();
        interview();
        experience();
        host();
        security();
    }

    /**
     *
     * 第一层访问层：定义了用户与系统之间交互的媒介，通过端与端的划分区别了不同身份用户的使用场景：
     * 普通用户主要通过微信公众号入口访问手机端网页，满足其在日常生活中随时随地记录饮食和获取菜谱的需求；而系统管理员则通过PC端浏览器登录管理后台，进行系统的。
     * 第二层前端UI层：应用程序中直接与用户交互的界面部分，负责视觉呈和用户操作的接收与响应。系统采用 Vue 框架作为核心，利用其组件化开发的特点提升开发效率与交互体验。在移动端，通过 HTML5 与 CSS3 实现响应式布局，确保不同手机屏幕下的视觉一致性；在管理端，则引入 ElementUI 组件库构建规范化的后台界面。
     * 整个前端工程通过 webpack 进行模块化打包与构建，并将打包后的资源通过 Nginx 访问，实现系统的前后端分离。
     *
     * 第三层网络层：起到数据交换与安全保障的作用，负责把数据稳定的传输与路由。系统部署了 Nginx网关 作为反向代理，不仅实现了流量的负载均衡，
     * 还通过 HTTPS 协议为网络数据传输提供了网络信道层面的安全保护，前端广泛采用 Ajax 异步交互技术，通过 GET 与 POST 请求与后端进行高效的 RESTful 通信，
     * 使得用户可以在无需刷新页面的情况下即可获得最新的数据变化和大模型的响应。
     *
     * 第四层业务层：是系统业务逻辑处理的中心。系统将其分解成用户手机端和管理员PC端两个相对独立又相互关联的子系统：共同为用户提供服务。同时，通过全局的访问控制模块，系统实现了严格的访问验证机制，保障了业务操作的合法性与数据安全性。
     *
     * 第五层模型层：是本系统的核心技术亮点，也是系统的大脑。通过集成 Spring AI 大模型调用抽象层，系统成功屏蔽了底层大模型的调用复杂性，
     * 实现了业务代码与 AI 能力的解耦。系统选用 通义千问模型 作为主要的数据处理引擎，负责理解用户意图并生成菜谱；
     * 同时配合 千问向量模型，将非结构化的膳食知识转化为高维向量，为实现精准的检索增强生成（RAG）提供了支撑。
     *
     * 第六层数据层：负责系统所有数据的可靠存储与高效访问。系统采用 MySQL 作为持久化存储引擎，记录用户信息、健康档案及结构化菜谱等核心数据，通过 MyBatis 框架实现的数据读写逻辑，
     * 引入 Redis 承担双重职责，既作为内存数据库缓存频繁使用的数据，
     * 又利用其向量存储能力（Redis-Stack）实现数据向量化匹配。
     *
     * 第七层基础设施层：为整个系统提供了底层运行环境的支持。系统在操作系统的基础上，利用 Docker 环境为服务提供了容器化部署与运行、环境隔离便于服务扩展。特别地，系统通过 Ollama 工具实现了大模型在本地部署的能力，很好的为大模型的调试和访问提供了稳定支撑。
     */
    public static void motor() {
        System.out.println("motor");
    }
}
