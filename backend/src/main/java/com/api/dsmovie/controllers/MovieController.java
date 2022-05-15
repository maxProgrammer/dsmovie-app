package com.api.dsmovie.controllers;

import com.api.dsmovie.dtos.MovieDTO;
import com.api.dsmovie.services.MovieService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
@OpenAPIDefinition(info = @Info(title = "Evaluate Movie API", version = "1.0", description = "REST API responsible to control evaluating movies."))
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    @Operation(summary = "Return a pageable list with all movies")
    public Page<MovieDTO> findAll(@PageableDefault(page = 0, size = 12, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return movieService.findAll((pageable));
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Return a movie by ID")
    public MovieDTO findByID(@PathVariable Long id){
        return movieService.findById(id);
    }

}
