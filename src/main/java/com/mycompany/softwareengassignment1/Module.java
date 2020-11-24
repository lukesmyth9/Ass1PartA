/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwareengassignment1;

import java.util.ArrayList;

/**
 *
 * @author lukej
 */
public class Module {
    
    
    String moduleName;
    String ID;
    ArrayList<Course> courses = new ArrayList<Course>();
    ArrayList<Student> students = new ArrayList<Student>();
    
    public Module(String moduleName, String ID)//allows to add modulename and id
    {
        this.moduleName = moduleName;
        this.ID = ID;
        //this.students = students;
        //this.courses = courses;
    }

//Mutators
    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }

public void setID(String ID)
{
    this.ID = ID;
}

//Accessors
public String getModuleName()
{
    return this.moduleName;
}
public String getID()
{
    return this.ID;
}
public void addStudentToModule(Student student)
{
    students.add(student);//add student to module student to arraylist
}
public void addCourseToModule(Course course)
{
    courses.add(course);//adds course to module
}
public void printStudents()//prints student iinfo
{
    System.out.println("Students enrolled in this module: ");
    for (Student student : students)
    {
        System.out.println("Name: " + student.getName() + " Username: " + student.getUsername());
    }
}
public void printCourses()//prints courses
{
    System.out.println("Courses that are in this module: ");
    for (Course course : courses)
    {
        System.out.println("Name: " + course.getCourseName());
    }
}
public void moduleInformation(Module module)//prints module info
{
    System.out.println("Module Name: " + module.getModuleName() + "\nModule ID: " + module.getID() + "\n");
    module.printCourses();
    System.out.println("\n");
    module.printStudents();
}
}
