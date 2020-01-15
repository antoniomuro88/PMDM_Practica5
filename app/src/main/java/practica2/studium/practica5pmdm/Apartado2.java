package practica2.studium.practica5pmdm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Apartado2 extends AppCompatActivity {
    AppCompatActivity estaActividad;
    Button boton;
    EditText edit1;
    EditText edit2;
    EditText edit3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartado2);
        estaActividad = this;
        boton = findViewById(R.id.btnEnviar);
        edit1 = findViewById(R.id.editTitulo);
        edit2 = findViewById(R.id.editMensaje);
        edit3 = findViewById(R.id.editSegundos);
        boton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            { if (!edit1.getText().toString().isEmpty() && !edit2.getText().toString().isEmpty() && !edit3.getText().toString().isEmpty())
            {
                PendingIntent i = PendingIntent.getActivity(estaActividad, 0, getIntent(), 0);

                final NotificationCompat.Builder mensaje = new NotificationCompat.Builder(estaActividad, "CH_ID");
                mensaje.setAutoCancel(true)
                        .setDefaults(Notification.DEFAULT_ALL)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.logo))
                        .setSmallIcon(R.drawable.logo)
                        .setPriority(Notification.PRIORITY_MAX) // No válido en API 26
                        .setContentTitle(edit1.getText())
                        .setContentText(edit2.getText())
                        .setContentIntent(i);


                final long changeTime = Integer.parseInt(edit3.getText().toString()) * 1000;
                boton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        NotificationManager nM = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                        nM.notify(1, mensaje.build());
                    }
                }, changeTime);
            }
            else
            {
            }
            }
        });
    }
}
