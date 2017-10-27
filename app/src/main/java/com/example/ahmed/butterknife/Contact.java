package com.example.ahmed.butterknife;

/**
 * Created by ahmed on 12/10/17.
 */

public class Contact {

    String name;
    String mobile;


    public Contact(String cName, String cMobile)
    {
        this.name = cName;
        this.mobile = cMobile;
    }

    public void setName(String myName)
    {
        this.name = myName;
    }

    public String getName()
    {
        return name;
    }

    public void setMobile(String myMobile)
    {
        this.mobile = myMobile;
    }

    public String getMobile()
    {
        return mobile;
    }
}
