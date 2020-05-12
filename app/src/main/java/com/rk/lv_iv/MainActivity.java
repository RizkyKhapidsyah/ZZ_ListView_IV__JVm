package com.rk.lv_iv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    HashMap<String, List<String>> listChild;
    List<String> listHeader;
    CustomAdapter customAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.IDXML_expListView);
        listChild = ExpandableListData.getData();
        listHeader = new ArrayList<String>(listChild.keySet());
        customAdapter = new CustomAdapter(this, listHeader, listChild);
        expandableListView.setAdapter(customAdapter);
    }
}
