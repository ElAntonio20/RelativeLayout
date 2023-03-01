package iest.edu.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bnCanal = findViewById(R.id.bnCanal);
        EditText etCanal = findViewById(R.id.etCanal);
        TextView tvCanal = findViewById(R.id.tvCanal);

        Spinner spProgramas = findViewById(R.id.spProgramas);

        spProgramas.setOnItemClickListener(this);
        bnCanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //
                //
                String texto = etCanal.getText().toString();
                Toast.makeText(MainActivity.this,"El valor era"+texto,Toast.LENGTH_LONG).show();
                tvCanal.setText(texto);
            }
        });

    }

    private ImageView ivContinuar;

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
        String programa = adapterView.getItemAtPosition(posicion).toString();
        Snackbar.make(adapterView,"Programa seleccionado"+programa,
                Snackbar.LENGTH_LONG).show();

        if(posicion == 0){
            ivContinuar.setImageResource(R.drawable.tobe);
        }else if(posicion ==1){
            ivContinuar.setImageResource(R.drawable.tobe2);
        }else{
            ivContinuar.setImageResource(R.drawable.tobe3);
        }

    }
}