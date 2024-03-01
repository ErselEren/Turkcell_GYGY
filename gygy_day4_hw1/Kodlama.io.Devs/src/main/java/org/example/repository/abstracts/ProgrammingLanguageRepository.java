package org.example.repository.abstracts;

import org.example.entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage programmingLanguage);

    void delete(String id);

    void update(ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage getById(String id);

    ProgrammingLanguage findByName(String name);
}
