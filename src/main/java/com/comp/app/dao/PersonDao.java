package com.comp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.app.entity.Person;

@Repository("personDao")
public interface PersonDao extends JpaRepository<Person, Long>{


}
