package org.techtown.communityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText content;
    Button btn_edit;
    TextView name_textview;
    TextView content_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        content = findViewById(R.id.content);
        btn_edit = findViewById(R.id.btn_edit);
        name_textview = findViewById(R.id.name_textview);
        content_textview = findViewById(R.id.content_textview);

        btn_edit.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String str_name = name.getText().toString();
                name_textview.setText("작성자:" +str_name);
                String str_content = content.getText().toString();
                content_textview.setText(str_content);


            }
        });
    }

}