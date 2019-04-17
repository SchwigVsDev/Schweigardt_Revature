package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
public class Bean {
    @Autowired
    Repo repo;

    @Override
    public String toString() {
        return "This is the Bean \n" + this.repo +"\n=====";
    }

}

@Repository
class Repo {
    String repoString = "This Bean's repo.";

    @Override
    public String toString() {
        return this.repoString;
    }
}