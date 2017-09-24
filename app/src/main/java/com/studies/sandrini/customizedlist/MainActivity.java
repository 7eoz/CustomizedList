package com.studies.sandrini.customizedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView sodaList;
    String[] soda = {"Coke", "Fanta"};
    Integer[] imageId = {R.drawable.coke,R.drawable.fanta};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sodaList = (ListView) findViewById(R.id.soda_list);
        ListCell adapter = new ListCell(MainActivity.this, soda, imageId);
        sodaList.setAdapter(adapter);

        sodaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You clicked on " + soda[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
