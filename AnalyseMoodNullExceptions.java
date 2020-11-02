package com.MoodAnalyser;

public class AnalyseMoodNullExceptions extends Exception{

    enum ExceptionType{
        ENTERD_NULL, ENTERD_EMPTY
    }

    ExceptionType type;
    public AnalyseMoodNullExceptions(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
