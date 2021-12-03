package Englishapp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class Incomplete extends Question{
    private List<MultipleChoice> question;
     public Incomplete(String content,Type type,Level lvl){
         super(content,type,lvl);
         this.question = new ArrayList<>();
         
     }
     public void addQuestion(MultipleChoice q){
         this.question.add(q);
     }

    @Override
    public String toString() {
        String s= super.toString();
        for(MultipleChoice q: this.question)
            s+=q;
        return s;
    }
    

    /**
     * @return the question
     */
    public List<MultipleChoice> getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(List<MultipleChoice> question) {
        this.question = question;
    }
    
    
}
