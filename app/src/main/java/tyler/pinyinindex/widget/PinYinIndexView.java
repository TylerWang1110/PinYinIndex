package tyler.pinyinindex.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import tyler.pinyinindex.R;

/**
 * @创建者 Tyler.
 * @创建时间 2016/11/7  0:59.
 * @描述 ${拼音快速索引}.
 */
public class PinYinIndexView extends RelativeLayout {
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
        LayoutInflater.from(context).inflate(R.layout.layout_pinyin, this, true);
    }
}
