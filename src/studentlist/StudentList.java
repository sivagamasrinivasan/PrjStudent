/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author sivagamasrinivasan
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // define and print 3 student details
        // name , id - Student
        Student s1 = new Student();
        s1.setName("prab");
        s1.setId(123);
        Student s2 = new Student();
        s2.setName("nardeep");
        s2.setId(1213);
        Student s3 = new Student();
        s3.setName("saran");
        s3.setId(1235);
        // print stde details name , id using array-cannot store 
        Student[] list = new Student[3];//array of object declaration
        //store object of student class
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
           System.out.println(list[i].getName() +" "+list[i].getId()); 
        }
    }
    
}
