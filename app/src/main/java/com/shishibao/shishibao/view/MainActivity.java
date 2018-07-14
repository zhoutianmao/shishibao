package com.shishibao.shishibao.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.orhanobut.logger.Logger;
import com.shishibao.shishibao.R;
import com.shishibao.shishibao.presenter.RowPresenter;

import model.RoomsModel;

public class MainActivity extends AppCompatActivity  implements RoomsView{

    private ListView listView;
    private RowPresenter rowPresenter = new RowPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("dd", "<<<<<>>>>>>>>>1");
        Log.d("dd", "<<<<<>>>>>>>>>3");
        rowPresenter.loadDataByRetrofitRxjava();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(new MyAdapter());
        Log.d("dd","<<<<<>>>>>>>>>2");
    }

    // 定义的数据
    private int[] images = { R.drawable.vae, R.drawable.vae, R.drawable.vae,
            R.drawable.vae, R.drawable.vae, R.drawable.vae, R.drawable.vae,
            R.drawable.vae, R.drawable.vae, R.drawable.vae, R.drawable.vae,
            R.drawable.vae };

    private String[] names = { "生命01号", "生命02号", "生命03号", "生命04号", "生命05号",
            "生命06号", "生命07号", "生命08号", "生命09号", "生命10号", "生命11号", "生命12号" };

    @Override
    public void getRoomsSuccess(RoomsModel roomsModel) {
        //Logger.json(JSON.toJSONString(roomsModel));
        Log.d("dd","<<<<<>>>>>>>>>5555");
        Log.d("dd", JSON.toJSONString(roomsModel));
        System.out.println(roomsModel);
    }

    //自定义适配器
    class MyAdapter extends BaseAdapter {
        public int getCount() {
            return names.length;
        }
        public Object getItem(int position) {
            return names[position];
        }
        public long getItemId(int position) {
            System.out.println("<<<<<>>>>>>>>>");
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder vh = new ViewHolder();
            //通过下面的条件判断语句，来循环利用。如果convertView = null ，表示屏幕上没有可以被重复利用的对象。
            if(convertView == null){
                //创建View
                convertView = getLayoutInflater().inflate(R.layout.activity_main_item, null);
                vh.iv = (ImageView) convertView.findViewById(R.id.imageView1);
                vh.tv = (TextView) convertView.findViewById(R.id.textView1);
                convertView.setTag(vh);
            }else{
                vh = (ViewHolder)convertView.getTag();
            }
            vh.iv.setImageResource(images[position]);
            vh.tv.setText(names[position]);

            return convertView;
        }
    }
    static class ViewHolder{
        ImageView iv;
        TextView tv;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}
