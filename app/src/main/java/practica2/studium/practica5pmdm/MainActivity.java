package practica2.studium.practica5pmdm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button boton1;
    Button boton2;
    Intent intent1;
    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = findViewById(R.id.button1);
        boton2 = findViewById(R.id.button2);
        intent1 = new Intent(this, Apartado1.class);
        intent2 = new Intent(this, Apartado2.class);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(intent1);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(intent2);
            }
        });
    }
}
