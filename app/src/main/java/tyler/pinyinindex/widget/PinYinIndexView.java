package tyler.pinyinindex.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import tyler.pinyinindex.R;

/**
 * @创建者 Tyler.
 * @创建时间 2016/11/7  0:59.
 * @描述 ${拼音快速索引}.
 */
public class PinYinIndexView extends RelativeLayout {


    public static final String[] names =

            {
                    "一灯大师", "马青雄", "马钰", "小沙弥", "木华黎", "丘处机", "沈青刚", "书记", "书生",
                    "天竺僧人", "王处一", "王罕", "尹志平", "包惜弱", "冯衡", "术赤", "农夫", "孙不二", "札木合", "华筝", "李萍", "刘玄处",
                    "刘瑛姑",
                    "吕文德", "乔寨主", "曲三", "曲傻姑", "全金发", "汤祖德", "朱聪", "陈玄风", "赤老温", "瘦丐", "陆乘风", "陆冠英", "沙通天",
                    "吴青烈",
                    "杨康", "杨铁心", "余兆兴", "张阿生", "张十五", "忽都虎", "欧阳峰", "欧阳克", "梅超风", "铁木真", "拖雷", "者勒米",
                    "段天德", "枯木",
                    "周伯通", "郭靖", "郭啸天", "郝大通", "洪七公", "侯通海", "姜文", "柯镇恶", "南希仁", "胖妇人", "胖丐", "胖子", "哑梢公",
                    "都史",
                    "钱青健", "桑昆", "盖运聪", "黄蓉", "黄药师", "梁长老", "梁子翁", "渔人", "博尔忽", "博尔术", "程瑶迦", "韩宝驹", "韩小莹",
                    "焦木和尚",
                    "鲁有脚", "穆念慈", "彭长老", "彭连虎", "童子", "窝阔台", "简长老", "简管家", "裘千仞", "裘千丈", "察合台", "酸儒文人", "谭处端",
                    "黎生", "樵子", "灵智上人", "完颜洪烈", "完颜洪熙"
            };

    public PinYinIndexView(Context context) {
        this(context, null);
    }

    public PinYinIndexView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PinYinIndexView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        ViewGroup group = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.layout_pinyin, this,
                true);
        RecyclerView rvList = (RecyclerView) group.findViewById(R.id.rv_list);

    }
}
