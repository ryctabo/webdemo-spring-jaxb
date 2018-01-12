package com.github.ryctabo.webdemo.service;

import com.github.ryctabo.webdemo.core.ListResponse;
import com.github.ryctabo.webdemo.core.Person;
import com.github.ryctabo.webdemo.repository.PersonRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;
import java.util.List;

/**
 * @author Gustavo Pacheco (ryctabo at gmail.com)
 * @version 1.0-SNAPSHOT
 */
@Service
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class PersonService {

    private PersonRepository personRepository;

    @Inject
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public ListResponse<Person> get() {
        List<Person> people = this.personRepository.get();
        return new ListResponse<>(people, people.size());
    }

    public Person get(int id) {
        return this.personRepository.get(id);
    }

}
