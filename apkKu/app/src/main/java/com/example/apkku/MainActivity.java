package com.example.apkku;


import android.app.Activity;
import android.app.AppComponentFactory;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends Activity {
    ListView listView;
    public String makanan_favorit_anak_jaman_now[]={"Pecel lele","Nasi goreng mercon","Ayam geprek keju","Kari ayam","Tahu Bulat","Salad buah"};

    Spinner combo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.listdata);
        combo=(Spinner) findViewById(R.id.combodata);


    }
}