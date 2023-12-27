/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;





/**
 *
 * @author furka
 */

public class Student {
    private String no;
    private String name;
    private String surname;
    
  
    public Student(){
        
    }
    public Student(String no,String name, String surname){
        this.no=no;
        this.name=name;
        this.surname=surname;
    }
    public Student(String no,String name){
        this.no=no;
        this.name=name;
        this.surname=null;
       
    }
    
    public String getNo(){
    return this.no;
}
    public String getName(){
    return this.name;
    }
    public String getSurname(){
    return this.surname;
    }   
    
    public void setNo(String numara){
    this.no=numara;
    
}
    public void setName(String isim){
    this.name=isim;
    
}
    public void setSurname(String soyisim){
    this.surname=soyisim;
    
}
    
    
   

}
