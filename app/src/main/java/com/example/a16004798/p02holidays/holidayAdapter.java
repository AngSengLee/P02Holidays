package com.example.a16004798.p02holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class holidayAdapter extends ArrayAdapter<holiday>{
    private ArrayList<holiday> hols;
    private Context context;
    private TextView tvName;
    private ImageView ivhols;

    public holidayAdapter(Context context, int resource, ArrayList<holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        hols = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvName = (TextView) rowView.findViewById(R.id.textViewHols);
        // Get the ImageView object
        ivhols = (ImageView) rowView.findViewById(R.id.imageViewHols);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        holiday currentHoliday = hols.get(position);
        // Set the TextView to show the food

        tvName.setText(currentHoliday.getHolsName() + "\n" + currentHoliday.getDate());

        ivhols.setImageResource(currentHoliday.getImage());
        // Return the nicely done up View to the ListView
        return rowView;
    }
}
