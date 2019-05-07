package com.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import model.Word;

public class MeaningActivity extends AppCompatActivity {
    private TextView tvMeaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meaning);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null) {
            String meaning = bundle.getString("meaning");
            String word = bundle.getString("word");
            tvMeaning = findViewById(R.id.tvMeaning);
            tvMeaning.setText(meaning);
        }
        else {
            Toast.makeText(this, "No Meaning", Toast.LENGTH_SHORT).show();
        }
    }
    public void UpdateWord(Word word) {
        try {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        String qry = "UPDATE" +

        }
    }


    }

