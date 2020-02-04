package com.flowz.learn4rmhome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.flowz.learn4rmhome.adapter.VideoAdapter;
import com.flowz.learn4rmhome.model.video;
import com.flowz.learn4rmhome.subjects.EnglishActivity;
import com.flowz.learn4rmhome.subjects.MathsActivity;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    ConstraintLayout parentEnglish,parentMaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        parentMaths = findViewById(R.id.parent_maths);
        parentEnglish = findViewById(R.id.parent_english);


        parentEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openEnglish = new Intent(MainActivity.this, EnglishActivity.class);
                startActivity(openEnglish);
            }
        });

        parentMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openMaths = new Intent(MainActivity.this, MathsActivity.class);
                startActivity(openMaths);
            }
        });

    }


}
