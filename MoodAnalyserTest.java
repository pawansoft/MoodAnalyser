package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void testMood_WhenStringContainSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String isMoodSad = moodAnalyser.analyseMood("This is Sad message");
        Assert.assertEquals("SAD" , isMoodSad);
    }

    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String isMoodHappy = moodAnalyser.analyseMood("This is Happy message");
        Assert.assertEquals("HAPPY" , isMoodHappy);
    }
}
