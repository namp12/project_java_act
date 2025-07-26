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
    ADMIN("Quản Trị Viên", 3),
    STAFF("Nhân Viên", 2),
    VIEWER("Người Dùng", 1);

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
    public static Role fromSting(String name){
        try{
            return Role.valueOf(name.toUpperCase());
        }catch(IllegalArgumentException e){
            return VIEWER;
        }
    }
    @Override
    public String toString() {
        return name() + "(" + description + ")";
    }

}
