package Englishapp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Manager {
    private List<Question> questions;
    
    public Manager(){
        this.questions = new ArrayList<>();
    }
    
    public void addQuestion(Question q){
        this.questions.add(q);
    }
    private List<Question> getQuestionClassName(String className) throws ClassNotFoundException{
        Class c= Class.forName(className);
         List<Question> k = new ArrayList<>();
        for(Question q: this.questions)
            if(c.isInstance(q))
                k.add(q);
        return k;
    }
//    private List<Question> getMultipleChoice(){
//        List<Question> k = new ArrayList<>();
//        this.questions.stream().filter((q) -> (q instanceof MultipleChoice)).forEachOrdered((q) -> {
//            k.add(q);
//        });
//        return k;
//    }
    public void practiceMultipleChoice(Scanner s,int num) throws ClassNotFoundException{
        List<Question> k = this.getQuestionClassName("Englishapp.MultipleChoice");
        Collections.shuffle(k);
        int n = k.size() > num ? num : k.size();
        for(int i = 0 ; i < n ; i++){
            MultipleChoice q = (MultipleChoice) k.get(i);
            System.out.println(q);
            
            System.out.println("Nhap cau tra loi:");
            String ans = s.next();
            
            if(q.checkAnswer(ans)==true)
                System.out.println("Correct");
            else
                System.out.println("InCorrect");
        }
    }
    public void practiceIncompleteQuestion(Scanner s) throws ClassNotFoundException{
         List<Question> k = this.getQuestionClassName("Englishapp.Incomplete");
         Collections.shuffle(k);
         if(k.size() > 0 ){
             Incomplete q = (Incomplete) k.get(0);
             System.out.println(q);
             for(MultipleChoice  mc: q.getQuestion()){
                System.out.printf("Tra loi cho cau %s \n",mc.getContent());
                String ans = s.next();
                if(mc.checkAnswer(ans)==true)
                    System.out.println("Correct");
                else
                    System.out.println("InCorrect");
            }
         }
    }
    /**
     * @return the questions
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * @param questions the questions to set
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
