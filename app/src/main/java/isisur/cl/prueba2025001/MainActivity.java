package isisur.cl.prueba2025001;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout color;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       color = findViewById(R.id.PIERNA);
       texto= findViewById(R.id.textView);

        Button izquierda = findViewById(R.id.rodilla);
        izquierda.setOnClickListener(view -> {
            cambiarcolor(Color.parseColor("#8000FF"),"cambio de color Layout");
        });

        Button zapatilla  = findViewById(R.id.button2);
        zapatilla.setOnClickListener(view -> {
            cambiarcolor(Color.parseColor("#FFFF00"),"cambio de color amarillo el  Layout");
        });
    }
    private void cambiarcolor(int colorfondo,String nuevotexto){
        color.setBackgroundColor(colorfondo);
        texto.setText(nuevotexto);
    }
}