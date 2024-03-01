package org.example.service.abstracts;

import org.example.entity.ProgrammingLanguage;
import java.util.List;

public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage programmingLanguage);

    void delete(String id);

    void update(ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage findById(String id);

    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage findByName(String name);
}
