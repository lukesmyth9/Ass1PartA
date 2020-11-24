/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwareengassignment1;
import java.util.*;
import org.joda.time.*;
/**
 *
 * @author lukej
 */
public class Course {
    
    String courseName;
    ArrayList<Module> modules = new ArrayList<Module>(); 
    ArrayList<Student> students = new ArrayList<Student>();
    LocalDate startDate; //jodatime
    LocalDate endDate;
    //constructor
    public Course(String courseName, String startDate, String endDate) //gets inputs for course and makes them equal to the constructor values
    {
        this.courseName = courseName;
        //this.modules = modules;
        //this.students = students;
        this.startDate = new LocalDate(startDate);
        this.endDate = new LocalDate(endDate);
    }
    
    //Mutator methods
    public void setCourseName(String courseName)//set course
    {
        this.courseName = courseName;
    }
    
    //Accessor Methods
    public String getCourseName()
    {
        return this.courseName;
    }
    public void addStudent(Student student)
    {
        students.add(student);//method to add student to student arraylist
    }
    public void printStudentsEnrolled()//method prints all students in student arraylist
    {
        System.out.println("The following students are enrolled in this course: ");
        for(Student student : students)
        {
            System.out.println("Name: " + student.getName() + " Username: " + student.getUsername()); //prints their name and username
        }
    }
    public void printModules()//method prints modules from module arraylist
    {
        System.out.println("The following Modules are enrolled in this course: ");
        for(Module module : modules)
        {
            System.out.println("Module Name: " + module.getModuleName() + " Module ID: " + module.getID());//prints mod name and id
        }
    }
    public void addModule(Module module)
    {
        modules.add(module);//add method for module to arraylist
    }
    
    public LocalDate getStartDate()
    {
        return this.startDate;//get method for startdate
    }
    public LocalDate getEndDate()
    {
        return this.endDate;//get method for startdate
    }
    
    
    public void courseInformation(Course course)//prints course information 
    {
        System.out.println("Course Name: " + course.getCourseName() + "\nStart Date: " + course.getStartDate() + "\nEnd Date: " + course.getEndDate() + "\n");//name start date and end date
       course.printStudentsEnrolled();//calls studentsenrolled function
   System.out.println("\n");
       course.printModules();//calls print module function
    }
    
}
