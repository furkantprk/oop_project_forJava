/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nesneye_yonelik;



import database.Sutun;
import database.Student;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author furka
 */
public class Nesneye_yonelik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       Student s1=new Student();
       s1.setNo("456");
       s1.setName("Yavuz");
       s1.setSurname("Gürleyük");
      
      
       Student s2=new Student("123","Furkan");
       s2.setNo("232");
       
       Student s3=new Student("789","Ecrin","Yetim");
       
       List<Student> students = new ArrayList<>();
       students.add(s1);
       students.add(s2);
       students.add(s3);
       
        
       for(int i=0;i<students.size();i++){
           Student student=students.get(i);
           
           System.out.println("No:" + student.getNo()+" Name:" + student.getName()+ " Surname:"+student.getSurname());
           
       }
        System.out.println(s2.getNo());
       
        Sutun c1=new Sutun(students);
        c1.NumaraYazdir();
        c1.IsimYazdir();
        c1.SoyIsimYazdir();
        
        
       
        
    }
    
    
}
