package com.zammle2009wtfgmail.utilityhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class listviewSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_selection);

        ListView selectionButton = (ListView)findViewById(R.id.selectionListView);
        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("History");
        buttons.add("Whitelist");
        buttons.add("Notifications");
        buttons.add("Hardware Widgets");
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,buttons);
        selectionButton.setAdapter(arrayAdapter1);
    }
}
