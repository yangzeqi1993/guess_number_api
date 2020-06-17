package com.twschool.practice.controller;

import com.twschool.practice.service.GuessGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/")
@RestController
public class GuessGameController {

    @Autowired
    private GuessGameService guessGameService;

    @RequestMapping("/game")
    public Map<String, String> guessGame(@RequestParam("guess") String guess){
        Map<String, String> result = new HashMap<>();
        result.put("input", guess);
        result.put("result", guessGameService.guess(guess));
        return result;
    }
}
