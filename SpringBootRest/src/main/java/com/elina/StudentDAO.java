package com.elina;

import org.springframework.data.repository.CrudRepository;

//use Spring ORM, hibernate JPA
//add JPA support in pom.xmls
public interface StudentDAO extends CrudRepository<Student, Integer> {
}
