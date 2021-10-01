package com.example.aplikasitoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView AngkaKounter;
    int angka =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AngkaKounter=findViewById(R.id.tbcounter);
    }

    public void toastklik(View view) {
        Toast.makeText(this, "ini adalah toast", Toast.LENGTH_SHORT).show();
    }

    public void tbcounter(View view) {
        angka=angka+1;
        AngkaKounter.setText(Integer.toString(angka));
    }
}
