package com.q3tech.SuperPower;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


	class Studentt implements Serializable
    {
        String name;
        int rollno;
        String school;
        
        public Studentt(String name, int rollno, String school)
        {
            System.out.println("111111");
            this.name=name;
            this.rollno=rollno;
            this.school=school;
        }
        
        public void show()
        {
            System.out.println("------------Student Details-------------");
            System.out.println("Name : "+  name);
            System.out.println("Roll No : "+  rollno);
            System.out.println("School : "+  school);
        }
    }
    public class Serialization 
    {
        public static void main(String[] args) throws Exception
        {
            //-------------------Serialization----------------------------------------
            FileOutputStream fos=new FileOutputStream("C:\\fileJAVA\\student.txt");
            
            Studentt s1=new Studentt("Deepak", 101, "Smart Programming");
            
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s1);
            
            //-------------------Deserialization------------------------------------
            
            FileInputStream fis=new FileInputStream("C:\\fileJAVA\\student.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Studentt s=(Studentt)ois.readObject();
            s.show();
          
    }}
    
    
    
    
    