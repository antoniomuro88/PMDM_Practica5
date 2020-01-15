package practica2.studium.practica5pmdm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Apartado1 extends AppCompatActivity {
Button boton1;
EditText edit1;
EditText edit2;
EditText edit3;
RadioButton radio1;
RadioButton radio2;
RadioButton radio3;
RadioButton radio4;
RadioButton radio5;
RadioButton radio6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartado1);
        boton1 = findViewById(R.id.button2);
        edit1 = findViewById(R.id.editText);
        edit2 = findViewById(R.id.editText2);
        edit3 = findViewById(R.id.editText3);
        radio1 = findViewById(R.id.radioButton);
        radio2 = findViewById(R.id.radioButton2);
        radio3 = findViewById(R.id.radioButton3);
        radio4 = findViewById(R.id.radioButton4);
        radio5 = findViewById(R.id.radioButton5);
        radio6 = findViewById(R.id.radioButton6);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if (!edit1.getText().toString().isEmpty() && !edit2.getText().toString().isEmpty() && !edit3.getText().toString().isEmpty())
                {
                Toast toast1 = Toast.makeText(getApplicationContext(), edit3.getText(), Toast.LENGTH_SHORT);
                if(radio1.isChecked() && radio4.isChecked())
                {
                    toast1.setGravity(Gravity.LEFT| Gravity.TOP, Integer.parseInt(edit1.getText().toString()) , Integer.parseInt(edit2.getText().toString()) );
                }
                else if(radio1.isChecked() && radio5.isChecked())
                {
                    toast1.setGravity(Gravity.LEFT| Gravity.CENTER_VERTICAL, Integer.parseInt(edit1.getText().toString()) , Integer.parseInt(edit2.getText().toString()) );
                }
                else if(radio1.isChecked() && radio6.isChecked())
                {
                    toast1.setGravity(Gravity.LEFT| Gravity.BOTTOM, Integer.parseInt(edit1.getText().toString()) , Integer.parseInt(edit2.getText().toString()) );
                }
                else if(radio2.isChecked() && radio4.isChecked())
                {
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL| Gravity.TOP, Integer.parseInt(edit1.getText().toString()) , Integer.parseInt(edit2.getText().toString()) );
                }
                else if(radio2.isChecked() && radio5.isChecked())
                {
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL| Gravity.CENTER_VERTICAL, Integer.parseInt(edit1.getText().toString()) , Integer.parseInt(edit2.getText().toString()) );
                }
                else if(radio2.isChecked() && radio6.isChecked())
                {
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL| Gravity.BOTTOM, Integer.parseInt(edit1.getText().toString()) , Integer.parseInt(edit2.getText().toString()) );
                }
                else if(radio3.isChecked() && radio4.isChecked())
                {
                    toast1.setGravity(Gravity.RIGHT| Gravity.TOP, Integer.parseInt(edit1.getText().toString()) , Integer.parseInt(edit2.getText().toString()) );
                }
                else if(radio3.isChecked() && radio5.isChecked())
                {
                    toast1.setGravity(Gravity.RIGHT| Gravity.CENTER_VERTICAL, Integer.parseInt(edit1.getText().toString()) , Integer.parseInt(edit2.getText().toString()) );
                }
                else if(radio3.isChecked() && radio6.isChecked())
                {
                    toast1.setGravity(Gravity.RIGHT| Gravity.BOTTOM, Integer.parseInt(edit1.getText().toString()) , Integer.parseInt(edit2.getText().toString()) );
                }
                toast1.show();
                }
                else
                {
                }
            }
        });
    }
}
