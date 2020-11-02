package com.MoodAnalyser;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MoodAnalyser {

    private String moodMessage;

    public MoodAnalyser(){
    }

    public MoodAnalyser(String moodMessage) {
        this.moodMessage = moodMessage;
    }

    public String analyseMood() {
        try {
            if(moodMessage.contains("Sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {
            return "HAPPY";
        }

    }
}

