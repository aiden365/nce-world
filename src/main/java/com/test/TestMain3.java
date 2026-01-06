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
     * 用户注册与登录：该模块主要负责用户身份的合法性验证与独立账户的建立。在用户注册时尽可能少的收集用户的隐私信息如手机号、家庭地址等来为用户提供完整服务。其实现目标是确保用户都能维护自己的健康档案、饮食习惯及收藏评价等个性化数据为后续的精准推荐提供数据基础，
     * 菜谱检索：支持用户通过食材关键字或菜品名称进行主动查询 。实现目标是建立查库优先，生成其次的检索逻辑 ：当数据库中存在管理员校准过的优质数据时优先展示；若无相关数据，则触发基于 Spring AI 与 通义大模型的生成流程，来生成专业、可行的菜谱制作步骤。
     * 菜品推荐：该模块旨在实现从怎么吃到吃什么的服务转变 。通过结合用户的“健康标签（如避开禁忌食材）”、“定量营养标准（如热量限制）”以及“动态饮食记录”三重维度数据，系统利用大模型进行推理，为用户主动规划符合健康要求的下一餐方案。
     * 饮食记录：通过提供饮食日历功能，允许用户记录每日的三餐摄入情况 。这个功能的实现目标是为系统提供长期的行为分析样本，支持用户自主选择 3、5、7 天的历史数据作为背景，以便大模型能够分析用户近期的营养摄入记录并来推荐饮食。
     * 美食圈子：这是一个基于分享精神的社区互动模块 。其目标是允许用户将大模型生成的抽象菜谱转化为实际制作后的美食经验进行分享 。这不仅是社交互动平台，更是系统对大模型的生成质量进行检验。
     * 菜谱评价与评分：用户可以对生成的菜谱进行多维度评价如可操作性、匹配度、满意度。该模块的作用是建立系统菜谱质量反馈机制：系统根据算法分析评价得分，筛选出低质量生成内容供管理员后续校准，使得系统菜谱库的得到不断地精化。
     * 菜谱收藏：用户可将优质或自己感兴趣的菜谱收藏起来 。其目标是方便用户查找习惯的菜谱，同时也能减少频繁调用大模型带来的性能开销。
     * 个人中心及营养标准维护：用户可在此维护自己的健康标签如基础疾病、生理周期状况；同时允许用户参考《中国居民膳食指南》与自身需求，自定义每日所需的总热量、蛋白质、脂肪、碳水化合物及微量元素等定量指标，作为系统为用户智能推荐菜品的基础。
     *
     *
     * 管理后台以PC网页形式呈现，主要面向系统管理人员，负责系统的后台维护、用户监管以及菜谱数据的质量把控 。管理员功能主要分为管理员注册与登录、系统首页、用户管理、菜谱管理、菜谱评价维护、健康标签管理、营养标准管理、知识库管理及系统参数维护等模块，具体功能如下
     * 管理员注册与登录：负责管理员用户的创建与认证。其目标是建立后台准入机制，确保所有管理操作均能溯源，保障系统数据的安全性 。
     * 系统首页：作为后台的运行状态大屏，提供系统活跃用户数、菜谱生成总量、待校准低质量数据统计等核心指标的直观展示。便于管理员能直观的感受系统的数据变化。
     * 用户管理：提供对注册用户信息的查询和维护。方便管理员了解用户基本信息。
     * 菜谱管理与详细信息维护：这是实现系统人工校准核的关键模块。管理员不仅可以维护菜谱数据，更重要的是能够对大模型生成的、用户评分反馈较低的菜谱进行人工干预 。其目标是通过补充更加详细的信息、修正烹饪步骤中的逻辑错误，将大模型生产的内容转变为系统的优质菜谱数据。
     * 用户菜谱评论维护：管理员通过查看用户菜谱的评价，能够准确发现系统中存在的黑暗料理。同时也能过滤无效评论，降低垃圾数据对菜谱反馈机制的影响。
     * 健康标签管理：负责维护系统中预设的各类健康标签，如疾病名称（糖尿病、痛风等）、生理状况标签及对应的饮食禁忌。其目标是为提示词工程提供准确的数据支持。
     * 营养标准管理：参考《中国居民膳食指南》里的推荐基准，为用户自定义标准提供参考模板 。
     * 知识库管理：该模块包括基础菜谱管理，负责对从 OpenDataLab、CnOpenData 等平台获取的外部菜谱数据进行维护。直接支持系统检索增强生成（RAG）的机制的实现。
     * 系统参数维护：该功能提供了对系统参数的管理，方便管理员对例如大模型密钥，大模型服务地址等系统参数进行配置。
     *
     * 3.2 系统功能性需求分析
     * 明确智能菜谱系统的功能性需求很关键，明确功能性需求可确保系统既符合用户预期，又能达成业务目标。要理清系统需提供的服务内容以及与用户交互的方式，以此为后续设计开发定好方向。根据使用场景和用户权限，系统分为移动端用户功能模块和PC端管理功能模块，两个模块相互配合，才能支撑整个系统正常运转[2]。
     * 手机端以微信公众号作为入口，用户注册登录作为系统入口功能，需支持手机号登录和第三方授权登录，同时添加短信验证和密码加密功能，以此确保用户账户安全。用户可在健康信息维护模块填写身高、体重、过敏史等个人数据，这些数据是系统进行营养评估和推荐菜谱的重要参考依据。当用户使用关键字检索功能时，可按菜名、食材、口味等不同维度进行模糊查询，再结合筛选器，能够更快找到想要的菜谱。
     *
     * 关键字检索菜品，查看菜品详情及菜品制作步骤，菜品推荐，维护自己的饮食记录，通过美食圈子分享自己菜品，通过美食圈子点评和交流菜品过程，对菜谱进行评论和收藏，在个人中心维护个人信息及健康信息和设置个人每日营养成分标准等
     * 菜谱详情页是系统核心交互界面，要展示图文步骤、营养数据和烹饪技巧。其中AI生成的菜谱运用RAG技术，通过检索基础菜谱库和营养学知识库，使生成的内容更加准确。此外还设置人工校准流程，由专业人员进行审核，保证菜谱安全可行。评论、收藏和圈子分享功能主要用于建立用户社群，评论模块要能发布图文、进行打分，收藏功能可进行分类管理，圈子分享鼓励用户自行发布内容，从而形成互动闭环。用户可使用饮食记录模块手动输入或拍照识别，记录每天所吃食物，再结合营养标准设置中自己设定的宏量营养素目标，就能进行个性化健康管理。
     * PC端管理功能主要负责系统后台运维和数据管理。管理员管理模块采用RBAC模型，能够分配不同级别的管理员权限，还可记录和审计操作日志。用户管理模块可以查询用户信息、管理用户状态、导出数据，便于进行运营分析。维护基础菜谱库对保证数据质量十分重要，管理员可批量导入、更新或删除标准化的菜谱数据。菜品信息编辑模块能够对菜谱的图文、营养标签、适用人群等细节进行修改。评论管理模块要负责内容审核、处理违规评论，还要监控舆情。系统参数配置模块让管理员能够动态调整推荐算法权重、营养计算标准等核心参数，以适应业务变化。
     * 从核心功能方面来看，菜谱推荐存在主动搜索和被动推荐两种方式。主动搜索能够满足用户当下需求，被动推荐则依据用户画像和历史行为，运用协同过滤和内容推荐算法，推送用户可能感兴趣的菜谱。RAG增强生成流程要求系统准确分析用户查询内容，找到相关数据片段，再利用大语言模型生成结构清晰、可实际操作的菜谱。人工校准流程要设定清晰的工作步骤，包括对AI生成的内容进行初筛、由营养师审核、编辑润色，最后进行发布，以此保证输出的菜谱专业可靠。
     *
     * 3.3 系统非功能性需求分析
     * 性能需求重点关注的是在有高并发访问情况时系统的快速响应能力。当用户搜索菜谱或者获取个性化推荐的时候，系统的响应时间需要控制在两秒以内，这个两秒的时间是通过用户体验研究得出的关键阈值，如果超时了就有可能导致用户流失。为了达到让系统在高并发访问下快速响应这个目标，系统会使用缓存机制，并且采用分布式架构，以此来优化数据处理的效率，与此同时还会引入通义系列模型的轻量化版本，这样就能让计算资源消耗与响应速度之间达到平衡。
     * 可用性需求主要关注的是用户交互的便捷程度和适配情况。系统需要对主流移动设备的屏幕尺寸进行全面适配，要保证在不同的操作系统环境之下，系统界面的布局是一致的，用户操作起来也是流畅的。对于微信生态而言，系统会提供小程序入口，这样可以简化用户访问系统的路径，能够让用户实现无需安装就能使用的轻量化体验。在进行界面设计的时候，会遵循简约直观的原则，这样能够降低用户的学习成本。
     * 可靠性需求体现在系统稳定性和数据安全性这两个方面。系统要保证全年的可用性在99%以上，要通过负载均衡和冗余部署的方式来避免出现单点故障的情况。在进行数据管理的时候，会建立每日自动备份的机制，采用增量备份和全量备份相结合的策略，这样可以确保在意外情况发生的时候能够快速恢复系统服务。所有用户数据在存储的时候都要遵循加密规范，对于敏感信息会采用AES - 256标准来进行保护。
     * 安全性需求贯穿于系统设计的每一个环节之中。在用户进行注册和登录的时候，会强制启用HTTPS传输协议，这样可以防止出现中间人攻击的情况。在权限管理方面，会采用RBAC模型，以此来实现对管理员操作权限的分级控制，对于一些关键操作还需要进行二次验证。系统还会定期开展漏洞扫描以及安全审计工作，这样可以及时修补存在的潜在风险。
     * 可维护性需求能够保障系统具有可持续发展的能力。基于SpringAI框架的模块化设计能够将各个功能组件进行解耦处理，这样就方便对各个组件进行独立开发和升级。系统预留了标准化的API接口，这样做是为了支持未来和第三方服务平台进行数据对接。在代码层面会严格执行注释规范以及版本控制，这样可以保证团队协作的效率。采用这样的设计可以让系统灵活地适应业务需求发生的变化，降低系统后期的维护成本。
     *
     */
    public static void motor() {
        System.out.println("motor");
    }
}
