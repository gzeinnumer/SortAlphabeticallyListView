package com.gzeinnumer.sortalphabeticallylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    String[] mNames = {
            "Sharan Debonis",
            "Idell Corrie",
            "Bryon Rodd",
            "Karolyn Niemeyer",
            "Heike Trieu",
            "Cordell Millikin",
            "Belle Wenz",
            "Sheena Roberto",
            "Xochitl Sandusky",
            "Helen Aho",
            "Danae Valero",
            "Valencia Winkfield",
            "Roxanna Gelb",
            "Everett Mendoza",
            "Jeffery Seltzer",
            "Aide Keen",
            "Remedios Hickel",
            "Emma Veazey",
            "Angelyn Aaron",
            "Mayra Ronk"
    };
    ListView listView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        btn = findViewById(R.id.btn);

        final ArrayAdapter<String> adapterListView = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mNames);
        listView.setAdapter(adapterListView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arrays.sort(mNames);
                adapterListView.notifyDataSetChanged();
            }
        });

    }
}
