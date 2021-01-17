package com.testappu.drugsdosagecalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_calc = (Button) findViewById(R.id.button_calc);
        final EditText field_weight = (EditText) findViewById(R.id.field_weight);
        final EditText field_dose = (EditText) findViewById(R.id.field_dose);
        final TextView view_result = (TextView) findViewById(R.id.view_result);
        final TextView view_msg = (TextView) findViewById(R.id.view_msg);

        button_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weight;
                double dose;
                double result;
                String msg=" The dosage to be taken 2 times a day";
                if(field_dose.getText().toString().equals("") || field_weight.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"No valid values detected",Toast.LENGTH_LONG);

                }
               //Fix this
            }
        });
    }
}
