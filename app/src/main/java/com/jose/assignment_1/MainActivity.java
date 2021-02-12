package com.jose.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    
    private Button btnProcess;
    private TextView textViewEven,textViewOdd;
    private EditText editTextInput;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnProcess = findViewById(R.id.btnProcess);
        textViewEven = findViewById(R.id.textViewEven);
        textViewOdd = findViewById(R.id.textViewOdd);
        editTextInput = findViewById(R.id.editTextInput);
        
        getProcess();
    }

    private void getProcess() {
        
        btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int input = Integer.parseInt(editTextInput.getText().toString());
                    int inputDisplay = input;
                    int even = 0;
                    int odd = 0;

                    while(input > 0){
                        if(input % 2 == 0){
                            even++;
                        }else{
                            odd++;
                        }
                        input--;
                    }
                    textViewEven.setText("EVEN NUMBER: "+even);
                    textViewOdd.setText("ODD NUMBER: "+odd);
                    Toast.makeText(MainActivity.this, ""+inputDisplay+" has "+even+" even and "+odd+" numbers.", Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error Check your Input", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}