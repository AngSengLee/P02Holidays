package com.example.a16004798.p02holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lvHoliday = (ListView)findViewById(R.id.lvHolidays);

        final ArrayList<String> alHoliday = new ArrayList<String>();
        ArrayAdapter<String> aaHoliday;

        alHoliday.add("Secular");
        alHoliday.add("Ethnic & Religion");

        aaHoliday = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alHoliday);
        lvHoliday.setAdapter(aaHoliday);

        lvHoliday.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String secularIndex = alHoliday.get(position);

                if(secularIndex == "Secular"){
                    Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                    intent.putExtra("type","Secular");
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                    intent.putExtra("type","Ethnic");
                    startActivity(intent);
                }



            }
        });

    }
}
