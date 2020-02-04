package com.flowz.learn4rmhome.youtubeSetUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import com.flowz.learn4rmhome.R;

public class YoutubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String API_KEY = "AIzaSyDsnlVNVr6TRPRI4Hu_LGL84N_Y02XH6VA";
    public static final String YOUTUBE_VIDEO_CODE = "EgzHCuzVKb8";   // key for STUDY VIDEO!!
    public static final int RECOVERY_DIALOG_REQUEST = 1;
    private YouTubePlayerView youTubeView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        youTubeView = findViewById(R.id.youtube);
        youTubeView.initialize(API_KEY, this);

        String videoUrl = getIntent().getStringExtra("videourl");
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
}
