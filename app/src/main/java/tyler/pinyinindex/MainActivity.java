package tyler.pinyinindex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tyler.pinyinindex.widget.PinYinIndexView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        PinYinIndexView pinyin = (PinYinIndexView) findViewById(R.id.pinyin_view);
    }
}
