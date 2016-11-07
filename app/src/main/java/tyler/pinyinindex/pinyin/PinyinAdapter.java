package tyler.pinyinindex.pinyin;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import tyler.pinyinindex.R;

/**
 * @创建者 Tyler.
 * @创建时间 2016/11/7  9:32.
 * @描述 ${列表内容Adapter}.
 */
public class PinyinAdapter extends RecyclerView.Adapter<PinyinAdapter.ViewHolder> {


    private final List<Person> mShowItems;
    private boolean isLastShow;

    public PinyinAdapter(List<Person> persons) {
        mShowItems = persons;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout
                .layout_item_personlist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Person person = mShowItems.get(position);
        holder.tvName.setText(person.getName());
//        holder.tvLetter.setVisibility(View.VISIBLE);
//        holder.tvLetter.setText(person.getLetter() + "");
        if (position == 0) {
            holder.tvLetter.setVisibility(View.VISIBLE);
            holder.tvLetter.setText(person.getLetter() + "");
            isLastShow = true;
        } else if (mShowItems.get(position - 1).getLetter() != person.getLetter()) {
            holder.tvLetter.setVisibility(View.VISIBLE);
            holder.tvLetter.setText(person.getLetter() + "");
        } else {
            holder.tvLetter.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return mShowItems == null ? 0 : mShowItems.size();
    }

    public List<Person> getShowItems() {
        return mShowItems;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        private TextView tvLetter;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvLetter = (TextView) itemView.findViewById(R.id.tv_letter);
        }
    }

}
