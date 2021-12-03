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
public class MultipleChoice extends Question{
    private static final String[] LABELS = {"A","B","C","D"}; 
    private List<Choice> choices;
    private String cmt;
    
    public MultipleChoice(String content, Type type ,Level lvl){
        super(content, type ,lvl);
        
        this.choices = new ArrayList<>();   
        
    }
    
//     public void nhapQuestion(Scannner s){
//        System.out.println("Nhap cau hoi:");
//        this.content = s.nextLine();
//        for(int i = 0 ; i < LABELS.length ; i ++)
//             System.out.println("Nhap phuong an %s \n", LABELS[i]);
//             Choice c = new Choice();
//             c.
//    }
    
    public void addChoice(Choice c){
        if(this.choices.size() < LABELS.length)
            this.choices.add(c);
    }
    public void shuffleChoice(){
        Collections.shuffle(choices);
    }
    
    public boolean checkAnswer(String ans){
        for(int i = 0 ; i< this.choices.size();i++)
            if(this.choices.get(i).isCorrect() == true &&
                    LABELS[i].equals(ans.toUpperCase()) == true)
                return true;
        return false;
    }   

    @Override
    public String toString() {
      String s = super.toString();
      for(int i =0; i< this.choices.size(); i++)
          s += String.format("%s. %s \n", LABELS[i],this.choices.get(i));
      return s;
    }
    

    /**
     * @return the choices
     */
    public List<Choice> getChoices() {
        return choices;
    }

    /**
     * @param choices the choices to set
     */
    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    
}
