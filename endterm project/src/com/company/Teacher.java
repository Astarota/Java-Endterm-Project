package com.company;

import java.util.Scanner;

public class Teacher {
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    private int ID;
    public int choose;
    public void getTeacher(){
        System.out.println("What do you want to do?\n"+"1:Change Attendance\n"+"2:Change Grade");
        choose=sc.nextInt();
        System.out.println("ID of Student, you want to change");
        ID=sc1.nextInt();
    }
    public int getID(){
        return ID;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getChoose() {
        return choose;
    }
}
