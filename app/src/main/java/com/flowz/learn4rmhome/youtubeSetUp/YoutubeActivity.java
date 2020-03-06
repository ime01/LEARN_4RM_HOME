package com.flowz.learn4rmhome.youtubeSetUp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.flowz.learn4rmhome.adapter.QuestionAdapter;
import com.flowz.learn4rmhome.adapter.VideoAdapter;
import com.flowz.learn4rmhome.model.QuestionsModel;
import com.flowz.learn4rmhome.model.video;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import com.flowz.learn4rmhome.R;

import java.util.ArrayList;
import java.util.List;

public class YoutubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String API_KEY = "AIzaSyDsnlVNVr6TRPRI4Hu_LGL84N_Y02XH6VA";
    public static final String YOUTUBE_VIDEO_CODE = "EgzHCuzVKb8";   // key for STUDY VIDEO!!
    public static final int RECOVERY_DIALOG_REQUEST = 1;
    private YouTubePlayerView youTubeView;
    public  RecyclerView recyclerView;
    public  QuestionAdapter questionAdapter;
    public Context context;

    TextView question1, question2;
    List<QuestionsModel> listofQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        youTubeView = findViewById(R.id.youtube);
        youTubeView.initialize(API_KEY, this);

        recyclerView = findViewById(R.id.questions_recycler);

        String videoUrl = getIntent().getStringExtra("videourl");

//        question1 = findViewById(R.id.question);
//        question2 = findViewById(R.id.question2);

        displayMathsQuestion();

    }

    private YouTubePlayer.Provider getYouTubePlayerProvider(){
        return (YouTubePlayerView)findViewById(R.id.youtube);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if(!b){

            String videoUrl = getIntent().getStringExtra("videourl");
            youTubePlayer.loadVideo(videoUrl);
            youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        if (youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
        }else {
            String errorMessage = String.format(
                    "Error playing video: %s", youTubeInitializationResult.toString());
            Toast.makeText(this, "errorMessage", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==RECOVERY_DIALOG_REQUEST){
            getYouTubePlayerProvider().initialize(API_KEY, this);
        }
    }

//    private void initializeQuestions() {
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
//        RecyclerView recyclerView = findViewById(R.id.questions_recycler);
//
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(manager);
//
//        recyclerView.setAdapter(adapter);
//
//    }

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
//        recyclerView = findViewById(R.id.questions_recycler);
//
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(manager);
//
//        recyclerView.setAdapter(adapter);
//    }

    public void displayMathsQuestion() {


        listofQuestions = new ArrayList<>();

        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "1", "4", "7",  "3"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "8", "0", "1",  "3"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "7", "3", "7",  "1"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "3", "4", "2",  "1"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "2", "6", "1",  "3"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "0", "3", "9",  "1"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "1", "5", "2",  "2"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "8", "3", "0",  "1"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "5", "6", "7",  "0"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "4", "1", "9",  "4"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "2", "6", "1",  "2"   ));
        listofQuestions.add(new QuestionsModel("What come next After  5, 6, 7, 8  _ ?", "What come next After  1, 2, 3, 4  _ ?", "What come next After  2, 3, 4, 5  _ ?", "fill the missing number 5, _, 7, 8,  9 ?", "fill the missing number  2, 3, _, 5  ?",  "3", "8", "4",  "0"   ));




        recyclerView = findViewById(R.id.questions_recycler);

        QuestionAdapter questionAdapter = new QuestionAdapter(listofQuestions);
        recyclerView.setAdapter(questionAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(manager);




    }



}
