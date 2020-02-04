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

public class EnglishActivity extends AppCompatActivity {

    ConstraintLayout parentEnglish;

    List<video> listOfVideos;
    RecyclerView myrecyclerView;
    VideoAdapter myadapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        parentEnglish = findViewById(R.id.parent_english);

        myrecyclerView = findViewById(R.id.english_recycler);


        LinearLayoutManager manager = new LinearLayoutManager(context);
        myrecyclerView.setLayoutManager(manager);



        initializeVideos();
        initializeAdapter();

    }
    private void initializeVideos() {

        listOfVideos = new ArrayList<>();
        listOfVideos.add(new video("English Lesson 1", "EgzHCuzVKb8"));
        listOfVideos.add(new video("English Lesson 2", "IgqL2FwoAxo"));
        listOfVideos.add(new video("English Lesson 3", "WjnazRb7Dc4"));
        listOfVideos.add(new video("English Lesson 4", "8bD26mgwkqY"));
        listOfVideos.add(new video("English Lesson 6", "PqZV4smKrBI"));
        listOfVideos.add(new video("English Lesson 7", "1raIhq5EYEQ"));
        listOfVideos.add(new video("English Lesson 8", "UI8gbshwNwo"));
        listOfVideos.add(new video("English Lesson 9", "CTOF6vAqOls"));
        listOfVideos.add(new video("English Lesson 10", "WjnazRb7Dc4"));
        listOfVideos.add(new video("English Lesson 11", "dDBjqrq82Wc"));

    }
    private void initializeAdapter() {
        myadapter = new VideoAdapter(listOfVideos);

        myrecyclerView = findViewById(R.id.english_recycler);

        myrecyclerView.setAdapter(myadapter);

    }
}
