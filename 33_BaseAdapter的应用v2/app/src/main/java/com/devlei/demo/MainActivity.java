package com.devlei.demo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView mListView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1.有了一个列表
        mListView = (ListView) findViewById(R.id.lv);
        //2.创建一些数据
        ArrayList<String> datas=new ArrayList<String>();
        for (int i = 0; i < 150; i++) {
            datas.add("测试:"+i);
        }
        //3.将数据导入到ListView
        MyAdapter adapter=new MyAdapter(datas);
        mListView.setAdapter(adapter);
    }


}

