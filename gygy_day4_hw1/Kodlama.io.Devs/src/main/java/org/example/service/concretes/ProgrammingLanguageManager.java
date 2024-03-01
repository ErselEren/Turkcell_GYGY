package org.example.service.concretes;

import java.util.List;
import org.example.entity.ProgrammingLanguage;
import org.example.repository.abstracts.ProgrammingLanguageRepository;
import org.example.service.abstracts.ProgrammingLanguageService;
import org.springframework.stereotype.Service;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private final ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {

        if(checkid(programmingLanguage) && checkName(programmingLanguage)){
            programmingLanguageRepository.add(programmingLanguage);
        }
        else{
            System.out.println("Programming language already exists");
        }
    }

    @Override
    public void delete(String id) {
        programmingLanguageRepository.delete(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
          //if id and name is not null
        if(programmingLanguage.getId() != null && programmingLanguage.getName() != null) {
            programmingLanguageRepository.update(programmingLanguage);
        }
    }

    @Override
    public ProgrammingLanguage findById(String id) {
        return programmingLanguageRepository.getById(id);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage findByName(String name) {
        return programmingLanguageRepository.findByName(name);
    }


    private boolean checkName(ProgrammingLanguage programmingLanguage) {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.getAll();

        if(programmingLanguage.getName() == null){
            return false;
        }

        for (ProgrammingLanguage language : programmingLanguages) {
            if(language.getName().equals(programmingLanguage.getName())){
                return false;
            }
        }
        return true;
    }

    private boolean checkid(ProgrammingLanguage programmingLanguage) {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.getAll();

        if (programmingLanguage.getId() == null) {
            return false;
        }

        for (ProgrammingLanguage language : programmingLanguages) {
            if(language.getId() == programmingLanguage.getId()){
                return false;
            }
        }
        return true;
    }
}