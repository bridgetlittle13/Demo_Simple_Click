package sg.edu.rp.c346.id22013272.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step1: Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgButton;
    RadioGroup rgGender;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step2 creating object for UI element
        btnDisplay=findViewById(R.id.btn);
        etInput=findViewById(R.id.editTextTextMultiLine);
        tvDisplay=findViewById(R.id.textViewDisplay);
        tgButton=findViewById(R.id.toggleButtonEnabled);
        rgGender=findViewById(R.id.radioButtonGender);

        //step 3,linking UI element with Java object
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code of action
                String stringResponse=etInput.getText().toString();
                int checkedRadioId=rgGender.getCheckedRadioButtonId();
                if(checkedRadioId==R.id.radioButtonGenderMale) {
                    //toggle's button is on, enable edit text
                    tvDisplay.setText(stringResponse);
            }else {
                    //toggle's button is off, disable edit text
                    Toast.makeText(MainActivity.this, "button is clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}