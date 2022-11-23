package com.assessment.demo.controller;


import com.assessment.demo.exception.NotFoundException;
import com.assessment.demo.model.NomenClature;
import com.assessment.demo.service.NomenClatureRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class NACEController {

    @Autowired
    private final NomenClatureRepository repository;

    NACEController(NomenClatureRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/putNaceDetails")
    @ApiOperation(value = "This method is used to put NACE Data")
    public NomenClature putNaceDetails(@RequestBody NomenClature newNomenClature) {
        return repository.save(newNomenClature);
    }

    @GetMapping("/getNaceDetails/{id}")
    @ApiOperation(value = "This method is used to get NACE Data")
    public NomenClature getNaceDetails(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(id));
    }
}