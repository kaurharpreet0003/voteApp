package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText id;
    ToggleButton toggleButton;
    Button btn;
    Spinner spinner;
    boolean temp = true;

    String vt1;
    String vt2;
    String vt3;

    String spinnerText;

    int vote1 = 0;
    int vote2 = 0;
    int vote3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.editText_name);
        id = findViewById(R.id.editText_id);
        spinner = findViewById(R.id.spinner);
        toggleButton = findViewById(R.id.toggleBtn);
        btn = findViewById(R.id.btn1);

    toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked){
                temp = true;
            }
            else
                temp = false;
        }
    });

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            spinnerText = spinner.getSelectedItem().toString();
            
            if (name.getText().toString().isEmpty() || id.getText().toString().isEmpty() || temp == false) {
                Toast.makeText(MainActivity.this, "Fill your fields", Toast.LENGTH_SHORT).show();
            }
            else {
                if(spinnerText.equals("candidate 1")){
                    vote1 += 1;

                    vt1 = Integer.toString(vote1);
                    vt2 = Integer.toString(vote2);
                    vt3 = Integer.toString(vote3);

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("vote1", vt1);
                    intent.putExtra("vote2", vt2);
                    intent.putExtra("vote3", vt3);
                    startActivity(intent);

                }
            }
        }
    });
    }
}
