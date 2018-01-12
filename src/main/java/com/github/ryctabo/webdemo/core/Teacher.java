package com.github.ryctabo.webdemo.core;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Gustavo Pacheco (ryctabo at gmail.com)
 * @version 1.0-SNAPSHOT
 */
@XmlRootElement
@XmlDiscriminatorValue("teacher")
public class Teacher extends Person {

    private String university;

    public Teacher() { }

    public Teacher(int id, String name, String university) {
        super(id, name);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
