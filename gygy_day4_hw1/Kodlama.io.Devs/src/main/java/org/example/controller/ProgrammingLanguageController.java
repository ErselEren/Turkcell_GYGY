package org.example.controller;

import org.example.entity.ProgrammingLanguage;
import org.example.service.abstracts.ProgrammingLanguageService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguageController {

    private ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return this.programmingLanguageService.getAll();
    }

    @PostMapping("/insert")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage){
        programmingLanguageService.add(programmingLanguage);
    }

    @PutMapping("/update")
    public void update(@RequestBody ProgrammingLanguage programmingLanguage){
        programmingLanguageService.update(programmingLanguage);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        programmingLanguageService.delete(id);
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getById(@PathVariable("id") String id){
        return programmingLanguageService.findById(id);
    }

    @GetMapping("/getbyname/{name}")
    public ProgrammingLanguage getByName(@PathVariable("name") String name){
        return programmingLanguageService.findByName(name);
    }



}
