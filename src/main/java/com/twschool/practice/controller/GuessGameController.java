package com.twschool.practice.controller;

import com.twschool.practice.DTO.UserInfoDTO;
import com.twschool.practice.service.GuessGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController
public class GuessGameController {

    @Autowired
    private GuessGameService guessGameService;

    @RequestMapping("/game/{user}")
    public UserInfoDTO guessGame(@PathVariable String user, @RequestParam("guess") String guess){
        return guessGameService.getUserGameInfo(user,guess);
    }
}
