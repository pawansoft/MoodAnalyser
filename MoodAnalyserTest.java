package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void testMood_WhenStringContainSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String isMoodSad = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD" , isMoodSad);
    }

    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String isMoodHappy = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY" , isMoodHappy);
    }
}

