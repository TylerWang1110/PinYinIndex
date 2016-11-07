package tyler.pinyinindex.widget;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tyler.pinyinindex.R;

/**
 * @创建者 Tyler.
 * @创建时间 2016/11/7  9:32.
 * @描述 ${列表内容Adapter}.
 */
public class PinyinAdapter extends RecyclerView.Adapter<PinyinAdapter.ViewHolder> {


    private final String[] mShowItems;

    public PinyinAdapter(String[] names) {
        mShowItems = names;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout
                .layout_item_personlist, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String name = mShowItems[position];
        holder.tvName.setText(name);
    }

    @Override
    public int getItemCount() {
        return mShowItems.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView tvName;

        public ViewHolder(View itemView) {

            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
        }
    }

}
