package com.MoodAnalyser;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MoodAnalyser {

    private String moodMessage;

    public MoodAnalyser(){
    }

    public MoodAnalyser(String moodMessage) {
        this.moodMessage = moodMessage;
    }

    public String analyseMood() throws AnalyseMoodNullExceptions {
        try {
            if(moodMessage.length() == 0)
            {
                throw new AnalyseMoodNullExceptions(AnalyseMoodNullExceptions.ExceptionType.ENTERD_EMPTY, "Pass value instead of Empty");
            }
            if(moodMessage.contains("Sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {
            throw new AnalyseMoodNullExceptions(AnalyseMoodNullExceptions.ExceptionType.ENTERD_NULL, "Don't pass null value");
        }

    }
}
