package Englishapp;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Tester {
    public static void main(String[] args) {
       
        int chon= 0;
        do{
            System.out.println("---Menu--\n\t");
            System.out.println("1.Dang ki tai khoan \n\t");
            System.out.println("2.Luyen tap MultipleChoice");
            System.out.println("3.Luyen tap Incomplete && Conversation");
            
            System.out.println("Nhap lua chon cua ban:");
            Scanner s3 = new Scanner(System.in);
            chon = s3.nextInt();
            switch(chon){
                case 1:
                    ManagerPeople tk = new ManagerPeople();
                    tk.DangKy();
                    System.out.println(tk.getListPeople().get(0).getNgaySinh().get(Calendar.DAY_OF_MONTH));
                    boolean flag =true;
                    do{
                    if(tk.In() != null){
                        System.out.println("**Dang nhap thanh cong!");
                        flag = false;
                           }
                    else
                        System.out.println("Tai khoan hoac mat khau khong dung");
                    }while(flag);

                    GregorianCalendar ngaySinh = new GregorianCalendar(2001,01,10);


                    People s = new People("nguyen","123456","luu nhat nguyen",
                            "115 nguyen duc thuan",ngaySinh,
                            (GregorianCalendar) Calendar.getInstance());

                    System.out.println(s);
                    break;
                case 2:
                    MultipleChoice q1 = new MultipleChoice("This is ... book",Type.Adv, Level.ALL);
                    Choice a5 = new Choice("a",true);
                    Choice a6 = new Choice("the",false);
                    Choice a7 = new Choice("an",false);
                    Choice a8 = new Choice("end",false);
                    q1.addChoice(a5);
                    q1.addChoice(a6);
                    q1.addChoice(a7);
                    q1.addChoice(a8);

                    q1.shuffleChoice();
                    System.out.println(q1);
                    Scanner s1 = new Scanner(System.in);
                    System.out.println("Nhap cau tra loi:");
                    String ans = s1.next();
                    if(q1.checkAnswer(ans)==true)
                        System.out.println("Correct");
                    else
                        System.out.println("InCorrect");
                    break;
                case 3:
//                    Incomplete q0 = new Incomplete("This is ..(1).. book. I ..(2)..it  so much", 
//                Type.Adj,Level.ALL);
//        
//                    MultipleChoice q3 = new MultipleChoice(" ..(1)..",Type.Adj, Level.ALL);
//                    Choice c1 = new Choice("a",true);
//                    Choice c2 = new Choice("the",false);
//                    Choice c3 = new Choice("an",false);
//                    Choice c4 = new Choice("end",false);
//                    q3.addChoice(c1);
//                    q3.addChoice(c2);
//                    q3.addChoice(c3);
//                    q3.addChoice(c4);
//
//                    MultipleChoice q2 = new MultipleChoice(" ..(2).. ",Type.Adj, Level.ALL);
//                    Choice a1 = new Choice("love",true);
//                    Choice a2 = new Choice("loves",false);
//                    Choice a3 = new Choice("lovely",false);
//                    Choice a4 = new Choice("none of",false);
//                    q2.addChoice(a1);
//                    q2.addChoice(a2);
//                    q2.addChoice(a3);
//                    q2.addChoice(a4);
//
//                    q0.addQuestion(q3);
//                    q0.addQuestion(q2);
//                    Manager  ql = new Manager();
//                    ql.addQuestion(q0);
//            //        ql.addQuestion(q3);
//            //        ql.addQuestion(q2);
//                    Scanner s2 = new Scanner(System.in);
//                    try {
//                        ql.practiceIncompleteQuestion(s2);
//                        ql.practiceMultipleChoice(s2, 5);
//                    q0.addQuestion(q3);
//                    q0.addQuestion(q2);
//
//                    System.out.println(q0);
//                    Scanner s4 = new Scanner(System.in);
//                    for(MultipleChoice  q: q0.getQuestion()){
//                        System.out.printf("Tra loi cho cau %s \n",q.getContent());
//                        String ans = s4.next();
//                        if(q.checkAnswer(ans)==true)
//                            System.out.println("Correct");
//                        else
//                            System.out.println("InCorrect");
//                    }
//
//                        //test multipleChoice
//
//                    } catch (ClassNotFoundException ex) {
//                        Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                    break;
                default:
                    System.out.println("Chuc ban thanh cong!");
            }
        }while(chon >= 1 && chon <=3);     
}
}
        
        
    
 

    