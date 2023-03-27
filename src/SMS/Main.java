package SMS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        ArrayList<Student> students = new ArrayList<>(
                List.of(
                        new Student(1,"Song","male",20,"Java",100),
                        new Student(2,"Messi","male",34,"Java",75),
                        new Student(3,"Neymar","male",56,"Java",85)
                )
        );
        do{
            System.out.println("===================== Student Management System ===========================");
            System.out.println("1. Insert Student to System ");
            System.out.println("2. Edit Student Information ");
            System.out.println("3. Search Student Information ");
            System.out.println("4. Delete Student Information ");
            System.out.println("5. Show Student Information ");
            System.out.println("6. Exit ");

            String strOption;
            do {
                System.out.println("Choose your Option from 1-6 : ");
                strOption = input.nextLine();
                try {
                    option = Integer.parseInt(strOption);
                    break;
                } catch (Exception ex) {
                    System.out.println("ERROR !! INVALID INPUT..... !!! TRY AGAIN.");
                }
            }while (true);
            switch (option){
                case 1:
                    System.out.println("++++++++++++++++++++ Insert Student ++++++++++++++++++++++ ");
                    Student newStudent = new Student();
                    newStudent.input(input);
                    students.add(newStudent);
                    System.out.println("successfully added..!");
                    break;
                case 2:
                    System.out.println("+++++++++++++++++++++++++++Update Student Information++++++++++++++++++++++++++");
                    int id;
                    System.out.println("Enter Student ID to Edit : ");
                    id = input.nextInt();
                    try {
                        for (int i=0;i<students.size();i++){
                            if (id==students.get(i).stuNo){
                                students.get(i).input(input);
                                System.out.println("Update Student Sccessfully....!!!!");
                            }
                        }
                    }catch (Exception ex){
                        System.out.println("ERROR !! ID CANNOT TO BE STRING");
                    }
                    break;
                case 3:
                    System.out.println("+++++++++++++++++++++++++++++++++ Search Student ++++++++++++++++++++++++++++");
                    int option1=0;
                    do{
                        System.out.println(" 1.Search by ID ");
                        System.out.println(" 2.Search by Name ");
                        System.out.println(" 3.Search by Gender ");
                        System.out.println(" 4.Search by classname ");
                        System.out.println(" 5.Exit");
                        System.out.println("Choose one Option to Search 1-5 : ");
                        String upd= input.nextLine();
                        try {
                            option = Integer.parseInt(upd);
                        }catch (Exception ex){
                            System.out.println("ERROR !! ID CANNOT TO BE STRING");
                        }
                        switch (option){
                            case 1:
                                int byID=0;
                                System.out.println("Enter ID Search : ");
                                String stuNo=input.next();
                                boolean b =false;
                                try {
                                    byID=Integer.parseInt(stuNo);
                                }catch (Exception ex){
                                    System.out.println("ERROR ID SEARCH ");
                                }
                                for (int i=0 ;i<students.size();i++){
                                    if (byID==students.get(i).stuNo){
                                        students.get(i).output();
                                    }
                                }
                                if(b){
                                    System.out.println("Search Not found....!!!!");
                                }
                                input.nextLine();
                                break;
                            case 2:
                                System.out.println("Enter By Name : ");
                                int byName=0;
                                String stuName=input.next();
                                boolean a = false;
                                try {
                                    byName=Integer.parseInt(stuName);
                                }catch (Exception ex){
                                    System.out.println(" ERROR NAME SEARCH ");
                                }
                                for (int i=0;i<students.size();i++){
                                    if (stuName.equals(students.get(i).stuName)){
                                        students.get(i).output();
                                    }
                                }
                                input.nextLine();
                                break;
                            case 3:
                                int byGender=0;

                                System.out.println("Enter By Gender : ");
                                String gender=input.next();
                                boolean c = false;
                                try {
                                    byName=Integer.parseInt(gender);
                                }catch (Exception ex){
                                    System.out.println(" ERROR NAME GENDER ");
                                }
                                for (int i=0;i<students.size();i++){
                                    if (gender.equals(students.get(i).gender)){
                                        students.get(i).output();
                                    }
                                }
                                input.nextLine();
                                break;
                            case 4:
                                String byclassroom = null;
                                boolean d = false;
                                try {
                                    byclassroom=input.nextLine();
                                    byName=Integer.parseInt(byclassroom);
                                }catch (Exception ex){
                                    System.out.println(" ERROR NAME CLASSROOM ");
                                }
                                for (int i=0;i<students.size();i++){
                                    if (byclassroom.equals(students.get(i).classroom)){
                                        students.get(i).output();
                                    }
                                }
                                input.nextLine();
                                break;
                            case 5:
                                System.out.println(" Exit program ");
                                break;
                        }
                    }while (option!=0);
                    break;
                case 4:{
                    System.out.println("++++++++++++++++++++++++++++ Remove Student ++++++++++++++++++++++++++");
                    int byID=0;
                    System.out.println("Enter ID to deleted : ");
                    String stuNo=input.next();
                    boolean b =false;
                    try {
                        byID=Integer.parseInt(stuNo);
                    }catch (Exception ex){
                        System.out.println("ERROR ID DELETED ");
                    }
                    for (int i=0 ;i<students.size();i++){
                        if (byID==students.get(i).stuNo){
                            students.remove(i);
                            b=true;
                            System.out.println("Student with the id has been removed successfully....!!!!");
                            break;
                        }
                    }
                    if(!b){
                        System.out.println("Remove not found !!!!!!");
                    }
                    input.nextLine();
                    break;
                }
                case 5:{
                        for(Student student : students){
                            student.output();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exit the program...!!");
                    break;
                default:
                    System.out.println("Wrong option !! Choose again form 1-6 !!! ");
                    break;
            }
                input.nextLine();
                System.out.println("++++++++++++ Press Enter again to continue +++++++++++++++++++++++++++++");
        }while(option!=0);
    }}
