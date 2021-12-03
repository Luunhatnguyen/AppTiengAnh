package Englishapp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class ManagerPeople {
    private List<People> listPeople = new ArrayList<>();
    
    public void add(People p){
        this.getListPeople().add(p);
    }
    
    public boolean checkId(String id){
        for(int i = 0 ; i< this.getListPeople().size();i++)
            if(this.getListPeople().get(i).getId().equals(id))
                return true;
        return false;
    }
    public People checkPeople(String id,String pass){
         for(int i = 0 ; i< this.getListPeople().size();i++)
            if(this.getListPeople().get(i).getId().equals(id) && 
                    this.getListPeople().get(i).getPass().equals(pass))
                return this.getListPeople().get(i);
         return null;
    }
    public People In(){
        String id ,pass;
        System.out.println("Dang nhap tai khoan:\n");
        Scanner s = new Scanner(System.in);
        System.out.println("+Nhap id:");
        id =s.nextLine();
         System.out.println("+Nhap pass:");
        pass =s.nextLine();
        if(checkPeople(id, pass)== null)
            return null;
        else
            return checkPeople(id, pass);
        
    } 
    public void DangKy(){
        System.out.println("**Dang ki tai khoan\n");
        int day ,month,year;
        String id ,pass,hoTen,queQuan;
        GregorianCalendar ngaySinh;
        Scanner s = new Scanner (System.in);
        boolean flag = true;
        do{    
      System.out.println("+Nhap ten tai khoan: ");
      id = s.nextLine();
      if(checkId(id) )
              System.out.println("Tai khoan da ton tai");
      else
          flag = false;
            
      }while (flag);
      
      System.out.println("+Nhap mat khau: ");
      pass = s.nextLine();
      System.out.println("+Nhap ho va ten: ");
      hoTen = s.nextLine();
      System.out.println("+nhap dia chi :  ");
      queQuan = s.nextLine();
      System.out.println("+Nhap ngay thang nam sinh: ");
      day = s.nextInt();
      month = s.nextInt();
      year = s.nextInt();
      
      ngaySinh = new GregorianCalendar(year,month-1,day);
     
      People acc = new People(id, pass, hoTen, queQuan,
             ngaySinh, (GregorianCalendar) Calendar.getInstance());
      
      this.getListPeople().add(acc);
      
      System.out.println(" TAO TAI KHOAN THANH CONG !!! ");
     
                
        
        
    }

    /**
     * @return the listPeople
     */
    public List<People> getListPeople() {
        return listPeople;
    }

    /**
     * @param listPeople the listPeople to set
     */
    public void setListPeople(List<People> listPeople) {
        this.listPeople = listPeople;
    }
     public List<People> findName(String s){
        List<People> tk = null;
        for (People q : this.getListPeople()) {
            if(q.getHoTen().equals(s))
                tk.add(q);
        }
        return tk;
    }
    

}
