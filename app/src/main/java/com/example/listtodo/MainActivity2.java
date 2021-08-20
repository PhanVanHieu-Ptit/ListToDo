package com.example.listtodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Set;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvInfor = findViewById(R.id.tv_infor);

        Set<String> namUsers = DataLocalManager.getNameUsers();
        tvInfor.setText(namUsers.toString());

        for (String strName:namUsers){
            Log.e("Name user",strName);
        }
    }
}