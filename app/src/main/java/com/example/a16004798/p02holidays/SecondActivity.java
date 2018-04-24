package com.example.a16004798.p02holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<holiday> holidays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv2ndDisplay = (TextView) findViewById(R.id.tvTitle);
        lv = (ListView)findViewById(R.id.lvDisplayHolidays);
        Intent intentReceived = getIntent();
        String type = intentReceived.getStringExtra("type");
        holidays = new ArrayList<holiday>();

        if(type.equals("Secular")){
            holidays.add(new holiday("New Year's Day", R.drawable.newyear, "1 Jan 2018", "New Year's Day date: 1 Jan 2018"));
            holidays.add(new holiday("Labour Day", R.drawable.labourday, "1 May 2019", "Labour Day's date: 1 May 2018"));
            tv2ndDisplay.setText("Secular");
            aa = new holidayAdapter(this, R.layout.row, holidays);
            lv.setAdapter(aa);


        }else{
            holidays.add(new holiday("Chinese New Year", R.drawable.cny, "28-29 Jan 2017", "Chinese New Year's date: 28-29 Jan 2017"));
            holidays.add(new holiday("Good Friday", R.drawable.goodfriday, "14 April 2017", "Good Friday's date: 14 April 2017"));
            tv2ndDisplay.setText("Ethnic & Religion");
            aa = new holidayAdapter(this, R.layout.row, holidays);
            lv.setAdapter(aa);
        }

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                holiday selectedHols = holidays.get(position);
                Toast.makeText(SecondActivity.this, selectedHols.getDesc(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
