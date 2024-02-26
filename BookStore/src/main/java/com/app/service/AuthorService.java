package com.app.service;

import com.app.dao.AuthorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
@Autowired
    AuthorDao authorDao;
}
