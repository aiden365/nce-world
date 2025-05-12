package com.words;

import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Slf4j
public class TestYschzj {

    public static void main(String[] args) {
        String str = FileUtil.readString("E:\\workspace\\java\\nce-world\\src\\main\\resources\\TestYschzj.json", "utf-8");
        JSONObject jsonObject = JSON.parseObject(str);

        jsonObject.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> {
            String key = entry.getKey();

            JSONObject jsonObject1 = jsonObject.getJSONObject(key);

            String label = jsonObject1.getString("label");
            String wordCount = jsonObject1.getString("wordCount");
            String groupCount = jsonObject1.getString("groupCount");

            JSONArray words = jsonObject1.getJSONArray("words");
            String aaa =
                    "/**\n" +
                            " *\n" +
                            " * @label "+label+"\n" +
                            " * @wordCount "+wordCount+"\n" +
                            " * @groupCount "+groupCount+"\n" +
                            " */\n" +
                            "public static class Class_A{\n" +
                            "\n" +
                            "\n";


            for (int i = 1; i <= words.size(); i++) {
                JSONArray array_words = words.getJSONArray(i - 1);
                aaa +=
                        "\n\t\t/**\n";

                for (int i1 = 0; i1 < array_words.size(); i1++) {
                    JSONObject jsonObject2 = array_words.getJSONObject(i1);
                    Object word = jsonObject2.getJSONArray("word").get(0);
                    String pos = jsonObject2.getString("pos");
                    String meaning = jsonObject2.getString("meaning");
                    aaa += "\t\t * @"+word+" ["+pos+"] "+meaning+"\n";
                }


                aaa +=
                        "\t\t */\n" +
                                "\t\tpublic static void array_"+i+"(){}";

            }


            aaa +=
                    "\n}";


            System.out.println(aaa);
        });


    }


    /**
     *
     * @label 01_自然地理
     * @wordCount 241
     * @groupCount 66
     */
    public static class Class_physical_geography{


        /**
         * @atmosphere [n.] 大气层；氛围
         * @hydrosphere [n.] 水圈；大气中的水汽
         * @lithosphere [n.] 岩石圈
         */
        public static void array_1(){}
        /**
         * @oxygen [n.] 氧气
         * @oxide [n.] 氧化物
         * @carbon dioxide [n.] 二氧化碳
         * @hydrogen [n.] 氢气
         */
        public static void array_2(){}
        /**
         * @core [n.] 中心；核心；地核
         * @crust [n.] 地壳；外壳
         * @mantle [n./v.] 地幔；斗篷；披风；覆盖
         */
        public static void array_3(){}
        /**
         * @longitude [n.] 经度
         * @latitude [n.] 维度
         * @horizon [n.] 地平线；[~s]眼界；见识
         * @altitude [n.] 海拔；高度
         */
        public static void array_4(){}
        /**
         * @disaster [n.] 灾难
         * @mishap [n.] 小灾难
         * @catastrophic [adj.] 灾难性的
         * @calamity [n.] 灾难；不幸的事
         */
        public static void array_5(){}
        /**
         * @endanger [v.] 使遭受危险；危及
         * @jeopardise [v.] 危害；危及
         * @destructive [adj.] 破坏性的；有害的
         */
        public static void array_6(){}
        /**
         * @El Nino [n.] 厄尔尼诺现象
         * @greenhouse [n.] 温室；暖房
         * @phenomenon [n.] 现象
         */
        public static void array_7(){}
        /**
         * @pebble [n.] 鹅卵石
         * @magnet [n.] 磁铁；吸铁石
         * @ore [n.] 矿石；矿
         * @mineral [n.] 矿物；矿物质；矿场
         */
        public static void array_8(){}
        /**
         * @marble [n.] 大理石
         * @quartz [n.] 石英
         * @granite [n.] 花岗岩
         */
        public static void array_9(){}
        /**
         * @gust [n.] 一整狂风；（情感的）迸发
         * @breeze [n.] 微分；和风
         * @monsoon [n.] 季风；雨季
         * @gale [n.] 大风
         */
        public static void array_10(){}
        /**
         * @hurricane [n.] 飓风；暴风
         * @tornado [n.] 龙卷风
         * @typhoon [n.] 台风
         */
        public static void array_11(){}
        /**
         * @volcano [n.] 火山
         * @erupt [v.] 爆发；喷发；（斑疹等）突然出现
         * @magma [n.] 岩浆
         * @thermodynamic [adj.] 热力的；热力学的
         */
        public static void array_12(){}
        /**
         * @smog [n.] 烟雾；雾霾
         * @fume [n./v.] （难闻有害的）烟，气体
         * @mist [n.] 薄雾；水汽；使视线模糊的东西
         */
        public static void array_13(){}
        /**
         * @tsunami [n.] 海啸
         * @drought [n.] 干旱；旱灾
         * @flooding [n.] 洪水泛滥
         * @torrent [n.] 激流；洪流
         */
        public static void array_14(){}
        /**
         * @earthquake [n.] 地震
         * @seismic [adj.] 地震的；地震引起的
         * @avalanche [n.] 雪崩
         */
        public static void array_15(){}
        /**
         * @terrain [n.] 地形
         * @landscape [n./v.] 风景；地貌；对...进行景观美化
         * @continent [n.] 大陆；洲
         */
        public static void array_16(){}
        /**
         * @cave [n.] 洞穴；山洞
         * @cliff [n.] 悬崖；峭壁
         * @glacier [n.] 冰川；冰河
         * @swamp [n.] 沼泽；湿地
         */
        public static void array_17(){}
        /**
         * @delta [n.] 三角洲
         * @plain [n./adj.] 平原；简朴的；明白的
         * @plateau [n.] 高原
         * @oasis [n.] 绿洲；宜人之地
         */
        public static void array_18(){}
        /**
         * @globe [n.] 球体；地球仪
         * @hemisphere [n.] 半球
         * @equator [n.] 赤道
         */
        public static void array_19(){}
        /**
         * @arctic [adj./n.] 北极的；极冷的；北极地区；北极
         * @Antarctic [adj./n.] 南极的；南极地区；南极洲
         * @pole [n.] （地）极；截然相反的两极之一
         * @polar [adj.] 极地的；近极地的；对立的
         * @axis [n.] 轴；轴线
         */
        public static void array_20(){}
        /**
         * @deteriorate [v.] 恶化；变坏
         * @aggravate [v.] 加重；加剧；使恶化
         * @degrade [v.] 降解；降低...身份；使恶化；使退化
         * @upgrade [v.] 使升级；提高；改善
         * @erode [v.] 侵蚀；腐蚀
         */
        public static void array_21(){}
        /**
         * @Mediterranean [adj./n.] 地中海的；地中海地区的；地中海；地中海地区
         * @Atlantic [n.] 大西洋
         * @pacific [adj./n.] 平静的；平和的；太平洋的；太平洋
         */
        public static void array_22(){}
        /**
         * @ocean [n.] 海洋；洋
         * @marine [adj./n.] 海洋的；海生的；海事的/水兵
         * @navigation [n.] 航海；航行
         */
        public static void array_23(){}
        /**
         * @gulf [n.] 海湾
         * @beach [n.] 海滩；河滩
         * @coast [n.] 海岸；海滨
         */
        public static void array_24(){}
        /**
         * @shore [n.] （海、湖等大水域的）岸；滨
         * @tide [n.] 趋势；潮流；潮汐
         * @current [n.] 水流；潮流；电流；气流
         */
        public static void array_25(){}
        /**
         * @brook [n.] 小河；溪
         * @stream [n./v.] 小河；溪；流；流动；流出
         * @source [n.] 河的源头；根源
         * @shallow [adj.] 浅的；肤浅的；浅薄的
         */
        public static void array_26(){}
        /**
         * @superficial [adj.] 表皮的；表层的
         * @flat [adj.] 平躺的；扁平的；单调的
         * @smooth [adj.] 光滑的；平稳的；流畅的
         * @rough [adj.] 粗糙的；粗略的
         * @sandy [adj.] 含沙的；铺满沙的
         * @stony [adj.] 石头的；多石的
         */
        public static void array_27(){}
        /**
         * @vertical [adj.] 垂直的；直立的
         * @steep [adj.] 陡峭的
         * @parallel [n./adj./v.] 平行线；相似之处/平行的/与...相似；比得上
         * @narrow [adj./n.] 狭窄的；有极限的
         */
        public static void array_28(){}
        /**
         * @Oceania [n.] 大洋洲
         * @mainland [n.] 大陆，本土
         * @peninsula [n.] 半岛
         */
        public static void array_29(){}
        /**
         * @climate [n.] 气候；风气，思潮，环境
         * @weather [n.] 天气，气象
         * @meteorology [n.] 气象学
         */
        public static void array_30(){}
        /**
         * @mild [adj.] 温和的；不严重的
         * @heating [n.] 供暖；暖气装置
         * @moderate [adj./v.] 适度的；温和的；中等的/使缓和
         * @warm [adj./v.] 温暖的/（使）变暖
         */
        public static void array_31(){}
        /**
         * @thermal [adj.] 热量的
         * @tropics [n.] 热带地区
         * @arid [adj.] 干燥的；干旱的；枯燥的
         */
        public static void array_32(){}
        /**
         * @moist [adj.] 潮湿的；湿润的
         * @damp [adj.] 湿气重的；潮湿的
         * @humid [adj.] 潮湿的；湿热的
         */
        public static void array_33(){}
        /**
         * @snowy [adj.] 下雪多的；被雪覆盖的
         * @frost [n.] 霜；霜冻；严寒
         * @hail [n./v.] 冰雹/赞扬；招呼；下冰雹
         * @thaw [v./n.] 解冻；融解；融化/解冻时期
         */
        public static void array_34(){}
        /**
         * @chill [v./n.] 使变冷；使恐惧/寒冷；害怕
         * @freeze [v./n.] 结冰；霜冻；严寒期
         * @frigid [adj.] 寒冷的
         * @tremble [v./n.] 战栗；颤抖
         * @shiver [v.] 颤抖；哆嗦；发抖
         */
        public static void array_35(){}
        /**
         * @thunder [n./v.] 雷；雷声/打雷；轰隆隆的快速移动
         * @lightning [n./v.] 闪电/闪电般的，极快的
         * @stormy [adj.] 有暴风雨的；争吵激烈的；（大海）波涛汹涌的
         */
        public static void array_36(){}
        /**
         * @downpour [n.] 倾盆大雨
         * @rainfall [n.] 降雨量
         * @sprinkle [v./n.] 撒；下小雨/少量；小雨
         * @rainbow [n.] 彩虹
         * @shower [n.] 阵；阵雨；淋浴
         */
        public static void array_37(){}
        /**
         * @Celsius [adj./n.] 摄氏的/摄氏温度
         * @temperature [n.] 气温；体温；温度
         * @forecast [n./v.] 预测；预报/预测；预言
         */
        public static void array_38(){}
        /**
         * @peak [n./v.] 山峰；顶点；达到最大值
         * @mount [v./n.] 渐渐增加；爬上；登上/山
         * @mountain [n.] 山，山岳，高山
         * @range [n.] 山脉；范围
         */
        public static void array_39(){}
        /**
         * @ridge [n./v.] 山脊；山脉/使隆起
         * @slope [v./n.] 倾斜；有坡度；山坡；斜坡
         * @valley [n.] 山谷；溪谷
         * @hillside [n.] 小山的山腰；山坡
         * @overlook [v.] 远眺；俯瞰；未注意到
         */
        public static void array_40(){}
        /**
         * @southern [adj.] 南方的
         * @southeast [n./adj.] -
         * @southwest [n./adj.] -
         */
        public static void array_41(){}
        /**
         * @northeast [n./adj.] -
         * @northwest [n./adj.] -
         * @eastern [adj.] -
         * @oriental [adj.] 东方的（尤其指中日）
         */
        public static void array_42(){}
        /**
         * @inevitable [adj.] 必然的；不可避免的
         * @irreversible [adj.] 不可逆转的；不可挽回的
         * @irregularly [adv.] 不规则地；不合常规地
         * @inappropriate [adj.] 不合适的
         * @abnormal [adj.] 不正常的；反常的；变态的
         */
        public static void array_43(){}
        /**
         * @sediment [n.] 沉积物；沉淀物
         * @silt [n./v.] 淤泥；泥沙；使淤塞
         * @muddy [adj.] 泥泞的；浑浊的
         * @clay [n.] 黏土；陶土
         * @dirt [n.] 污垢；灰尘；泥土
         */
        public static void array_44(){}
        /**
         * @rural [adj.] 农村的；乡村的；田园的
         * @suburb [n.] 郊区；郊外；近郊
         * @outskirts [n.] 郊区；市郊
         */
        public static void array_45(){}
        /**
         * @remote [adj.] 遥远的；偏僻的；疏远的
         * @desolate [adj.] 荒凉的
         * @distant [adj.] 疏远的；遥远的
         * @adjacent [adj.] 邻近的；毗连的
         */
        public static void array_46(){}
        /**
         * @toxic [adj.] 有毒的
         * @pollution [n.] -
         * @pollutant [n.] 污染物质
         * @contaminate [v.] 污染；弄脏
         */
        public static void array_47(){}
        /**
         * @geology [n.] 地质学；地质状况
         * @border [n./v.] 边界；边界地区；镶边；和...毗邻；形成...边界
         * @margin [n.] 边缘；页边空白；余地
         * @fringe [n./adj.] 边缘；刘海/非主要的；次要的
         */
        public static void array_48(){}
        /**
         * @plate [n.] 板块；盘
         * @debris [n.] 碎片；残骸
         * @crack [v./n.] 破裂；发出爆裂声/裂缝；缝隙
         * @gap [n.] 缺口；裂缝；差距；空白
         */
        public static void array_49(){}
        /**
         * @splendid [adj.] 极好的；壮观的
         * @grand [adj.] 宏大的；豪华的；宏伟的；极好的
         * @magnificent [adj.] 壮丽的；宏伟的；令人印象深刻的
         */
        public static void array_50(){}
        /**
         * @super [adj.] -
         * @interesting [adj.] -
         * @dramatic [adj.] 戏剧的；引人入胜的
         */
        public static void array_51(){}
        /**
         * @wilderness [n.] 荒野
         * @desert [n./v.] /ˈdez.ət/ 沙漠/ /dɪˈzɜːt/遗弃
         * @deforest [v.] 毁掉...深林
         */
        public static void array_52(){}
        /**
         * @barren [adj.] 贫瘠的；荒芜的；不结果实的
         * @fertile [adj.] 富饶的；肥沃的
         * @fertilise [v.]  施肥于
         */
        public static void array_53(){}
        /**
         * @solar [adj.] 太阳的；日光的
         * @lunar [adj.] 月亮的；月球的
         * @calendar [n.] 日历；历法
         */
        public static void array_54(){}
        /**
         * @sunrise [n.] 日出
         * @sunset [n.] -
         * @eclipse [n.] 日食；月食
         */
        public static void array_55(){}
        /**
         * @dusk [n.] 黄昏
         * @heaven [n.] 天堂；极乐之地
         * @paradise [n.] 天堂；乐园；福地
         */
        public static void array_56(){}
        /**
         * @sunshine [n.] 阳光；日光
         * @shade [n./v.] 阴影部分；背阴处；给...遮挡（光线）
         * @shadow [n.] 影子
         */
        public static void array_57(){}
        /**
         * @vapour [n.]  蒸汽；水汽
         * @evaporate [v.] 使蒸发；消失
         * @circulate [v.] 循环；流通；传播
         * @precipitate [v.] 凝结；沉淀
         */
        public static void array_58(){}
        /**
         * @reservoir [n.] 水库；蓄水池
         * @waterfall [n.] -
         * @fountain [n.] 喷泉；源泉
         * @spring [n.] 春天；泉水
         * @dew [n.] 露水
         */
        public static void array_59(){}
        /**
         * @pour [v.] 倾泻；倒；倾盆而下
         * @drain [v./n.] 排空；流出；耗竭
         * @drip [v.] 滴出（液体）；滴下
         * @drown [v.] 淹死；浸泡
         */
        public static void array_60(){}
        /**
         * @blow [v./n.] 吹；打击；挫折
         * @puff [v./n.] 喷出；喘息；（吹出的）一股；一缕
         * @gush [v./n.] 涌出
         */
        public static void array_61(){}
        /**
         * @dense [adj.] 密集的；稠密的
         * @intensity [n.] 强度；强烈
         * @intensive [adj.] 加强的；集中的；密集的
         */
        public static void array_62(){}
        /**
         * @emerge [v.] 浮现；露出；暴露；摆脱出来
         * @flash [v./n.]
         * @float [v.]
         */
        public static void array_63(){}
        /**
         * @environment [n.] -
         * @surrounding [adj.] 周围的；附近的
         * @condition [n.] 条件；情况；状态
         * @situation [n.] -
         */
        public static void array_64(){}
        /**
         * @nature [n.] -
         * @natural [adj.] -
         * @artificial [adj.] 人造的
         * @synthetic [adj.] 人造的；合成的
         */
        public static void array_65(){}
        /**
         * @petrol [n.] [英]汽油
         * @gas [n.] 气体；[美]汽油
         * @gasoline [n.] [美]汽油
         * @petroleum [n.] 石油
         */
        public static void array_66(){}
    }
    /**
     *
     * @label 02_植物研究
     * @wordCount 130
     * @groupCount 34
     */
    public static class Class_botany{



        /**
         * @photosynthesis [n.] 光合作用
         * @respire [v.] 呼吸
         * @dioxide [n.] 二氧化物
         */
        public static void array_1(){}
        /**
         * @vegetation [n.] 植物；草木
         * @herb [n.] 药草；香草
         * @perennial [n./adj.] 多年生植物；长期的；持久的
         */
        public static void array_2(){}
        /**
         * @botany [n.] 植物学
         * @ecology [n.] 生态学；生态
         * @ecosystem [n.] 生态系统
         * @eco-friendly [adj.] 对生态环境友好的
         */
        public static void array_3(){}
        /**
         * @horticulture [n.] 园艺学；园艺
         * @organism [n.] 有机体；生物
         * @genetics [n.] 遗传学
         */
        public static void array_4(){}
        /**
         * @mutation [n.] 突变；变异
         * @variation [n.] 变种；变异
         * @diversity [n.] 多样性
         * @hybridisation [n.] 杂交
         * @classify [v.] 分类
         */
        public static void array_5(){}
        /**
         * @reproduce [v.] 繁殖
         * @evolve [v.] 进化；发展
         * @fluctuate [v.] 波动；起伏
         */
        public static void array_6(){}
        /**
         * @reclaim [v.] 开垦；利用
         * @cultivate [v.] 耕作；培养
         * @sow [v.] 播种
         * @harvest [v./n.] 收割；收获；收成
         */
        public static void array_7(){}
        /**
         * @pluck [v.] 采；摘
         * @pick [v.] 拾；摘
         * @yield [v./n.] 产出；屈服；服从；产量；投资收益
         * @rear [v./n.] 培养；抚养；饲养；后部
         * @arable [adj.] 适合耕种的
         */
        public static void array_8(){}
        /**
         * @plough [n./v.]  犁；耕
         * @spade [n.] 铲；锹
         * @rake [n./v.] 耙子；耙；搜索
         */
        public static void array_9(){}
        /**
         * @stack [n./v.] 堆；垛；堆积
         * @heap [n.] （大而杂乱的）堆
         * @bundle [n.] 捆；包；束
         * @bunch [n.] 一束（花）；一串（钥匙）
         * @vase [n.] 瓶；花瓶
         */
        public static void array_10(){}
        /**
         * @sunlight [n.] 阳光
         * @short-day [adj.] 短日照的
         * @shade-tolerant [adj.] 耐阴的
         * @fungus [n.] 真菌
         * @mould [n./v.]  霉菌/发霉
         */
        public static void array_11(){}
        /**
         * @pollen [n./v.] 花粉；给...授粉
         * @germinate [v.] 发芽
         * @seed [n.] 种子
         * @burgeon [n./v.] 嫩枝；新芽/极速生长；发芽；抽枝
         * @bud [n.] 芽；苞；蓓蕾
         */
        public static void array_12(){}
        /**
         * @flower [n./v.] 花；开花植物/成熟；繁荣；开花
         * @blossom [v./n.] 开花；花朵
         * @bloom [n.] 花朵
         * @scent [n./v.] 气味；香味；使具有香味
         * @aromatic [adj.] 芳香的
         */
        public static void array_13(){}
        /**
         * @ripen [v.] 使成熟
         * @fruit [v.] 结果实
         * @wither [v.] （使）枯萎
         * @decompose [v.] 分解；腐烂
         */
        public static void array_14(){}
        /**
         * @rot [v./n.] 使腐烂；使腐坏；腐烂
         * @decay [v.] 腐烂
         * @stale [adj.] 不新鲜的；没有新意的；陈腐的
         */
        public static void array_15(){}
        /**
         * @rainforest [n.] 雨林
         * @jungle [n.] 丛林
         * @plantation [n.] 种植园
         * @field [n.] 原野；场地；野外
         * @terrace [n.] 梯田
         */
        public static void array_16(){}
        /**
         * @timber [n.] 木材；木料；林木
         * @charcoal [n.] 木炭
         * @log [n.] 原木；日志
         * @logo [n.] 标识；徽标
         * @forestry [n.] 林学；林业
         */
        public static void array_17(){}
        /**
         * @branch [n.] 树枝；分支机构；分店
         * @trunk [n.] 树干；躯干；大箱子
         * @bough [n.] 大树枝
         * @root [n./v.] 根；使生根
         */
        public static void array_18(){}
        /**
         * @hay [n.] 干草
         * @straw [n.] 稻草；麦秆；吸管
         * @reed [n.] 芦苇
         * @thorn [n.] 刺；荆棘
         * @weed [n.] 杂草
         */
        public static void array_19(){}
        /**
         * @grass [n.] 草；草地
         * @meadow [n.] 草地；牧草
         * @lawn [n.] 草地；草坪
         */
        public static void array_20(){}
        /**
         * @olive [n.] 橄榄；橄榄树
         * @pine [n.] 松树；松木
         * @vine [n.] 葡萄藤
         */
        public static void array_21(){}
        /**
         * @violet [n.] 紫罗兰
         * @tulip [n.] 郁金香
         * @mint [n./v.] 薄荷；铸币厂/铸造（硬币）
         */
        public static void array_22(){}
        /**
         * @reef [n.] 暗礁
         * @alga [n.] 海藻
         * @enzyme [n.] 酶
         * @catalyst [n.] 催化剂；促进因素
         */
        public static void array_23(){}
        /**
         * @release [v./n.] 释放；发布
         * @emission [n.] 排放；散发；排放物
         * @absorb [v.] 吸收；吸引全部注意力
         * @circulation [n.] 流通；循环；流传
         */
        public static void array_24(){}
        /**
         * @exceed [v.] 超出
         * @uptake [n.] 摄取；领会
         * @nutrient [n.] 营养物质
         * @energy [n.] 能源；精力
         */
        public static void array_25(){}
        /**
         * @surroundings [n.] 环境可与environment互换
         * @mechanism [n.] 机制；构造
         * @counterbalance [n./v.] 其平衡作用的事物；抵消；对...起平衡作用
         */
        public static void array_26(){}
        /**
         * @protect [v.] 保护
         * @preserve [v.] 保护；维持；保存
         * @conservation [n.] （对自然环境的）保护；保存
         */
        public static void array_27(){}
        /**
         * @bush fire [n.] 林区大火
         * @extinguish [v.] 扑灭（火）；使（想法；感情等）破灭
         * @destruct [v.] （使）自毁
         * @ruin [v./n.] 毁坏；摧毁；毁灭；废墟
         * @perish [v.] 毁灭；消亡；腐烂
         */
        public static void array_28(){}
        /**
         * @demolish [v.] 毁坏；拆除；推翻
         * @infringe [v.] 侵犯；违反
         * @undermine [v.] 破坏；逐渐削弱
         * @extinction [n.] 灭绝
         */
        public static void array_29(){}
        /**
         * @pattern [n.] 模式；样式；底样
         * @outcome [n.] 结果
         * @impact [n.] 影响
         */
        public static void array_30(){}
        /**
         * @seasonal [adj.] 季节性的
         * @experimental [adj.] 实验性的
         * @favourable [adj.] 有利的；赞成的；肯定的
         */
        public static void array_31(){}
        /**
         * @productive [adj.] 多产的
         * @effective [adj.] 有效的
         * @efficient [adj.] 效率高的
         */
        public static void array_32(){}
        /**
         * @considerable [adj.] 相当多的
         * @massive [adj.] 巨大的；大规模的；庞大的
         * @immense [adj.] 巨大的；极好的
         */
        public static void array_33(){}
        /**
         * @maximal [adj.] 最大的
         * @minimal [adj.] 最小的
         * @optimal [adj.]  最佳的；最理想的
         */
        public static void array_34(){}
    }
    /**
     *
     * @label 03_动物保护
     * @wordCount 168
     * @groupCount 43
     */
    public static class Class_zoology{



        /**
         * @biologist [n.] 生物学家
         * @zoologist [n.] 动物学家
         * @ecologist [n.] 生态学家
         * @botanist [n.] 植物学家
         */
        public static void array_1(){}
        /**
         * @mammal [n.] 哺乳动物
         * @primate [n.] 灵长动物
         * @vertebrate [n.] 脊椎动物
         * @reptile [n.] 爬行动物
         */
        public static void array_2(){}
        /**
         * @amphibian [n./adj.] 两栖动物/两栖的
         * @carnivore [n.] 肉食动物
         * @herbivore [n.] 食草动物
         */
        public static void array_3(){}
        /**
         * @creature [n.] 生物；动物
         * @wildlife [n.] 野生动我
         * @fauna [n.] （尤指某一地区的）动物群
         * @flora [n.] （尤指某一地区的）植物群
         * @species [n.] 物种
         */
        public static void array_4(){}
        /**
         * @flock [n./v.] （羊或鸟）群/聚集
         * @herd [n.] 兽群；畜群
         * @swarm [n.] （蜜蜂昆虫的）一大群；（快速移动的）人群
         * @throng [n./v.] 人群/群集
         * @crowd [n.] 人群；观众；一群人
         */
        public static void array_5(){}
        /**
         * @beast [n.] 野兽；凶残的人；畜生
         * @brute [n.] 粗野的人；残忍的人
         * @cruel [adj.] 残忍的；残暴的
         */
        public static void array_6(){}
        /**
         * @originate [v.] 发源；来自；创始
         * @derive [v.] 得到；（使）源自
         * @stem [v./n.] 起源于；来自/茎；梗
         */
        public static void array_7(){}
        /**
         * @ancestor [n.] 祖宗；祖先
         * @descendant [n./adj.] 后裔；后代/下降的
         * @offspring [n.] 后代；子孙；产物
         * @subgroup [n.] 子群
         */
        public static void array_8(){}
        /**
         * @feed [v.] 供养；喂养；进食
         * @breed [v./n.] 饲养；繁殖/品种
         * @interbreed [v.] （使）品种杂交
         */
        public static void array_9(){}
        /**
         * @hybridize [v.] （使）杂交
         * @proliferate [v.] 迅速增殖；剧增
         * @sterility [n.] 不生育
         */
        public static void array_10(){}
        /**
         * @mate [v./n.] 交配/配偶
         * @courtship [n.] 求偶
         * @lay [v.] 产；放置；铺设
         */
        public static void array_11(){}
        /**
         * @hatch [v./n.] 孵化
         * @brood [n./v.] 一窝幼鸟；孵（蛋）
         * @spawn [n./v.] （鱼、蛙的）卵；产卵；引起
         * @mature [adj./v.] 成熟的；成熟
         */
        public static void array_12(){}
        /**
         * @skin [n.] 皮肤
         * @claw [n./v.] 爪；钳；鳌；爪状物/抓；挠；撕
         * @paw [n.] （动物的）脚掌；爪子
         * @beak [n.] 鸟嘴；喙
         */
        public static void array_13(){}
        /**
         * @fin [n.] 鳍
         * @wing [n.] 翅膀
         * @plume [n.] 羽毛
         * @feather [n.] 羽毛
         */
        public static void array_14(){}
        /**
         * @fur [n.] 软毛；毛皮
         * @bristle [n.] 鬃毛；短而硬的毛，刚毛
         * @curl [n./v.] 卷曲；螺旋状物/（使）卷曲
         */
        public static void array_15(){}
        /**
         * @insect [n.] 昆虫
         * @worm [n.] 蠕虫
         * @pest [n.] 害虫；有害动物
         * @parasite [n.] 寄生虫
         */
        public static void array_16(){}
        /**
         * @spider [n.] 蜘蛛
         * @butterfly [n.] 蝴蝶
         * @mosquito [n.] 蚊子
         * @cricket [n.] 蟋蟀
         */
        public static void array_17(){}
        /**
         * @penguin [n.] 企鹅
         * @seal [n./v.] 海豹；封条；图章；密封
         * @tortoise [n.] 龟；陆龟
         * @turtle [n.] 海龟
         * @whale [n./v.] 鲸；捕鲸
         */
        public static void array_18(){}
        /**
         * @kangaroo [n.] 袋鼠
         * @camel [n.] 骆驼
         * @panda [n.] 熊猫
         */
        public static void array_19(){}
        /**
         * @elephant [n.] 大象
         * @trunk [n.] 象鼻
         * @ivory [n.] 象牙
         * @horn [n.] （牛羊等动物的）角；（乐器的）号
         */
        public static void array_20(){}
        /**
         * @bear [n.] 熊
         * @wolf [n.] 狼
         * @dragon [n.] 龙；悍妇
         * @fox [n.] 狐狸🦊；狡猾的人
         */
        public static void array_21(){}
        /**
         * @cub [n.] 幼兽
         * @calf [n.] 幼兽；小牛🐂
         * @pup [n.] 幼小动物
         * @lamb [n.] 羔羊
         */
        public static void array_22(){}
        /**
         * @cattle [n.] 牛
         * @ox [n.] （阉割的）公牛
         * @bull [n.] 公牛
         * @buffalo [n.] 水牛；野牛
         */
        public static void array_23(){}
        /**
         * @horse [n.] 马🐴
         * @zebra [n.] 斑马🦓
         * @donkey [n.] 驴子
         * @saddle [n.] 鞍；马鞍；车座
         * @harness [n.] 马具；挽具
         */
        public static void array_24(){}
        /**
         * @falcon [n.] 隼；猎鹰
         * @hawk [n.] 鹰；隼
         * @eagle [n.] 雕
         * @owl [n.] 猫头鹰
         * @swallow [n.] 燕子
         * @sparrow [n.] 麻雀
         * @pigeon [n.] 鸽子
         * @crow [n.] 乌鸦
         */
        public static void array_25(){}
        /**
         * @swan [n.] 天鹅
         * @goose [n.] 鹅；鹅肉
         * @cock [n.] 公鸡；雄禽
         */
        public static void array_26(){}
        /**
         * @mouse [n.] 老鼠；鼠标
         * @rat [n.] 老鼠；卑鄙的人
         * @squirrel [n.] 松树
         * @hare [n.] 野兔
         * @frog [n.] 青蛙
         */
        public static void array_27(){}
        /**
         * @behaviour [n.]  行为；活动方式
         * @bite [v./n.] 咬；（昆虫）叮；吞饵
         * @sting [v./n.] 刺；叮；（使）感觉刺痛；鳌针；蜇痛
         * @bark [v./n.] 吠；大声嚷；树皮
         * @roar [n./v.] 吼叫；咆哮
         */
        public static void array_28(){}
        /**
         * @rub [v./n.] 擦；摩擦/困难；障碍
         * @creep [v.] 爬行；悄悄地爬行
         * @crawl [v.] 爬；爬行；卑躬屈膝；巴结
         */
        public static void array_29(){}
        /**
         * @habitat [n.] 栖息地
         * @nest [n.] 巢；窝；穴
         * @hive [n./v.] 蜂房；繁忙的场所；（使）入蜂箱；（像蜜蜂般）密集群居
         * @cell [n.] 蜂房巢室；细胞；单人牢房
         */
        public static void array_30(){}
        /**
         * @cage [n.] 笼子
         * @stable [n./adj.] 马厩；牛棚；稳定的
         * @barn [n.] 谷仓；牲口棚
         * @hedge [n.] 树篱；障碍物
         * @barrier [n.] 障碍
         * @bar [n.] 栅；栏杆；条；长块
         */
        public static void array_31(){}
        /**
         * @anatomy [n.] 解剖学
         * @epidemic [n./adj.] 流行病；（坏事的）盛行；流行性的；极为盛行的
         * @gene [n.] 基因
         */
        public static void array_32(){}
        /**
         * @germ [n.] 微生物；细菌
         * @bacteria [n.] 细菌；bacterium 的复数形式
         * @virus [n.] 病毒
         * @microbe [n.] 微生物
         */
        public static void array_33(){}
        /**
         * @metabolism [n.] 新陈代谢
         * @protein [n.] 蛋白质
         * @vitamin [n.] 维生素
         */
        public static void array_34(){}
        /**
         * @secrete [v.] 分泌
         * @excrete [v.] 排泄；分泌
         * @devour [v.] 吞食；狼吞虎咽的吃
         */
        public static void array_35(){}
        /**
         * @instinct [n.] 本能；天性；直觉
         * @intuitive [adj.] 直觉的
         * @potential [n./adj.] 潜力/潜在的
         * @intelligence [n.] 智慧；智力；情报；谍报
         * @functional [adj.] 功能的；起作用的
         */
        public static void array_36(){}
        /**
         * @sensitive [adj.] 灵敏的；易担忧的；需谨慎对待的
         * @flexible [adj.] 灵活的；弹性的
         * @acoustic [adj.] 听觉的；声音的
         * @optical [adj.] 视觉的；光学的
         */
        public static void array_37(){}
        /**
         * @nocturnal [adj.] 夜间活动的
         * @dormant [adj.] 睡着的；休眠的；（动物等）冬眠的
         * @hibernation [n.] 冬眠
         */
        public static void array_38(){}
        /**
         * @track [v./n.] 追踪；足迹；踪迹；轨道
         * @trace [v./n.] 追踪；查出；追溯；痕迹；少许
         * @alternate [v.] （使）交替；（使）轮流
         */
        public static void array_39(){}
        /**
         * @prey [n./v.] 猎物；捕食
         * @predator [n.] 掠夺者；捕食性动物
         * @victim [n.] 受害者
         * @captive [n./adj.] 俘虏；被关押的；收控制的
         * @defensive [adj.] 防御性的
         */
        public static void array_40(){}
        /**
         * @undergo [v.] 经历；经受
         * @suffer [v.] 遭受；受折磨；变糟
         * @vulnerable [adj.] 易受伤的；脆弱的
         */
        public static void array_41(){}
        /**
         * @subsistence [n.] 勉强维持生活
         * @exist [v.] 存在；生存
         * @exterminate [v.] 消灭；根除
         */
        public static void array_42(){}
        /**
         * @tame [v./adj.] 驯养；制服/驯服的；乏味的
         * @keeper [n.] 看守人；饲养员
         * @shepherd [n.] 牧羊人，羊倌
         */
        public static void array_43(){}
    }
    /**
     *
     * @label 04_太空探索
     * @wordCount 75
     * @groupCount 20
     */
    public static class Class_outer_space{



        /**
         * @galaxy [n.] 星系
         * @cosmos [n.] 宇宙
         * @universe [n.] 宇宙；万物；世界
         * @interstellar [adj.] 星际的
         */
        public static void array_1(){}
        /**
         * @terrestrial [adj.] 地球的；陆地的
         * @celestial [adj.] 天上的
         * @astronomy [n.] 天文学
         * @astrology [n.] 占星术；占星学
         * @astronaut [n.] 宇航员
         */
        public static void array_2(){}
        /**
         * @comet [n.] 彗星
         * @meteorite [n.] 陨石
         * @crater [n.] （撞击或爆炸形成的）坑
         */
        public static void array_3(){}
        /**
         * @dust [n.] 尘土；灰尘
         * @ash [n.] 灰烬
         * @envelope [n.] 外裹物；外层
         * @chunk [n.] 厚块
         */
        public static void array_4(){}
        /**
         * @spacecraft [n.] 宇宙飞船
         * @spaceship [n.] 宇宙飞船
         * @probe [n.] 太空探测器；详尽调查
         * @module [n.] 模块
         */
        public static void array_5(){}
        /**
         * @propulsion [n.] 推进力
         * @pressure [n.] 压力
         * @dynamics [n.] 动力学；动态
         * @motion [n.] 作物；移动
         */
        public static void array_6(){}
        /**
         * @vent [n./v.] 排气口；排放；发泄
         * @tail [n.] 尾部
         * @curve [n.] 曲线；弧线
         */
        public static void array_7(){}
        /**
         * @exploration [n.] 探索
         * @expedition [n.] 远征；探险
         * @flyby [n.] （航天器对行星或卫星的）飞掠
         */
        public static void array_8(){}
        /**
         * @observatory [n.] 天文台
         * @telescope [n.] 望远镜
         * @spectacle [n.] 壮观的景象；奇观
         */
        public static void array_9(){}
        /**
         * @orbit [n.] 轨道
         * @ecliptic [n.] 黄道
         * @diameter [n.] 直径
         * @radius [n.] 半径
         */
        public static void array_10(){}
        /**
         * @substance [n.] 物质；实质；要旨
         * @composition [n.] 成分；构成；作品；创作
         * @compound [n./adj./v.] 混合物；化合物。复合的；组合的。混合
         */
        public static void array_11(){}
        /**
         * @fossil [n.] 化石
         * @sample [n.] 样品；样本
         * @specimen [n.] 样品；标本
         */
        public static void array_12(){}
        /**
         * @particle [n.] 颗粒；微粒；极小量
         * @molecule [n.] 分子
         * @atom [n.] 原子
         * @ion [n.] 离子
         * @electron [n.] 电子
         * @quantum [n.] 量子
         */
        public static void array_13(){}
        /**
         * @liquid [n./adj.] 液体；液体的
         * @fluid [n./adj.] 液体；流体。流动的
         * @solid [n./adj.] 固体。固体的；牢固的
         */
        public static void array_14(){}
        /**
         * @synthesise [v.]  合成；综合
         * @formation [n.] 形成
         * @method [n.] 方法
         */
        public static void array_15(){}
        /**
         * @spectrum [n.] 光谱；范围
         * @dimension [n.] 维度
         * @frequency [n.] 频率；发生次数
         * @signal [n.] 信号
         * @antenna [n.] 天线
         * @circuit [n.] 线路；电路；巡回
         */
        public static void array_16(){}
        /**
         * @refraction [n.] 折射
         * @ultraviolet [n./adj.] 紫外辐射。紫外线的
         * @radioactive [adj.] 放射性的
         */
        public static void array_17(){}
        /**
         * @distinct [adj.] 明显的；截然不同的
         * @discernible [adj.] 可辨别的；看得清的
         * @invisible [adj.] 看不见的
         */
        public static void array_18(){}
        /**
         * @collision [n.] 碰撞事故；冲突
         * @squash [v./n.] 压扁；壁球
         * @fragment [n./v.] 碎片；片段；（使）碎裂
         */
        public static void array_19(){}
        /**
         * @cataclysmic [adj.] 剧变的；灾难的
         * @overwhelming [adj.] 压倒性的
         * @despair [v./n.] 绝望
         * @desperate [adj.] 绝望的；急需要的
         * @hopeless [adj.] 无望的；极差的
         */
        public static void array_20(){}
    }
    /**
     *
     * @label 05_学校教育
     * @wordCount 401
     * @groupCount 107
     */
    public static class Class_education{



        /**
         * @education [n.]
         * @primary [adj.] -
         * @secondary [adj.] -
         */
        public static void array_1(){}
        /**
         * @university [n.] -
         * @college [n.] 学院；大学
         * @institute [n.] 研究所
         * @academy [n.] 专科院校；（美国的）私立学校；研究会；学会
         */
        public static void array_2(){}
        /**
         * @learn [v.] 学习；得知
         * @study [v./n.] 学习；研究
         * @acquire [v.] 获得；购得
         * @knowledge [n.] 知识
         */
        public static void array_3(){}
        /**
         * @expertise [n.] 专门技能
         * @novice [n.] 新手
         * @recruit [v.] 吸收（新成员）
         */
        public static void array_4(){}
        /**
         * @literate [adj.] 有读写能力的
         * @illiteracy [n.] 文盲
         * @numerate [adj.] 识数的；有计算能力的
         */
        public static void array_5(){}
        /**
         * @problem [n.] 问题；习题
         * @issue [n./v.] 重要问题；发行。公布；发出
         * @affair [n.] 事件；公共事件
         * @controversial [adj.] 有争议的
         */
        public static void array_6(){}
        /**
         * @puzzle [n./v.] 难题；谜。使迷惑
         * @riddle [n.] 谜；谜语
         * @obscure [adj.] 难以理解的
         */
        public static void array_7(){}
        /**
         * @instil [v.]  逐渐灌输
         * @cram [v.] 把...塞进；（为应考）临时死记硬背
         * @emphasise [v.] 强调；着重
         * @enhance [v.] 提高；增强
         */
        public static void array_8(){}
        /**
         * @enable [v.] 使能够
         * @inspire [v.] 鼓舞；给...灵感
         * @motive [n.] 动机；缘由
         * @motivate [v.] 激发；驱使
         */
        public static void array_9(){}
        /**
         * @stimulate [v.] 刺激；激励
         * @spur [v./n.] 鞭策；激发。马刺；刺激
         * @impetus [n.] 推动；促进；动量；惯性
         */
        public static void array_10(){}
        /**
         * @indulge [v.] 迁就；放任；沉湎；让...享受一下
         * @spoil [v.] 宠坏；溺爱；破坏；糟蹋
         * @abuse [v.] 滥用；虐待
         */
        public static void array_11(){}
        /**
         * @intelligent [adj.] 聪明的
         * @clever [adj.] 聪明的；精明的
         * @smart [adj.] 聪明的；智能的
         * @all-round [adj.] 有多方面才能的；全面的
         */
        public static void array_12(){}
        /**
         * @genius [n.] 天才人物；天赋
         * @elite [n.] 精英
         * @idiot [n.] 白痴；傻瓜
         */
        public static void array_13(){}
        /**
         * @wisdom [n.] 智慧；学问
         * @wit [n.] 风趣的人；机智；风趣；智慧
         * @aptitude [n.] 天生的才能；资质
         * @capable [adj.] 有能力的；有才能的
         */
        public static void array_14(){}
        /**
         * @excellent [adj.] 杰出的；优秀的
         * @outstanding [adj.] 突出的；杰出的
         * @brilliant [adj.] 光辉的；聪明的；（光线等）明亮的
         */
        public static void array_15(){}
        /**
         * @prestige [n.] 威望；声望
         * @reputation [n.] 名誉；声誉
         * @eminent [adj.] 著名的；杰出的
         * @notorious [adj.] 名声狼藉的
         */
        public static void array_16(){}
        /**
         * @esteem [v.] 尊重；尊敬
         * @respect [n./v.] 尊敬；敬重
         * @diligent [adj.] 勤勉的；勤奋的
         * @painstaking [adj.] 极其仔细的；辛苦的
         */
        public static void array_17(){}
        /**
         * @skill [n.] 技巧
         * @approach [n./v.] 方法。接近
         * @scheme [n./v.] 计划；方案；阴谋。谋划
         */
        public static void array_18(){}
        /**
         * @headmaster [n.] [英]男校长
         * @principal [n./adj.] [美]（中小学）校长；[英]大学校长；学院院长。首要的
         * @dean [n.] （大学的）学院院长；系主任
         * @faculty [n.] （大学的）系、院；全体教员
         */
        public static void array_19(){}
        /**
         * @professor [n.] 教授
         * @scholar [n.] 学者
         * @scientist [n.] 科学家
         * @mentor [n.] 导师；顾问
         * @tutor [n.] 家庭教师；（英国大学或者学院的）导师
         */
        public static void array_20(){}
        /**
         * @lecturer [n.] 讲师
         * @assistant [n.] 助理；助手
         * @candidate [n.] 候选人；求职者；考生
         */
        public static void array_21(){}
        /**
         * @degree [n.] 学位；程度
         * @qualify [v.] （使）有资格、有权
         * @certify [v.] 证明；颁发专业合格证书
         * @license [n.] 执照；许可证
         * @permit [n.] 许可证
         */
        public static void array_22(){}
        /**
         * @diploma [n.] 毕业文凭
         * @diplomat [n.] 外交官；善于交际的人
         * @ambassador [n.] 大使
         */
        public static void array_23(){}
        /**
         * @pupil [n.] 小学生；瞳孔
         * @graduate [n./v.] 毕业生；毕业
         * @ceremony [n.] 典礼；礼节
         */
        public static void array_24(){}
        /**
         * @bachelor [n.] 学士；单身汉
         * @master [n./v.] 硕士；大师。精通；控制
         * @doctor [n.] 博士；医生
         */
        public static void array_25(){}
        /**
         * @fresher [n.] [英]（大学）一年级新生
         * @sophomore [n.] [美]（大学或高中）二年级学士
         * @junior [n./adj.] [美]（大学或高中）三年级学生；较年幼者。青少年的；级别（或地位）较低的
         * @senior [n./adj.] [美]（大学或高中）毕业班学士；较年长者。成人的；资深的
         * @alumni [n.] [alumnus 的复数形式]毕业生；校友
         */
        public static void array_26(){}
        /**
         * @campus [n.] （大专院校的）校园
         * @orientation [n.] 迎新会；方向
         * @platform [n.] 平台；讲台
         * @coed [adj./n.] 男女同校的。（男女同校的大学生中的）女生
         */
        public static void array_27(){}
        /**
         * @register [v./n.] 登记；注册。登记表；注册簿
         * @roster [n.] 花名册；登记表；执勤表
         * @enrol [v.] 登记；注册；加入
         * @matriculation [n.] 注册入大学
         */
        public static void array_28(){}
        /**
         * @accommodation [n.] 住处；食宿招待
         * @dorm [n.] 宿舍
         * @dining hall [n.] 食堂
         * @canteen [n.] 水壶；[英]食堂
         */
        public static void array_29(){}
        /**
         * @laboratory [n.] 实验室；研究室
         * @experiment [n.] 实验；试验
         * @data [n.] [datum 的复数形式]数据
         * @quantity [n.] 数量
         * @quality [n.] 质量
         */
        public static void array_30(){}
        /**
         * @library [n.] 图书馆；个人收藏
         * @literature [n.] 文学；文学作品；文献
         * @article [n.] 文章
         * @author [n.] 作者；作家
         */
        public static void array_31(){}
        /**
         * @tale [n.] 故事；传说
         * @fiction [n.] 小说；虚构；杜撰
         * @story [n.] 故事；小说；（尤指口头的）叙述
         * @diary [n.] 日记；日记簿
         */
        public static void array_32(){}
        /**
         * @poetry [n.] 诗
         * @magazine [n.] 杂志；期刊；弹夹
         * @journal [n.] 日报；周报；（尤指专门科学的）杂志；日志
         * @coverage [n.] 新闻报道；覆盖范围
         */
        public static void array_33(){}
        /**
         * @bibliography [n.] 参考书目
         * @encyclopedia [n.] 百科全书
         * @biography [n.] 传记
         * @documentary [n./adj.] 纪录片；记录的
         * @series [n.] 连续的；一系列；系列节目
         */
        public static void array_34(){}
        /**
         * @record [n.] 记录；履历
         * @file [n./v.] 档案；把...归档
         * @profile [n.] 概述；人物简介；侧面轮廓
         */
        public static void array_35(){}
        /**
         * @draft [n.] 草稿；汇票；起草
         * @sketch [n./v.] 概略；概述
         * @brochure [n.] 小册子
         * @manual [n.] 使用手册；指南；手工的
         */
        public static void array_36(){}
        /**
         * @frame [n.] 框架；眼镜框；构架
         * @index [n./v.] 指数；索引；为...编索引
         * @catalogue [n.] 目录
         * @category [n.] 种类；类别；范畴
         */
        public static void array_37(){}
        /**
         * @inventory [n.] 库存；详细目录
         * @content [n./adj.] 内容；目录；含量。满足的
         * @context [n.] 上下文；语境；背景
         * @list [n./v.] 一览表；目录。列举；把...列表
         */
        public static void array_38(){}
        /**
         * @chapter [n.] （书的）章；（人生或历史的）重要时刻
         * @volume [n.] 卷；体积；容积；音量
         * @reel [n.] 卷轴；卷筒；一卷胶卷
         */
        public static void array_39(){}
        /**
         * @subject [n.] 科目；主题；实验对象
         * @object [n./v.] 物体；目标。反对
         * @major [n./v./adj.] [美]主修科目；专业。主修。主要的
         * @minor [n./adj.] [美]辅修科目。不严重的
         */
        public static void array_40(){}
        /**
         * @sociology [n.] 社会学
         * @politics [n.] 政治学；政治；政治事务
         * @economics [n.] 经济学
         */
        public static void array_41(){}
        /**
         * @marketing [n.] 市场营销
         * @accounting [n.] 会计
         * @audit [n./v.] 审计。旁听；审计
         * @statistics [n.] 统计学
         */
        public static void array_42(){}
        /**
         * @psychology [n.] 心理学；心理特征
         * @philosophy [n.] 哲学
         * @logic [n.] 逻辑学；逻辑
         */
        public static void array_43(){}
        /**
         * @biology [n.] 生物学；生命机理
         * @physics [n.] 物理学
         * @chemistry [n.] 化学
         */
        public static void array_44(){}
        /**
         * @agriculture [n.] 农业；农学
         * @logistics [n.] 物流；后勤
         * @geography [n.] 地理学；地形；地势
         * @history [n.] 历史；历史学
         */
        public static void array_45(){}
        /**
         * @engineering [n.] 工程；工程学
         * @mechanics [n.] 力学；机械学
         * @electronics [n.] 电子学；电子器件
         */
        public static void array_46(){}
        /**
         * @maths [n.] 数学
         * @arithmetic [n.] 算数
         * @geometry [n.] 几何学
         * @algebra [n.] 代数
         * @calculus [n.] 微积分；结实
         */
        public static void array_47(){}
        /**
         * @plus [prep./adj.] 加上。正数的；在零以上的
         * @sum [n.] 总和；总数；金额
         * @total [adj./n.] 总的；全部的。总数
         */
        public static void array_48(){}
        /**
         * @merger [n.] 合并；并归
         * @equation [n.] 相等；平衡；综合体；方程式；等式
         * @identical [adj.] 同一的
         */
        public static void array_49(){}
        /**
         * @minus [adj./prep.] 负的；零以下的；减去
         * @subtract [v.] 减去；减
         * @multiply [v.] 乘；使相乘；使成倍增加；繁殖
         */
        public static void array_50(){}
        /**
         * @divide [v.] 除以；除
         * @dividend [n.] 被除数
         * @remainder [n.] 余数；剩余部分
         * @rational [n./adj.] 有理数；（数、式等）有理的
         */
        public static void array_51(){}
        /**
         * @parameter [n.] 参数；起限定作用的因素
         * @variable [n./adj.] 变量；可变因素。易变的
         * @even [adj./adv.] 均匀的；偶数的；相等的。甚至
         * @odd [adj.] 奇数的；古怪的
         * @mean [n./adj.] 平均数；平均值。平均的
         */
        public static void array_52(){}
        /**
         * @double [adj./n./v.] 两倍的。两倍数；两倍量。使加倍
         * @triple [adj./n./v] 三倍的；三重的。三倍数；三包两。使增至三倍
         * @quadruple [adj./n./v.] 四倍的。四倍
         * @multiple [n./adj.] 倍数。多样的，数量多的
         */
        public static void array_53(){}
        /**
         * @maximum [n.] 最大值；最大限度
         * @minimum [n.] 最小值；最小限度
         * @approximately [adv.] 大约
         */
        public static void array_54(){}
        /**
         * @chart [n.] 图；图表；海图
         * @graph [n.] 图表；图
         * @diagram [n.] 图表；示意图；图解
         * @table [n.] 表格；桌子
         * @matrix [n.] 矩阵；铸模
         */
        public static void array_55(){}
        /**
         * @rectangle [n.] 长方形；矩形
         * @cube [n.] 立方体；立方；三次幂；立方的东西
         * @angle [n.] 角度；脚
         * @triangle [n.] 三角形；三角关系
         * @diagonal [adj./n.] 斜纹的；对角线的。对角线；斜纹织物
         * @straight [adj./adv.] 直的；笔直地；直接
         */
        public static void array_56(){}
        /**
         * @circle [n.] 圆
         * @round [adj./n./adv.] 圆的。绕圈；一轮。环绕
         * @dot [n./v.] 点。在...打点
         * @sphere [n.] 球体；球状物；范围；领域
         * @cone [n.] 圆锥体；锥形物
         */
        public static void array_57(){}
        /**
         * @extent [n.] 广度；范围；程度
         * @width [n.] 宽度
         * @length [n.] 长度
         */
        public static void array_58(){}
        /**
         * @decimal [adj./n.] 小数的；十进制的。小数
         * @percent [n.] 百分之...
         * @proportion [n.] 比例
         */
        public static void array_59(){}
        /**
         * @rate [n.] 比率；率；速度
         * @ratio [n.] 比
         * @fraction [n.] 分数；小部分；片段
         */
        public static void array_60(){}
        /**
         * @scale [n./v.] 刻度；规模。攀登 scales 天平；鳞
         * @ounce [n.] 盎司；少量
         * @density [n.] 密度；浓度
         */
        public static void array_61(){}
        /**
         * @Fahrenheit [adj.] 华氏温标的
         * @mercury [n.] 水银；水星
         * @battery [n.] 电池；（物品的）一组
         * @volt [n.] 伏特
         */
        public static void array_62(){}
        /**
         * @radiate [v.] 辐射；发散；从中心向四周散开
         * @emit [v.] 散发 (光、热、气等)；发出（声音）
         * @transparent [adj.] 透明的；易看穿的
         * @hollow [adj.] 中空的；空心的
         */
        public static void array_63(){}
        /**
         * @ozone [n.] 臭氧
         * @gravity [n.] 地球引力；重力
         * @friction [n.] 摩擦力；摩擦；不和；矛盾
         * @eccentric [adj.] 不同心圆的；古怪的
         * @displace [v.] 移动...的位置；取代；代替
         */
        public static void array_64(){}
        /**
         * @boil [v./n.] 煮沸。沸点
         * @melt [v.] （使）融/熔化
         * @dissolve [v.] （使）溶解；解散
         */
        public static void array_65(){}
        /**
         * @rust [v./n.] （使）生锈。锈；铁锈
         * @ferment [v./n.] （使）发酵；骚动。酶；发酵；动乱
         * @dilute [v./adj.] 冲淡；稀释。稀释了的；减弱了的
         * @acid [n./adj.] 酸。酸的；讽刺的；尖刻的
         * @noxious [adj.] 有害的
         */
        public static void array_66(){}
        /**
         * @static [adj.] 静态的
         * @inert [adj.] 无生气的；惰性的；不活泼
         * @inherent [adj.] 内在的；固有的
         */
        public static void array_67(){}
        /**
         * @formula [n.] 公式；方程式；原则；配方；分子式
         * @component [n.] 成分；组成
         * @compose [v.] 组成；构成；创作；写
         * @mixture [n.] 混合物
         * @blend [n./v.] 混合；（使）交融。混合物
         */
        public static void array_68(){}
        /**
         * @theory [n.] 理论；学说
         * @empirical [adj.] 经验主义的；以实验为依据的
         * @practical [adj.] 实际的；有用的；务实的；心灵手巧的
         */
        public static void array_69(){}
        /**
         * @doctrine [n.] 学说；教义；信条
         * @principle [n.] 原则；（科学）原理
         * @discipline [n.] 纪律；训练
         */
        public static void array_70(){}
        /**
         * @term [n.] 期限；术语；[英]学期
         * @semester [n.] 学期
         * @timetable [n.] 时间表；课程表
         * @schedule [n.] 日程安排；[美]时刻表
         * @deadline [n.] 截止日期
         */
        public static void array_71(){}
        /**
         * @course [n.] 课程
         * @lesson [n.] 一堂课；课程；教训
         * @curriculum [n.] 课程；全部课程
         * @seminar [n.] 研讨会；讨论课
         * @forum [n.] 论坛；讨论会；公开讨论广场
         * @syllabus [n.] 教学大纲
         * @system [n.] 系统；体系；制度
         */
        public static void array_72(){}
        /**
         * @rudimentary [adj.] 基本的；粗浅的
         * @basic [adj.] 基本的；基础的
         * @fundamental [adj.] 基础的；基本的；根本的
         */
        public static void array_73(){}
        /**
         * @elementary [adj.] 基本的；初级的
         * @profound [adj.] （影响）深刻的，深远的；见解深刻的
         * @superficial [adj.] 表面的；外表的；肤浅的
         * @surface [n.] 表面；地面；水面
         */
        public static void array_74(){}
        /**
         * @compulsory [adj.] 强制的
         * @prerequisite [n./adj.] 必备条件。必备的
         * @selective [adj.] 选择性的
         * @elective [adj.] 选择性的
         */
        public static void array_75(){}
        /**
         * @assignment [n.] 作业；任务
         * @submit [v.] 提交；服从
         * @preview [n./v.] 预习
         * @review [n./v.] 回顾；复习
         */
        public static void array_76(){}
        /**
         * @revise [v.] 修订；修改
         * @inspect [v.] 检查；检阅；视察
         * @consult [v.] 请教；查阅
         */
        public static void array_77(){}
        /**
         * @skim [v.] 掠过；擦过；略读
         * @scan [v./n.] 细看；浏览；扫描
         * @scrutinise [v.] 仔细检查
         * @recite [v.] 背诵；朗诵
         * @dictate [v.] 让（某人）听写；命令；强行规定
         */
        public static void array_78(){}
        /**
         * @examination [n.] 考试；抽查
         * @test [v./n.] 测试；检验
         * @quiz [n.] 小测验
         * @presentation [n.] 陈述；表演；演出
         */
        public static void array_79(){}
        /**
         * @plagiarise [v.] 抄袭
         * @copy [n./v.] 复制品。抄写；复制
         * @print [v./n.] 打印。印刷品；照片
         */
        public static void array_80(){}
        /**
         * @thesis [n.] 论文
         * @essay [n.] 短文；小品文
         * @paper [n.] 论文；纸
         * @dissertation [n.] 专题论文；（尤指）学位论文
         * @project [n.] （大中学生的）专题研究；项目；方案
         */
        public static void array_81(){}
        /**
         * @heading [n.] 标题；主题
         * @outset [n.] 开端；开始
         * @outline [n.] 概要；轮廓
         */
        public static void array_82(){}
        /**
         * @point [n.] 点；要点
         * @gist [n.] 主旨；要点
         * @opinion [n.] 看法；评价
         * @introduce [v.] 介绍；引进
         */
        public static void array_83(){}
        /**
         * @reference [n.] 参考；推荐函；提及；涉及
         * @cite [v.] 引用
         * @elicit [v.] 引出；探出；套出
         * @quote [v.] 引用；引述；报（价）
         */
        public static void array_84(){}
        /**
         * @extract [n.] 摘录
         * @abstract [n./adj./v.] 摘要。抽象的。提取；把...抽象出
         * @summary [n.] 摘要；概要
         */
        public static void array_85(){}
        /**
         * @assume [v.] 假定；设想；承担（责任）；取得（权力）
         * @presume [v.] 假定；假设；料想
         * @suppose [v.] 假定；认为
         */
        public static void array_86(){}
        /**
         * @hypothesis [n.] 假说；假设
         * @postulate [v./n.] 假定；假设
         * @speculate [v.] 推测
         * @predict [v.] 预测
         */
        public static void array_87(){}
        /**
         * @perceive [v.] 感知；察觉；意识到
         * @detect [v.] 察觉；发觉；侦查出
         * @discern [v.] 察觉出；分辨出
         * @recognise [v.] 认识；辨认出
         * @conscious [adj.] 意识到的；有知觉的
         */
        public static void array_88(){}
        /**
         * @reckon [v.] 估计；期望；认为
         * @deem [v.] 认为；相信
         * @imply [v.] 暗指；意味着
         * @deliberate [v./adj.] 深思熟虑；仔细考虑。审慎的
         */
        public static void array_89(){}
        /**
         * @represent [v.] 代表；象征
         * @insist [v.] 坚持；坚决认为（主张或要求）
         * @persist [v.] 坚持不懈；持续存在
         */
        public static void array_90(){}
        /**
         * @understand [v.] 懂得；理解
         * @comprehend [v.] 理解；领悟
         * @analyse [v.] 分析
         */
        public static void array_91(){}
        /**
         * @diagnose [v.] 判断；诊断
         * @infer [v.] 推断；推理
         * @deduce [v.] 演绎；推论
         * @conclude [v.] 推断出；得出结论；（使）结束
         */
        public static void array_92(){}
        /**
         * @analogy [n.] 类比；类推
         * @compare [v.] 比较；把...比作；比得上
         * @contrast [n.] 对比；明显的差异
         */
        public static void array_93(){}
        /**
         * @overlap [v.] 与...复叠；（与...）部分相同
         * @contradiction [n.] 矛盾；不一致；反驳
         * @disagree [v.] 有分歧；不同意
         * @differ [v.] 不同、相异
         */
        public static void array_94(){}
        /**
         * @diverse [adj.] 不一样的；多种多样的
         * @nuance [n.] 细微差别
         * @inductive [adj.] 归纳的；诱导的
         */
        public static void array_95(){}
        /**
         * @detail [n.] 细节；（画等的）细节
         * @thorough [adj.] 彻底的；详尽的
         * @example [n.] 例子；榜样
         * @instance [n.] 实例；情况；场合
         */
        public static void array_96(){}
        /**
         * @confirm [v.] 证实；确保；巩固
         * @demonstrate [v.] 示范；演示；证明
         * @illustrate [v.] （用图等）说明；给（书）加插图（或图表）
         * @manifest [v.] 显示；表明
         * @prove [v.] 证明；结果是
         */
        public static void array_97(){}
        /**
         * @determine [v.] 决定；下定决心；查明
         * @decide [v.] 决定
         * @resolve [v.] 决心；决定；（使）分解为；解决
         */
        public static void array_98(){}
        /**
         * @survey [n./v.] 民意调查；对...进行民意调查
         * @research [n.] 调查；探索
         * @observe [v.] 观察；观测；注意到
         */
        public static void array_99(){}
        /**
         * @inquire [v.] 询问；调查
         * @query [n./v.] 疑问；询问；怀疑；询问
         * @questionnaire [n.] 调查表；调查问卷
         */
        public static void array_100(){}
        /**
         * @achieve [v.] 实现；到达
         * @accomplish [v.] 达到（目的）；完成
         * @attain [v.] 获得；达到
         */
        public static void array_101(){}
        /**
         * @credit [n.] 赊购；学分；信任
         * @score [n.] 得分、成绩
         * @mark [n./v.] 分数；标记；标志着；给...打分；在...上做记号
         * @grade [v./n.] 给...分等级：等级；成绩等级
         */
        public static void array_102(){}
        /**
         * @rank [n./v.] 等级；排；列；给...评级；位列
         * @row [n.] 一排；一行
         * @queue [n./v.] 行列；队列；排队等候
         */
        public static void array_103(){}
        /**
         * @grant [v.] 授予；准予；承认
         * @praise [n./v.] 赞美；赞扬
         * @appreciate [v.] 赏识；感激；意识到
         */
        public static void array_104(){}
        /**
         * @feedback [n.] 反馈；反应
         * @underestimate [v.] 低估
         * @overestimate [v.] 高估
         */
        public static void array_105(){}
        /**
         * @apply [v.] 申请
         * @fellowship [n.] 研究生奖学金
         * @scholarship [n.] 奖学金；学问；学识
         * @reward [n./v.] 报答；赏金；报答
         */
        public static void array_106(){}
        /**
         * @award [n.] 奖；奖品
         * @prize [n./v.] 奖赏；珍视
         * @fee [n.] 酬金；费用
         */
        public static void array_107(){}
    }
    /**
     *
     * @label 06_科技发明
     * @wordCount 122
     * @groupCount 29
     */
    public static class Class_scienceAndTechnology{



        /**
         * @technology [n.] 技术
         * @technique [n.] 技巧；技术
         * @polytechnic [adj./n.] 有关多种工艺的；理工学院
         * @engineer [n.] 工程师；技师
         * @mechanic [n.] 技工；机械师；机修工
         */
        public static void array_1(){}
        /**
         * @advance [n./v.] 发展；前进
         * @innovate [v.] 创新；改革
         * @breakthrough [n.] 突破
         */
        public static void array_2(){}
        /**
         * @gizmo [n.] 小装置
         * @patent [n./v.] 专利；专利权；得到...的专利权；给...专利证
         * @devise [v.] 设计；发明
         * @invent [v.] 发明，创造
         * @discover [v.] 发现
         */
        public static void array_3(){}
        /**
         * @disclose [v.] 揭露；透露
         * @reveal [v.] 展现；显示；透露
         * @uncover [v.] 揭露；发现
         * @expose [v.] 使暴露；揭发；使曝光
         */
        public static void array_4(){}
        /**
         * @domain [n.] （活动、学问等的）领域；领土；领地
         * @field [n.] 领域
         * @realm [n.] 领域
         * @foundation [n.] 基础；地基；基金会
         */
        public static void array_5(){}
        /**
         * @specialise [v.] 专攻
         * @absorb [v.] 理解；掌握
         * @concentrate [v.] （集中）心思；（使）浓缩
         * @focus [v./n.] 集中于；焦点
         * @utilise [v.] 利用
         * @usage [n.] 使用；用法
         * @tester [n.] 测试员；测试仪
         * @apply [v.] 应用；适用
         */
        public static void array_6(){}
        /**
         * @device [n.] 装置；设备；手段；策略
         * @appliance [n.] 应用；（家用）器具
         * @facility [n.] 设备；便利
         * @equipment [n.] 设备
         */
        public static void array_7(){}
        /**
         * @instrument [n.] 仪器；工具；乐器
         * @tool [n.] 工具
         * @gauge [n./v.] 测量仪器；测量；判断
         * @measure [v./n.] 测量；衡量；措施
         * @calculate [v.] 计算；考虑；打算
         * @compute [n.] 计算；估计
         * @count [v.] 计算
         * @estimate [n./v.] 估计；估价；评价
         * @assess [v.] 评估；估算
         * @evaluate [v.] 评价；评估
         */
        public static void array_8(){}
        /**
         * @accessory [n.] 附件；配件
         * @byproduct [n.] 副产品
         * @auxiliary [adj.] 辅助的；协助的；备用的
         * @versatile [adj.] 多功能的；多用途的
         */
        public static void array_9(){}
        /**
         * @add [v.] 添加；附加
         * @accumulate [v.] 累积；（数额）不断增加
         * @assemble [v.] 集合；聚集
         */
        public static void array_10(){}
        /**
         * @gather [v.] 收集；采集
         * @attach [v.] 使依附；附加；缚；系；贴
         * @belong [v.] 应在（某处）；适合（某种情形）
         */
        public static void array_11(){}
        /**
         * @optics [n.] 光学
         * @microscope [n.] 显微镜
         * @lens [n.] 镜头；透镜
         */
        public static void array_12(){}
        /**
         * @radar [n.] 雷达
         * @echo [n./v.] 回声；发回声；模仿；重复
         * @sensor [n.] 传感器
         */
        public static void array_13(){}
        /**
         * @multimedia [n.] 多媒体
         * @network [n.] 网络
         * @browser [n.] 浏览器
         * @dial [v.] 拨（电话号码）
         */
        public static void array_14(){}
        /**
         * @microcomputer [n.] 微型计算机
         * @laptop [n.] 笔记本电脑
         * @software [n.] 软件
         */
        public static void array_15(){}
        /**
         * @keyboard [n.] 键盘
         * @screen [n.] 屏幕
         * @loudspeaker [n.] 扬声器；喇叭
         */
        public static void array_16(){}
        /**
         * @microphone [n.] 麦克风；话筒
         * @cassette [n.] 盒式磁带；底片盒
         * @tape [n.] 磁带；录音带；胶带
         */
        public static void array_17(){}
        /**
         * @binary [adj.] 二进制的；二元的
         * @digital [adj.] 数字的
         * @wireless [adj.] 无线的
         * @high-definition [adj.] 高分辨率的
         */
        public static void array_18(){}
        /**
         * @audio [adj.] 声音的
         * @vision [n.] 视觉；视力
         * @fantasy [n.] 幻想
         * @science fiction [n.] 科幻作品
         */
        public static void array_19(){}
        /**
         * @pump [n./v.] 泵；（用泵）抽
         * @generator [n.] 发电机
         * @gear [n./v.] 齿轮；传动装置；使适合
         * @pivot [n.] 枢轴；支点；中心；重点
         */
        public static void array_20(){}
        /**
         * @hydraulic [adj.] 水力的；液压的
         * @drainage [n.] 排水系统；排水
         * @sewage [n.] （下水道的）污水
         * @ventilation [n.] 通风设备；通风
         */
        public static void array_21(){}
        /**
         * @compress [v.] 压缩；压紧
         * @condense [v.] 减缩；精简；（使气体）凝结
         * @refine [v.] 精炼；提纯
         * @simplify [v.] 简化；精简
         */
        public static void array_22(){}
        /**
         * @purify [v.] 净化；使纯净
         * @filter [v./n.] 过滤；（光或声音）透过；过滤器
         * @distil [v.] 蒸馏；提取...的精华
         * @mode [n.] 模式；方式
         * @mould [v./n.] 浇铸；塑造/模子
         * @prototype [n.] 原型；雏形
         */
        public static void array_23(){}
        /**
         * @framework [n.] 框架；体系；结构
         * @aspect [n.] （问题、事务的）方面
         * @phase [n.] 阶段；时期
         */
        public static void array_24(){}
        /**
         * @operate [v.] 操作；运营；做手术
         * @facilitate [v.] 使便利；促进
         * @transform [v.] 使改变形态；使改观
         * @convert [v./n.] （使）转变、改变（信仰、观点等）/皈依者
         * @alter [v.] 变更；改变
         * @shift [v./n.] 转移；变换/轮班
         */
        public static void array_25(){}
        /**
         * @turn [v./n.] 转移；转变/（一次轮到的）机会
         * @adapt [v.] 适应；改编
         * @adjust [v.] 调节；改变（行为或观点）以适应
         */
        public static void array_26(){}
        /**
         * @pinpoint [v./n.] 精确指明...位置/针尖；极小的事物
         * @accurate [adj.] 准确的；正确无误的
         * @precise [adj.] 精确的；准确的；一丝不苟的
         * @correct [adj.] 正确的
         */
        public static void array_27(){}
        /**
         * @error [n.] 错误；过失
         * @mistake [n./v.] 错误/误解
         * @flaw [n.] 缺陷；错误
         * @wrong [adj./adv.] 错误的；错误地
         * @fault [n./v.] 缺点；故障/找出缺点
         */
        public static void array_28(){}
        /**
         * @stumble [v.] 犯错误；绊脚；跌跌撞撞的走
         * @contingency [n.] 意外事件；可能发生的事
         * @circumstance [n.] 情况；条件；环境；境遇
         */
        public static void array_29(){}
    }
    /**
     *
     * @label 07_文化历史
     * @wordCount 79
     * @groupCount 22
     */
    public static class Class_cultureAndHistory{



        /**
         * @culture [n.] 文化；文明；教养
         * @civilisation [n.] 文明
         * @renaissance [n.] the Renaissance 文艺复兴时期
         * @epic [n./adj.] 史诗；宏大的
         * @ideology [n.] 意识形态；思想体系
         */
        public static void array_1(){}
        /**
         * @tradition [n.] 传统
         * @convention [n.] 惯例；大型会议
         * @custom [n.] 习俗；（个人的）习惯
         */
        public static void array_2(){}
        /**
         * @feudalism [n.] 封建主义；封建制度
         * @slavery [n.] 奴隶制
         * @ethical [adj.] 伦理的；道德的
         * @moral [adj./n.] 道德上的；有道德的；morals 道德
         */
        public static void array_3(){}
        /**
         * @tribe [n.] 部落
         * @aboriginal [n./adj.] Aboriginal 澳大利亚土人/本土原有的；土著的
         * @inhabitant [n.] 居民
         * @native [adj./n.] 本土的；本地人
         * @local [adj./n.] 当地的；本地人
         */
        public static void array_4(){}
        /**
         * @exotic [adj.] 外来的；异国情调的
         * @foreigner [n.] 外国人
         * @alien [n./adj.] 外侨；外星人；外国的；陌生的
         * @anthropologist [n.] 人类学家
         * @humanitarian [n./adj.] 人道主义者；人道主义的；博爱的
         */
        public static void array_5(){}
        /**
         * @heritage [n.] （国家的）遗产
         * @inherit [v.] 继承（财产等）；经遗传获得
         * @antique [n./adj.] 古董；古董的
         */
        public static void array_6(){}
        /**
         * @archaeology [n.] 考古学
         * @excavate [v.] 发掘；挖掘
         * @museum [n.] 博物馆
         */
        public static void array_7(){}
        /**
         * @pottery [n.] 陶瓷
         * @engrave [v.] 在...上雕刻
         * @decorate [v.] 装饰
         */
        public static void array_8(){}
        /**
         * @religion [n.] 宗教；宗教信仰
         * @ritual [n.] 仪式
         * @etiquette [n.] 礼仪；礼节
         */
        public static void array_9(){}
        /**
         * @belief [n.] 信念；信仰
         * @soul [n.] 灵魂；心灵；精神
         * @spirit [n.] 精神；心灵
         */
        public static void array_10(){}
        /**
         * @sacred [adj.] 神圣的；宗教的
         * @hallowed [adj.] 神圣的；收尊崇的
         * @holy [adj.] 神圣的；圣洁的；虔诚的
         */
        public static void array_11(){}
        /**
         * @Pope [n.] 教皇
         * @bishop [n.] 主教
         * @missionary [n.] 传教士
         * @priest [n.] 牧师；神父；教士
         */
        public static void array_12(){}
        /**
         * @Bible [n.] （基督教）圣经
         * @church [n.] 教堂
         * @cathedral [n.] 大教堂
         * @choir [n.] 唱诗班
         */
        public static void array_13(){}
        /**
         * @monk [n.] 僧侣
         * @temple [n.] 师院；庙宇
         * @pagoda [n.] 佛塔
         */
        public static void array_14(){}
        /**
         * @empire [n.] 帝国
         * @imperial [adj.] 帝国的
         * @royal [adj.] 皇家的；高贵的
         * @dynasty [n.] 朝代
         * @chronology [n.] 年代学；年表；事件发生的顺序表
         */
        public static void array_15(){}
        /**
         * @emperor [n.] 皇帝
         * @king [n.] 国王
         * @queen [n.] 王后；女王
         */
        public static void array_16(){}
        /**
         * @prince [n.] 王子；亲王
         * @princess [n.] 公主；王妃
         * @majesty [n.] 威严；壮观；陛下
         */
        public static void array_17(){}
        /**
         * @nobility [n.] 高尚的品质；贵族
         * @lord [n.] （英国）贵族；Lord 阁下；大人；the Lord 上帝
         * @knight [n./v.] 骑士；封（某人）为爵士
         * @guardian [n./adj.] 保卫者；监护人；守护的
         */
        public static void array_18(){}
        /**
         * @nostalgia [n.] 思乡之情；怀旧之情
         * @homesick [adj.] 思乡的
         */
        public static void array_19(){}
        /**
         * @celebrity [n.] 名人；名誉
         * @status [n.] 地位；身份；尊重程度；仰慕程度；重视程度；（社交媒体上的）状态，近况
         * @background [n.] 背景；（个人出身、受教育）经历
         * @experience [n.] 经验；（一次）经历、体验
         */
        public static void array_20(){}
        /**
         * @anecdote [n.] 轶事；奇闻
         * @accident [n.] 事故；意外；偶然事件
         * @incident [n.] （尤指不寻常的、重要的或暴力的）事件；（两国之间的）冲突
         */
        public static void array_21(){}
        /**
         * @thrive [v.] 繁荣；兴旺发达；茁壮成长
         * @prosperity [n.] 繁荣；兴旺
         * @setback [n.] 挫折；阻碍
         * @adversity [n.] 逆境
         */
        public static void array_22(){}
    }
    /**
     *
     * @label 08_语言演化
     * @wordCount 68
     * @groupCount 19
     */
    public static class Class_language{



        /**
         * @language [n.] 语言
         * @symbol [n.] 象征；符号；记号
         * @sign [n./v.] 符号；征兆；迹象；手势；签（名）
         * @gesture [n.] 手势；姿势
         * @handwriting [n.] 笔记；书写
         */
        public static void array_1(){}
        /**
         * @pictograph [n.] 象形文字
         * @wedge [n.] 楔子；楔形物；楔形文字
         * @knot [n.] （绳、线的）结；（树枝上的）节子
         */
        public static void array_2(){}
        /**
         * @linguistics [n.] 语言学
         * @semantic [adj.] 语义的
         * @syntax [n.] 句法
         * @grammar [n.] 语法；语法书
         */
        public static void array_3(){}
        /**
         * @phonetics [n.] 语音学
         * @pronounce [v.] 发...的音；宣布
         * @intonation [n.] 语调
         * @inflection [n.] 语调的抑扬变化
         */
        public static void array_4(){}
        /**
         * @dialect [n.] 方言；地方话
         * @accent [n.] 重音；口音；读音符号
         * @utterance [n.] 说话；言论
         * @oral [adj.] 口头的
         * @verbal [adj.] 口头的；言语的
         */
        public static void array_5(){}
        /**
         * @syllable [n.] 音节
         * @phoneme [n.] 音位
         * @vowel [n.] 元音
         * @consonant [n.] 辅音
         */
        public static void array_6(){}
        /**
         * @alphabet [n.] 字母表；（一种语言的）全部字母
         * @logogram [n.] 语标，缩记符（如& 、@等） ;非字母语言的字符
         * @vocabulary [n.] 词汇
         * @dictionary [n.] 词典；字典
         */
        public static void array_7(){}
        /**
         * @idiom [n.] 习语
         * @phrase [n.] 短语；习语
         * @clause [n.] 从句；分句；条款
         * @expression [n.] 词语；表达；表情
         * @tense [n./adj.] 时态；紧张的
         */
        public static void array_8(){}
        /**
         * @root [n.] 根；词根
         * @prefix [n.] 前置代号；词首；前缀
         * @suffix [n.] 后缀
         */
        public static void array_9(){}
        /**
         * @abbreviation [n.] 缩写形式
         * @synonym [n.] 同义词
         * @antonym [n.] 反义词
         */
        public static void array_10(){}
        /**
         * @noun [n.] 名词
         * @singular [n./adj.] 单数；非凡的；单数的
         * @plural [n./adj.] 复数；复数的；多元的
         */
        public static void array_11(){}
        /**
         * @pronoun [n.] 代词
         * @verb [n.] 动词
         * @adjective [n.] 形容词
         */
        public static void array_12(){}
        /**
         * @adverb [n.] 副词
         * @preposition [n.] 介词
         * @conjunction [n.] 连词
         */
        public static void array_13(){}
        /**
         * @consistent [adj.] 一致的；（观点或看法）连贯的
         * @complicated [adj.] 复杂的
         * @complex [adj.] 复杂的
         */
        public static void array_14(){}
        /**
         * @compile [v.] 编撰
         * @version [n.] 版本
         * @translate [v.] 翻译；（使）转变
         * @paraphrase [v./n.] 意译；改述
         */
        public static void array_15(){}
        /**
         * @interpret [v.] 口译；解释；说明；领会；理解
         * @narrate [v.] 讲（故事）；叙述
         */
        public static void array_16(){}
        /**
         * @illuminate [v.] 阐释；说明；照亮
         * @decipher [v.] 译解；辨认
         * @eloquence [n.] 雄辩；流利的口才
         */
        public static void array_17(){}
        /**
         * @communicate [v.] 沟通；交流；传达
         * @discussion [n.] 讨论；谈论
         * @brainstorm [n./v.] 集体自由讨论；头脑风暴；集思广益；进行头脑风暴
         */
        public static void array_18(){}
        /**
         * @debate [v./n.] 辩论；争论；讨论
         * @commentary [n.] 评论；批评；实况报道
         * @negotiate [v.] 协商；谈判
         * @contention [n.] 争论；争辩；观点
         */
        public static void array_19(){}
    }
    /**
     *
     * @label 09_娱乐运动
     * @wordCount 176
     * @groupCount 47
     */
    public static class Class_pastimeAndSport{



        /**
         * @medium [n./adj.] 媒介；中间的；中等的
         * @press [n.] 新闻界；记者；报刊；出版社
         * @journalist [n.] 记者；新闻工作者
         */
        public static void array_1(){}
        /**
         * @critic [n.] 批评家；挑剔的人
         * @commentator [n.] 评论员；实况解说员
         * @exponent [n.] 阐述者；倡导者；拥护者
         */
        public static void array_2(){}
        /**
         * @announcer [n.] 广播员；播音员
         * @correspondent [n.] 通信者；通讯员；记者
         * @messenger [n.] 邮递员；信使
         * @editor [n.] 编辑；校订者
         * @typist [n.] 打字员
         */
        public static void array_3(){}
        /**
         * @handout [n.] 传单；讲义
         * @leaflet [n./v.] 传单；散发传单
         * @propaganda [n.] 宣传；鼓吹
         */
        public static void array_4(){}
        /**
         * @publish [v.] 公布；出版；发行
         * @disseminate [v.] 散布；传播
         * @foresee [v.] 预见；预知
         */
        public static void array_5(){}
        /**
         * @anticipate [v.] 预期；预料
         * @expect [v.] 预料；期待
         * @await [v.] 等候；期待；将降临到...身上
         */
        public static void array_6(){}
        /**
         * @pastime [n.] 娱乐；消遣
         * @entertain [v.] 娱乐；招待；心存；怀有
         * @recreation [n.] 休闲；娱乐
         */
        public static void array_7(){}
        /**
         * @amuse [v.] 逗乐；给...提供娱乐
         * @gossip [n.] 闲聊；流言蜚语
         * @rumour [n.] 谣言；传闻
         * @consensus [n.] 共识；一致的意见
         */
        public static void array_8(){}
        /**
         * @festival [n.] 节日
         * @feast [n.] 盛宴；（宗教）节日
         * @programme [n./v.] 节目；方案；程序；为系统设置程序；计划
         * @rehearsal [n.] 排练
         */
        public static void array_9(){}
        /**
         * @perform [v.] 表演；演出
         * @imitate [v.] 模仿；效仿
         * @mimic [v.] 模仿；戏仿
         * @simulate [v.] 模拟；假装；冒充
         */
        public static void array_10(){}
        /**
         * @circus [n.] 马戏团；圆形广场（常用于地名）
         * @magic [n.] 魔术；魔法
         * @drama [n.] 戏；剧；戏剧艺术
         */
        public static void array_11(){}
        /**
         * @concert [n.] 音乐会
         * @symphony [n.] 交响乐
         * @orchestra [n.] 管弦乐队
         * @ballet [n.] 芭蕾舞；芭蕾舞剧
         * @opera [n.] 歌剧
         */
        public static void array_12(){}
        /**
         * @comedy [n.] 喜剧
         * @tragedy [n.] 悲剧；悲惨的事
         * @animation [n.] 动画片；动画制作
         */
        public static void array_13(){}
        /**
         * @film [n.] 影片；胶卷
         * @movie [n.] 电影
         * @X-rated [adj.] X级的；青少年不宜的
         */
        public static void array_14(){}
        /**
         * @artist [n.] 艺术家
         * @craftsman [n.] 工匠；工艺师
         * @painter [n.] 画家；油漆匠
         */
        public static void array_15(){}
        /**
         * @role [n.] 角色
         * @scene [n.] 景色；现场；（戏剧的）场面
         * @stage [n.] 舞台；阶段
         */
        public static void array_16(){}
        /**
         * @gallery [n.] 美术馆
         * @exhibition [n.] 展览
         * @aesthetic [adj./n.] 审美的；审美观
         */
        public static void array_17(){}
        /**
         * @collect [v.] 收集；收藏
         * @select [v./adj.] 选择；挑选；精选的
         * @opt [v.] 选择
         */
        public static void array_18(){}
        /**
         * @photograph [n.] 照片；相片
         * @portrait [n.] 肖像；半身画像
         * @painting [n.] 油画；会话；画作；涂漆
         * @sculpture [n.] 雕塑
         */
        public static void array_19(){}
        /**
         * @draw [v.] 画；拉；拔出
         * @sketch [n./v.] 素描；草图；速写；画素描；画速写
         * @depict [v.] 描述；描写；描绘
         * @describe [v.] 描述；形容
         */
        public static void array_20(){}
        /**
         * @carve [v.] 雕刻；切下
         * @improvise [v.] 临时做；即兴创作
         * @musical [adj.] 音乐的；悦耳的
         * @classical [adj.] 古典的；传统的
         */
        public static void array_21(){}
        /**
         * @jazz [n.] 爵士乐
         * @rock [n.] 摇滚乐；岩石
         * @hip-hop [n.] 嘻哈文化
         * @pop [n.] 流行音乐；流行乐曲
         * @lyric [n./adj.] 抒情诗；抒情的
         */
        public static void array_22(){}
        /**
         * @band [n.] 乐队；带；波段
         * @solo [n./adj.] 独奏；独唱；独奏的；独唱的
         * @melody [n.] 乐曲；旋律
         * @rhythm [n.] 节奏；韵律
         */
        public static void array_23(){}
        /**
         * @tone [n.] 音色；声调；腔调
         * @tune [n./v.] 曲调；短乐曲；调试
         * @disc [n.] 光碟；唱片；磁盘
         */
        public static void array_24(){}
        /**
         * @piano [n.] 钢琴
         * @violin [n.] 小提琴
         * @cello [n.] 大提琴
         * @guitar [n.] 吉他
         */
        public static void array_25(){}
        /**
         * @harmonica [n.] 口琴
         * @trumpet [n.] 喇叭；小号
         * @drum [n.] 鼓；鼓状物；大桶
         * @flute [n.] 长笛
         */
        public static void array_26(){}
        /**
         * @competition [n.] 竞争；比赛
         * @tournament [n.] 锦标赛；联赛
         * @Olympic [adj./n.] 奥林匹克运动会
         * @sponsor [n./v.] 发起人；主办人；赞助人。发起；主办；赞助
         * @patron [n.] 赞助人；顾客；老主顾
         */
        public static void array_27(){}
        /**
         * @athlete [n.] 运动员
         * @champion [n./v.] 冠军；第一名；拥护；支持
         * @spectator [n.] 观众
         * @volunteer [n./v.] 志愿者；自愿做
         */
        public static void array_28(){}
        /**
         * @famous [adj.] 著名的；出名的
         * @well-known [adj.] 众所周知的；出名的
         * @energetic [adj.] 充满活力的；精力充沛的
         * @vigorous [adj.] 充满活力的；活跃的；积极的
         */
        public static void array_29(){}
        /**
         * @stadium [n.] 体育场；运动场
         * @gym [n.] 体育馆；运动场
         * @training [n.] 训练；锻炼；培训
         */
        public static void array_30(){}
        /**
         * @exercise [n./v.] 锻炼；运动；习题；练习。锻炼
         * @indoor [adj.] 室内的
         * @outdoor [adj.] 户外的；室外的
         */
        public static void array_31(){}
        /**
         * @motion [v.] 做动作；示意
         * @mobile [adj.] 可移动的；流动的
         * @movement [n.] 活动；运动；移动
         */
        public static void array_32(){}
        /**
         * @yoga [n.] 瑜伽
         * @sprawl [n./v.] 延伸；蔓延。（城市）杂乱无序扩张的地区
         * @stretch [v.] 延伸；伸长
         * @strain [v./n.] 拉紧；拉伤；扭伤。张力；拉力；（精神上）紧张
         */
        public static void array_33(){}
        /**
         * @chess [n.] 国际象棋
         * @badminton [n.] 羽毛球
         * @golf [n.] 高尔夫球
         */
        public static void array_34(){}
        /**
         * @billiards [n.] 台球
         * @soccer [n.] （英式）足球
         * @tennis [n.] 网球
         * @volleyball [n.] 排球
         * @hockey [n.] 曲棍球；冰球
         * @cricket [n.] 板球
         */
        public static void array_35(){}
        /**
         * @goal [n.] 球门；进球得分；目的
         * @bat [n.] 球拍；球棒；球板
         * @racket [n.] （网球、羽毛球）球拍
         */
        public static void array_36(){}
        /**
         * @kick [n./v.] 踢
         * @knock [v.] 敲；击；撞
         * @flip [v./n.] 掷；快速翻转。随便的；宽泛的
         */
        public static void array_37(){}
        /**
         * @pitch [v./n.] 投；掷；球场；（棒球中的）投球
         * @throw [v.] 投；掷；抛；扔
         * @toss [v.] 扔；抛；掷；（使）颠簸
         */
        public static void array_38(){}
        /**
         * @slide [v./n.] 滑动；逐渐降低；滑行；下跌
         * @slip [v./n.] 滑跤；滑落；溜；滑到
         * @glide [v./n.] 滑动；掠过；滑行
         * @tumble [v.] 摔倒；滚下
         */
        public static void array_39(){}
        /**
         * @ski [v./n.] 滑雪；滑雪板
         * @skate [v.] 滑冰
         * @cycling [n.] 骑自行车运动
         */
        public static void array_40(){}
        /**
         * @dive [v.] 跳水；潜水；俯冲
         * @drift [v.] 飘逸；漂流；流浪；漂泊
         * @jump [v.] 跳；暴涨；跳过
         */
        public static void array_41(){}
        /**
         * @leap [v./n.] 跳；跃；跳跃
         * @plunge [v./n.] 纵身投入；猛跌；（使）投身。跳水；猛跌
         * @spring [v./n.] 跳；跃
         * @hop [v.] 跳上/下；单脚跳行；齐足跳行
         * @bounce [v.] （使）反弹/弹起/跳动
         */
        public static void array_42(){}
        /**
         * @tent [n.] 帐篷
         * @camp [n.] 营地；阵营
         * @picnic [n./v.] 野餐；野餐食物
         * @hunt [v./n.] 打猎；搜寻；猎取
         */
        public static void array_43(){}
        /**
         * @race [n.] 赛跑；速度竞赛；人种；种族
         * @marathon [n.] 马拉松
         * @pedestrian [n.] 步行者；行人
         * @pace [n./v.] 步速；速度；步调；节奏；来回踱步
         * @step [n.] 步伐；步骤
         */
        public static void array_44(){}
        /**
         * @excursion [n.] 远足；短程旅行
         * @cruise [v.] 乘船游览；以平稳的速度行驶
         * @trip [v./n.] 绊倒；旅行
         * @vacation [v./n.] 休假；假期
         * @hike [n./v.] 徒步旅行；远足
         */
        public static void array_45(){}
        /**
         * @jog [v.] 慢跑
         * @stride [v.] 大步走；阔步行走
         * @wander [v.] 闲逛；漫步；走神；开小差
         * @linger [v.] 逗留；流连；继续存留
         * @lag [v./n.] 落后；间隔；时间差
         */
        public static void array_46(){}
        /**
         * @climb [v.] 攀登；爬
         * @pull [v.] 拉；拖；扯；划（小船）
         * @drag [v.] 拖；拉；拽
         * @bend [v.] 俯身；弯腰；使弯曲
         * @bow [v./n.] 鞠躬
         */
        public static void array_47(){}
    }
    /**
     *
     * @label 10_物品材料
     * @wordCount 152
     * @groupCount 40
     */
    public static class Class_stuffAndMaterial{



        /**
         * @stuff [n.] 东西；原料
         * @item [n.] 一件物品；一件商品
         * @merchandise [n.] 商品
         * @souvenir [n.] 纪念品
         * @artifact [n.] 人造物品；手工艺品
         */
        public static void array_1(){}
        /**
         * @material [n./adj.] 材料；原料；人才；物质的
         * @raw [adj.] 天然的；未经加工的；（感情）原始的
         * @crude [adj.] 天然的；未经加工的；粗超的
         */
        public static void array_2(){}
        /**
         * @necessity [n.] 必需品；必要
         * @outfit [adj./n.] 全套服装；全套装备；配备；装备
         * @kit [n.] 成套工具
         * @utensil [n.] （家庭）用具；器皿
         */
        public static void array_3(){}
        /**
         * @garbage [n.] （尤美）垃圾；废物
         * @rubbish [n.] （尤英）垃圾；废弃物；废话
         * @trash [n.] （美）垃圾
         * @recycle [v.] 使再循环；回收利用
         * @reuse [v.] 再次使用
         */
        public static void array_4(){}
        /**
         * @litter [n./v.] 垃圾；废弃物；乱丢东西
         * @waste [n./v.] 废物；浪费
         * @junk [n.] 无用的东西；废物
         * @landfill [n.] 垃圾填埋地；垃圾填埋
         * @sewerage [n.] 排水系统；污水处理系统；（=sewage）污水
         */
        public static void array_5(){}
        /**
         * @detergent [n.] 洗涤剂
         * @lotion [n.] 洁肤乳；润肤乳
         * @shampoo [v./n.] 用洗发剂（头发）；洗发剂
         * @soap [n./v.] 肥皂；用肥皂擦洗
         */
        public static void array_6(){}
        /**
         * @tub [n.] 桶；盆；（美）鱼缸；浴盆
         * @plug [n./v.] 塞子；插头；把...塞住
         * @tap [n.] 旋塞；龙头
         * @pipe [n.] 管子；管道；烟斗
         * @tube [n.] 管；显像管；（英国/伦敦）地铁
         */
        public static void array_7(){}
        /**
         * @mop [n./v.] 拖把；用拖把擦
         * @broom [n./v.] 扫帚；用扫帚扫
         * @sweep [v.] 打扫；（迅猛的）吹走；掠过
         */
        public static void array_8(){}
        /**
         * @mattress [n.] 床垫
         * @carpet [n.] 地毯
         * @rug [n.] 小地毯；（盖肩或腿的）小毛毯
         * @mat [n.] 地垫
         * @cushion [n.] 软垫
         * @pad [n./v.] 衬垫；便签本；（用软材料）填塞
         */
        public static void array_9(){}
        /**
         * @blanket [n.] 毛毯；毯子
         * @quilt [n.] 被子
         * @sheet [n.] 被单；床单；一张（纸）；薄板
         * @pillow [n.] 枕头
         * @sponge [n.] 海绵
         * @towel [n.] 毛巾
         */
        public static void array_10(){}
        /**
         * @staple [n.] 订书钉；主要部分
         * @nail [n./v.] 指甲；钉子；（用钉子）钉住
         * @razor [n.] 剃刀；（用剃刀）剃
         * @shave [v.] 剃须；刮脸
         */
        public static void array_11(){}
        /**
         * @fuse [n./v.] 保险丝；导火线；（使）融化、融合
         * @cable [n.] 电缆；缆绳；电报；有线电视
         * @cord [n.] 细绳；粗线；（体内的）线、索、带
         * @strand [n.] 缕，股；滨，岸
         */
        public static void array_12(){}
        /**
         * @match [n./v.] 火柴；比赛；匹配的人或物；与...匹配
         * @candle [n.] 蜡烛
         * @wax [n.] 蜡；蜂蜡
         */
        public static void array_13(){}
        /**
         * @portfolio [n.] 文件夹；公事包
         * @paperback [n.] 简装书；平装书
         * @pamphlet [n.] 小册子
         * @tissue [n.] 面巾纸；（器官）组织
         * @cover [n.] 封面；盖子；套子
         */
        public static void array_14(){}
        /**
         * @Xerox [n.] 施乐复印机
         * @duplicate [v./n.] 重复；副本；复制品
         * @memorandum [n.] 备忘录；建议书；=memo
         * @stationery [n.] 文具；信纸
         */
        public static void array_15(){}
        /**
         * @glue [n.] 胶水
         * @ink [n.] 墨水
         * @rubber [n.] （英）橡皮擦；橡胶
         * @scissors [n.] 剪刀
         */
        public static void array_16(){}
        /**
         * @shear [n./v.] shears（尤指修篱笆用的）大剪刀；剪
         * @edge [n.] 边；边缘；刀口
         * @rim [n.] （圆形物品的）外缘、边缘
         */
        public static void array_17(){}
        /**
         * @element [n.] 元素；组成部分；基本部分
         * @factor [n.] 因素；要素
         * @section [n.] 部分；章；节
         */
        public static void array_18(){}
        /**
         * @tag [n.] 标签；称号
         * @label [n.] 标签；标贴
         * @badge [n.] 徽章；证章；标志；象征
         */
        public static void array_19(){}
        /**
         * @bolt [n./v.] 螺栓；插销；闩上（门、窗）
         * @knob [n.] 球形把手；旋钮
         * @handle [n./v.] 柄；把手；拿；处理
         */
        public static void array_20(){}
        /**
         * @shutter [n./v.] 百叶窗；快门；停止（营业）
         * @curtain [n./v.] 窗帘；幕布；给...装上帘子
         * @pane [n.] （一块）玻璃窗
         * @opacity [n.] 不透明性
         */
        public static void array_21(){}
        /**
         * @jar [n.] 罐；广口瓶；猛烈震动
         * @barrel [n.] 桶
         * @bucket [n.] （有提手的）桶
         * @pail [n.] （尤美-通常是金属或者木质的）桶；提桶
         */
        public static void array_22(){}
        /**
         * @phone [n.] 电话
         * @bell [n.] 钟，铃
         * @camera [n.] 照相机
         * @portable [adj.] 手提式的；便携的
         */
        public static void array_23(){}
        /**
         * @spotlight [n.] 聚光灯
         * @lantern [n.] 提灯；灯笼
         * @bulb [n.] 电灯泡；球茎；球茎状物
         * @flashlight [n.] 闪光灯的闪光；手电筒
         */
        public static void array_24(){}
        /**
         * @refrigerator [n.] 冰箱
         * @fridge [n.] 冰箱
         * @vacuum [n./adj.] 真空；真空吸尘器；真空的
         * @fan [n./v.] 扇子；风扇；狂热爱好者；扇
         * @switch [n./v.] 开关；转换；
         */
        public static void array_25(){}
        /**
         * @hurdle [n.] 栏架；跨栏赛跑
         * @fence [n.] 栅栏；围栏
         * @pedal [n./v.] 踏板；踩踏板
         */
        public static void array_26(){}
        /**
         * @shelf [n.] 架子；隔板
         * @ladder [n.] 梯子；阶梯
         * @lift [v./n.] 提；抬；提高；（英）电梯（美 elevator）
         */
        public static void array_27(){}
        /**
         * @stool [n.] 凳子
         * @drawer [n.] 抽屉
         * @umbrella [n.] 伞
         * @raincoat [n.] 雨衣
         */
        public static void array_28(){}
        /**
         * @dredge [n./v.] 挖泥船；挖掘机/挖掘；撒（糖；面粉等）
         * @can [v./n.] 把（食品）罐装保存；罐头；听
         * @mill [n./v.] 磨粉机；磨坊/碾碎；无目的地乱转
         */
        public static void array_29(){}
        /**
         * @forge [n./v.] 炼铁炉；锻造；伪造
         * @alloy [n.] 合金；（金属的）成色
         * @metal [n.] 金属
         */
        public static void array_30(){}
        /**
         * @iron [n./v.] 铁；熨斗；熨；烫
         * @lead [n.] 铅
         * @brass [n.] 黄铜；黄铜制品
         * @bronze [n.] 青铜；青铜艺术品
         */
        public static void array_31(){}
        /**
         * @cement [n./v.] 水泥；胶结剂；使黏结
         * @pitch [n.] 沥青
         * @lime [n.] 石灰
         * @plaster [n.] 灰泥；熟石膏
         */
        public static void array_32(){}
        /**
         * @leather [n.] 皮革；皮衣
         * @plastic [n./adj.] 塑料；有塑性的；塑料的
         * @fiber [n.] 纤维；纤维素
         */
        public static void array_33(){}
        /**
         * @fabric [n.] 织物；布料
         * @knit [v.] 编织；针织
         * @weave [v.] 编织；编造
         */
        public static void array_34(){}
        /**
         * @canvas [n.] 帆布；油画布
         * @linen [n.] 亚麻布；亚麻织品
         * @cotton [n.] 棉；棉线；棉布
         */
        public static void array_35(){}
        /**
         * @nylon [n.] 尼龙
         * @lumber [n.] 木材；木料
         * @wooden [adj.] 木制的；呆板的
         */
        public static void array_36(){}
        /**
         * @mine [n.] 矿场；矿井；地雷
         * @pit [n.] 深坑；煤矿；潜在危险
         * @fuel [n./v.] 燃料；给...加燃料
         * @lubricate [v.] 润滑；加润滑油于
         */
        public static void array_37(){}
        /**
         * @diamond [n.] 金刚石；钻石；菱形
         * @crystal [n.] 水晶；结晶；晶体
         */
        public static void array_38(){}
        /**
         * @inferior [adj./n.] 差的；下级的；低等的；级别/地位低的人；次品
         * @counterfeit [adj./v.] 假冒的；伪造
         * @fake [adj./n.] 假冒的；冒充者；假货
         */
        public static void array_39(){}
        /**
         * @fragile [adj.] 易碎的；脆弱的
         * @miniature [adj./n.] 微型的；很小的/微缩模型；微型画
         * @available [adj.] 可获得的
         * @durable [adj.] 耐用的；持久的
         */
        public static void array_40(){}
    }
    /**
     *
     * @label 11_时尚潮流
     * @wordCount 113
     * @groupCount 31
     */
    public static class Class_fashionAndDress{



        /**
         * @fashion [n./v.] 时尚；制作；制成
         * @style [n.] 风格；样式；时尚
         * @trend [n.] 趋势；倾向
         * @tendency [n.] 趋势；倾向；偏好
         * @current [n./adj.] 潮流；趋势；当前的
         */
        public static void array_1(){}
        /**
         * @popularity [n.] 流行
         * @vogue [n.] 流行
         * @prevail [v.] 盛行；获胜
         */
        public static void array_2(){}
        /**
         * @model [n./v.] 模型；模特/使模仿
         * @icon [n.] 偶像；图标
         * @idol [n.] 偶像；受到崇拜的人或物；神像
         */
        public static void array_3(){}
        /**
         * @luxury [n.] 奢侈；奢侈品
         * @extravagant [adj.] 奢侈的；过分的
         * @jewelry [n.] 珠宝；手势
         */
        public static void array_4(){}
        /**
         * @jewel [n.] 宝石
         * @gem [n.] 宝石；珍品
         * @jade [n.] 玉石；翡翠
         */
        public static void array_5(){}
        /**
         * @adorn [v.] 装饰；装扮
         * @ornament [n./v.] 装饰品；装饰
         * @embellish [v.] 修饰
         * @embroider [v.] 对（故事等）加以渲染；在...上刺绣
         */
        public static void array_6(){}
        /**
         * @hairdressing [n.] 美发；理发
         * @pigment [n.] 色素；颜料
         * @dye [n.] 染料；（染上的）颜色；染
         */
        public static void array_7(){}
        /**
         * @masquerade [n./v.] 化装舞会；化妆；假扮
         * @veil [n.] 面纱；遮蔽物
         * @costume [n.] 戏服；（某历史时期或某地的）服装
         */
        public static void array_8(){}
        /**
         * @fascinate [v.] 迷住
         * @decent [adj.] 得体的；尚好的
         * @exquisite [adj.] 精致的；雅致的
         */
        public static void array_9(){}
        /**
         * @grace [n.] 优美；优雅
         * @elegance [n.] 文雅；典雅
         * @perfect [adj.] 完美的
         */
        public static void array_10(){}
        /**
         * @appearance [n.] 外貌；出现
         * @cosmetics [n.] 化妆品
         * @make-up [n.] 化妆品；组成成分；性格
         */
        public static void array_11(){}
        /**
         * @handsome [adj.] 数量大的；英俊的
         * @charming [adj.] 迷人的
         * @pretty [adj./adv.] 漂亮的；相当地
         * @beautiful [adj.] 美丽的
         * @ugly [adj.] 丑陋的
         */
        public static void array_12(){}
        /**
         * @dress [n.] 衣服；连衣裙
         * @clothe [v.] 给...穿衣；为...提供衣服
         * @uniform [n./adj.] 制服；一致的
         */
        public static void array_13(){}
        /**
         * @garment [n.] （一件）衣服
         * @laundry [n.] 洗衣店；要（或正在）洗的衣服；刚洗好的衣服
         * @wardrobe [n.] 衣柜；（某人的）全部服装
         */
        public static void array_14(){}
        /**
         * @overall [n./adj.] （英）（工作时穿的）罩衣；全面的
         * @overcoat [n.] 大衣
         * @robe [n.] 长袍；浴袍
         * @gown [n.] 长外衣；女礼服
         */
        public static void array_15(){}
        /**
         * @sweater [n.] 毛衣；线衣
         * @jacket [n.] 夹克衫
         * @skirt [n.] 裙子
         */
        public static void array_16(){}
        /**
         * @jeans [n.] 牛仔裤
         * @trousers [n.] （尤英）裤子
         * @clasp [n./v.] 搭扣；扣住
         * @button [n./v.] 纽扣；按钮；扣上...的纽扣
         */
        public static void array_17(){}
        /**
         * @glove [n.] 手套
         * @hat [n.] （常指带帽檐的）帽子
         * @cap [n.] （有帽舌的）帽子；（经费等的）最高限额
         * @brim [n.] 边缘；帽檐
         * @scarf [n.] 围巾；头巾
         */
        public static void array_18(){}
        /**
         * @handkerchief [n.] 手帕
         * @purse [n.] （英）钱包；（美）小手提包
         * @wallet [n.] 钱包；皮夹子
         */
        public static void array_19(){}
        /**
         * @vest [n.] 英-汗衫；美-西装背心
         * @wrap [n.] 披肩
         * @cloak [n.] 斗篷；覆盖物
         * @collar [n.] 衣领；项圈
         * @sleeve [n.] 袖子
         */
        public static void array_20(){}
        /**
         * @sock [n.] 短袜
         * @stocking [n.] （女式）长筒袜
         * @slipper [n.] 拖鞋
         * @boot [n.] 靴子
         * @lace [n.] 鞋带
         */
        public static void array_21(){}
        /**
         * @tailor [n./v.] 裁缝；专门制作
         * @sew [v.] 缝补；缝制
         * @spin [v./n.] 纺；（使）旋转；高速旋转；（乘车）兜风
         */
        public static void array_22(){}
        /**
         * @stitch [n./v.] 针脚；缝
         * @needle [n.] 针
         * @pin [n./v.] 别针；大头针；别住，钉住
         * @string [n.] 线；一串
         * @thread [n.] 线；螺纹
         */
        public static void array_23(){}
        /**
         * @strap [n./v.] 带子；用带子系
         * @stripe [n.] 条纹
         * @ribbon [n.] 缎带；丝带
         */
        public static void array_24(){}
        /**
         * @belt [n.] 腰带，皮带；地带，地区
         * @chain [n.] 链子；链条
         * @bracelet [n.] 手镯
         * @necklace [n.] 项链
         * @bead [n./v.] 珠子，（液体的）小滴；形成珠状
         */
        public static void array_25(){}
        /**
         * @textile [n./adj.] 纺织品；纺织的
         * @velvet [n.] 丝绒；天鹅绒
         * @wool [n.] （羊等的）毛；毛线
         */
        public static void array_26(){}
        /**
         * @patch [n./v.] 补丁，（与周围不同的）小片；补缀
         * @rag [n.] 破布
         * @shabby [adj.] 破旧的；衣衫褴褛的
         * @tight [adj.] 紧的
         */
        public static void array_27(){}
        /**
         * @colour [n.] 颜色；颜料
         * @white [adj./n.] 白的；白色
         * @yellow [adj./n.] 黄的；黄色
         * @brown [adj./n.] 褐色的；褐色
         */
        public static void array_28(){}
        /**
         * @grey [adj./n.] 灰色的；灰色
         * @pink [adj./n.] 粉色的；粉色
         * @purple [adj./n.] 紫色的；紫色
         * @tan [adj./n.] 棕黄色的；棕黄色；晒成的棕褐色
         */
        public static void array_29(){}
        /**
         * @fade [v.] 逐渐消失；（使）褪色
         * @stain [v./n.] 污染；污渍
         * @blot [n.] 污点
         */
        public static void array_30(){}
        /**
         * @figure [n./v.] 身材；身影；重要人物；数字；认为
         * @slender [adj.] 苗条的；微弱的
         * @slight [adj.] 纤细的；轻微的
         */
        public static void array_31(){}
    }
    /**
     *
     * @label 12_饮食健康
     * @wordCount 173
     * @groupCount 45
     */
    public static class Class_dietAndHealth{



        /**
         * @food [n.] 食物
         * @diet [n.] 日常饮食；（医生指定的）特别饮食；节食
         * @appetite [n.] 食欲；强烈欲望
         */
        public static void array_1(){}
        /**
         * @treat [v./n.] 请客；对待；治疗/款待
         * @cater [v.] 为...提供饮食；满足...的需要
         * @provision [n.] 供应、预备
         * @edible [adj.] 可以吃的
         * @recipe [n.] 食谱；秘诀
         */
        public static void array_2(){}
        /**
         * @restaurant [n.] 餐馆
         * @refectory [n.] （学校或其他机构）食堂、餐厅
         * @bar [n.] 酒吧、吧台
         * @cafeteria [n.] 自助餐厅
         */
        public static void array_3(){}
        /**
         * @buffet [n.] 自助餐
         * @barbecue [n./v.] 烧烤野餐、烤架/烧烤
         * @supper [n.] 晚餐
         * @banquet [n.] 宴会
         */
        public static void array_4(){}
        /**
         * @refreshment [n.] 茶点、点心
         * @snack [n.] 快餐、小吃、零食
         * @appetiser [n.] 开胃饮料、开胃小菜
         * @cuisine [n.] 菜肴、烹饪
         * @menu [n.] 菜单
         * @order [n./v.] 订单、点的餐/点（酒菜等）
         * @takeaway [n.] [英]外卖餐馆、外卖食物
         */
        public static void array_5(){}
        /**
         * @chief [n.] 厨师
         * @gourmet [n./adj.] 美食家/美味佳肴的
         * @vegetarian [n./adj.] 素食者/素食的、无肉的
         */
        public static void array_6(){}
        /**
         * @cutlery [n.] 餐具、刀具
         * @silver [n./adj.] 银、银器/银的、银色的
         * @ceramic [adj./n.] 陶瓷的/陶瓷制品
         * @porcelain [n.] 瓷器、瓷
         */
        public static void array_7(){}
        /**
         * @bowl [n.] 碗
         * @dish [n.] 碟、菜肴
         * @saucer [n.] 茶托、茶碟
         * @tray [n.] 盘、托盘
         */
        public static void array_8(){}
        /**
         * @fork [n.] 餐叉、分岔处
         * @knife [n.] 刀
         * @spoon [n.] 匙、调羹
         * @glass [n.] 玻璃、玻璃杯
         * @mug [n.] 大杯、马克杯
         */
        public static void array_9(){}
        /**
         * @kettle [n.] 水壶、[美]锅
         * @pan [n.] 平底锅、[美]烤盘
         * @pot [n.] 锅、壶
         */
        public static void array_10(){}
        /**
         * @stove [n.] 炉子
         * @furnace [n.] 熔炉；暖气炉
         * @oven [n.] 烤炉、烤箱
         */
        public static void array_11(){}
        /**
         * @tin [n.] 锡、罐头
         * @lid [n.] 盖子；眼睑，眼皮
         * @drink [v./n.] 饮、喝；喝酒/饮料
         * @beverage [n.] （水以外的）饮料
         */
        public static void array_12(){}
        /**
         * @juice [n.] 果汁、菜汁
         * @soda [n.] 无碳酸钠的；苏打水；[美]汽水
         * @coffee [n.] 咖啡
         */
        public static void array_13(){}
        /**
         * @alcohol [n.] 酒精、乙醇、酒
         * @liquor [n.] 烈性酒
         * @whisky [n.] 威士忌酒
         * @brandy [n.] 白兰地酒
         * @drunk [adj.] 醉的
         */
        public static void array_14(){}
        /**
         * @tobacco [n.] 烟草
         * @cigarette [n.] 香烟
         * @sober [adj./v.] 清醒的/（使）醒酒
         */
        public static void array_15(){}
        /**
         * @vegetable [n.] 蔬菜
         * @tomato [n.] 番茄
         * @potato [n.] 土豆
         */
        public static void array_16(){}
        /**
         * @pea [n.] 豌豆
         * @bean [n.] 豆
         * @cucumber [n.] 黄瓜
         */
        public static void array_17(){}
        /**
         * @cabbage [n.] 洋白菜、卷心菜、甘蓝
         * @onion [n.] 洋葱
         * @mushroom [n./v.] 蘑菇/呈蘑菇状扩散
         * @eggplant [n.] 茄子
         */
        public static void array_18(){}
        /**
         * @carrot [n.] 胡萝卜
         * @turnip [n.] 萝卜、芜菁
         * @radish [n.] 樱桃萝卜
         */
        public static void array_19(){}
        /**
         * @fruit [n.] 水果
         * @peel [v./n.] 剥（水果、蔬菜的）皮/（水果）皮
         * @strip [v./n.] 剥去、除去/条、带
         * @core [n.] 果核
         * @hull [n./v.] （果实等的）外壳；船体/剥去（果实的）外壳
         */
        public static void array_20(){}
        /**
         * @cherry [n.] 樱桃；樱桃树
         * @berry [n.] 浆果
         * @grape [n.] 葡萄
         * @papaya [n.] 番木瓜
         */
        public static void array_21(){}
        /**
         * @peach [n.] 桃子
         * @pear [n.] 梨
         * @plum [n.] 李子、梅子
         */
        public static void array_22(){}
        /**
         * @orange [n.] 橙子
         * @melon [n.] 瓜、甜瓜
         * @lemon [n.] 柠檬
         * @kiwi [n.] 猕猴桃、奇异果
         */
        public static void array_23(){}
        /**
         * @crop [n.] 庄稼、收成、产量
         * @corn [n.] [英]谷物；[美]玉米
         * @grain [n.] 谷物、颗粒
         */
        public static void array_24(){}
        /**
         * @wheat [n.] 小麦
         * @reap [v.] 收割、收获
         * @flour [n.] 面粉
         * @porridge [n.] 麦片粥
         * @paste [n.] 糨糊、面团
         */
        public static void array_25(){}
        /**
         * @livestock [n.] 家畜
         * @chicken [n.] 鸡
         * @turkey [n.] 火鸡
         */
        public static void array_26(){}
        /**
         * @beef [n.] 牛肉
         * @pork [n.] 猪肉
         * @mutton [n.] 羊肉
         * @sausage [n.] 香肠
         */
        public static void array_27(){}
        /**
         * @fish [n./v.] 鱼/钓鱼
         * @pond [n.] 池塘
         * @rod [n.] 杆、竿
         */
        public static void array_28(){}
        /**
         * @dairy [n./adj.] 乳制品、乳品店/乳制的
         * @milk [n./v.] 奶/挤奶
         * @yogurt [n.] 酸奶
         * @cream [n.] 奶油
         * @cheese [n.] 起司、奶酪
         */
        public static void array_29(){}
        /**
         * @butter [n./v.] 黄油/涂黄油
         * @salad [n.] 色拉
         * @sandwich [v./n.] 把...夹入/三明治
         * @hamburger [n.] 汉堡包
         */
        public static void array_30(){}
        /**
         * @loaf [n./v.] 一条（面包）/游荡、闲逛
         * @pie [n.] 馅饼、派
         * @pizza [n.] 披萨饼
         */
        public static void array_31(){}
        /**
         * @pasta [n.] 意大利面食
         * @spaghetti [n.] 意大利细面
         * @soup [n.] 汤
         */
        public static void array_32(){}
        /**
         * @pudding [n.] 布丁
         * @biscuit [n.] [英]饼干，[美]烤饼、小圆面包
         * @jam [n.] 果酱
         */
        public static void array_33(){}
        /**
         * @nut [n.] 坚果、螺母
         * @chocolate [n.] 巧克力
         * @ice cream [n.] 冰淇淋
         * @vanilla [n./adj.] 香草/香草味的
         */
        public static void array_34(){}
        /**
         * @mustard [n.] 芥末、芥菜
         * @wasabi [n.] 山葵、山葵根
         * @pepper [n.] 胡椒粉、柿子树
         */
        public static void array_35(){}
        /**
         * @ginger [n.] 姜
         * @garlic [n.] 蒜
         * @scallion [n.] 大葱
         */
        public static void array_36(){}
        /**
         * @vinegar [n.] 醋
         * @salt [n.] 盐
         * @sugar [n.] 糖
         * @candy [n.] 糖果
         * @honey [n.] 蜂蜜
         */
        public static void array_37(){}
        /**
         * @flavor [n.] 味道、口味、特色、风格
         * @sour [adj.] 酸的
         * @sweet [adj.] 甜的、愉快的
         * @bitter [adj.] 苦的；痛苦的；严寒的
         * @spicy [adj.] 辣的
         */
        public static void array_38(){}
        /**
         * @delicious [adj.] 美味的
         * @yummy [adj.] 美味的
         * @tasty [adj.] 美味的
         * @hunger [n.] 饥饿、渴望
         * @thirsty [n.] 渴的、渴望的
         */
        public static void array_39(){}
        /**
         * @spice [n.] 香料、给生活添加情趣的事
         * @sauce [n.] 酱汁
         * @ketchup [n.] 番茄酱
         */
        public static void array_40(){}
        /**
         * @perfume [n.] 香味、芳香；香水
         * @ingredient [n.] 成分；（烹调的）原料、因素
         * @supplement [n./v.] 营养补给、补贴/增补、补充
         * @digest [v.] 消化、理解、领悟
         */
        public static void array_41(){}
        /**
         * @cook [v./n.] 烹调、烧、煮/厨师
         * @bake [v.] 烘烤、烤熟
         * @fry [v.] 油煎
         * @roast [v./n.] 烤/烤肉
         * @toast [v./n.] 向...祝酒；为...干杯；烤/烤面包片
         */
        public static void array_42(){}
        /**
         * @suck [v.] 吮吸
         * @swallow [v.] 咽下、吞下
         * @lick [v.] 舔
         * @chew [v.] 咀嚼
         * @gum [n.] 口香糖、树胶
         */
        public static void array_43(){}
        /**
         * @soak [v.] 浸泡、使湿透
         * @dip [v.] 蘸、浸
         * @squeeze [v.] 挤压
         */
        public static void array_44(){}
        /**
         * @stir [v.] 搅动
         * @grind [v./n.] 碾碎/枯燥乏味的事情
         * @slice [v./n.] 切成薄片、切、划/薄片
         */
        public static void array_45(){}
    }
    /**
     *
     * @label 13_建筑场所
     * @wordCount 134
     * @groupCount 37
     */
    public static class Class_buildingPlace{



        /**
         * @architecture [n.] 建筑风格、建筑学
         * @erection [n.] 建筑、建造
         * @structure [n.] 建筑物；结构
         * @construct [v.] 建造
         * @obstruct [v.] 阻塞、妨碍
         */
        public static void array_1(){}
        /**
         * @establish [v.] 建立；设立
         * @build [v.] 建造、开发
         * @found [v.] 创建、创办
         */
        public static void array_2(){}
        /**
         * @concrete [n./adj.] 混泥土/具体的、混凝土制的
         * @steel [n.] 钢铁
         * @stability [n.] 稳定（性）
         */
        public static void array_3(){}
        /**
         * @site [n.] 地点
         * @venue [n.] 发生地点、举行场所
         * @landmark [n.] 地标
         */
        public static void array_4(){}
        /**
         * @situated [adj.] 位于...的
         * @locate [v.] 放置；建立；找到
         * @reside [v.] 居住
         */
        public static void array_5(){}
        /**
         * @inhabit [v.] 居住于
         * @migrate [v.] 迁徙；移居
         * @settle [v.] 解决；在...定居；使定居
         */
        public static void array_6(){}
        /**
         * @dwelling [n.] 住所
         * @skyscraper [n.] 摩天大楼
         * @villa [n.] 乡间别墅；[英]度假别墅
         */
        public static void array_7(){}
        /**
         * @mansion [n.] 宅第；公馆
         * @apartment [n.] 公寓
         * @flat [n.] [尤英]单元房；公寓
         */
        public static void array_8(){}
        /**
         * @hostel [n.] 廉价招待所
         * @lodge [v./n.] 租住/小屋；度假屋
         * @hut [n.] 小屋、棚屋
         * @cabin [n.] 小木屋、（船上的）小舱
         */
        public static void array_9(){}
        /**
         * @cellar [n.] 地窖、地下室
         * @shed [n./v.] 简易房、棚/流、洒、摆脱
         * @cottage [n.] 村舍、小屋
         */
        public static void array_10(){}
        /**
         * @nursery [n./adj.] 托儿所、托儿所的
         * @cradle [n.] 摇篮、发源地
         * @shelter [n./v.] 庇护所；掩蔽/庇护；遮蔽
         * @block [n.] 街区、障碍、一块
         * @grid [n.] 栅栏、网格、输电网
         */
        public static void array_11(){}
        /**
         * @aisle [n.] 走廊、过道
         * @porch [n.] 门廊
         * @corridor [n.] 走廊、通道
         */
        public static void array_12(){}
        /**
         * @stair [n.] 楼梯
         * @staircase [n.] （建筑内的）楼梯
         * @storey [n.] 楼层
         * @layer [n.] 层
         */
        public static void array_13(){}
        /**
         * @elevator [n.] [美]电梯
         * @escalator [n.] 自动扶梯、滚梯
         * @handrail [n.] 扶手、栏杆
         */
        public static void array_14(){}
        /**
         * @pillar [n.] 柱子、中坚、栋梁
         * @column [n.] 柱；（书、报纸的）栏；专栏
         * @beam [n.] （能量、放射线或粒子的）束；柱
         */
        public static void array_15(){}
        /**
         * @vault [n.] 拱顶；金库；保险库
         * @arch [n./v.] 拱门/（使）弯成弓形
         * @ceiling [n.] 天花板、顶棚
         * @eaves [n.] 屋檐
         * @chimney [n.] 烟囱
         */
        public static void array_16(){}
        /**
         * @reception [n.] 接待处
         * @lobby [n./v.] 大厅；前厅；游说/游说
         * @bench [n.] 长凳
         */
        public static void array_17(){}
        /**
         * @parlour [n.] 客厅
         * @fireplace [n.] 壁炉
         * @radiator [n.] 暖气设备
         * @living room [n.] 客厅、起居室
         * @cabinet [n.] 储藏柜、内阁
         */
        public static void array_18(){}
        /**
         * @balcony [n.] 阳台；（剧院的）楼座
         * @terrace [n.] 露天平台、大阳台
         * @kitchen [n.] 厨房
         */
        public static void array_19(){}
        /**
         * @lavatory [n.] 盥洗室、厕所
         * @toilet [n.] 抽水马桶；[英]厕所
         * @bath [n.] 洗澡；[英]浴缸
         * @basin [n.] 盆；盆地
         */
        public static void array_20(){}
        /**
         * @reserve [n./v.] 储备；自然保护区/预订
         * @store [n./v.] 商店；贮存物/贮存
         * @mall [n.] 购物中心
         * @complex [n.] 综合建筑群
         */
        public static void array_21(){}
        /**
         * @supermarket [n.] 超市
         * @booth [n.] 售货摊；电话亭；小隔间
         * @casino [n.] 赌场
         * @studio [n.] 演播室；工作室；单间公寓
         */
        public static void array_22(){}
        /**
         * @downtown [n./adj.] 市中心/市中心的
         * @urban [adj.] 城市的
         * @peripheral [adj./n.] 外围的/外围设备
         * @vicinity [n.] 附近；附近地区
         */
        public static void array_23(){}
        /**
         * @room [n.] 房间；空间
         * @void [n./adj.] 空间；空白；空虚/空的
         * @spacious [adj.] 宽敞的
         * @airtight [adj.] 密封的；不透气的
         */
        public static void array_24(){}
        /**
         * @expanse [n.] 广阔；辽阔
         * @plaza [n.] 广场；购物中心
         * @castle [n.] 城堡
         */
        public static void array_25(){}
        /**
         * @carpenter [n.] 木匠
         * @mason [n.] 石匠；泥瓦匠
         * @tile [n.] 瓦；瓷砖
         * @brickwork [n.] 砖结构
         */
        public static void array_26(){}
        /**
         * @suspension [n.] 暂缓；暂令停职、停赛
         * @hook [n.] 钩；钩状物；勾拳
         * @lever [n.] 杠杆；操纵杆
         * @pole [n.] 竿；杆
         * @scaffold [n.] 脚手架；绞刑架
         */
        public static void array_27(){}
        /**
         * @infrastructure [n.] 基础设施
         * @apparatus [n.] 机械；装置
         * @crane [n.] 起重机；鹤
         */
        public static void array_28(){}
        /**
         * @malfunction [v.] 发生故障
         * @maintain [v.] 维持；维修；坚称
         * @fix [v.] 修理；使固定
         */
        public static void array_29(){}
        /**
         * @mend [v.] 修理；（使）康复
         * @modify [v.] 稍作修改
         * @trim [v./adj.] 修剪；装饰/整齐的、整洁的
         */
        public static void array_30(){}
        /**
         * @weld [v.] 焊接；使紧密结合
         * @saw [n.] 锯
         * @screw [n.] 螺丝钉；螺旋架
         * @drill [n./v.] 钻机；反复练习/钻孔；训练
         * @plumb [n./v.] （表示垂直度的）铅锤/用铅锤线校正
         */
        public static void array_31(){}
        /**
         * @viaduct [n.] 高架桥
         * @span [n.] 跨距；跨度；持续时间
         * @dam [n./v.] 水坝/控制、抑制
         */
        public static void array_32(){}
        /**
         * @assemble [v.] 组装；装配
         * @install [v.] 安装
         * @furnish [v.] 为...配备家具陈设
         */
        public static void array_33(){}
        /**
         * @placement [n.] 放置、布置
         * @layout [n.] 设计；布局
         * @design [v./n.] 设计；计划/设计
         */
        public static void array_34(){}
        /**
         * @entrance [n.] 入口；进入权
         * @entry [n.] 进入；进入权
         * @enter [v.] 进入
         * @exit [n./v.] 出口；退场；离去/离去
         */
        public static void array_35(){}
        /**
         * @outside [adj./n.] 外部的/外表
         * @outward [adj./adv.] 向外的/向外
         * @exterior [n./adj.] 外部；外观/外部的
         * @external [adj.] 外来的；外面的；对外的
         */
        public static void array_36(){}
        /**
         * @inner [adj.] 内部的；内心的
         * @interior [n./adj.] 内部/内部的
         * @inward [adj./adv.] 向内的；内心的/向内
         * @internal [adj.] 内部的；自身的；国内的
         */
        public static void array_37(){}
    }
    /**
     *
     * @label 14_交通旅行
     * @wordCount 134
     * @groupCount 39
     */
    public static class Class_trafficAndTravel{



        /**
         * @navigate [v.] 航行；横渡
         * @voyage [n.] 航海，航行；旅行
         * @aviation [n.] 航空；航空学；航空工业
         */
        public static void array_1(){}
        /**
         * @journey [n.] 旅行；历程
         * @travel [n./v.] 旅行/旅行
         * @safari [n.] 观兽旅行
         * @parade [v./n.] 游行；炫耀/庆祝游行；列队进行；炫耀
         * @haunt [v./n.] （鬼魂等）常出没于/常去的地方
         */
        public static void array_2(){}
        /**
         * @attraction [n.] 吸引；具有吸引力的事物
         * @memorial [n./adj.] 纪念碑/纪念的；悼念的
         * @pyramid [n.] 金字塔；棱锥体
         */
        public static void array_3(){}
        /**
         * @port [n.] 港口；左舷
         * @visa [n.] 签证
         * @traffic [n.] 交通；车流
         */
        public static void array_4(){}
        /**
         * @airline [n.] 航空公司
         * @airplane [n.] 飞机
         * @helicopter [n.] 直升机
         * @jet [n.] 喷气式飞机；喷气口
         * @parachute [n.] 降落伞
         */
        public static void array_5(){}
        /**
         * @flight [n.] 飞行；航班
         * @pilot [n.] 飞行员
         * @passenger [n.] 乘客
         */
        public static void array_6(){}
        /**
         * @baggage [n.] （尤美）行李
         * @luggage [n.] 行李
         * @suitcase [n.] 手提箱
         * @carry-on [n./adj.] （可随身携带上飞机的）小包/随身携带上飞机的
         */
        public static void array_7(){}
        /**
         * @rack [n.] 挂物架；置物架
         * @freight [n./v.] 货运；货物/运送（货物）
         * @fare [n.] 车费；路费
         */
        public static void array_8(){}
        /**
         * @atlas [n.] 地图册；地图集
         * @route [n.] 路线
         * @itinerary [n.] 路线；行程
         */
        public static void array_9(){}
        /**
         * @passage [n.] 通过；通道；走廊
         * @intersection [n.] 十字路口；交叉路口
         * @cross [n./v.] 十字形；十字架/穿过
         */
        public static void array_10(){}
        /**
         * @way [n.] 路；方式
         * @path [n.] 小路
         * @lane [n.] 小巷；车道
         * @avenue [n.] 大街；途径
         * @highway [n.] [尤美]公路
         */
        public static void array_11(){}
        /**
         * @curb [n.] 路缘；起控制作用的事物
         * @signpost [n.] 路标
         * @pave [v.] 铺（路或地面）
         */
        public static void array_12(){}
        /**
         * @vehicle [n.] 车辆；交通工具；手段；工具
         * @auto [n.] 汽车
         * @express [n./v./adj.] 特快列车；快递服务/表示/特快的
         */
        public static void array_13(){}
        /**
         * @tram [n.] [尤英]有轨电车
         * @coach [n./v.] [英]长途汽车；教练；私人教师/训练
         * @ambulance [n.] 救护车
         */
        public static void array_14(){}
        /**
         * @truck [n.] 卡车；敞篷火车
         * @lorry [n.] [英]卡车
         * @van [n.] 厢式货车；客货车
         * @wagon [n.] 四轮运货马车（或牛车）；[英]（火车的）火车车厢
         * @carriage [n.] 四轮马车；[英]（客运火车的）车厢
         */
        public static void array_15(){}
        /**
         * @tractor [n.] 拖拉机；牵引力
         * @cart [n.] 货运马车；手推车；购物车
         * @pedicab [n.] （人力）三轮车
         * @cycle [v./n.] 骑/周期；自行车
         */
        public static void array_16(){}
        /**
         * @garage [n.] 汽车修理厂；车库
         * @motor [n./adj.] 发动机/机动的
         * @horsepower [n.] 马力
         * @wheel [n.] 方向盘；车轮
         */
        public static void array_17(){}
        /**
         * @brake [n./v.] 车闸；刹车/刹车
         * @tire [n.] 轮胎
         * @honk [n./v.] 汽车喇叭声；鹅叫声/按（汽车喇叭）
         */
        public static void array_18(){}
        /**
         * @crew [n.] 全体工作人员；一组工作人员
         * @captain [n.] 船长；队长
         * @steward [n.] 男乘务员；管家
         */
        public static void array_19(){}
        /**
         * @emergency [n./adj.] 紧急事件/应急的
         * @wreck [v./n.] 使失事；破坏/失事的船只；残破的东西
         * @crash [v.] 撞击；崩溃；破产
         * @crush [v./n.] 压碎、压坏/拥挤的人群；迷恋；迷恋对象
         * @dash [v.] 猛冲；猛摔
         */
        public static void array_20(){}
        /**
         * @vanish [v.] 突然消失；绝迹
         * @disappear [v.] 失踪；消失
         * @hazard [n./v.] 危险/使冒风险
         */
        public static void array_21(){}
        /**
         * @harbour [n.]  港口
         * @dock [n.] 码头；船坞
         * @anchor [n.] 锚
         */
        public static void array_22(){}
        /**
         * @submerge [v.] （使）浸没；掩盖
         * @sailor [n.] 水手；海员
         * @seaman [n.] 海员；水手
         */
        public static void array_23(){}
        /**
         * @carrier [n.] 航空母舰；运输工具
         * @steamer [n.] 汽船；轮船
         * @liner [n.] 邮轮；客轮
         */
        public static void array_24(){}
        /**
         * @vessel [n.] 大船；舰；容器；器皿；血管
         * @ferry [n./v.] 渡船/渡运
         * @sail [v.] 航行；驾驶（帆船）
         */
        public static void array_25(){}
        /**
         * @raft [n.] 木筏；木排
         * @canoe [n.] 独木舟
         * @oar [n./v.] 桨/用桨划
         */
        public static void array_26(){}
        /**
         * @deck [n./v.] 甲板/装饰
         * @turbine [n.] 涡轮机
         * @propeller [n.] 螺旋桨，推进器
         */
        public static void array_27(){}
        /**
         * @stern [n./adj.] 船尾/严厉的，苛刻的；严峻的，棘手的
         * @aboard [adv.] 在（船、飞机等）上
         * @embark [v.] 上船、飞机等；开始做
         */
        public static void array_28(){}
        /**
         * @channel [n.] 频道；航道；海峡
         * @canal [n.] 运河；（人体内输送食物、气体等的）管
         * @ditch [n./v.] 沟、渠/抛弃
         */
        public static void array_29(){}
        /**
         * @railroad [n.] [美]铁路；铁路公司
         * @railway [n.] [英]铁路；铁路系统
         * @locomotive [n.] 火车头；机车
         */
        public static void array_30(){}
        /**
         * @subway [n.] [英]地下通道；[美]地铁
         * @underground [adj./n.] 地下的；秘密的/[英]地铁
         * @tunnel [n.] 隧道、地道
         * @rail [n.] 栏杆；铁路系统
         */
        public static void array_31(){}
        /**
         * @depart [v.] 离开；启程
         * @arrive [v.] 到达；取得成功
         * @destination [n.] 目的地；终点
         */
        public static void array_32(){}
        /**
         * @delay [n./v.] 耽搁；延期/使耽搁；使延期
         * @postpone [v.] 推迟；使延期
         * @defer [v.] 推迟；延期
         */
        public static void array_33(){}
        /**
         * @lull [n./v.] 暂停；暂时平静期/使昏昏欲睡
         * @expire [v.] 期满；气绝；死亡
         * @due [adj.] 到期的；预期的
         */
        public static void array_34(){}
        /**
         * @postage [n.] 邮费；邮资
         * @stamp [n./v.] 邮票；印章/贴邮票；盖章
         * @envelope [n.] 信封
         * @mail [n./v.] 邮件；邮包；邮政/邮寄
         */
        public static void array_35(){}
        /**
         * @packet [n.] 包装盒；小件包裹
         * @package [n./v.] 包裹；盒；包/包装
         * @bind [v.] 捆；绑
         */
        public static void array_36(){}
        /**
         * @parcel [v./n.] 打包；包/土地的一块；包裹
         * @load [v./n.] 装载；装满/负荷；大量
         * @burden [v./n.] 使负担/重担；负担
         */
        public static void array_37(){}
        /**
         * @transfer [v.] 迁移；转移；调动
         * @transmit [v.] 传送；传染；传播；传输
         * @transit [v./n.] 通过；运送/运输；通行；过境；中装
         */
        public static void array_38(){}
        /**
         * @deliver [v.] 传送；递送
         * @convey [v.] 运送；输送；表达；传递
         * @speed [n.] 速度；迅速
         * @velocity [n.] 速度
         * @swift [adj.] 迅速的；敏捷的
         */
        public static void array_39(){}
    }
    /**
     *
     * @label 15_国家政府
     * @wordCount 149
     * @groupCount 40
     */
    public static class Class_nationAndGovernment{



        /**
         * @republic [n.] 共和国；共和政体
         * @Marxism [n.] 马克思主义
         * @socialism [n.] 社会主义
         * @communism [n.] 共产主义
         */
        public static void array_1(){}
        /**
         * @regime [n.] 统治制度；政权、政体
         * @government [n.] 政府、政体、统治
         * @authority [n.] 权力；权威人士
         * @political [adj.] 政治的；政党的
         * @hierarchy [n.] 等级制度；统治集团
         */
        public static void array_2(){}
        /**
         * @democracy [n.] 民主、民主制度；民主国家
         * @bureaucracy [n.] 官僚主义；官僚作风
         * @egalitarian [adj./n.] 平等主义的/平等主义者
         * @materialism [n.] 唯物主义；唯物论
         */
        public static void array_3(){}
        /**
         * @revolution [n.] 革命；巨大变化
         * @reform [v./n.] 改革、改良；改过自新/改革、改良
         * @process [n./v.] 过程；进程/处理；加工；列队前进
         * @conservative [adj./n.] 保守的/保守党员
         * @meltdown [n.] 堆芯熔毁；崩溃
         */
        public static void array_4(){}
        /**
         * @municipal [adj.] 市政的，地方政府的
         * @neutral [adj.] 中立的；中立国的
         * @bilateral [adj.] 双边的
         */
        public static void array_5(){}
        /**
         * @arena [n.] 竞技场、运动场；舞台、活动领域
         * @flag [n.] 旗
         * @banner [n.] 横幅、标语
         */
        public static void array_6(){}
        /**
         * @president [n.] 总统；校长；董事长
         * @premier [n./adj.] 总理、首相/首要的，第一的
         * @minister [n.] 部长；大臣；公使
         * @secretary [n.] 秘书、书记员、大臣
         */
        public static void array_7(){}
        /**
         * @parliament [n.] 议会、国会
         * @senate [n.] 大学理事会
         * @conference [n.] （常持续数日的大型正式）会议；正式商谈
         * @meeting [n.] 会议；会面
         */
        public static void array_8(){}
        /**
         * @headquarters [n.] 总部，总公司；司令部
         * @delegation [n.] 代表团；委派
         * @behalf [n.] [on ~ of sb.]代表某人
         */
        public static void array_9(){}
        /**
         * @police [n.] 警察
         * @statesman [n.] 政治家
         * @mayor [n.] 市长
         */
        public static void array_10(){}
        /**
         * @service [n.] 服务
         * @office [n.] 办公室；要职；官职；[Office]部、局、厅
         * @bureau [n.] 局、处、科；办事处
         * @department [n.] （政府的）部门；（大学的）系、所
         */
        public static void array_11(){}
        /**
         * @harness [v.] 利用；控制
         * @administration [n.] 管理；行政
         * @dominate [v.] 支配；控制；占优势
         * @power [n.] 能源；权力；政权；能力
         */
        public static void array_12(){}
        /**
         * @influence [n./v.] 影响；作用/影响
         * @affect [v.] 影响；打动；使悲伤
         * @importance [n.] 重要，重要性
         * @significance [n.] 重要性；意义
         */
        public static void array_13(){}
        /**
         * @organization [n.] 组织；团体；机构
         * @association [n.] 协会；团体；关联
         * @union [n.] 联合；联盟；工会
         */
        public static void array_14(){}
        /**
         * @community [n.] 社区；群体；（生物的）群落
         * @consortium [n.] 财团；联营企业
         * @league [n.] 联赛；联盟；同盟
         */
        public static void array_15(){}
        /**
         * @institution [n.] 机构
         * @unite [v.] 联合；团结
         * @unique [adj.] 独一无二的；唯一的；独特的
         */
        public static void array_16(){}
        /**
         * @nation [n.] 国家；民族；国民
         * @global [adj.] 全球的；全世界的
         * @worldwide [adj.] 世界范围的；遍及全球的
         * @federal [adj.] 联邦的；联合的
         */
        public static void array_17(){}
        /**
         * @foreign [adj.] 外国的；外来的；外交的
         * @overseas [adj./adv.] 海外的；外国的/向海外；在海外
         * @abroad [adv.] 到国外；在国外；广为流传
         */
        public static void array_18(){}
        /**
         * @civil [adj.] 公民的；国内的；民用的；斯文的
         * @emigrate [v.] 移居国外
         * @immigrate [v.] （从外地）移居；移入
         */
        public static void array_19(){}
        /**
         * @reign [n./v.] 君主统治的时期/统治
         * @puppet [n.] 玩偶；傀儡
         * @throne [n.] 王位；宝座
         * @crown [n./v.] 王冠/为...加冕
         * @wreath [n.] 花环；花冠；花圈
         */
        public static void array_20(){}
        /**
         * @colony [n.] 殖民地
         * @liberty [n.] 自由
         * @independence [n.] 独立；自立
         */
        public static void array_21(){}
        /**
         * @slum [n.] 贫民窟
         * @refuge [n.] 避难；庇护；避难所
         * @asylum [n.] 庇护；精神病院
         */
        public static void array_22(){}
        /**
         * @population [n.] 人口；人口数量
         * @demographic [adj.] 人口的，人口统计的
         * @citizen [n.] 公民；市民
         * @resident [n./adj.] 居民；居住的
         */
        public static void array_23(){}
        /**
         * @ethnic [adj.] 民族的；种族的
         * @racial [adj.] 种族的；人种的
         * @clan [n.] 宗族；家族；帮派
         */
        public static void array_24(){}
        /**
         * @franchise [v./n.] 向…授予（或出售）特许经销权/特许权
         * @entitle [v.] 给...权力（或资格）；给...题名
         * @preference [n.] 偏爱；优先权
         */
        public static void array_25(){}
        /**
         * @vote [n./v.] 选举权；投票/表决、投票
         * @elect [v.] 选举；选择
         * @respondent [n.] （民意测验的）调查对象
         * @poll [n.] 民意调查；选举投票；投票数
         * @ambition [n.] 雄心；抱负
         */
        public static void array_26(){}
        /**
         * @nominate [v.] 报名；任命
         * @checklist [n.] 清单；选民花名册
         * @succession [n.] 连续；继承权；继位
         */
        public static void array_27(){}
        /**
         * @safety [n.] 安全；安全场所
         * @welfare [n.] 健康；幸福
         * @well-being [n.] 康乐；安宁
         * @harmony [n.] 协调；和谐；融洽；和声
         * @steady [adj.] 稳定的；不摇晃的
         */
        public static void array_28(){}
        /**
         * @flourish [v.] 繁荣；兴旺；茁壮成长
         * @succeed [v.] 成功
         * @prospect [n.] 希望；可能性；风景
         * @perspective [n.] 景观；观点
         */
        public static void array_29(){}
        /**
         * @viewpoint [n.] 观点；看法；视角
         * @standpoint [n.] 立场；立足点
         * @outlook [n.] 观点；展望；前景
         * @guideline [n.] 指导方针
         * @ethic [n.] 行为准则；ethics 道德规范，伦理标准
         */
        public static void array_30(){}
        /**
         * @suggest [v.] 建议；暗示
         * @advise [v.] 劝告；建议；通知
         * @proposal [n.] 提议；建议
         * @hint [v./n.] 暗示，提示
         */
        public static void array_31(){}
        /**
         * @declare [v.] 宣布，宣告，宣称，声称
         * @affirm [v.] 断言，坚持声称，证实
         * @claim [n./v.] 声称；主张；索赔/声称；要求（拥有）
         * @proclaim [v.] 声明；清楚的表明
         */
        public static void array_32(){}
        /**
         * @state [v./n.] 陈述；说明/国家，州，状况
         * @announce [v.] 宣布，通知
         * @clarify [v.] 澄清，阐明
         */
        public static void array_33(){}
        /**
         * @assist [v.] 帮助；协助
         * @aid [n.] 救助；救援物资；辅助物
         * @encourage [v.] 鼓励，激励，怂恿
         */
        public static void array_34(){}
        /**
         * @implement [v./n.] 实施；执行/工具；器具
         * @monitor [v./n.] 监视；监听/监控器，监视器，班长
         * @admit [v.] 供认，承认
         */
        public static void array_35(){}
        /**
         * @African [adj./n.] 非洲的/非洲人
         * @European [adj./n.] 欧洲的/欧洲人
         * @Latin [adj./n.] 拉丁语的，拉丁人的/拉丁人，拉丁语
         * @Jewish [adj.] 犹太教的，犹太人的
         * @Arabian [adj.] 阿拉伯的
         */
        public static void array_36(){}
        /**
         * @Portuguese [adj./n.] 葡萄牙的/葡萄牙人，葡萄牙语
         * @Roman [adj./n.] 罗马的/罗马人
         * @Russian [adj./n.]
         * @Spanish [adj./n.]
         * @Swiss [adj./n.] 瑞士的/瑞士人
         */
        public static void array_37(){}
        /**
         * @Greek [adj./n.]
         * @Italian [adj./n.]
         * @soviet [adj./n.] 苏联的/苏维埃
         * @Indian [adj./n.]
         */
        public static void array_38(){}
        /**
         * @Australia [n.] 澳大利亚
         * @New Zealand [n.]
         * @Canada [n.]
         */
        public static void array_39(){}
        /**
         * @Britain [n.]
         * @France [n.]
         * @Germany [n.]
         */
        public static void array_40(){}
    }
    /**
     *
     * @label 16_社会经济
     * @wordCount 171
     * @groupCount 48
     */
    public static class Class_societyAndEconomy{



        /**
         * @economy [n.] 经济；节约
         * @trade [n./v.] 贸易/交换
         * @market [n.] 市场；市场需求
         * @industry [n.] 工业；产业；勤劳
         */
        public static void array_1(){}
        /**
         * @merchant [n./adj.] 商人/商业的
         * @financial [adj.] 财政的；金融的
         * @fund [v./n.] 资助/基金；资金
         * @donate [v.] 捐款；捐献
         * @endow [v.] 捐赠；赋予
         */
        public static void array_2(){}
        /**
         * @commercial [adj./n.] 商业的/商业广告
         * @advertise [v.] 做广告
         * @slogan [n.] 标语；口号
         */
        public static void array_3(){}
        /**
         * @purchase [n./v.] 购买
         * @lease [n./v.] 租约/出租；租用
         * @afford [v.] 负担得起；提供；给予
         */
        public static void array_4(){}
        /**
         * @retail [n./v.] 零售/以...价格零售
         * @chain [n.] 一连串；连锁店
         * @grocery [n.] 食品杂货店
         */
        public static void array_5(){}
        /**
         * @discount [n./v.] 折扣/打折出售
         * @promotion [n.] 促销活动；晋升
         * @voucher [n.] 代金券
         * @coupon [n.] 优惠券
         */
        public static void array_6(){}
        /**
         * @currency [n.] 货币；通用，流行
         * @exchange [n.] 交换；兑换
         * @swap [v./n.] 交换
         * @receipt [n.] 收据；收到
         * @invoice [n./v.] 发票/开发票给
         */
        public static void array_7(){}
        /**
         * @tax [n./v.] 税/对...征税
         * @levy [n./v.] 税款/征收
         * @tariff [n.] 关税；（公共服务的）收费
         * @duty [n.] 职责；义务；关税
         * @impose [v.] 强加；征收（书款）
         */
        public static void array_8(){}
        /**
         * @consume [v.] 消耗，吃，喝
         * @spend [v./n.] 花费/开支
         * @cost [v./n.] 需付费/费用；代价；成本
         */
        public static void array_9(){}
        /**
         * @expense [n.] 费用；花费
         * @revenue [n.] （公司、组织的）收入；（政府的）税收
         * @gross [adj.] 总的；毛的
         */
        public static void array_10(){}
        /**
         * @recession [n.] 经济衰退
         * @depression [n.] 沮丧；消沉；萧条期；不景气
         * @crisis [n.] 危机
         */
        public static void array_11(){}
        /**
         * @security [n.] 安全工作；安全；[securities]证券
         * @bond [n.] 债券
         * @debt [n.] 债务
         */
        public static void array_12(){}
        /**
         * @deficit [n.] 赤字；逆差
         * @inflation [n.] 通货膨胀
         * @deflation [n.] 通货紧缩
         */
        public static void array_13(){}
        /**
         * @dwindle [v.] 缩小；减少
         * @decrease [n./v.] 减少；减小/（使）减少；（使）减小
         * @downsize [v.] 使精简；裁员
         */
        public static void array_14(){}
        /**
         * @decline [v./n.] 下降
         * @diminish [v.] 减少；贬低
         * @reduce [v.] 减少，减小
         */
        public static void array_15(){}
        /**
         * @increase [n./v.] 增加，增长/（使）增加，（使）增长
         * @increment [n.] 增加量；定期加薪
         * @growth [n.] 增长；生长
         */
        public static void array_16(){}
        /**
         * @escalate [v.] （使）逐步升级；（使）不断恶化
         * @expand [v.] 扩充；扩大；扩展
         * @influx [n.] 流入，涌进
         */
        public static void array_17(){}
        /**
         * @affluent [adj.] 富裕的；富足的
         * @enrich [v.] 使富有；充实
         * @sufficient [adj.] 足够的
         * @adequate [adj.] 足够的；合格的
         */
        public static void array_18(){}
        /**
         * @spare [adj./v.] 多余的；空闲的/剩余
         * @saving [n.] 节约；节省
         * @redundant [adj.] 多余的；被裁减的
         * @lack [n./v.] 缺乏；不足/缺少；没有
         */
        public static void array_19(){}
        /**
         * @company [n.] 公司；陪伴；剧团
         * @firm [n./adj.] 公司/坚定的；坚固的
         * @enterprise [n.] 企业；事业
         * @agent [n.] 代理人，代理商
         * @entity [n.] 实体，独立存在物
         */
        public static void array_20(){}
        /**
         * @invest [v.] 投资；投入
         * @input [n.] 输入信息；投入物
         * @product [n.] 产品；产物
         */
        public static void array_21(){}
        /**
         * @acquisition [n.] 获得；（对公司的）并购
         * @goods [n.] 商品；货物
         * @cargo [n.] 货物
         */
        public static void array_22(){}
        /**
         * @insure [v.] 确保；给...上保险
         * @guarantee [v./n.] 担保；确保/保证；保修单；担保金；担保物
         * @reliable [adj.] 可靠的，可信赖的
         */
        public static void array_23(){}
        /**
         * @negotiation [n.] 谈判，协商
         * @attend [v.] 参加，出席
         * @absent [adj.] 缺席的；不在场的；心不在焉的
         */
        public static void array_24(){}
        /**
         * @sale [n.] 买；销售；销售额
         * @wholesale [n.]  批发
         * @auction [v./n.] 拍卖
         * @bid [v./n.] 出价；投标
         */
        public static void array_25(){}
        /**
         * @deal [v./n.] 买卖；[~ with]处理；应付/协议；交易；大量
         * @transaction [n.] （一笔）交易；业务
         * @turnover [n.] （人员的）流动率；营业额
         * @dump [v.] 丢弃；倾倒；倾销
         */
        public static void array_26(){}
        /**
         * @export [v./n.] 出口/出口；出口商品
         * @import [v./n.] 进口/进口；进口商品
         * @quota [n.] 限额；配额；定额
         */
        public static void array_27(){}
        /**
         * @share [n./v.] 股份，股票；一份/分享；共享；分担
         * @benefit [n./v.] 益处/有利于；获益
         * @interest [n./v.] 兴趣；利益；利息/使感兴趣
         * @dividend [n.] 股息；红利
         * @stock [n.] 股本；股票；库存
         */
        public static void array_28(){}
        /**
         * @account [n.] 账户；解释
         * @deposit [n.] 存款；押金
         * @instalment [n.] （分期付款的）一期付款
         * @cheque [n.] 支票
         */
        public static void array_29(){}
        /**
         * @cash [n./v.] 现金/兑现（支票）
         * @coin [n./v.] 硬币/铸币；创造（新词语）
         * @shilling [n.] 先令
         * @copper [n.] 铜；[~s]铜币；警察
         */
        public static void array_30(){}
        /**
         * @treasure [n.] 金银财宝；宝物；珍品
         * @wealth [n.] 财富；丰富
         * @estate [n.] 地产；遗产
         */
        public static void array_31(){}
        /**
         * @possess [v.] 占用；拥有；影响；控制
         * @legacy [n.] 遗赠；遗产
         * @descend [v.] 下降，下来
         */
        public static void array_32(){}
        /**
         * @worthy [adj.] 有价值的
         * @valuable [adj.] 很值钱的；贵重的；很重要的
         * @cheap [adj.] 廉价的；质劣价低的
         */
        public static void array_33(){}
        /**
         * @incentive [n.] 刺激；激励
         * @accelerate [v.] 加速
         * @prompt [v./adj.] 促使/迅速的
         */
        public static void array_34(){}
        /**
         * @salary [n.] 工资；（按月领的）薪水
         * @income [n.] 收入
         * @wage [n.] （通常指按周领的）工钱
         */
        public static void array_35(){}
        /**
         * @payment [n.] 支付；支付的款项；付款额
         * @refund [n./v.] 退款
         * @reimburse [v.] 赔偿；补偿
         */
        public static void array_36(){}
        /**
         * @payroll [n.] 工资名单
         * @remuneration [n.] 报酬
         * @subsidy [n.] 津贴，补贴
         * @earn [v.] 赚得；赢得；获得
         */
        public static void array_37(){}
        /**
         * @undertaking [n.] 任务；事业；许诺；保证
         * @career [n.] 职业；事业；职业生涯
         * @profession [n.] 职业
         */
        public static void array_38(){}
        /**
         * @occupation [n.] 占领，占据；职业
         * @job [n.] 职业；工作
         * @vocation [n.] （认为特别适合自己的）职业；使命感
         */
        public static void array_39(){}
        /**
         * @labour [n.] 劳动；体力劳动
         * @workforce [n.] 劳动力；全体员工
         * @workaholic [n.] 工作狂
         * @personnel [n.] 人员，职员；人事部门
         * @clerk [n.] 店员，办事员，接待员
         */
        public static void array_40(){}
        /**
         * @interview [n./v.] 面试；采访/对...进行面试；采访
         * @résumé [n.] UK /ˈrez.juː.meɪ/ US /ˈrez.ə.meɪ/ 履历；简历；摘要
         * @recommend [v.] 推荐；劝告；介绍
         * @employ [v.] 雇用；采用
         * @hire [v./n.] 雇用；租用/租赁（业）
         */
        public static void array_41(){}
        /**
         * @fire [v./n.] 解雇/火
         * @lay-off [n.] （因岗位不足的）解雇；裁员；歇工期
         * @dismiss [v.] 解雇；解散；驳回
         * @discharge [v./n.] 解雇/卸货
         */
        public static void array_42(){}
        /**
         * @resign [v.] 辞去；辞职
         * @sack [n./v.] 大口袋，麻布袋/开除
         * @retire [v.] 退休
         */
        public static void array_43(){}
        /**
         * @result [n./v.] 结果，后果/导致
         * @failure [n.] 失败；失败的人；失败的事
         * @abortion [n.] 人工流产；中途失败
         * @loss [n.] 遗失；损失；亏损
         */
        public static void array_44(){}
        /**
         * @opportunity [n.] 机会；时机
         * @chance [n.] 机会；可能性
         * @choose [v.] 选择
         * @change [n.] 改变
         */
        public static void array_45(){}
        /**
         * @solve [v.] 解答，解决
         * @develop [v.] 发展，开发
         * @sustainable [adj.] 可持续的
         * @improve [v.] 改善；改进
         */
        public static void array_46(){}
        /**
         * @manage [v.] 管理；设法做到
         * @regulate [v.] 管理；调整
         * @sanction [n./v.] 批准；制裁/批准；对...制裁
         */
        public static void array_47(){}
        /**
         * @coordinate [v./n.] 调和；协调/坐标
         * @cooperate [v.] 合作；协作
         * @collaborate [v.] 合作
         */
        public static void array_48(){}
    }
    /**
     *
     * @label 17_法律法规
     * @wordCount 117
     * @groupCount 28
     */
    public static class Class_lawAndRegulation{



        /**
         * @law [n.] 法律；规律；定理
         * @legal [adj.] 法律的；合法的
         * @rule [n./v.] 规则/统治
         * @regulation [n.] 规则；规定；管理
         */
        public static void array_1(){}
        /**
         * @item [n.] 条目
         * @treaty [n.] 条约；协议
         * @agreement [n.] 同意；协定
         * @charter [n./v.] 宪章/租；包（船、车、飞机等）
         * @protocol [n.] 协定书；协议；礼仪
         */
        public static void array_2(){}
        /**
         * @norm [n.] 标准；[~s]行为准则；规范
         * @benchmark [n.] 基准，水准点
         * @criteria [n.] [criterion 的复数形式]标准；准则
         * @standard [n.] 标准
         * @permit [v.] 允许；准许
         * @allow [v.] 允许；准许
         * @admission [n.] 承认；入场费；准许入场
         */
        public static void array_3(){}
        /**
         * @perform [v.] 履行；执行
         * @enforce [v.] 强制执行；强行实施；迫使
         * @default [v./n.] 不支付、不履行/违约；默认值
         * @reject [v.] 拒绝接受；摒弃
         * @constraint [n.] 约束；限制，克制
         */
        public static void array_4(){}
        /**
         * @official [adj.] 正式的；官方的
         * @mandatory [adj.] 法定的；强制的
         * @potent [adj.] 很有效的；强有力的
         * @bound [adj.] [be ~ to]一定会；很可能会；有义务
         * @obligation [n.] 义务；责任
         */
        public static void array_5(){}
        /**
         * @court [n.] 法院；庭院
         * @supreme [adj.] 最高的；最大的
         * @enact [v.] 通过（法律）；表演
         * @legislate [v.] 立法，制定（或通过）法律
         */
        public static void array_6(){}
        /**
         * @equity [n.] 公平
         * @fair [adj.] 公平的；公章的
         * @just [adj./adv.] 公证的；正义的/刚刚；仅仅
         * @prejudice [n.] 偏见；成见
         * @discrimination [n.] 歧视
         */
        public static void array_7(){}
        /**
         * @accuse [v.] 控告；指责
         * @sue [v.] 控告，提起诉讼；提出请求
         * @prosecute [v.] 检举；起诉
         */
        public static void array_8(){}
        /**
         * @condemn [v.] 谴责；指责
         * @complain [v.] 抱怨；投诉
         * @boycott [n./v.] 抵制；拒绝购买
         */
        public static void array_9(){}
        /**
         * @session [n.] 会议；会期
         * @mediate [v.] 斡旋；调解
         * @plea [n.] 辩解理由；借口；请求
         */
        public static void array_10(){}
        /**
         * @appeal [v./n.] 呼吁；申述
         * @contradict [v.] 反驳；与...矛盾
         * @persuade [v.] 说服；使相信
         * @controversy [n.] 争议；辩论
         */
        public static void array_11(){}
        /**
         * @whisper [v.] 低声说；私下谈论
         * @mutter [v.] 低声低语；小声抱怨
         * @murmur [n./v.] 低声说/咕哝；低语
         * @silent [adj.] 沉默的；寂静无声的
         * @mute [adj./n.] 缄默的；哑的；无声的/哑巴
         */
        public static void array_12(){}
        /**
         * @investigate [v.] 调查
         * @witness [n./v.] 目击者；见证人/见证
         * @justify [v.] 为...辩护；证明...正当
         * @reasonable [adj.] 合理的；理智的
         * @suitable [adj.] 合适的，适宜的
         */
        public static void array_13(){}
        /**
         * @judge [n.] 法官；裁判员
         * @jury [n.] 陪审团；评判委员会
         * @trial [n.] 试验；审判
         * @suspect [n./v.] 嫌疑犯/怀疑
         */
        public static void array_14(){}
        /**
         * @sentence [n./v.] 判决/宣判
         * @arrest [v./n.] 逮捕；吸引（注意）/逮捕
         * @jail [n./v.] 监狱/监禁
         * @prison [n.] 监狱，监禁
         * @confine [n./v.] [~s]边界；范围/限制；监禁
         */
        public static void array_15(){}
        /**
         * @oversee [v.] 监督；监管
         * @supervise [v.] 监督；管理；指导
         * @restrict [v.] 限制；限定；约束
         * @restrain [v.] 抑制；制止
         */
        public static void array_16(){}
        /**
         * @commit [v.] 犯（罪）；做（坏事）
         * @sin [n./s.] 罪孽/犯戒律
         * @crime [n.] 罪行；犯罪活动
         */
        public static void array_17(){}
        /**
         * @vice [n.] 恶行；缺点
         * @bribe [n./v.] 贿赂/向...行贿
         * @rob [v.] 抢劫；夺走
         * @pirate [n./v.] 海盗；盗版者/盗印，窃用
         */
        public static void array_18(){}
        /**
         * @steal [n.] 偷，窃取；剽窃
         * @thief [n.] 窃贼；偷窃犯
         * @murder [n./v.] 谋杀
         * @suicide [n.] 自杀
         */
        public static void array_19(){}
        /**
         * @deceive [v.] 欺骗；蒙蔽；误导
         * @cheat [v./n.] 欺骗；作弊/作弊者
         * @fraud [n.] 骗子；赝品；欺诈
         * @liar [n.] 说谎的人
         */
        public static void array_20(){}
        /**
         * @trap [n./v.] 陷阱；诡计/诱骗
         * @trick [n./v.] 诡计/哄骗
         * @pretend [v.] 假装，假扮
         * @fool [n./v.] 蠢人；傻子/欺骗
         * @stigma [n.] 耻辱；污名
         */
        public static void array_21(){}
        /**
         * @confess [v.] 供认；忏悔
         * @conform [v.] 遵守；顺从；相符合
         * @reconcile [v.] 使和解；调和
         * @obey [v.] 服从；顺从
         * @succumb [v.] 屈服；屈从
         */
        public static void array_22(){}
        /**
         * @penalty [n.] 惩罚；处罚
         * @fine [n./adj.] 罚款/美好的
         * @mortgage [v./n.] 抵押（房屋、土地）借款/房贷
         * @ownership [n.] 所有权；物主身份
         */
        public static void array_23(){}
        /**
         * @copyright [n.] 版权
         * @privilege [n.] 特权
         * @accredit [v.] 把...归于；委任
         */
        public static void array_24(){}
        /**
         * @clue [n.] 线索；提示
         * @access [n.] 通路；查阅（或使用、接近）的机会（或权利）
         * @anonymous [adj.] 匿名的
         * @false [adj.] 不正确的；虚假的；伪造的
         * @genuine [adj.] 真诚的；真正的
         */
        public static void array_25(){}
        /**
         * @procedure [n.] 手续；程序
         * @routine [n./adj.] 例行公事；常规/惯例的
         * @consequence [n.] 后果
         */
        public static void array_26(){}
        /**
         * @demand [v./n.] 要求；需要/需求；需求量
         * @request [n./v.] 要求；请求
         * @require [v.] 需要；命令；规定
         */
        public static void array_27(){}
        /**
         * @petition [v./n.] 请求/请愿书；上诉
         * @command [v./n.] 命令；指挥；统率/命令；指挥；控制；运用能力
         * @instruct [v.] 指导；讲授；通知；命令
         */
        public static void array_28(){}
    }
    /**
     *
     * @label 18_沙场争锋
     * @wordCount 213
     * @groupCount 58
     */
    public static class Class_war{



        /**
         * @violence [n.] 暴力
         * @conflict [n./v.] 斗争，冲突/冲突
         * @raid [n./v.] 突袭；突然搜查
         * @enormity [n.] 巨大；滔天大罪
         */
        public static void array_1(){}
        /**
         * @campaign [n./v.] 战役；（社会、政治）运动/参加（或领导）运动
         * @battle [n./v.] 战斗，战役/与...战斗
         * @struggle [v./n.] 挣扎；奋力；奋斗
         */
        public static void array_2(){}
        /**
         * @explosion [n.] 爆发；迸发；爆炸；激增
         * @bombard [v.] 轰击，轰炸；连珠炮般指纹（或批评）
         * @bomb [n./v.] 炸弹/轰炸
         */
        public static void array_3(){}
        /**
         * @blast [n./v.] 爆炸/爆炸，炸毁
         * @burst [v./n.] 爆裂，展开/迸发，爆裂
         * @spark [n.] 火花，火星
         * @twinkle [n./v.] 闪烁，闪耀
         */
        public static void array_4(){}
        /**
         * @gunpowder [n.] 火药
         * @tank [n.] 坦克；罐，槽，缸
         * @cannon [n.] 大炮，加农炮
         * @missile [n.] 导弹；投掷物
         */
        public static void array_5(){}
        /**
         * @weapon [n.] 武器；兵器；手段
         * @pistol [n.] 手枪
         * @rifle [n.] 步枪
         * @bullet [n.] 子弹
         */
        public static void array_6(){}
        /**
         * @target [n.] 靶子；目标
         * @deflect [v.] （使）偏斜，（使）偏转；转移
         * @mission [n.] 使命；重要任务；传教团
         */
        public static void array_7(){}
        /**
         * @flame [n.] 火焰；强烈的情感
         * @flare [n./v.] （闪耀的）火光；闪光信号灯/闪耀
         * @glitter [v./n.] 闪烁；闪现/发光小物
         * @glow [v./n.] 发出微弱稳定的光/微弱稳定的光
         */
        public static void array_8(){}
        /**
         * @blade [n.] 刃；锋；（螺旋桨的）叶片
         * @sword [n.] 刀；剑
         * @ax [n.] 斧头
         * @hammer [n./v.] 锤，榔头/用锤击
         */
        public static void array_9(){}
        /**
         * @bow [n.] 弓；蝴蝶结
         * @arrow [n.] 箭头，箭
         * @spear [n./v.] 矛；标枪/用尖物刺穿
         * @helmet [n.] 头盔
         * @shield [n./v.] 盾；防护物/保护
         */
        public static void array_10(){}
        /**
         * @equip [v.] 配备，装备
         * @prepare [v.] 使预备好，为...做准备
         * @provide [v.] 供给；提供
         * @deploy [v.] 部署
         */
        public static void array_11(){}
        /**
         * @hit [v./n.] 打，击，碰撞/打，击中
         * @beat [v./n.] 打；打败；（心脏等）跳动/节拍；击鼓声
         * @strike [v./n.] 打，击，突击；罢工/罢工；打击
         */
        public static void array_12(){}
        /**
         * @punch [n./v.] 打孔机；重拳打击/给...打孔；拳打
         * @chop [v.] 切碎（食物）；劈（木头）
         * @stab [v./n.] 刺；戳
         */
        public static void array_13(){}
        /**
         * @dilemma [n.]  /daɪˈlem.ə/ /dɪˈlem.ə/（进退两难的）困境
         * @plight [n.] 困境；誓约
         * @pitfall [n.] 陷阱；危险；困难
         * @conspiracy [n.] 阴谋；密谋；合谋
         */
        public static void array_14(){}
        /**
         * @destitute [adj.] 赤贫的；一无所有的，缺乏
         * @famine [n.] 饥荒
         * @starve [v.] 使挨饿；饿死
         */
        public static void array_15(){}
        /**
         * @deprive [v.] 剥夺
         * @seize [v.] 抓住；夺取
         * @pursue [v.] 追赶
         */
        public static void array_16(){}
        /**
         * @threat [n.] 威胁；恐吓
         * @offend [v.] 冒犯；犯罪；违反
         * @aggressive [adj.] 侵略的；好斗的
         */
        public static void array_17(){}
        /**
         * @invade [v.] 入侵；侵略；侵扰
         * @trespass [v./n.] 非法入侵/罪过，非法入侵
         * @intrude [v.] 闯入，侵入，侵扰
         * @violate [v.] 违反；违背；侵犯；搅扰
         */
        public static void array_18(){}
        /**
         * @attack [v./n.] 攻击；进攻
         * @assault [n./v.] 猛攻；（身体）侵犯/袭击
         * @challenge [n./v.] 挑战/向...挑战
         */
        public static void array_19(){}
        /**
         * @siege [n.] 包围，围攻
         * @surround [v.] 包围；环绕
         * @enclose [v.] 围住；包围；把...封入信封；随信附上
         */
        public static void array_20(){}
        /**
         * @pause [n./v.] 暂停，停顿
         * @halt [v./n.] （使）停止/停止
         * @cease [v.] 终止；停止
         */
        public static void array_21(){}
        /**
         * @oppose [v.] 反对，抵制
         * @oppress [v.] 压迫；压制；使压抑
         * @counter [v./adv./n.] 抵消；反击；反驳/相反的/柜台；工作台
         */
        public static void array_22(){}
        /**
         * @deter [v.] 阻止；威慑住
         * @forbid [v.] 禁止；阻止
         * @prohibit [v.] 禁止；不允许
         * @prevent [v.] 预防，防止；阻止，阻碍
         */
        public static void array_23(){}
        /**
         * @revolt [n./v.] 叛乱；反抗
         * @betray [v.] 背叛；出卖；（无意中）泄露；流露出
         * @treason [n.] 叛国罪；通敌罪
         */
        public static void array_24(){}
        /**
         * @rebel [n./v.] 反叛者；叛逆者/造反；反抗；反对
         * @traitor [n.] 叛徒，卖国贼
         * @patriot [n.] 爱国者
         */
        public static void array_25(){}
        /**
         * @blame [v./n.] 责备，指责/（对坏事应负的）责任
         * @reproach [n./v.] 责备；指责
         * @evidence [n.] 证据；根据
         * @proof [n.] 证明，证据
         */
        public static void array_26(){}
        /**
         * @terror [n.] 恐惧；恐慌
         * @terrible [adj.] 可怕的；糟糕的；极严重的
         * @terrific [adj.] 极好的；很大的；很强的
         * @horrible [adj.] 可怕的；恐怖的
         */
        public static void array_27(){}
        /**
         * @alarm [n.] 惊恐；犹豫；报警；报警器
         * @dread [v./n.] 极为害怕；非常担心/恐惧忧愁
         * @frighten [v.] 使害怕；使惊恐
         */
        public static void array_28(){}
        /**
         * @tension [n.] 紧张；拉紧状态
         * @turbulent [adj.] 动荡的；混乱的；汹涌的
         * @turmoil [n.] 混乱，骚乱
         * @scenario [n.] 可能发生的情况；剧情梗概；脚本
         * @occasion [n.] 场合；时机；机会
         */
        public static void array_29(){}
        /**
         * @limit [n./v.] 限度；界限/限制，限定
         * @boundary [n.] 分界线，边界；界限
         * @rein [n./v.] 缰绳；控制权/用缰绳勒马；管束
         */
        public static void array_30(){}
        /**
         * @compete [v.] 竞争；参加（比赛）
         * @contest [v./n.] 争取赢得；争辩/竞争；比赛
         * @contend [v.] 竞争；争辩；主张
         */
        public static void array_31(){}
        /**
         * @rival [n./v.] 竞争者；对手/与...匹敌
         * @competitor [n.] 竞争者；对手
         * @enemy [n.] 敌人；仇敌；敌军
         */
        public static void array_32(){}
        /**
         * @strategy [n.] 策略；战略
         * @tactic [n.] 策略，战术
         * @maneuver [n.] 策略；技巧；[~s]军事演习
         * @blueprint [n.] 蓝图；行动计划
         */
        public static void array_33(){}
        /**
         * @warn [v.] 警告；告诫
         * @compel [v.] 强迫；迫使
         * @oblige [v.] 迫使；强迫；帮忙
         */
        public static void array_34(){}
        /**
         * @order [n./v.] 次序；整齐/命令
         * @protest [n./v.] 抗议；申明/抗议；申辩
         * @refute [v.] 反驳；驳斥；否认
         */
        public static void array_35(){}
        /**
         * @might [n.] 力量，威力
         * @force [n./v.] 力量；武力/强迫；迫使
         * @reinforce [v.] 增援；增强；加强；加固
         */
        public static void array_36(){}
        /**
         * @impair [v.] 削弱；妨碍
         * @mitigate [v.] 减轻；缓和
         * @comfort [n./v.] 安慰；舒适/缓和抚慰
         */
        public static void array_37(){}
        /**
         * @event [n.] 事件；大事；公开活动
         * @matter [n./v.] 事情；物质/要紧
         * @happen [v.] 发生；出现；碰巧
         * @occur [v.] 发生，出现
         */
        public static void array_38(){}
        /**
         * @savage [adj./v./n.] 野蛮的；凶狠的/凶狠的攻击/野蛮人
         * @reckless [adj.] 鲁莽的；不计后果的
         * @fierce [adj.] 凶猛的；猛烈的；（天气或温度）恶劣的
         */
        public static void array_39(){}
        /**
         * @foul [adj./v.] 恶臭的；恶劣的；邪恶的/弄脏；对...犯规
         * @evil [n./adj.] 邪恶；祸害/邪恶的
         * @devil [n.] 魔鬼；恶棍
         */
        public static void array_40(){}
        /**
         * @punishment [n.] 惩罚；处罚
         * @execute [v.] 实行，执行；处死
         * @hang [n.] 悬挂；悬浮；（被）绞死
         */
        public static void array_41(){}
        /**
         * @sacrifice [n./v.] 牺牲；献祭/牺牲；以...为祭品
         * @casualty [n.] 伤亡人员
         * @bury [v.] 埋葬
         * @funeral [n.] 葬礼
         */
        public static void array_42(){}
        /**
         * @grave [n./adj.] 坟墓；死亡/庄重的；严肃的
         * @tomb [n.] 坟墓；塚
         * @hell [n.] 地狱；苦境
         */
        public static void array_43(){}
        /**
         * @maritime [adj.] 海的，海上的，海事的
         * @naval [adj.] 海军的
         * @fleet [n.] 舰队，船队；机群，车队
         */
        public static void array_44(){}
        /**
         * @troop [n./v.] 一群，一对；[~s]军队/结队前行
         * @landing [n.] 着陆；登陆
         * @hover [v.] 盘旋，悬浮；徘徊；处于不确定状态
         * @proceed [v.] 接下来做；继续进行；行进
         * @progress [n./v.] 前进；进步；进程/前进；进步
         */
        public static void array_45(){}
        /**
         * @military [adj.] 军事的，军用的
         * @nuclear [adj.] 原子核的；核能的；核武器的
         * @poison [n./v.] 毒物，毒药/毒害
         * @devastate [v.] 毁坏，摧毁
         */
        public static void array_46(){}
        /**
         * @risk [n./v.] 危险，风险/冒着...的危险
         * @adventure [n./v.] 冒险，冒险尽量/去（某地）探险
         * @peril [n.] 重大危险，险情，危险
         * @catastrophe [n.] 重大灾难，大祸
         * @collapse [n./v.] 倒塌，崩溃
         */
        public static void array_47(){}
        /**
         * @torture [n./v.] 拷问，痛苦，折磨/拷问，使痛苦
         * @humiliate [v.] 羞辱；使蒙羞
         * @damage [n./v.] 损害；伤害
         * @harmful [adj.] 有害的
         */
        public static void array_48(){}
        /**
         * @mislead [v.] 误导，欺骗，使误入歧途
         * @disturb [v.] 打扰，使焦虑，弄乱
         * @interfere [v.] 干涉；妨碍
         * @interrupt [v.] 打断；中断
         */
        public static void array_49(){}
        /**
         * @retreat [n./v.] 撤退；退避
         * @shrink [v.] 退缩；缩水；（使）减少
         * @withdraw [v.] 回收；（使）撤退；提（款）
         * @withstand [v.] 承受；顶住；经受住
         */
        public static void array_50(){}
        /**
         * @compromise [v.] 妥协
         * @surrender [n./v.] 投降；（被迫）放弃
         * @escape [n./v.] 逃跑；逃脱；逃避
         * @avoid [v.] 避免；躲开
         */
        public static void array_51(){}
        /**
         * @quit [v.] 放弃，停止；辞去，离开
         * @abandon [v.] 放弃，抛弃，丢弃
         * @forgo [v.] 放弃
         * @discard [v.] 丢弃，抛弃
         * @rid [adj.] [get ~ of]摆脱，丢弃
         */
        public static void array_52(){}
        /**
         * @defend [v.] 防御，保护；为...辩护
         * @safeguard [v./n.] 保护，保卫/保护措施
         * @defeat [v./n.] 战胜，击败/失败
         * @resist [v.] 抵制，反对；抵御，忍住
         * @capture [n./v.] 战利品/捕获，夺得
         */
        public static void array_53(){}
        /**
         * @victory [n.] 胜利，成功
         * @triumph [n./v.] 伟大胜利，非凡的成功/获得胜利
         * @conquer [v.] 征服，客服，战胜
         */
        public static void array_54(){}
        /**
         * @monument [n.] 纪念碑，历史古迹，典范
         * @tablet [n.] 碑，匾，药片
         * @statue [n.] 雕像，塑像
         * @medal [n.] 勋章，奖章
         */
        public static void array_55(){}
        /**
         * @honor [n./v.] 尊敬，敬意，冗余/尊敬，给予表扬
         * @glorious [adj.] 光荣的，荣耀的
         * @contribute [v.] 捐献，做贡献，撰稿
         * @devote [v.] 献身，投入
         * @owe [v.] 欠；应把...归功于；欠，感激
         */
        public static void array_56(){}
        /**
         * @patrol [n./v.] 巡逻，巡查
         * @guard [n./v.] 卫兵，警卫员/看守，守卫，保卫
         * @camouflage [v./n.] 伪装
         * @obstacle [n.] 障碍；障碍物
         * @burrow [n./v.] 地洞，地道/掘地洞
         */
        public static void array_57(){}
        /**
         * @spy [n./v.] 间谍，特务/收集情报，从事间谍活动
         * @scout [n./v.] 侦查员，侦察机/侦查，搜寻
         * @general [n./adj.] 将军/总的，一般性的
         * @soldier [n.] 战士，士兵
         * @veteran [n.] 老兵，老手
         */
        public static void array_58(){}
    }
    /**
     *
     * @label 19_社会角色
     * @wordCount 121
     * @groupCount 34
     */
    public static class Class_societyAndRole{



        /**
         * @pioneer [n.] 先驱，开创者
         * @prophet [n.] 先知；预言家
         * @herald [n./v.] 使者，传令官，先驱；预兆/预告；宣布
         * @heir [n.] 后嗣；继承人
         * @successor [n.] 接替者；继任者；后继的事物
         */
        public static void array_1(){}
        /**
         * @generation [n.] 一代，一代人
         * @surname [n./v.] 姓/给...起别名
         * @gender [n.] 性别
         * @sex [n.] 性别 ；性行为
         * @female [n./adj.] 女子 ；雌性生物/女的；雌性的
         */
        public static void array_2(){}
        /**
         * @couple [n.] 夫妻 ，情侣；两个；几个
         * @spouse [n.] 配偶（指夫或妻）
         * @husband [n.] 丈夫
         * @gay [n./adj.] 同性恋者（尤指男性）/同性恋的；快乐的；艳丽的
         */
        public static void array_3(){}
        /**
         * @grandfather [n.] （外）祖父
         * @father-in-law [n.] 岳父，公公
         * @sibling [n.] 兄，弟，姐，妹
         */
        public static void array_4(){}
        /**
         * @cousin [n.] 堂（或表）兄（或弟、姐、妹）
         * @nephew [n.] 侄子；外甥
         * @niece [n.] 侄女；外甥女
         * @twin [adj./n.] 成双的/双胞胎之一
         */
        public static void array_5(){}
        /**
         * @embryo [n./adj.] 胚胎/胚胎的，初期的
         * @infant [n./adj.] 供婴儿用的；婴儿的
         * @orphan [n./v.] 孤儿/使成为孤儿
         */
        public static void array_6(){}
        /**
         * @juvenile [adj./n.] 少年的/少年
         * @youngster [n.] 年轻人；少年
         * @youth [n.] 青年时期；青春；青年
         */
        public static void array_7(){}
        /**
         * @gang [n.] 一帮，一伙（常聚在一起闹事、打斗的年轻人）
         * @teenager [n.] （13 至 19 岁之间的）青少年
         * @adolescence [n.] 青春期
         */
        public static void array_8(){}
        /**
         * @kin [n./adj.] （统称）家属，亲戚/有血缘关系的；类似的
         * @folk [n.] 人们；[~s]家属，亲属
         * @relative [n./adj.] 相对的；有关的
         */
        public static void array_9(){}
        /**
         * @intimate [adj./n.] 亲密的；个人隐私的/密友，至交
         * @dear [adj./int.] 亲爱的/啊呀
         * @darling [n.] 亲爱的；宠儿
         * @lover [n.] 爱好者；（婚外的）情人
         * @beloved [n./adj.] 爱人/深受喜爱的
         */
        public static void array_10(){}
        /**
         * @madam [n.] 夫人；女士；[英]自以为是的小姑娘
         * @hostess [n.] 女主人
         * @landlady [n.] 女房东；女地主
         * @mistress [n.] 女主人；情妇
         * @housewife [n.] 家庭主妇
         */
        public static void array_11(){}
        /**
         * @widow [n.] 寡妇，遗孀
         * @maid [n.] 女佣，女仆，少女
         * @maiden [n.] 少女，姑娘
         */
        public static void array_12(){}
        /**
         * @household [n.] 家庭，一户，家务
         * @chore [n.] 家庭杂物；乏味无聊的工作
         * @host [n.] 主人，东道主
         */
        public static void array_13(){}
        /**
         * @landlord [n.] 地主；房东；（酒吧）店主
         * @tenant [n.] 客房；租户
         * @guest [n.] 客人，宾客，旅客
         * @customer [n.] 顾客，主顾，客户
         * @client [n.] 顾客；客户；委托人
         */
        public static void array_14(){}
        /**
         * @encounter [v./n.] 遭遇；偶遇；邂逅
         * @chase [v./n.] 追逐；追求
         * @miss [v.] 想念；未注意到
         */
        public static void array_15(){}
        /**
         * @appointment [n.] 约会；指派
         * @accompany [v.] 陪伴；伴随
         * @dependent [adj.] 依靠的；依赖的
         */
        public static void array_16(){}
        /**
         * @propose [v.] 提议；向...求婚
         * @engagement [n.] 婚约；约定
         * @marry [v.] 娶，嫁，结婚
         */
        public static void array_17(){}
        /**
         * @wedding [n.] 婚礼
         * @honeymoon [n.] 蜜月
         * @kiss [v./n.] 吻，接吻/吻
         */
        public static void array_18(){}
        /**
         * @divorce [n./v.] 离婚；脱离/（与...）离婚；使脱离
         * @separate [adj./v.] 分开的，单独的/（使）分开；分局
         * @single [adj.] 单一的；单身的
         * @sole [adj.] 仅有的；唯一的
         */
        public static void array_19(){}
        /**
         * @respective [adj.] 各自的；分别的
         * @each [pron./det.] 各个，各自
         * @individual [n./adj.] 个人；个体/个别的，单独的
         */
        public static void array_20(){}
        /**
         * @commuter [n.] 上下班，往返者
         * @neighborhood [n.] 街坊；居住区；周边地区
         * @member [n.] 成员；会员
         */
        public static void array_21(){}
        /**
         * @boss [n./v.] 老板，上司/对...指手画脚
         * @manager [n.] 经理，管理人
         * @supervisor [n.] 管理者，监督者
         * @subordinate [n./adj.] 部署，下级/次要的；下级的
         */
        public static void array_22(){}
        /**
         * @partner [n.] 伙伴，盟友；合伙人；搭档
         * @mate [n.] 伙伴；[构成复合词]同伴
         * @colleague [n.] 同事；同僚
         */
        public static void array_23(){}
        /**
         * @comrade [n.] 同志；（尤指共患难的）同伴
         * @acquaintance [n.] 相识之人，泛泛之交；认识；了解
         * @friendship [n.] 友谊；有情；友好
         * @affection [n.] 喜爱，喜欢；[~s]爱情
         */
        public static void array_24(){}
        /**
         * @stranger [n.] 陌生人；新来者
         * @apprentice [n./v.] 学徒，徒弟/使当...的学徒
         * @deputy [n.] 代理人，副手
         */
        public static void array_25(){}
        /**
         * @hero [n.] 男主角；男主；英雄；勇士
         * @heroine [n.] 女主角；女主；女英雄
         * @actress [n.] 女演员
         */
        public static void array_26(){}
        /**
         * @chancellor [n.] （德国或奥地利的）总理；（英国）财政大臣
         * @commander [n.] 司令官；指挥官
         * @director [n.] 主管；理事；导演
         * @proponent [n.] 拥护者；支持者
         */
        public static void array_27(){}
        /**
         * @committee [n.] 委员会
         * @council [n.] 委员会；市政委员会
         * @delegate [n./v.] 代表/授权，委派
         */
        public static void array_28(){}
        /**
         * @specialist [n.] 专家；专科医生
         * @consultant [n.] 顾问；[英]会诊医师
         * @veterinary [adj.] 兽医的
         */
        public static void array_29(){}
        /**
         * @counsellor [n.] 顾问，辅导顾问；（美国的）律师
         * @solicitor [n.] （英国的）诉状律师，事务律师；（美国的）法务官
         * @attorney [n.] （美国的）律师
         * @umpire [n.] 裁判员
         */
        public static void array_30(){}
        /**
         * @cashier [n.] 出纳员，收银员
         * @fireman [n.] 消防队员
         * @nurse [n.] 护士；保姆/狐狸
         * @gardener [n.] 园丁，花匠
         */
        public static void array_31(){}
        /**
         * @barber [n.] 理发师
         * @haircut [n.] 理发
         */
        public static void array_32(){}
        /**
         * @fisherman [n.] 渔民，渔夫，垂钓者
         * @butcher [n.] 屠夫；杀人狂
         * @groom [n./v.] 马夫；新郎/（给动物）刷洗；理毛；梳毛
         */
        public static void array_33(){}
        /**
         * @hostage [n.] 人质
         * @toil [n./v.] 苦工，苦活，网，圈套/辛勤劳作，苦干
         * @beggar [n.] 乞丐
         * @slave [n.] 奴隶
         * @coward [n.] 懦夫，胆小鬼
         */
        public static void array_34(){}
    }
    /**
     *
     * @label 20_行为动作
     * @wordCount 268
     * @groupCount 68
     */
    public static class Class_behaviourAndAction{



        /**
         * @act [v./n.] 行动/行为
         * @behave [v.] 表现；运转
         * @deed [n.] 行为；功绩；契约
         * @accustom [v.] 使习惯于
         */
        public static void array_1(){}
        /**
         * @react [v.] 作出反应，反应
         * @respond [v.] 回答；响应，作出反应
         * @reflect [v.] 反应；反射
         */
        public static void array_2(){}
        /**
         * @bear [v.] 生（孩子）；容忍；承担（责任）
         * @adopt [v.] 收养；采取；采纳
         * @nourish [v.] 滋养；给...提供营养
         * @mow [v./n.] 割，修剪/干草堆
         * @support [v./n.] 支撑；支持；供养/支持；帮助
         */
        public static void array_3(){}
        /**
         * @exhale [v.] 呼气；呼出
         * @intake [n.] 吸入；摄取量；新招收者
         * @revive [v.] （使）苏醒；（使）复兴；（使）复活
         * @survive [v.] 幸存；生存
         */
        public static void array_4(){}
        /**
         * @glare [v./n.] 怒目而视；发出强光/刺眼的光；怒视
         * @glimpse [v./n.] 瞥见/一瞥
         * @glance [v./n.] 瞥，迅速看一眼/一瞥
         * @peep [v./n.] 窥视，偷看/偷偷一瞥
         * @gaze [v.] 凝视，注视
         */
        public static void array_5(){}
        /**
         * @peer [v./n.] 凝视；盯着看/同等地位的人，同辈
         * @stare [v.] 凝视，盯着看
         * @contemplate [v.] 凝视；沉思；考虑
         */
        public static void array_6(){}
        /**
         * @vow [n./v.] 誓约/发誓
         * @oath [n.] 誓言；宣誓
         * @pledge [v./n.] 保证/保证；誓言
         * @whistle [n./v.] 口哨；哨子；汽笛声/吹口哨；吹哨子
         */
        public static void array_7(){}
        /**
         * @reply [v./n.] 回答，答复
         * @notify [v.] 通知，告知
         * @assert [v.] 断言，坚称；坚持（自己的）主张
         */
        public static void array_8(){}
        /**
         * @explain [v.] 说明；解释
         * @quarrel [v./n.] 吵架，争论
         * @dispute [v./n.] 争论，辩论
         * @argument [n.] 辩论，争论；论点，论据
         */
        public static void array_9(){}
        /**
         * @mention [v./n.] 提及；说起
         * @hurry [v./n.] 赶紧；催促/匆忙
         * @hasten [v.] 赶紧；促进
         * @urge [v.] 催促，敦促/冲动
         */
        public static void array_10(){}
        /**
         * @scold [v.] 责骂，斥责
         * @curse [v./n.] 诅咒；咒骂/咒语
         * @swear [v.] 诅咒；咒骂；发誓；保证
         * @provoke [v.] 激怒，挑拨；引起
         */
        public static void array_11(){}
        /**
         * @preach [v.] 宣扬
         * @boast [v./n.] 自夸，吹嘘
         * @tease [v.] 取笑；嘲弄
         * @mock [v./adj.] 嘲笑；嘲弄/模拟的；假装的
         */
        public static void array_12(){}
        /**
         * @touch [v./n.] 触摸；触动/触觉，接触
         * @hug [v./n.] 拥抱
         * @tap [v.] 轻拍，轻扣，开发
         * @clap [v./n.] 拍手；轻拍/鼓掌
         * @applaud [v.] 鼓掌；称赞；赞许
         */
        public static void array_13(){}
        /**
         * @kneel [v.] 跪下，跪
         * @catch [v.] 捉住；赶上；领会
         * @snatch [v.] 一把抓住；迅速夺取
         * @grab [v.] 抓住，攫取；（匆忙的）取
         * @grasp [v.] 抓牢 ，握紧；完全理解，全面领会
         */
        public static void array_14(){}
        /**
         * @overtake [v.] 追上，超过；（情感）压倒
         * @follow [v.] 跟随；是...的必然结果；遵循
         * @grip [v./n.] 紧握，抓牢/紧握，抓牢；理解，了解
         */
        public static void array_15(){}
        /**
         * @mess [n./v.] 混乱，脏乱/弄乱
         * @twist [v./n.] 拧，扭；使缠绕/拧，扭动
         * @scatter [v.] 撒；（使）散开
         */
        public static void array_16(){}
        /**
         * @fold [v.] 折叠，对折
         * @fasten [v.] 扣牢，系紧
         * @loosen [v.] 解开，松开，放宽
         */
        public static void array_17(){}
        /**
         * @smash [v.] 打碎；（使）猛烈撞击；（打球时）扣球
         * @scratch [v./n.] 擦破，刮坏；搔/乱涂；划痕，擦伤
         * @wipe [v.] 揩，擦
         * @scrape [v./n.] 刮掉；擦坏；勉强获得/刮；擦伤
         * @polish [v.] 擦光，擦亮；使完美，改进
         */
        public static void array_18(){}
        /**
         * @peel [v.] 剥落；掉漆；脱皮
         * @split [v.] （使）开裂、分开
         * @sway [v.] （使）摇摆、摆动、摇晃
         * @shake [v./n.] 摇动；（使）颤动/摇动；颤动
         * @vibrate [v.] （使）震动、摇摆
         */
        public static void array_19(){}
        /**
         * @whirl [v./n.] （使）回旋/回旋
         * @rotate [v.] （使）旋转、转动
         * @reel [v.] 眩晕；混乱
         * @shuffle [v.] 洗（牌）；拖着脚走；搅乱...的次序/洗牌
         */
        public static void array_20(){}
        /**
         * @collide [v.] 碰撞；抵触
         * @contact [n./v.] 接触，联系
         * @connect [v.] （使）连接；（使）接通（电源等）
         */
        public static void array_21(){}
        /**
         * @combine [v.] （使）联合、结合
         * @bond [v./n.] 与...黏合（或连接）/黏合；（情感的）纽带
         * @integrate [v.] （使）成为一体、合并
         */
        public static void array_22(){}
        /**
         * @wrap [v.] 包；裹；用...缠绕
         * @penetrate [v.] 刺入；穿透；渗透；洞察
         * @pierce [v.] 刺穿，刺破，穿透；使心如刀割
         * @insert [v./n.] 插入；嵌入/插入物
         */
        public static void array_23(){}
        /**
         * @tilt [v.] （使）倾斜、歪斜
         * @tow [v./n.] 拖、拉；牵引/牵引
         * @trail [v./n.] （使）拖在后面/踪迹
         */
        public static void array_24(){}
        /**
         * @arrange [v.] 安排，整理，使有条理
         * @manipulate [v.] （熟练的）操作；操纵
         * @steer [v.] 掌舵；驾驶；操纵
         */
        public static void array_25(){}
        /**
         * @baptize [v.] 给...施行洗礼
         * @bet [v./n.] 下注；打赌；敢说/打赌；赌注
         * @stake [n./v.] 赌注；桩/以...打赌
         * @gamble [v./n.] 赌博；冒险
         * @promise [n./v.] 诺言/承诺
         */
        public static void array_26(){}
        /**
         * @attract [v.] 吸引；引起
         * @obsess [v.] （是）痴迷、心神不宁
         * @mesmerize [v.] 吸引；迷住
         * @nightmare [n.] 噩梦，梦魇
         */
        public static void array_27(){}
        /**
         * @amaze [v.] 使惊奇，使惊愕
         * @marvel [v./n.] 感到惊讶，大为赞叹/奇迹
         * @astonish [v.] 使惊讶
         */
        public static void array_28(){}
        /**
         * @involve [v.] 参加；牵涉
         * @annoy [v.] 使恼怒；打扰
         * @upset [v.] 使心烦意乱；使生气；搅乱；打翻
         * @bewilder [v.] 使迷惑，使不知所措
         */
        public static void array_29(){}
        /**
         * @irony [n.] 反话；有讽刺意味的情形
         * @indignity [n.] 侮辱；轻蔑
         * @contempt [n.] 轻视，藐视
         * @neglect [v./n.] 忽视；忽略
         * @disregard [v./n.] 不顾，漠视/忽视，漠视
         */
        public static void array_30(){}
        /**
         * @ignorance [n.] 无知，愚昧
         * @bias [v./n.] 使有偏见；使偏心/偏见；偏心
         * @deviate [v.] 偏离；背离
         * @expel [V.] 驱逐；开除；排出
         * @flee [v.] 逃避，逃离
         */
        public static void array_31(){}
        /**
         * @bully [v./n.] 恐吓，欺凌/恃强凌弱者
         * @panic [n./v.] 惊慌，惊恐/（使）惊恐、惊慌
         * @terrify [v.] 使恐惧，使非常害怕
         * @revenge [n./v.] 报仇，复仇/为...报仇
         */
        public static void array_32(){}
        /**
         * @kidnap [v.] 绑架；劫持
         * @hijack [v.] 劫持（飞机或其他交通工具）
         * @smuggle [v.] 走私，投运
         * @convict [v./n.] 定罪；宣判...有罪/已决犯
         */
        public static void array_33(){}
        /**
         * @strangle [v.] 扼杀，压制，勒死，扼死
         * @massacre [n./v.] 残杀。屠杀
         * @decimation [n.] 大批杀死，大量毁灭；大大削弱
         * @intervene [v.] 插话；干扰；干涉
         * @impede [v.] 妨碍，阻止
         */
        public static void array_34(){}
        /**
         * @allure [v.] 吸引，引诱
         * @bait [v./n.] 使上当发火/诱饵，诱惑物
         * @induce [v.] 引诱，劝说
         * @tempt [v.] 引诱，诱惑，怂恿
         */
        public static void array_35(){}
        /**
         * @designate [v.] 指明；选派；指派
         * @assign [v.] 布置；分配；指定；确定
         * @distribute [v.] 分发，分配
         * @despatch [v.] 派遣；调派；迅速处理
         * @detach [v.] （使）分开，（使）分离；派遣
         */
        public static void array_36(){}
        /**
         * @undo [v.] 解开，打开，取笑
         * @disguise [v./n.] 掩饰；假扮；伪装/假扮；伪装物
         * @conceal [v.] 掩盖
         */
        public static void array_37(){}
        /**
         * @refuse [v.] 拒绝；回绝
         * @exclude [v.] 把...排除在外；拒绝
         * @reverse [v./n./adj.] 颠倒；彻底改变；撤销/相反的情况；反面/相反的
         */
        public static void array_38(){}
        /**
         * @assure [v.] 向...保证；保证；保险
         * @undertake [v.] 承担；许诺；保证
         * @stipulate [v.] 规定；明确要求；保证
         * @convince [v.] 使确信，使信服，说服
         * @reassure [v.] 使安心；使放心
         */
        public static void array_39(){}
        /**
         * @wish [v./n.] 想要（某事发生）/希望
         * @aspire [v.] 有志于；渴望
         * @desire [n./v.] 愿望；欲望/渴望，期望
         * @yearn [v.] 渴望；向往
         * @invoke [v.] 唤起（情感等）；向...祈求帮助；恳求
         */
        public static void array_40(){}
        /**
         * @itch [v./n.] 发痒；渴望/痒；渴望
         * @attempt [v./n.] 尝试；试图/尝试；企图
         * @strive [v.] 努力；奋斗
         * @effort [n.] 努力；努力的成果
         * @fulfil [v.] 履行；实现；完成；满足
         */
        public static void array_41(){}
        /**
         * @range [v.] （在一定幅度内的）变动
         * @sort [n./v.] 种类，类别/把...分类
         * @loom [v./n.] （庞然大物或形状模糊之物）隐现；逼近/织布机
         * @launch [v.] 发射；发布；推出；发起
         * @commence [v.] 开始；着手
         */
        public static void array_42(){}
        /**
         * @exploit [v.] 开发；开采；开拓
         * @explore [v.] 勘察；考察；探讨
         * @exert [v.] 运用，行驶；施加
         */
        public static void array_43(){}
        /**
         * @tackle [v./n.] 处理；应对；处理/用具；器材
         * @cope [v.] 处理；应付
         * @dispose [v.] 布置；安排
         * @conduct [v./n.] 进行；实施/举止；行为
         */
        public static void array_44(){}
        /**
         * @omit [v.] 遗漏 ；省略；删去
         * @delete [v.] 删除；删掉
         * @cancel [v.] 取消；废除
         * @clear [adj./v.] 清晰的；明显的/清除
         * @erase [v.] 清除；抹去
         */
        public static void array_45(){}
        /**
         * @rescue [v./n.] 营救；救援
         * @resort [v./n.] 求助于；采取；诉诸/（度假）胜地
         * @recover [v.] 重新拿回；恢复健康；复原
         * @restore [v.] 恢复；归还；修复
         * @rectify [v.] 纠正；矫正；改正
         */
        public static void array_46(){}
        /**
         * @redeem [v.] 赎回；挽回；补偿；兑现
         * @offset [v./n.] 补偿；抵消
         * @replenish [v.] 重新装满；补充
         */
        public static void array_47(){}
        /**
         * @obtain [v.] 获得；得到
         * @gain [v./n.] 获得；增加/增加；改进
         * @supply [v./n.] 供给；供应；提供/供应量；[supplies]补给品
         * @offer [n./v.] 给予（物）；提议/提供；出（价）
         * @render [v.] 给予，提供；翻译
         */
        public static void array_48(){}
        /**
         * @enlarge [v.] 扩大，扩展；放大
         * @augment [v.] 扩大；增加；加强；提高
         * @magnify [v.] 放大；夸大
         */
        public static void array_49(){}
        /**
         * @amplify [v.] 增强；扩大（声音）；充实（陈述）
         * @exaggerate [v.] 夸张；夸大
         * @prolong [v.] 延长
         */
        public static void array_50(){}
        /**
         * @uphold [v.] 支持；维护；维持
         * @backup [n./adj.] 后援；支持（文件等的）备份/备用的
         * @propel [v.] 推动；驱使；推进
         * @update [v.] 更新；使现代化
         * @raise [v.] 举起；引起；抚养；提高；筹募
         */
        public static void array_51(){}
        /**
         * @leak [v./n.] 泄露/漏洞，裂缝
         * @spill [v.] （使）溢出
         * @seep [v.] 渗出；渗透
         * @ooze [v.] 渗出；洋溢着
         */
        public static void array_52(){}
        /**
         * @evacuate [v.] 疏散；撤离
         * @trench [v./n.] 掘沟于；砍除/沟，渠，壕沟
         * @saturate [v.] 使饱和；使充满；浸透
         */
        public static void array_53(){}
        /**
         * @excuse [v./n.] 原谅；同意免除/理由；借口
         * @forgive [v.] 原谅，宽恕，饶恕
         * @contain [v.] 包含，容纳；抑制（感情）
         */
        public static void array_54(){}
        /**
         * @regard [n./v.] 尊重；问候/看待
         * @flatter [v.] 奉承，讨好，向...谄媚
         * @worship [n./v.] 崇拜，礼拜，爱慕/做礼拜
         */
        public static void array_55(){}
        /**
         * @cause [n./v.] 原因，理由，事业/引起；导致
         * @sake [n.] 理由，目的
         * @purpose [n.] 目的
         * @objective [n./adj.] 宗旨；目标/客观的
         */
        public static void array_56(){}
        /**
         * @arouse [v.] 唤起；激起；引起
         * @trigger [v./n.] 引发；触发/扳机
         * @seek [v.] 寻找；寻求
         * @retrieve [v.] 取回；挽回
         */
        public static void array_57(){}
        /**
         * @testify [v.] 作证；证明
         * @verify [v.] 证实；核实；查清
         * @specify [v.] 具体指定；详细说明
         */
        public static void array_58(){}
        /**
         * @enlighten [v.] 启发；开导；启迪
         * @impart [v.] 传授；透露
         * @deserve [v.] 应得；应受
         */
        public static void array_59(){}
        /**
         * @drop [v./n.] （使）落下；（使）降低；断绝关系/滴
         * @sink [v.] （使）下沉；下降
         * @plummet [v.] 垂直掉下；（价格、水平等）骤然下跌
         * @muffle [v.] 使（声音）减弱
         * @overshadow [v.] 隐蔽；使黯然失色
         */
        public static void array_60(){}
        /**
         * @invite [v.] 邀请
         * @welcome [int./n./v.] 欢迎
         * @greet [v.] 向...问好；迎接；对...做出反应
         * @salute [v./n.] （向...）行礼；致敬/行礼；致敬
         */
        public static void array_61(){}
        /**
         * @celebrate [v.] 庆祝（节日、事件等）
         * @congratulate [v.] 祝贺；向...道贺
         * @bless [v.] 祝福；为...祈求上帝保佑
         * @participate [v.] 参加；参与
         * @farewell [int./n.] 再会/告别
         */
        public static void array_62(){}
        /**
         * @assort [v.] 把...分类；相配，协调
         * @correspond [v.] 符合；相一致；通信
         * @accord [v./n.] 与...一致；给予/协议
         * @attribute [v./n.] 把...归因于/属性，特性
         */
        public static void array_63(){}
        /**
         * @recall [v.] 回忆，回想起
         * @recollect [v.] 记忆，想起
         * @remind [v.] 提醒；使想起
         */
        public static void array_64(){}
        /**
         * @retell [v.] 重新讲述；复述
         * @repeat [v./adj.] 重复/再次光顾的
         * @retrospect [n.] [in ~]回顾
         * @impress [v.] 给...深刻的印象；使铭记
         */
        public static void array_65(){}
        /**
         * @surmount [v.] 克服；置于...的顶端
         * @mortify [v.] 使难堪；使羞愧
         * @pervade [v.] 弥漫；渗透；遍及
         */
        public static void array_66(){}
        /**
         * @replace [v.] 代替；取代
         * @substitute [v./n.] 替换/替代品，替补
         * @distinguish [v.] 区别，辨别；使出众；使著名
         * @differentiate [v.] 区分；区别；差别对待
         */
        public static void array_67(){}
        /**
         * @incline [v./n.] （使）倾向于、倾斜/斜坡；倾斜
         * @lean [v./adj.] （使）倚靠；倾斜/瘦的；贫乏的
         * @sideways [adv.] 向（或从、往）一侧
         */
        public static void array_68(){}
    }
    /**
     *
     * @label 21_身心健康
     * @wordCount 417
     * @groupCount 110
     */
    public static class Class_bodyAndMental{



        /**
         * @feel [v.] 感觉到，感知；触碰
         * @mood [n.] 心情，情绪；气氛
         * @emotion [n.] 情绪，情感，感情
         */
        public static void array_1(){}
        /**
         * @temper [n./v.] 坏脾气；情绪；心情/是缓和
         * @manner [n.] 举止；礼貌；风俗；方式
         * @attitude [n.] 态度；看法
         */
        public static void array_2(){}
        /**
         * @character [n.] 性格；特征；人物；角色
         * @personality [n.] 个性；人格
         * @trait [n.] 特点；特性
         */
        public static void array_3(){}
        /**
         * @virtue [n.] 美德；德行；优点
         * @feature [n./v.] 特征；面容的一部分/以...为特色
         * @stature [n.] 身高；身材；（精神、道德等的）高度
         */
        public static void array_4(){}
        /**
         * @flesh [n.] 肉；人类
         * @mankind [n.] 人类；男人
         * @human [adj./n.] 人类的；有人性的/人类
         */
        public static void array_5(){}
        /**
         * @bone [n.] 骨；骨骼
         * @backbone [n.] 脊柱；骨干；中坚；骨气
         * @skeleton [n.] 骨骼；骨架；框架；梗概
         */
        public static void array_6(){}
        /**
         * @skull [n.] 头脑；头骨
         * @brain [n.] 脑；[~s]智力；智慧
         * @mind [n.] 头脑；思维；思考能力；意见；记忆力
         * @physical [adj.] 身体的；物质的；物理的
         * @mental [adj.] 精神的；思想上的；智力的
         */
        public static void array_7(){}
        /**
         * @cheek [n.] 面颊
         * @forehead [n.] 额
         * @brow [n.] 额；眉毛
         * @eyelash [n.] 眼睫毛
         */
        public static void array_8(){}
        /**
         * @lip [n.] 嘴唇；（洞口、伤口等的）边缘
         * @mouth [n.] 口；嘴；河口
         * @tongue [n.] 舌头；语言
         * @throat [n.] 喉咙；窄路；嗓子；嗓音
         * @gorge [n./v.] 咽喉；暴食；山峡；峡谷/狼吞虎咽
         * @chin [n.] 下巴
         */
        public static void array_9(){}
        /**
         * @jaw [n.] 颌；下巴；狭窄入口；唠叨
         * @neck [n.] 脖子；已领；海峡
         * @beard [n.] 胡须
         */
        public static void array_10(){}
        /**
         * @shoulder [n.] 肩膀
         * @limb [n.] 肢；树枝
         * @elbow [n./v.] 肘部；弯头；扶手/用肘挤
         * @wrist [n.] 腕；腕关节
         */
        public static void array_11(){}
        /**
         * @thumb [n.] 拇指
         * @palm [n./v.] 棕榈树；手掌/把...藏在手中
         * @finger [n.] 手指
         * @fist [n.] 拳头
         */
        public static void array_12(){}
        /**
         * @chest [n.] 胸；胸部
         * @abdomen [n.] 腹；腹部
         * @rib [n.] 肋骨；排骨
         * @waist [n.] 腰；腰部
         */
        public static void array_13(){}
        /**
         * @organ [n.] 器官；手风琴；机构
         * @liver [n.] 肝脏
         * @stomach [n.] 胃口；胃；腹部
         * @womb [n.] 子宫；发源地
         * @kidney [n.] 肾脏
         */
        public static void array_14(){}
        /**
         * @lung [n.] 肺
         * @gland [n.] 腺
         * @chamber [n.] 室；腔；议院
         * @intestine [n.] 肠
         */
        public static void array_15(){}
        /**
         * @thigh [n.] 大腿；股
         * @joint [n./adj.] 结合处；关节/共同的；联合的
         * @knee [n.] 膝盖
         * @lap [n.] 大腿部；下摆；环节；一圈
         */
        public static void array_16(){}
        /**
         * @ankle [n.] 踝关节
         * @heel [n.] 足跟
         * @toe [n.] 脚趾；足尖
         */
        public static void array_17(){}
        /**
         * @muscle [n.] 肌肉
         * @pore [n./v.] 毛孔；小孔；气孔/凝视；沉思
         * @pulse [n.] 脉搏；脉冲
         * @artery [n.] 动脉；干线
         */
        public static void array_18(){}
        /**
         * @nerve [n.] 神经；紧张；焦虑
         * @hormone [n.] 荷尔蒙；激素
         * @immune [adj.] 免疫的；不受影响的；免除的
         * @stimulus [n.] 刺激物；促进因素
         */
        public static void array_19(){}
        /**
         * @biorhythm [n.] 生物节律
         * @lifestyle [n.] 生活方式
         * @habit [n.] 习惯
         */
        public static void array_20(){}
        /**
         * @sense [n.] 感官；感觉
         * @sight [n.] 视力；看见；景物
         * @eyesight [n.] 视力
         * @view [n.] 视野；见解；风景；察看
         */
        public static void array_21(){}
        /**
         * @visual [adj.] 视力的；视觉的
         * @visible [adj.] 看得见的，可见的
         * @vague [adj.] 含糊的；不清楚的；模糊的
         * @blind [adj.] 盲目的；瞎的；未察觉的
         */
        public static void array_22(){}
        /**
         * @dumb [adj.] 哑的；不肯开口的
         * @aural [adj.] 耳的；听觉的；气味的；先兆的
         * @dental [adj.] 牙的；牙科的
         */
        public static void array_23(){}
        /**
         * @awake [adj.] 醒着的；警觉的；
         * @yawn [v./n.] 打哈欠；裂开/呵欠
         * @nap [n.] 小睡；绒毛
         * @doze [v.] 小睡；打盹儿
         * @quiet [adj.] 安静的；寂静的；平静的
         * @asleep [adj.] 睡着的；不活跃的；麻木的
         */
        public static void array_24(){}
        /**
         * @cripple [n./v.] 跛子；残疾人/使跛
         * @lame [adj.] 跛的；瘸的；（解释或接口）无说服力的
         * @dwarf [n./adj.] （童话中的）小矮人；侏儒/矮小的
         */
        public static void array_25(){}
        /**
         * @pregnancy [n.] 怀孕；妊娠
         * @born [adj./v.] 天生的；与生俱来的/[be ~]出生
         * @condom [n.] 避孕套
         * @clone [v./n.] 克隆/克隆的动植物
         */
        public static void array_26(){}
        /**
         * @symptom [n.] 征兆；症状
         * @disease [n.] 疾病
         * @illness [n.] 疾；疾病
         */
        public static void array_27(){}
        /**
         * @moan [n./v.] 呻吟；哀悼
         * @infection [n.] 传染；传染病；影响
         * @detriment [n.] 损害；损害物
         */
        public static void array_28(){}
        /**
         * @broken [adj.] 弄坏的；破碎的
         * @disable [v.] 使丧失能力，使伤残
         * @invalid [n./adj.] 病弱者；伤残者/病弱的；伤残的
         * @patient [n./adj.] 病人/有耐心的；能忍耐的
         * @dysfunction [n.] （身体）功能障碍
         */
        public static void array_29(){}
        /**
         * @diabetes [n.] 糖尿病
         * @obesity [n.] （过度）肥胖；肥胖症
         * @overweight [adj./n./v.] 超重的；过胖的/超重/使超重；过于重视
         * @hypertension [n.] 高血压
         * @paralyse [v.] 使麻痹；使瘫痪；使无助
         */
        public static void array_30(){}
        /**
         * @dizzy [adj./v.] 头晕目眩的；眩晕的/使眩晕
         * @insane [adj.] 患精神病的；疯狂的
         * @insomnia [n.] 失眠；失眠症
         */
        public static void array_31(){}
        /**
         * @allergy [n.] 敏感症；过敏性
         * @heart attack [n.] 心脏病发作
         * @cancer [n.] 癌
         * @arthritis [n.] 关节炎
         * @pimple [n.] 粉刺；丘疹
         */
        public static void array_32(){}
        /**
         * @stroke [n.] 中风；打击；一笔（画）
         * @plague [n.] 瘟疫
         * @flu [n.] 流行性感冒
         * @fever [n./v.] 狂热；发烧；发热/（使）发烧；（使）狂热
         */
        public static void array_33(){}
        /**
         * @headache [n.] 头痛
         * @swell [v.] 肿胀；膨胀；（使）增加
         * @choke [v.] （使）窒息；阻塞；说不出话
         */
        public static void array_34(){}
        /**
         * @injure [v.] 伤害；使遭受损伤；损害
         * @injury [n.] 伤害；损害
         * @hurt [v.] 损害；伤害；（使）疼痛
         * @bleed [v.] 流血；榨取；给...放血；放掉（水或气体）
         */
        public static void array_35(){}
        /**
         * @bruise [n./v.] 瘀伤；伤痕/擦伤
         * @scar [n.] 疤痕；伤疤
         * @wound [n.] 创伤；伤害；伤口
         * @trauma [n.] 外伤；身体上的伤；精神创伤；痛苦经历
         * @lump [n./v.] 块；肿块/使成块状
         */
        public static void array_36(){}
        /**
         * @pain [n./v.] 痛苦；疼痛/使痛苦
         * @death [n.] 死；死亡；毁灭
         * @mortal [adj./n.] 必死的；致命的/凡人；人类
         * @demise [n./v.] 死亡；君权的转移或授予；禅让/遗赠；转让
         * @doom [n./v.] 厄运；毁灭/使注定失败（或死亡等）
         */
        public static void array_37(){}
        /**
         * @fatal [adj.] 致命的；毁灭性的；决定性的
         * @lethal [adj.] 致命的
         * @corpus [n.] 尸体；文集；本金
         */
        public static void array_38(){}
        /**
         * @overwork [n./v.] 过度操劳；过度工作/（使）过度工作
         * @tire [v.] （使）感到疲劳；厌烦
         * @exhaust [v.] 使精疲力竭；用完；耗尽
         * @fatigue [n./v.] 疲劳/（使）疲劳
         */
        public static void array_39(){}
        /**
         * @faint [adj./v.] 模糊的；微弱的；虚弱的/晕倒
         * @feeble [adj.] 虚弱的；无力的；微弱的
         * @weary [adj.] 疲倦的；厌烦的
         */
        public static void array_40(){}
        /**
         * @weaken [v.] 减弱；削弱；变软弱
         * @uncomfortable [adj.] 不舒服的；不自在的
         * @unconscious [adj.] 无意识的；失去知觉的
         */
        public static void array_41(){}
        /**
         * @chronic [adj.] 慢性的；长期的
         * @acute [adj.] （疾病）急性的；敏锐的；深刻的
         * @sore [adj.] 疼痛的；恼火的；严重的
         */
        public static void array_42(){}
        /**
         * @sorrow [n.] 悲伤；悲痛
         * @suffering [n.] 苦难；折磨
         * @lament [n../v.] 悲伤；哀悼/哀悼；对...感到悔恨
         */
        public static void array_43(){}
        /**
         * @hospital [n.] 医院
         * @therapy [n.] 治疗
         * @health care [n.] 医疗保健
         * @sanitary [adj.] 卫生的；清洁的
         */
        public static void array_44(){}
        /**
         * @medical [adj.] 医学的；医疗的
         * @curative [adj./n.] 治疗的/药品
         * @hygiene [n.] 卫生（学）；保健（学）
         * @fitness [n.] 健康；合适
         */
        public static void array_45(){}
        /**
         * @clinic [n.] 诊所；门诊部
         * @physician [n.] 内科医生
         * @surgeon [n.] 外科医生
         * @operation [n.] 手术；操作；经营；运转
         */
        public static void array_46(){}
        /**
         * @cure [v./n.] 治好；治愈/疗法；治疗
         * @heal [v.] 治愈；愈合
         * @treatment [n.] 治疗；疗法；待遇
         * @check [v./n.] 检查；核对/[美]账单
         */
        public static void array_47(){}
        /**
         * @prescription [n.] 处方；药方；秘诀
         * @transplant [v.] 移植
         * @X-ray [n./v.] X射线/用 X 射线检查
         * @injection [n.] 注射；注射物；单射（函数）
         */
        public static void array_48(){}
        /**
         * @precaution [n.] 预防；警惕；预防措施
         * @vaccinate [v.] 给...接种疫苗；预防接种
         * @quarantine [v./n.] 对...进行隔离检疫/检疫；隔离检查期
         * @segregate [v.] 隔离
         * @isolate [v.] 使隔离；使孤立；使脱离
         */
        public static void array_49(){}
        /**
         * @pharmacy [n.] 药店；药剂学
         * @medicine [n.] 药；医学
         * @remedy [n.] 药物；治疗法；解决方法
         */
        public static void array_50(){}
        /**
         * @drug [n.] 毒品；药
         * @pill [n.] 药丸
         * @antibiotic [n.] 抗生素
         */
        public static void array_51(){}
        /**
         * @acupuncture [n.] 针灸
         * @penicillin [n.] 青霉素
         * @morphine [n.] 吗啡
         * @dose [n./v.] 一剂/给...服药
         */
        public static void array_52(){}
        /**
         * @recovery [n.] 恢复；痊愈
         * @refresh [v.] 使恢复精神
         * @relief [n.] 宽恕；轻松；减轻；缓解
         * @relieve [v.] 救济；减轻；解除（痛苦、不快等）
         * @alleviate [n.] 减轻（痛苦等）；缓解
         */
        public static void array_53(){}
        /**
         * @resume [v.] 重新开始；（中断后的）继续
         * @ease [v./n.] 减轻；返送；缓和/容易；悠闲
         * @relax [v.] 放松
         */
        public static void array_54(){}
        /**
         * @normal [adj.] 正常的；正规的；规范的
         * @common [adj.] 共同的；普通的；平常的
         * @usual [adj.] 通常的；惯常的
         */
        public static void array_55(){}
        /**
         * @optimistic [adj.] 乐观主义的；乐观的
         * @pessimistic [adj.] 悲观的；悲观主义的
         * @positive [adj.] 肯定的；值得的；绝对的
         * @negative [adj.] 怀疑的，消极的
         * @passive [adj.] 被动的，消极的
         */
        public static void array_56(){}
        /**
         * @enthusiastic [adj.] 热心的；热情的
         * @indifferent [adj.] 漠不关心的；无关紧要的；平庸的；中立的
         * @apathetic [adj.] 无动于衷的；漠不关心的
         * @negligible [adj.] 可以忽略的；微不足道的
         */
        public static void array_57(){}
        /**
         * @happiness [n.] 幸福；快乐；适当
         * @delight [v./n.] （使）高兴；爱好/乐趣
         * @merry [adj.] 愉快的；欢乐的；微醉的
         */
        public static void array_58(){}
        /**
         * @fun [n./adj.] 乐趣；玩笑/有趣的
         * @joke [n./v.] 笑话；玩笑/说笑话；开玩笑
         * @laughter [n.] 笑；笑声
         * @joy [n.] 欢乐，喜悦；乐趣
         */
        public static void array_59(){}
        /**
         * @please [v./adv.] 使高兴；取悦/请
         * @rejoice [v.] （使）高兴、欢喜
         * @thrill [n./v.] （使）激动；感到紧张
         * @cheer [v.] 使振作；（向...）欢呼
         */
        public static void array_60(){}
        /**
         * @pleasure [n.] 愉快；高兴；荣幸
         * @agreeable [adj.] 使人愉快的；（欣然）同意的
         * @exhilarate [v.] 使高兴；使兴奋
         */
        public static void array_61(){}
        /**
         * @satisfactory [adj.] 令人满意的
         * @desirable [adj.] 可取的；值得拥有的；合意的
         * @exciting [adj.] 令人兴奋的；使人激动的
         */
        public static void array_62(){}
        /**
         * @keen [adj.] 强烈的；敏锐的；渴望的；有强烈兴趣的
         * @zeal [n.] 热心；热情；热忱
         * @lively [adj.] 活泼的；活跃的；栩栩如生的
         */
        public static void array_63(){}
        /**
         * @lovely [adj.] 可爱的；令人愉快的
         * @fond [adj.] 喜爱的；溺爱的
         * @favor [n.] 偏爱；赞同；恩惠；帮助
         */
        public static void array_64(){}
        /**
         * @surprising [adj.] 令人惊讶的；出人意料的
         * @startle [v./n.] 使大吃一惊/吃惊
         * @amazing [adj.] 令人惊叹的；惊人的
         * @astound [v.] 使大吃一惊；使惊骇
         * @hectic [adj.] 兴奋活跃的；忙乱的；繁忙的
         */
        public static void array_65(){}
        /**
         * @liberal [adj.] 慷慨的；大方的；自由主义的
         * @generous [adj.] 慷慨的；宽厚的
         * @gentle [adj.] 温和的；文雅的；出身名门的
         * @humble [adj.] 谦虚的；卑微的
         * @modest [adj.] 谦虚的；谦逊的
         */
        public static void array_66(){}
        /**
         * @humorous [adj.] 幽默的；诙谐的
         * @polite [adj.] 有礼貌的；客气的
         * @frank [adj.] 坦白的；直率的
         * @mysterious [adj.] 神秘的；不可思议的
         * @curious [adj.] 好奇的；好求知的
         * @daring [adj.] 勇敢的；大胆的
         * @manly [adj.] 有男子气概的；果断的
         * @direct [adj.] 直接的；直率的
         */
        public static void array_67(){}
        /**
         * @earnest [adj.] 认真的；诚恳的
         * @honesty [n.] 诚实；正直
         * @proud [adj.] 骄傲的；自豪的；令人自豪的
         * @rational [adj.] 理性的；合理的
         * @seriously [adv.] 严肃得；认真地；严重地
         * @stern [adj.] 严厉的；坚定的
         */
        public static void array_68(){}
        /**
         * @friendly [adj.] 友好的；友善的
         * @hospitable [adj.] 好客的；热情友好的
         * @romantic [adj.] 浪漫的；充满传奇色彩的
         */
        public static void array_69(){}
        /**
         * @freedom [n.] 自由；独立自主
         * @careful [adj.] 仔细地；细致的；小心的；谨慎的
         * @concern [n./v.] 关心；忧虑/涉及；使担忧；关心
         * @confidence [n.] 自信；信任
         */
        public static void array_70(){}
        /**
         * @considerate [adj.] 考虑周到的；体谅的
         * @thoughtful [adj.] 认真思考的；考虑周到的；体贴的
         * @sympathetic [adj.] 同情的；和谐的
         * @ready [adj.] 准备好的；愿意的
         */
        public static void array_71(){}
        /**
         * @apologize [v.] 道歉；赔罪
         * @apology [n.] 道歉；辩解
         * @mercy [n.] 仁慈；宽容；怜悯
         * @admire [v.] 赞美；钦佩；仰慕
         */
        public static void array_72(){}
        /**
         * @remarkable [adj.] 值得注意的；非凡的；卓越的
         * @grateful [adj.] 感激的；表示感谢的
         * @gratitude [n.] 感谢；感激；感恩
         * @eager [adj.] 渴望的；热切的
         * @sound [adj./n./v.] 健全的；（睡眠）酣畅的；合理地/声音/发出声音；听起来
         */
        public static void array_73(){}
        /**
         * @picturesque [adj.] 如画的；独特的
         * @promising [adj.] 大有希望的；有前途的
         * @prominent [adj.] 突出的；显著的；重要的；杰出的
         * @awesome [adj.] 卓越的；引起敬畏的
         */
        public static void array_74(){}
        /**
         * @arduous [adj.] 辛勤的；费力的；陡峭的
         * @tough [adj.] 艰难的；坚强的；强硬的
         * @robust [adj.] 强壮的；强健的
         * @sturdy [adj.] 强健的；坚定的
         * @steadfast [adj.] 坚定的
         */
        public static void array_75(){}
        /**
         * @tender [adj./v.] 脆弱的；温柔的；软弱的；疼痛的/（正式）提出；投标
         * @temperate [adj.] （气候）温和的；温带的；有节制的；心平气和的
         * @delicate [adj.] 精致的；微妙的；脆弱的
         * @mundane [adj.] 平凡的；世俗的；世界的
         */
        public static void array_76(){}
        /**
         * @naive [adj.] 天真的；幼稚的
         * @childish [adj.] 孩子般的；幼稚的
         * @sincere [adj.] 真诚的；诚挚的
         * @liable [adj.] 有责任的；有...倾向的，可能的
         * @trustworthy [adj.] 值得信赖的，可靠的
         */
        public static void array_77(){}
        /**
         * @enterprising [adj.] 有事业心的；有进取心的；有魄力的
         * @sane [adj.] 心智健全的；理智的
         * @strenuous [adj.] 发奋的；繁重的；艰苦的
         */
        public static void array_78(){}
        /**
         * @rigorous [adj.] 严格的；严厉的；一丝不苟的
         * @strict [adj.] 严格的；严厉的
         * @severe [adj.] 严厉的；十分严重的；艰巨的
         */
        public static void array_79(){}
        /**
         * @mutual [adj.] 相互的；彼此的；共同的
         * @resemble [v.] 与...相像；类似
         * @similar [adj.] 相似的；类似的
         * @familiar [adj.] 熟悉的
         */
        public static void array_80(){}
        /**
         * @naked [adj.] 裸体的；赤条条的
         * @bare [adj.] 赤裸的，无遮蔽的
         * @private [adj.] 私人的；个人的；私下的
         */
        public static void array_81(){}
        /**
         * @intuition [n.] 直觉
         * @spontaneous [adj.] 自发的；自然的；本能的；自然产生的
         * @implicit [adj.] 暗示的；含蓄的；不怀疑的；无保留的
         */
        public static void array_82(){}
        /**
         * @illusion [n.] 错觉；幻想
         * @imaginary [adj.] 想像的；虚构的
         * @fancy [n./v.] 想象（力）；爱好/认为；想象
         * @fate [n.] 命运；宿命
         * @fortune [n.] 命运；运气；财产
         */
        public static void array_83(){}
        /**
         * @agony [n.] 极度的痛苦；挣扎
         * @grief [n.] 极度悲伤
         * @grieve [v.] （使）悲痛
         */
        public static void array_84(){}
        /**
         * @miserable [adj.] 极不愉快的；痛苦的
         * @distress [n./v.] 悲痛；穷困；不幸/使伤心；使忧虑
         * @sadness [n.] 悲痛；悲哀
         */
        public static void array_85(){}
        /**
         * @gloomy [adj.] 幽暗的；令人沮丧的
         * @disappoint [v.] 使失望；使受挫折
         * @discourage [v.] 使灰心；使气馁；劝阻
         */
        public static void array_86(){}
        /**
         * @wretched [adj.] 不幸的；可怜的；悲惨的；恶劣的
         * @frustrating [adj.] 令人灰心的；是人沮丧的
         * @mourn [v.] （因失去...而）哀痛；哀悼
         */
        public static void array_87(){}
        /**
         * @anger [n./v.] 怒；怒气/使发怒
         * @furious [adj.] 狂怒的；暴怒的
         * @frown [n./v.] 皱眉；不悦/皱眉；表示不悦
         */
        public static void array_88(){}
        /**
         * @rage [n.] 盛怒；狂怒
         * @irritate [v.] 激怒；使急躁；刺激
         * @hate [v.] 恨；憎恨；不喜欢
         * @hatred [n.] 憎恶；憎恨；仇恨
         */
        public static void array_89(){}
        /**
         * @nuisance [n.] 讨厌或麻烦的人或物
         * @disgust [v./n.] 使厌恶；使作呕/厌恶
         * @vex [v.] 使烦恼；使恼火
         * @harass [v.] 烦扰
         */
        public static void array_90(){}
        /**
         * @bore [v./n.] 烦扰；钻孔/讨厌的人；令人生厌的事
         * @bother [v./n.] 花费时间精力（做某事）；（使）苦恼/麻烦，困难
         * @troublesome [adj.] 令人烦恼的；麻烦的
         */
        public static void array_91(){}
        /**
         * @awful [adj.] 令人不愉快的；极讨厌的
         * @unpleasant [adj.] 令人不愉快的；讨厌的
         * @adverse [adj.] 敌对的；不友好的；不利的
         */
        public static void array_92(){}
        /**
         * @hostile [adj.] 怀有敌意的；不友善的；敌对的
         * @indignant [adj.] 愤慨的
         * @radical [adj.] 激进的；根本的
         * @mad [adj.] 发疯的；恼火的
         * @crazy [adj.] 疯狂的；荒唐的
         */
        public static void array_93(){}
        /**
         * @wicked [adj.] 邪恶的；缺德的
         * @vicious [adj.] 邪恶的；不道德的
         * @vulgar [adj.] 粗俗的；庸俗的
         * @mean [adj./v.] 卑鄙的；吝啬的/意思是
         */
        public static void array_94(){}
        /**
         * @ego [n.] 自我；自尊；自负
         * @selfish [adj.] 自私的；利己主义的
         * @nasty [adj.] 下流的；肮脏的；险恶的
         * @rash [adj.] 草率的；鲁莽的
         */
        public static void array_95(){}
        /**
         * @volatile [adj.] 容变的；反复无常的；易挥发的
         * @weird [adj.] 怪诞的；古怪的
         * @excessive [adj.] 过分的；过多的
         */
        public static void array_96(){}
        /**
         * @anxiety [n.] 焦虑；担心；渴望
         * @restless [adj.] 不安定的；焦躁不安的；不耐烦的
         * @uneasy [adj.] 心神不安的；忧虑的
         */
        public static void array_97(){}
        /**
         * @fear [n./v.] 害怕；担心
         * @timid [adj.] 胆小的；羞怯的
         * @fuss [n.] 大惊小怪；无所谓的纷扰
         */
        public static void array_98(){}
        /**
         * @insult [v./n.] 侮辱；凌辱/侮辱，凌辱
         * @unkind [adj.] 不和善的；不仁慈的；刻薄的
         * @envy [n./v.] 羡慕；嫉妒
         * @jealous [adj.] 嫉妒的；妒忌的
         */
        public static void array_99(){}
        /**
         * @doubt [n./v.] 怀疑，疑问/怀疑；不信
         * @suspicion [n.] 怀疑，嫌疑
         * @skeptical [adj.] 怀疑的
         */
        public static void array_100(){}
        /**
         * @unsatisfactory [adj.] 不能令人满意的；不符合要求的；不足的
         * @unstable [adj.] 不稳定的；易变的；不牢固的
         * @unsuitable [adj.] 不合适的；不适宜的
         */
        public static void array_101(){}
        /**
         * @unwilling [adj.] 不愿意的；不情愿的；勉强的
         * @reluctant [adj.] 不情愿的；勉强的
         * @hesitate [v.] 犹豫不决；顾虑
         * @confuse [v.] 使困惑；把（某人）弄糊涂；混淆
         */
        public static void array_102(){}
        /**
         * @guilty [adj.] 有罪的；内疚的
         * @embarrass [v.] 使尴尬，使窘迫，使局促不安
         * @regret [n./v.] 遗憾；抱歉；悲叹/后悔；痛惜；惋惜
         * @repent [v.] 忏悔；后悔
         * @ashamed [adj.] 惭愧的；感到难为情的
         */
        public static void array_103(){}
        /**
         * @sigh [n./v.] 叹息；叹气
         * @weep [v./n.] 哭泣；流泪；哀悼/哭泣
         * @tolerance [n.] 忍受；容忍；宽容
         * @ignorant [adj.] 无知的；没有学识的；愚昧的
         * @endure [v.] 忍耐；忍受；持久
         */
        public static void array_104(){}
        /**
         * @sly [adj.] 狡猾的；狡诈的
         * @cunning [adj.] 狡猾的；巧妙的
         * @arbitrary [adj.] 武断的；专断的；任意的
         */
        public static void array_105(){}
        /**
         * @ridiculous [adj.] 荒谬的；可笑的
         * @stupid [adj.] 愚蠢的；麻木的；乏味的/傻瓜；笨蛋
         * @awkward [adj.] 笨拙的；尴尬的；棘手的；不合适的
         */
        public static void array_106(){}
        /**
         * @clumsy [adj.] 笨拙的
         * @careless [adj.] 粗心的；无忧无虑的；淡漠的
         * @oblivious [adj.] 不知道的；未注意的
         */
        public static void array_107(){}
        /**
         * @naughty [adj.] 淘气的；顽皮的
         * @greedy [adj.] 贪吃的；贪婪的
         * @obtrusive [adj.] 过分炫耀的；过分突出的；眨眼的
         */
        public static void array_108(){}
        /**
         * @slothful [adj.] 偷懒的；懒散的
         * @sluggish [adj.] 行动迟缓的
         * @impulse [n.] 冲动；心血来潮
         */
        public static void array_109(){}
        /**
         * @rigid [adj.] 固执的；严格的；刚硬的
         * @stubborn [adj.] 顽固的；固执的
         * @stereotype [n.] 老一套；模式化观念；刻板印象
         */
        public static void array_110(){}
    }
    /**
     *
     * @label 22_时间日期
     * @wordCount 52
     * @groupCount 15
     */
    public static class Class_timeAndDate{



        /**
         * @daily [adj./n.] 每日的/日报
         * @monthly [adj./adv./n.] 每月的/每月一次/月刊
         * @quarterly [adj./adv./n.] 季度的/按季度地/季刊
         */
        public static void array_1(){}
        /**
         * @annual [adj./n.] 每年的；一年的/年报
         * @yearly [adj./adv.] 每年的；一年的/每年地
         * @anniversary [n.] 周年纪念日
         */
        public static void array_2(){}
        /**
         * @era [n.] 时代；年代；纪元
         * @ancient [adj.] 古代的
         * @medieval [adj.] 中世纪的；守旧的
         * @contemporary [adj.] 当代的；同时代的
         * @present [adj./n.] 现在的/目前；礼物；赠送物
         */
        public static void array_3(){}
        /**
         * @decade [n.] 十年
         * @century [n.] 世纪；百年
         * @millennium [n.] 一千年；千年期；千禧年
         */
        public static void array_4(){}
        /**
         *
         * @million [num.] 百万；大量
         * @billion [num.] 十亿；大量
         * @dozen [n.] 一打；十二个；十来个
         */
        public static void array_5(){}
        /**
         * @dawn [n./v.] 黎明；开端/破晓
         * @midday [n.] 正午；中午
         * @dusk [n.] 黄昏；旁晚
         * @midnight [n.] 午夜；子夜；半夜
         * @night [n.] 夜；夜间；晚上；夜场
         * @overnight [adv.] 在晚上；突然；一夜之间
         */
        public static void array_6(){}
        /**
         * @modern [adj.] 现代的；近代的
         * @recent [adj.] 最近的
         * @up-to-date [adj.] 直到目前的；现代的
         */
        public static void array_7(){}
        /**
         * @first [ord./adv.] 第一/最初
         * @secondly [adv.] 第二；其次
         * @finally [adv.] 最后；终于；决定性地
         * @finish [v./n.] 完成；结束/结尾；最后部分
         */
        public static void array_8(){}
        /**
         * @immediately [adv.] 立即；直接地
         * @instant [n./adj.] 瞬间；立即的
         * @moment [n.] 片刻；时刻
         * @minute [n./adj.] 分；分钟；一会儿/细微的
         */
        public static void array_9(){}
        /**
         * @prior [adj.] 在先的；在前的
         * @former [adj./pron.] 以前的；前者的/前者
         * @preceding [adj.] 在前的；在先的
         */
        public static void array_10(){}
        /**
         * @precedent [n.] 先例；常规
         * @foremost [adj.] 最前的；最重要的
         * @opening [adj./n.] 开始的/开始；开端
         * @initially [adv.] 最初
         */
        public static void array_11(){}
        /**
         * @intermediate [adj.] 中间的
         * @midst [n.] 中部；中间
         * @meantime [n.] [in the ~]其间；同时/[for the ~]眼下；暂时
         */
        public static void array_12(){}
        /**
         * @meanwhile [adv.] 同时；其间
         * @simultaneous [adj.] 同时发生（或进行）的
         * @ongoing [adj.] 进行中的；继续存在的
         */
        public static void array_13(){}
        /**
         * @everlasting [adj.] 永恒的
         * @permanent [adj.] 永久的
         * @punctual [adj.] 准时的；守时的
         * @duration [n.] 持续时间；期间
         * @consecutive [adj.] 连续不断的
         */
        public static void array_14(){}
        /**
         * @periodically [adv.] 周期性地；定期地
         * @
         * @imminent [adj.] （尤指不愉快的事）即将发生的；逼近的
         * @incidentally [adv.] 偶然地；顺便提一句
         *
         */
        public static void array_15(){}
    }




}
