package Englishapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Choice {
    private String content;
    private boolean correct;
    
    public Choice(){
        
    }
    public Choice(String content,boolean correct){
        this.content = content;
        this.correct = correct;
    }
    

    @Override
    public String toString() {
        return this.content + "\n"; //To change body of generated methods, choose Tools | Templates.
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
     * @return the correct
     */
    public boolean isCorrect() {
        return correct;
    }

    /**
     * @param correct the correct to set
     */
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
    
}
