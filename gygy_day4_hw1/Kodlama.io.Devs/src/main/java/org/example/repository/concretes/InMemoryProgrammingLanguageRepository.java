package org.example.repository.concretes;

import org.example.entity.ProgrammingLanguage;
import org.example.repository.abstracts.ProgrammingLanguageRepository;


import java.util.ArrayList;
import java.util.List;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

    List<ProgrammingLanguage> languages;

    public InMemoryProgrammingLanguageRepository() {
        this.languages = new ArrayList<>();
        languages.add(new ProgrammingLanguage("1", "Java"));
        languages.add(new ProgrammingLanguage("2", "Python"));
        languages.add(new ProgrammingLanguage("3", "C#"));
        languages.add(new ProgrammingLanguage("4", "C++"));

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languages;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        languages.add(programmingLanguage);
    }

    @Override
    public void delete(String id) {
        //delete language that matches id
        for (ProgrammingLanguage language : languages) {
            if(language.getId().equals(id)){
                languages.remove(language);
                break;
            }
        }
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage language : languages) {
            if(language.getId() == programmingLanguage.getId()){
                language.setName(programmingLanguage.getName());
                break;
            }
        }
    }

    @Override
    public ProgrammingLanguage getById(String id) {
        //return language that matches id
        for (ProgrammingLanguage language : languages) {
            if(language.getId().equals(id)){
                return language;
            }
        }
        return null;
    }

    @Override
    public ProgrammingLanguage findByName(String name) {
        //return language that matches name
        for (ProgrammingLanguage language : languages) {
            if(language.getName().equals(name)){
                return language;
            }
        }
        return null;
    }


}
