package com.example.handsonjavaappclockdigital;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.executor.TaskExecutor;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView txtUpdateHoraAtual;
    private TextClock txtHoraAtual, txtHora;
    private Button btnUpdateHoraAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        iniciarComponenteLayout();
        
        capturarHoraAtual();
    }

    private void iniciarComponenteLayout() {

            txtUpdateHoraAtual = findViewById(R.id.txtUpdateHoraAtual);
            txtHoraAtual = findViewById(R.id.txtHoraAtual);
            txtHora = findViewById(R.id.txtHora);
            btnUpdateHoraAtual = findViewById(R.id.btnUpdateHoraAtual);

    }

    private void capturarHoraAtual() {

        btnUpdateHoraAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUpdateHoraAtual.setText("Hora: "+txtHoraAtual.getText());
            }
        });


    }

}