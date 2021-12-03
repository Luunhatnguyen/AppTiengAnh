package Englishapp;


import java.util.logging.Level;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Question {
    private String content;
    private Level level;
    private Type type;
    
    public Question(String content,Type type,Level lvl){
        this.content = content;
        this.level = lvl;
        this.type = type;
    }
   
    @Override
    public String toString() {
        return this.content + "\n"; 
    }
    
    
    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the level
     */
    public Level getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(Level level) {
        this.level = level;
    }

    /**
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * @return the type
     */
   
    
}
