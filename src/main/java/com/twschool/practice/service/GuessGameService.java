package com.twschool.practice.service;

import com.twschool.practice.DTO.UserInfoDTO;
import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuessGameService {

    private GuessNumberGame guessNumberGame;

    public UserInfoDTO getUserGameInfo(String user, String guess){
        UserInfoDTO userInfoDTO = new UserInfoDTO(user,0,"");
        Map<String, String> result = new HashMap<>();
        result.put(user, guess(guess));
        userInfoDTO.setUser(user);
        userInfoDTO.setResult(guess);
        userInfoDTO.setIntegral(calculateIntegral(result,user));
        return userInfoDTO;
    }

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

    public int calculateIntegral(Map<String, String> result, String user){
        int count = 0;
        int integral = 0;
         for (String item : result.keySet()) {
             if("4A0B".equals(result.get(item))){
                 count ++;
                 integral +=3;
             }else {
                 count = 0;
             }
             if(count == 3){
                 integral += 3;
             }
             if(count == 5){
                 integral += 2;
             }
         }
        return integral;
    }
}
