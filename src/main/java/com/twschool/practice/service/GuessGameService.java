package com.twschool.practice.service;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;

import java.util.Arrays;
import java.util.List;

public class GuessGameService {

    private GuessNumberGame guessNumberGame;

    public String guess(String userAnswerInput){
        startGame();
        List<String> userAnswer = Arrays.asList(userAnswerInput.split(" "));
        return guessNumberGame.guess(userAnswer);
    }

    public void startGame(){
        if(guessNumberGame == null){
            guessNumberGame = new GuessNumberGame(new RandomAnswerGenerator());
        }
    }
}
