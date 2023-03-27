package SMS;

import java.util.Scanner;

class Student{
    int stuNo;
    String stuName;
    String gender ;
    int age;
    String classroom;
    float score;
    Student(){}

    public Student(int stuNo, String stuName, String gender, int age, String classroom, float score) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.gender = gender;
        this.age = age;
        this.classroom = classroom;
        this.score = score;
    }


    void input(Scanner input) {
        boolean isValid = false;
        do {
            String strId;
            System.out.println("Enter ID : ");
            try {
                strId = input.next();
                stuNo = Integer.parseInt(strId);
                isValid = true;
            } catch (Exception ex) {
                System.out.println("ERROR !! ID CANNOT TO BE STRING ");
            }
            String strName;
            do {
                try {
                    System.out.println("Enter Name : ");
                    stuName = input.next();
                    stuNo = Integer.parseInt(stuName);
                    System.out.println("ERROR !! ID CANNOT TO BE INTEGER!");
                } catch (Exception ex) {
                    break;
                }
            } while (true);
            stuName = input.nextLine();
            System.out.println(" Enter your gender ");
            gender = input.nextLine();
            System.out.println("Enter Age : ");
            age = input.nextInt();
            input.nextLine();
            String Classroom;
            do {
                try {
                    System.out.println("Enter Classroom : ");
                    classroom = input.next();
                    stuNo = Integer.parseInt(classroom);
                    System.out.println("ERROR !! ID CANNOT TO BE INTEGER!");
                } catch (Exception ex) {
                    break;
                }
                System.out.println(" Enter your score : ");
                score = input.nextFloat();
            } while (true);
            } while (!isValid);
    }
    void output(){
        System.out.println(stuNo+" "+stuName+" "+gender+" "+age+" "+classroom+" "+score);
    }
}

