/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Phuong Nam
 */
public enum Role {
    ADMIN("ADMIN", 3),
    STAFF("STAFF", 2),
    VIEWER("VIEWER", 1);

    private final String description;
    private final int level;

    Role(String description,int level){
        this.description = description;
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Role{" +
                "description='" + description + '\'' +
                ", level=" + level +
                '}';
    }
}
