package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Connection cn=Connect.getConnect();
        Statement st=null;


try {

    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    Scanner sc3=new Scanner(System.in);
    Scanner sc4=new Scanner(System.in);
    Scanner sc5=new Scanner(System.in);
    Scanner sc6=new Scanner(System.in);
    Scanner sc7=new Scanner(System.in);
    Scanner sc8=new Scanner(System.in);
    Scanner sc9=new Scanner(System.in);
    Scanner sc10=new Scanner(System.in);
    Scanner sc11=new Scanner(System.in);
    Scanner sc12=new Scanner(System.in);
    Scanner sc13=new Scanner(System.in);
    Scanner sc14=new Scanner(System.in);
    Scanner sc15=new Scanner(System.in);
    Scanner sc16=new Scanner(System.in);
    Scanner sc17=new Scanner(System.in);
    Scanner sc18=new Scanner(System.in);
    Scanner sc19=new Scanner(System.in);
    Scanner sc20=new Scanner(System.in);
    Scanner sc21=new Scanner(System.in);
    Scanner sc22=new Scanner(System.in);
    Scanner sc23=new Scanner(System.in);
    Scanner sc24=new Scanner(System.in);
    Scanner sc25=new Scanner(System.in);
    Scanner sc26=new Scanner(System.in);
    Scanner sc27=new Scanner(System.in);
    Scanner sc28=new Scanner(System.in);
    Scanner sc29=new Scanner(System.in);
    Scanner sc30=new Scanner(System.in);
    Scanner sc31=new Scanner(System.in);
    String Username;
    String Password;
    String num1;

    Username="Admin";
    Password="admin";
    num1="1";
    System.out.println("Who are you?\n" + "1:Admin\n" + "2:Student\n" + "3:Teacher");
    if (sc.hasNext("Admin")) {
        System.out.println("Your login:");
        String username = sc.next();
        if (sc.hasNext("Admin")) {
            System.out.println("Your password:");
            String password = sc1.next();
            if (username.equals(Username) && password.equals(Password)) {
                System.out.println("You have entered successfully!\n" + "What do you want to do\n" +
                        "1:Make something with Teacher?\n" + "2:Make something with Student\n" +
                        "3:Make something with Staff\n" + "Please print a number");
                String num = sc2.next();
                if (num.equals(num1)) {
                    System.out.println("What do you want to do\n" + "1:Add Teacher\n" + "2:Delete Teacher");
                    String num10 = sc3.nextLine();
                    if (num10.equals("1")) {
                        System.out.println("Please print id for Teacher");
                        int TeacherID = sc4.nextInt();
                        System.out.println("Please create a username for Teacher");
                        String TeacherUser = sc5.next();
                        System.out.println("Please create a password for Teacher");
                        int TeacherPassword = sc6.nextInt();
                        System.out.println("Please add a Teacher name");
                        String TeacherName=sc7.next();
                        System.out.println("Please add a Teacher surname");
                        String TeacherSurname=sc8.next();
                        System.out.println("Please add a subject of Teacher");
                        String Subject=sc9.next();
                        System.out.println("Please add another ID");
                        int TeacherID1= sc10.nextInt();
                        String sql = "Insert into teacher_user(tu_id,t_user,t_password) values(?,?,?);";
                        String sql1 = "Insert into teacher(t_id,t_name,t_surname,school_subject,tu_id) values(?,?,?,?,?);";
                        PreparedStatement pr = cn.prepareStatement(sql);
                        pr.setInt(1, TeacherID);
                        pr.setString(2, TeacherUser);
                        pr.setInt(3, TeacherPassword);
                        pr.executeUpdate();
                        PreparedStatement pr1 = cn.prepareStatement(sql1);
                        pr1.setInt(1, TeacherID1);
                        pr1.setString(2, TeacherName);
                        pr1.setString(3, TeacherSurname);
                        pr1.setString(4, Subject);
                        pr1.setInt(5, TeacherID);
                        pr1.executeUpdate();
                    }
                    else if(num10.equals("2")){
                        System.out.println("Please write which row(id) you want to delete?");
                        int ID=sc11.nextInt();
                        int ID1=sc12.nextInt();
                        String sql="Delete from teacher_user where tu_id=?;";
                        String sql1="Delete from teacher where t_id=?;";
                        PreparedStatement pr = cn.prepareStatement(sql);
                        pr.setInt(1, ID);
                        pr.executeUpdate();
                        PreparedStatement pr2 = cn.prepareStatement(sql1);
                        pr2.setInt(1, ID1);
                        pr2.executeUpdate();
                    }
                }
                else if(num.equals("2")){
                    System.out.println("What do you want to do\n" + "1:Add Student\n" + "2:Delete Student");
                    String num10 = sc13.nextLine();
                    if(num10.equals("1")) {
                        System.out.println("Please print id for Student");
                        int StudentID = sc14.nextInt();
                        System.out.println("Please create a username for Student");
                        String StudentUser = sc15.next();
                        System.out.println("Please create a password for Student");
                        int StudentPassword = sc16.nextInt();
                        System.out.println("Please add a Student name");
                        String StudentName = sc17.next();
                        System.out.println("Please add a Student surname");
                        String StudentSurname = sc18.next();
                        System.out.println("Please add a Attendance");
                        int Attendance = sc19.nextInt();
                        System.out.println("Please add a grade");
                        int Grade = sc20.nextInt();
                        System.out.println("Please add another ID");
                        int StudentID1 = sc21.nextInt();
                        String sql = "Insert into student_user(s_id,s_username,s_password) values(?,?,?);";
                        String sql1 = "Insert into student(st_id,st_name,st_surname,st_attendance,st_grade,s_id) values(?,?,?,?,?,?);";
                        PreparedStatement pr3 = cn.prepareStatement(sql);
                        pr3.setInt(1, StudentID);
                        pr3.setString(2, StudentUser);
                        pr3.setInt(3, StudentPassword);
                        pr3.executeUpdate();
                        PreparedStatement pr1 = cn.prepareStatement(sql1);
                        pr1.setInt(1, StudentID1);
                        pr1.setString(2, StudentName);
                        pr1.setString(3, StudentSurname);
                        pr1.setInt(4, Attendance);
                        pr1.setInt(5, Grade);
                        pr1.setInt(6, StudentID);
                        pr1.executeUpdate();
                    }
                    else if(num10.equals("2")){
                        System.out.println("Please write which row(id) you want to delete?");
                        int ID2=sc22.nextInt();
                        int ID3=sc23.nextInt();
                        String sql="Delete from student_user where student.s_id=?;";
                        String sql1="Delete from student where student.st_id=?;";
                        PreparedStatement pr4 = cn.prepareStatement(sql);
                        pr4.setInt(1, ID2);
                        pr4.executeUpdate(sql);
                        PreparedStatement pr5 = cn.prepareStatement(sql1);
                        pr5.setInt(1, ID3);
                        pr5.executeUpdate(sql1);
                    }
                }
                else if (num.equals("3")) {
                    System.out.println("What do you want to do\n" + "1:Add Staff\n" + "2:Delete Staff");
                    String num10 = sc24.nextLine();
                    if (num10.equals("1")) {
                        System.out.println("Please print id for Staff");
                        int StaffID = sc25.nextInt();
                        System.out.println("Please add a Staff name");
                        String StaffName=sc26.next();
                        System.out.println("Please add a Staff surname");
                        String StaffSurname=sc27.next();
                        System.out.println("Please add a work for Staff");
                        String StaffWork=sc28.next();
                        String sql1 = "Insert into staff(staff_id,staff_name,staff_surname,staff_work) values(?,?,?,?);";
                        PreparedStatement pr1 = cn.prepareStatement(sql1);
                        pr1.setInt(1, StaffID);
                        pr1.setString(2, StaffName);
                           pr1.setString(3, StaffSurname);
                        pr1.setString(4, StaffWork);
                        pr1.executeUpdate();
                    }
                    else if(num10.equals("2")){
                        System.out.println("Please write which row(id) you want to delete?");
                        int ID1=sc29.nextInt();
                        String sql1="Delete from staff where staff_id=?;";
                        PreparedStatement pr2 = cn.prepareStatement(sql1);
                        pr2.setInt(1, ID1);
                        pr2.executeUpdate();
                    }
                }
            }
        }
    }
    else if(sc.hasNext("Student")){
        Student student=new Student();
        student.getPerson();
        if(student.getChoose()==1){
            String sql="Select*from student where student.st_id=?";
            PreparedStatement pr=cn.prepareStatement(sql);
            pr.setInt(1,student.getID());
            ResultSet rs=pr.executeQuery();
            if(rs.next()) {
                System.out.println(rs.getInt(5));
            }
        }
        else if(student.getChoose()==2){
            String sql="Select*from Student where student.st_id=?";
            PreparedStatement pr=cn.prepareStatement(sql);
            pr.setInt(1,student.getID());
            ResultSet rs=pr.executeQuery();
            if(rs.next()) {
                System.out.println(rs.getInt(4));
            }
        }
    }
    else if(sc.hasNext("Teacher")){
        int Attendance;
        int Grade;
        Teacher tc=new Teacher();
        tc.getTeacher();
        if(tc.getChoose()==1){
            String sql="Update Student set st_attendance=? where st_id=?";
            System.out.println("Attendance?");
            Attendance= sc30.nextInt();
            PreparedStatement pr=cn.prepareStatement(sql);
            pr.setInt(1,Attendance);
            pr.setInt(2,tc.getID());
            pr.executeUpdate();
        }
        if(tc.getChoose()==2){
            String sql="Update Student set st_grade=? where st_id=?";
            System.out.println("Grade?");
            Grade= sc31.nextInt();
            PreparedStatement pr=cn.prepareStatement(sql);
            pr.setInt(1,Grade);
            pr.setInt(2,tc.getID());
            pr.executeUpdate();
        }
    }
}
catch (Exception e){
            System.out.println("Got some error during connection");
        }
    }
}
