/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author furka
 */
public class Sutun {
    private List<String> numbers= new ArrayList<>();
    private List<String> names= new ArrayList<>();
    private List<String> surnames= new ArrayList<>();
    private List<Student> student=new ArrayList<>();
  

    public Sutun(List<Student> student){
        this.student=student;
        for(int i=0; i<student.size();i++){
            Student student1=student.get(i);
        numbers.add(student1.getNo());
        names.add(student1.getName());
        surnames.add(student1.getSurname());
       
        }
        
    }
   
    
  public void NumaraYazdir(){
      System.out.println("BİRİNCİ SÜTÜN ELEMANLARI(NUMARALAR):"+ numbers);
  }
   public void IsimYazdir(){
       System.out.println("İKİNCİ SÜTÜN ELEMANLARI(İSİMLER):"+names);
   }
   public void SoyIsimYazdir(){
       System.out.println("ÜÇÜNCÜ SÜTÜN ELEMANLARI(SOY İSİMLER):"+surnames);
   }

}
   
    
   


