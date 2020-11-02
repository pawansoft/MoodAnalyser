package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

    @Test
    public void testMood_WhenStringContainHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
                moodAnalyser.analyseMood();
        }
        catch ( AnalyseMoodNullExceptions e) {
            Assert.assertEquals(AnalyseMoodNullExceptions.ExceptionType.ENTERD_NULL, e.type);
        }
    }
}
