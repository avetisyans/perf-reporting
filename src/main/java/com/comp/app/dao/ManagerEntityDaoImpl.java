package com.comp.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.comp.app.entity.ManagerEntity;

@Repository("managerEntityDao")
public class ManagerEntityDaoImpl implements ManagerEntityDao {
	@PersistenceContext
	protected EntityManager em;

	@Override
	public ManagerEntity save(ManagerEntity managerEntity) {
		em.persist(managerEntity);
		System.out.println("managerEntity after persist: " + managerEntity);
		return managerEntity;
	}

	@Override
	public ManagerEntity saveAndFlush(ManagerEntity managerEntity) {
		em.persist(managerEntity);
		em.flush();
		System.out.println("managerEntity after flush: " + managerEntity);
		return managerEntity;
	}

}