package com.flowz.learn4rmhome.subjects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.flowz.learn4rmhome.R;
import com.flowz.learn4rmhome.adapter.VideoAdapter;
import com.flowz.learn4rmhome.model.video;

import java.util.ArrayList;
import java.util.List;

public class MathsActivity extends AppCompatActivity {

    ConstraintLayout parentEnglish;

    List<video> listOfVideos;
    RecyclerView myrecyclerView;
    VideoAdapter myadapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);


        myrecyclerView = findViewById(R.id.maths_recycler);


        LinearLayoutManager manager = new LinearLayoutManager(context);
        myrecyclerView.setLayoutManager(manager);



        initializeVideos();
        initializeAdapter();
    }

    private void initializeVideos() {

        listOfVideos = new ArrayList<>();
        listOfVideos.add(new video("Maths Lesson 1", "bfJikS_rCY8"));
        listOfVideos.add(new video("Maths Lesson 2", "CRN7rwblaNk"));
        listOfVideos.add(new video("Maths Lesson 3", "LvvFW4u8hsQ&pbjreload=10"));
        listOfVideos.add(new video("Maths Lesson 4", "7WbcGLDDudI"));
        listOfVideos.add(new video("Maths Lesson 5", "72L2zoCIpng"));
        listOfVideos.add(new video("Maths Lesson 6", "zl_ppO5zKAI"));
        listOfVideos.add(new video("Maths Lesson 7", "D4eJ5kg28nU&pbjreload=10"));
        listOfVideos.add(new video("Maths Lesson 8", "uEGYX8UAsK4"));
        listOfVideos.add(new video("Maths Lesson 9", "AuX7nPBqDts"));
        listOfVideos.add(new video("Maths Lesson 10", "Fe8u2I3vmHU"));
        listOfVideos.add(new video("Maths Lesson 11", "SEAKuerLbsk"));
        listOfVideos.add(new video("Maths Lesson 12", "mAvuom42NyY"));
        listOfVideos.add(new video("Maths Lesson 13", "Y6M89-6106I"));
        listOfVideos.add(new video("Maths Lesson 14", "depLStKzbIE"));

    }
    private void initializeAdapter() {
        myadapter = new VideoAdapter(listOfVideos);

        myrecyclerView = findViewById(R.id.maths_recycler);

        myrecyclerView.setAdapter(myadapter);

    }
}
