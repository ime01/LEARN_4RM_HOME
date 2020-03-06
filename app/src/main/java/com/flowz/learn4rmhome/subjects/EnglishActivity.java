package com.flowz.learn4rmhome.subjects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.flowz.learn4rmhome.R;
import com.flowz.learn4rmhome.adapter.QuestionAdapter;
import com.flowz.learn4rmhome.adapter.VideoAdapter;
import com.flowz.learn4rmhome.model.QuestionsModel;
import com.flowz.learn4rmhome.model.video;
import com.flowz.learn4rmhome.youtubeSetUp.YoutubeActivity;

import java.util.ArrayList;
import java.util.List;

public class EnglishActivity extends AppCompatActivity {

    ConstraintLayout parentEnglish;

    List<video> listOfVideos;
    List<QuestionsModel> listofQuestions;
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
//        initializeQuestions();
//        displayEnglishQuestion();
    }

//    public void initializeQuestions() {
//        YoutubeActivity youtubeActivity = new YoutubeActivity();
//        youtubeActivity.displayEnglishQuestion();
//
//    }

    private void initializeVideos() {

        listOfVideos = new ArrayList<>();
        listOfVideos.add(new video("English Lesson 1", "EgzHCuzVKb8"));
        listOfVideos.add(new video("English Lesson 2", "IgqL2FwoAxo"));
        listOfVideos.add(new video("English Lesson 3", "WjnazRb7Dc4"));
        listOfVideos.add(new video("English Lesson 4", "8bD26mgwkqY"));
        listOfVideos.add(new video("English Lesson 5", "PqZV4smKrBI"));
        listOfVideos.add(new video("English Lesson 6", "1raIhq5EYEQ"));
        listOfVideos.add(new video("English Lesson 7", "UI8gbshwNwo"));
        listOfVideos.add(new video("English Lesson 8", "CTOF6vAqOls"));
        listOfVideos.add(new video("English Lesson 9", "WjnazRb7Dc4"));
        listOfVideos.add(new video("English Lesson 10", "dDBjqrq82Wc"));

    }


    private void initializeAdapter() {
        myadapter = new VideoAdapter(listOfVideos);

        myrecyclerView = findViewById(R.id.english_recycler);

        myrecyclerView.setAdapter(myadapter);

    }

//    public void displayEnglishQuestion() {
//
//        listofQuestions = new ArrayList<>();
//
//        listofQuestions.add(new QuestionsModel("What come next After  A, B, C, D, _ ?", "G", "O", "E", "Z"));
//        listofQuestions.add(new QuestionsModel("What come next After  E, F, G, H, _ ?", "G", "O", "E", "Z"));
//        listofQuestions.add(new QuestionsModel("What come next After  M, N, O, P, _ ?", "G", "O", "E", "Z"));
//        listofQuestions.add(new QuestionsModel("What come next After  A, B, C, D, _ ?", "G", "O", "E", "Z"));
//        listofQuestions.add(new QuestionsModel("What come next After  E, F, G, H, _ ?", "G", "O", "E", "Z"));
//        listofQuestions.add(new QuestionsModel("What come next After  M, N, O, P, _ ?", "G", "O", "E", "Z"));
//
//
//
//        QuestionAdapter adapter = new QuestionAdapter(listofQuestions);
//
//        YoutubeActivity youtubeActivity = new YoutubeActivity();
//
//        myrecyclerView2 = youtubeActivity.recyclerView;
//
//        LinearLayoutManager manager = new LinearLayoutManager(context);
//
//        myrecyclerView2.setLayoutManager(manager);
//
//        myrecyclerView2.setAdapter(adapter);
//
//
//    }
}
