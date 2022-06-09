package com.levelup.forestsandmonsters;

public class Character {
    String name;

    public Character(String name){
      this.setName(name);
    }
    public String getName() {
        return name;
    }
    private void setName(String name)
    {
        this.name = name;
    }
}
