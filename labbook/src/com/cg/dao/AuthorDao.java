package com.cg.dao;

import com.cg.pojo.Author;

public interface AuthorDao {
public String createAuthor(Author a);
public String updateAuthor(int aid,String fname);
}
