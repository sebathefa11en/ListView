package com.example.listview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView miTextView;
    private ListView lv1;

    private String nombres []= {"Samuel", "Valentina", "Pedro", "Luis"};
    private String edades []= {"18", "25", "40", "23"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miTextView = (TextView) findViewById(R.id.miTextView);
        lv1 = (ListView) findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.list_item, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                miTextView.setText("La edad de "+lv1.getItemAtPosition(position)+" es "+edades[position]+" años");
            }
        });
    }
}