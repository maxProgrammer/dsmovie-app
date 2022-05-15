package com.api.dsmovie.controllers;

import com.api.dsmovie.dtos.MovieDTO;
import com.api.dsmovie.dtos.ScoreDTO;
import com.api.dsmovie.services.ScoreService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
@OpenAPIDefinition(info = @Info(title = "Evaluate Movie API", version = "1.0", description = "REST API responsible to control evaluating movies."))
public class ScoreController {

    @Autowired
    private ScoreService scoreService;


    @PutMapping
    @Operation(summary = "Make a movie evaluation")
    public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO){
       MovieDTO movieDTO = scoreService.saveScore(scoreDTO);
       return movieDTO;
    }

}
