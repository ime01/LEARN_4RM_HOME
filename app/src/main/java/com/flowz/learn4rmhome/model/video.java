package com.flowz.learn4rmhome.model;

import java.io.Serializable;

public class video implements Serializable {

    public String theVideo;
    public String videoLink;


    public video(String theVideo, String videoLink) {
        this.theVideo = theVideo;
        this.videoLink = videoLink;
    }

    public String getTheVideo() {
        return theVideo;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setTheVideo(String theVideo) {
        this.theVideo = theVideo;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}
