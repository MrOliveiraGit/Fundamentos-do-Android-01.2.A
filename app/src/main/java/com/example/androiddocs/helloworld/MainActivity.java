package com.example.androiddocs.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","Hello World");
        textView = (TextView) findViewById(R.id.show_count);
    }

    public void showTost(View view) {
        Toast mensagem = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_LONG);
        mensagem.show();

    }

    public void countUp(View view) {
        this.count++;
        if(this.textView != null){
            textView.setText(Integer.toString(this.count));
        }
    }
}
