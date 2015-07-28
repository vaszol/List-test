package ru.vaszol.vas.list_test;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ru.vaszol.vas.list_test.model.ToDo;

/**
 * Created by vas on 28.07.2015.
 */
public class ToDoAdapter extends BaseAdapter {

    private List<ToDo> toDos = null;
    private LayoutInflater inflater = null;

    public ToDoAdapter(Context context, List<ToDo> toDos)
    {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.toDos = toDos;
    }

    @Override
    public int getCount() {
        if(toDos!=null)
            return toDos.size();
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(toDos!=null && position>=0 && position <= getCount())
            return toDos.get(position);
        return null;
    }

    @Override
    public long getItemId(int position) {
        if(toDos!=null && position>=0 && position <= getCount())
            return toDos.get(position).getId();
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;
        if(view == null){
            view = inflater.inflate(R.layout.todo_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.iv = (ImageView)view.findViewById(R.id.imageView1);
            viewHolder.tv = (TextView)view.findViewById(R.id.textView1);
            view.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) view.getTag();
        }
        ToDo record = toDos.get(position);

//        viewHolder.iv.setImageResource(record.getPicture());
        viewHolder.tv.setText("" + record.getTask() + ": "
            + record.getPriority());
        viewHolder.tv.setTextColor(Color.BLUE);

        return view;
    }

    private class ViewHolder {
        public ImageView iv;
        public TextView tv;
    }
}
