package com.example.aes.ejercio01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textView1;
    EditText textView2;
    TextView textViewresultado;
    Button buttoncalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        textView1=(EditText)findViewById(R.id.editText1);
        textView2=(EditText)findViewById(R.id.editText2);
        textViewresultado=(TextView)findViewById(R.id.textViewresultado);

        buttoncalcular=(Button)findViewById(R.id.buttoncalcular);


        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular(Integer.parseInt(textView1.getText().toString()),Integer.parseInt(textView2.getText().toString()));
            }
        });


    }

    public void Calcular(int a ,int b){
        int R =a+b;
        textViewresultado.setText(Integer.toString(R));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
