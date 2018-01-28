package com.example.trupti.navlwithlistview;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    ListView mListView;
    String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data=getResources().getStringArray(R.array.data);

        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawerlay);
        mListView=(ListView)findViewById(R.id.listdata);
        mListView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data));



    }
}
