package com.example.homework_22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button buttonBack;
    public Button buttonForward;
    private TextView textLink;
    int a = 0;
    int b = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBack = (Button) findViewById(R.id.btn_back);
        buttonForward = (Button) findViewById(R.id.btn_forward);
        textLink = (TextView) findViewById(R.id.textLink);

        textLink.setText("http://myfile.org/" + (a + (int) (Math.random() * b)));

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn_back:
                        finish();
                        break;
                    case R.id.btn_forward:
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };

        buttonBack.setOnClickListener(onClickListener);
        buttonForward.setOnClickListener(onClickListener);
    }
}