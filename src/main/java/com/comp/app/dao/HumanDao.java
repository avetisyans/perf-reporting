package com.comp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.app.entity.Human;

@Repository("humanDao")
public interface HumanDao extends JpaRepository<Human, Long>{


}
