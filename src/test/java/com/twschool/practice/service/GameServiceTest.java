package com.twschool.practice.service;

import com.twschool.practice.domain.Answer;
import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameServiceTest {

    RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();

    @Before
    public void setUp() throws Exception{
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        randomAnswerGenerator = Mockito.mock(RandomAnswerGenerator.class);
        Mockito.when(randomAnswerGenerator.generateAnswer()).thenReturn(answer);
    }

    //@Test
   // public void should_start_game_when_guess_then_
}
