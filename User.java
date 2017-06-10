package com.zeng.learn.freemarker;
 
/**
 *   @author zengzhihua 
 */
public class User {
    private String username;
    private String password;
    private int age;
    private String hobby;
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    
    public String getHobby(){
        return this.hobby;
    }
    
}