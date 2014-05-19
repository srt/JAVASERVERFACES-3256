package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class MyBean implements Serializable
{
    public void action()
    {
        System.out.println("Action performed");
    }
}

