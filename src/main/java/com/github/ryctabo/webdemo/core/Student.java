package com.github.ryctabo.webdemo.core;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Gustavo Pacheco (ryctabo at gmail.com)
 * @version 1.0-SNAPSHOT
 */
@XmlRootElement
@XmlDiscriminatorValue("student")
public class Student extends Person {

    private int semester;

    public Student() { }

    public Student(int id, String name, int semester) {
        super(id, name);
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
