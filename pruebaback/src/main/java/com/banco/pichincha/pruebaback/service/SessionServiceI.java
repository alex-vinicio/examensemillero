package com.banco.pichincha.pruebaback.service;

import com.banco.pichincha.pruebaback.enities.Session;

public interface SessionServiceI {

    public Session getSession(String name, String password, String mail);
}