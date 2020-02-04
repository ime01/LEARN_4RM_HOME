package com.flowz.learn4rmhome.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.flowz.learn4rmhome.R;
import com.flowz.learn4rmhome.model.video;
import com.flowz.learn4rmhome.youtubeSetUp.YoutubeActivity;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<video> videoList;

    public VideoAdapter(List<video> videoList) {
        this.videoList = videoList;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_item,  parent, false);
        VideoViewHolder vVH = new VideoViewHolder(view);
        return vVH;
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        holder.textView.setText(videoList.get(position).theVideo);

    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }


    public class VideoViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout constraintLayout;
        TextView textView;
        ImageView imageView;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.video_text);
            constraintLayout = itemView.findViewById(R.id.video_item);

//            itemView.setOnClickListener(this);

            constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position = getAdapterPosition();

                   video videoModel =  videoList.get(position);

                       String videoUrl = videoModel.videoLink;

                    Intent intent = new Intent(view.getContext(), YoutubeActivity.class);
                    intent.putExtra("videourl",  videoUrl);
                    view.getContext().startActivity(intent);

                }
            });
        }
    }
}
