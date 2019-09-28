package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String colors[] = {"Blue", "Cyan", "Gray", "Green", "Magenta", "Red","Purple","Olive","Navy","Teal"};
        //final ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, colors);
        ColorAdapter colorAdapter = new ColorAdapter(this, colors);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(colorAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //adapterView.setBackgroundColor(Color.parseColor(adapterView.getItemAtPosition(i).toString()));
                view.setBackgroundColor(Color.WHITE);
                String chosenColor = adapterView.getItemAtPosition(i).toString();

                View myLayout = findViewById(R.id.mainLayout);
                myLayout.setBackgroundColor(Color.parseColor(chosenColor));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}
