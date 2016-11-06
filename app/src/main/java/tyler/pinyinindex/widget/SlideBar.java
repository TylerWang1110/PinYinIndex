package tyler.pinyinindex.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tyler.pinyinindex.R;
import tyler.pinyinindex.util.DensityUtils;

/**
 * @创建者 Tyler.
 * @创建时间 2016/11/7  1:11.
 * @描述 ${拼音侧边}.
 */
public class SlideBar extends View {

    public static final String[] sLetters = {"#", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
            "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private int mMeasuredHeight;
    private int mMeasuredWidth;
    private Paint mPaint;
    private float mHeight;
    private TextView mTv_toast;
    private RecyclerView mRvList;

    public SlideBar(Context context) {
        this(context, null);
    }

    public SlideBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SlideBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SlideBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this(context, attrs, defStyleAttr);
    }


    private void init(Context context) {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(getResources().getColor(android.R.color.black));
        mPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setTextSize(DensityUtils.px2dp(context, 100));


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < sLetters.length; i++) {
            canvas.drawText(sLetters[i], mMeasuredWidth / 2, mHeight * (i + 1), mPaint);
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mMeasuredHeight = getMeasuredHeight() - getPaddingBottom();
        mMeasuredWidth = getMeasuredWidth();
        mHeight = (mMeasuredHeight + 0.f) / sLetters.length;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                showToastAndScroll(event.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                showToastAndScroll(event.getY());
                break;
            case MotionEvent.ACTION_UP:
                hideToast();

                break;

            default:
                break;

        }
        return true;

    }

    private void hideToast() {
        setBackground(getResources().getDrawable(R.drawable.shape_slidebar_bg_normal));
        mTv_toast.setVisibility(GONE);
    }


    private void showToastAndScroll(float y) {
        if (mTv_toast == null) {
            ViewGroup parent = (ViewGroup) getParent();
            mTv_toast = (TextView) parent.findViewById(R.id.tv_toast);
            mRvList = (RecyclerView) parent.findViewById(R.id.rv_list);
        }
        setBackground(getResources().getDrawable(R.drawable.shape_slidebar_bg));
        int index = (int) (y / mHeight);
        if (index < 0) {
            index = 0;
        } else if (index > sLetters.length - 1) {
            index = sLetters.length - 1;
        }
        String sLetter = sLetters[index];
        mTv_toast.setText(sLetter);
        mTv_toast.setVisibility(VISIBLE);
    }
}
