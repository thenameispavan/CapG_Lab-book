package com.cg.service;

import com.cg.pojo.Author;

public interface AuthorService {
public String insertAuthor(Author a);
public String updateAuthor(int aid,String fname);
}
