package com.example.ushercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Weight, Amount;
    private RadioGroup rGroup;
    private RadioButton B1, B2, B3;
    private Button Calculate;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Weight = findViewById(R.id.weight);
        Amount = findViewById(R.id.amount);
        rGroup = findViewById(R.id.radioGroup);
        Calculate = findViewById(R.id.calculate);
        Result = findViewById(R.id.result);
        B1=findViewById(R.id.button1);
        B2=findViewById(R.id.button2);
        B3=findViewById(R.id.button3);

        Calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int Id = rGroup.getCheckedRadioButtonId();
                int weight = Integer.parseInt(Weight.getText().toString());
                int amount = Integer.parseInt(Amount.getText().toString());

                String Text = String.valueOf(Id);

              if(Text.equals("2131230819"))
                {
                    double usher = (weight*amount)/10;
                    Result.setText("Your Usher: "+usher);
                }

                if(Text.equals("2131230820"))
                {
                    double usher = (weight*amount)/20;
                    Result.setText("Your Usher: "+usher);
                }

                if(Text.equals("2131230821"))
                {
                    double usher = (weight*amount)/13.333333;
                    Result.setText("Your Usher: "+usher);
                }

            }
        });
    }


}