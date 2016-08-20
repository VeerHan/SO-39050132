package com.leihan.so;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.templateFilesList);
        ArrayList<String> templateList = new ArrayList<>();

        File myDir = getFilesDir();
        File[] templateFiles = myDir.listFiles();
        int length = templateFiles.length;

        //case 1: length is 1,show only one element,see case2.
//        for (int i = 0; i < length; i++) {
//            templateList.add(templateFiles[i].getName());
//        }

        //case 2: try to add simple strings
        templateList.add("a1");
        templateList.add("a2");
        templateList.add("a3");

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                templateList);
        listView.setAdapter(arrayAdapter);
    }
}
