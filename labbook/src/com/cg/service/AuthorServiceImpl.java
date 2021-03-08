package com.cg.service;

import com.cg.dao.AuthorDao;
import com.cg.dao.AuthorDaoImpl;
import com.cg.pojo.Author;

public class AuthorServiceImpl implements AuthorService{
	AuthorDao aDao=new AuthorDaoImpl();
	@Override
	public String insertAuthor(Author a) {		
		return aDao.createAuthor(a);
	}
	@Override
	public String updateAuthor(int aid, String fname) {
		return aDao.updateAuthor(aid, fname);
	}

}
