package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.config.JPAconfig;
import com.cg.pojo.Author;

public class AuthorDaoImpl implements AuthorDao{
	EntityManager eManager= JPAconfig.getEntityManager();
	EntityTransaction et=eManager.getTransaction();
	Author au;
	@Override
	public String createAuthor(Author a) {
		et.begin();
		eManager.persist(a);
		et.commit();
		return "Author inserted";
	}
	@Override
	public String updateAuthor(int aid,String fname) {
		au=eManager.find(Author.class, aid);
		et.begin();
		au.setFirstName(fname);
		eManager.merge(au);
		et.commit();
		return "first name updated";
	}

}
