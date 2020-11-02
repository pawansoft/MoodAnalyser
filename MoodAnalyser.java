package com.MoodAnalyser;

public class MoodAnalyser {

    private String moodMessage;

    public MoodAnalyser(){
    }

    public MoodAnalyser(String moodMessage) {
        this.moodMessage = moodMessage;
    }

    public String analyseMood() {
        if(moodMessage.contains("Sad")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}

