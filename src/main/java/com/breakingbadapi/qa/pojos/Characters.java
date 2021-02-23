package com.breakingbadapi.qa.pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Characters {

    private String birthday;

    private String img;

    private String[] better_call_saul_appearance;

    private String[] occupation;

    private String[] appearance;

    private String portrayed;

    private String name;

    private String nickname;

    private String char_id;

    private String category;

    private String status;

    public String getBirthday ()
    {
        return birthday;
    }

    public void setBirthday (String birthday)
    {
        this.birthday = birthday;
    }

    public String getImg ()
    {
        return img;
    }

    public void setImg (String img)
    {
        this.img = img;
    }

    public String[] getBetter_call_saul_appearance ()
    {
        return better_call_saul_appearance;
    }

    public void setBetter_call_saul_appearance (String[] better_call_saul_appearance)
    {
        this.better_call_saul_appearance = better_call_saul_appearance;
    }

    public String[] getOccupation ()
    {
        return occupation;
    }

    public void setOccupation (String[] occupation)
    {
        this.occupation = occupation;
    }

    public String[] getAppearance ()
    {
        return appearance;
    }

    public void setAppearance (String[] appearance)
    {
        this.appearance = appearance;
    }

    public String getPortrayed ()
    {
        return portrayed;
    }

    public void setPortrayed (String portrayed)
    {
        this.portrayed = portrayed;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getNickname ()
    {
        return nickname;
    }

    public void setNickname (String nickname)
    {
        this.nickname = nickname;
    }

    public String getChar_id ()
    {
        return char_id;
    }

    public void setChar_id (String char_id)
    {
        this.char_id = char_id;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [birthday = "+birthday+", img = "+img+", better_call_saul_appearance = "+better_call_saul_appearance+", occupation = "+occupation+", appearance = "+appearance+", portrayed = "+portrayed+", name = "+name+", nickname = "+nickname+", char_id = "+char_id+", category = "+category+", status = "+status+"]";
    }
}
