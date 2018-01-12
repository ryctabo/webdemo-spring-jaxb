package com.github.ryctabo.webdemo.repository;

import com.github.ryctabo.webdemo.core.Person;
import com.github.ryctabo.webdemo.core.Student;
import com.github.ryctabo.webdemo.core.Teacher;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gustavo Pacheco (ryctabo at gmail.com)
 * @version 1.0-SNAPSHOT
 */
@Repository
public class PersonRepository {

    private Map<Integer, Person> persons = new HashMap<>();

    @PostConstruct
    public void initialize() {
        persons.put(1, new Student(1, "Gustavo Pacheco", 10));
        persons.put(2, new Teacher(2, "Stephanie Leal", "Universidad de Cartagena"));
    }

    public List<Person> get() {
        return new ArrayList<>(this.persons.values());
    }

    public Person get(int id) {
        return this.persons.get(id);
    }

}
