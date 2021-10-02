package indprojecta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class IndprojectA {
    
    public static void noMethod() {
        ArrayList<Course> allCourseList = new ArrayList();
        Course c = new Course("CB13", "JAVA", "part time");
        Course c1 = new Course("CB13", "C#", "part time");
        Course c2 = new Course("CB13", "PYTHON", "part time");
        Course c3 = new Course("CB13", "PYTHON", "full time");
        Collections.addAll(allCourseList, c, c1, c2, c3);
        c.setAllList(allCourseList);
        c.setStartDate(LocalDate.parse("2021-02-15", DateTimeFormatter.ISO_DATE));
        c.setEndDate(LocalDate.parse("2021-09-14", DateTimeFormatter.ISO_DATE));
        c1.setStartDate(LocalDate.parse("2021-02-15", DateTimeFormatter.ISO_DATE));
        c1.setEndDate(LocalDate.parse("2021-09-14", DateTimeFormatter.ISO_DATE));
        c2.setStartDate(LocalDate.parse("2021-02-15", DateTimeFormatter.ISO_DATE));
        c2.setEndDate(LocalDate.parse("2021-09-14", DateTimeFormatter.ISO_DATE));
        c3.setStartDate(LocalDate.parse("2021-02-15", DateTimeFormatter.ISO_DATE));
        c3.setEndDate(LocalDate.parse("2021-05-15", DateTimeFormatter.ISO_DATE));
        Student s = new Student("Stefanos", "Dimitrakopoulos", 2500, LocalDate.parse("1994-10-19", DateTimeFormatter.ISO_DATE));
        Student s1 = new Student("Dimitris", "Papadopoulos", 2500, LocalDate.parse("1985-09-05", DateTimeFormatter.ISO_DATE));
        Student s2 = new Student("Nikos", "Papas", 2300, LocalDate.parse("1990-05-09", DateTimeFormatter.ISO_DATE));
        Student s3 = new Student("Maria", " Dima", 0, LocalDate.parse("1999-11-03", DateTimeFormatter.ISO_DATE));
        Student s4 = new Student("Kostas", " Basileiou", 1850, LocalDate.parse("1991-10-01", DateTimeFormatter.ISO_DATE));
        Student s5 = new Student("Biky", "Karra", 2500, LocalDate.parse("1994-03-27", DateTimeFormatter.ISO_DATE));
        Student s6 = new Student("Mixalis", " Mpakakis", 2500, LocalDate.parse("2000-06-20", DateTimeFormatter.ISO_DATE));
        Student s7 = new Student("Fanis", "Basilopoulos", 1000, LocalDate.parse("1989-02-08", DateTimeFormatter.ISO_DATE));
        Student s8 = new Student("Sofia", " Giannouli", 2300, LocalDate.parse("1997-05-30", DateTimeFormatter.ISO_DATE));
        Student s9 = new Student("Xristos", "Dionisopoulos", 2100, LocalDate.parse("1993-08-03", DateTimeFormatter.ISO_DATE));
        Student s10 = new Student("Basilis", " Giannoulis", 2500, LocalDate.parse("1994-11-22", DateTimeFormatter.ISO_DATE));
        ArrayList<Student> allStudentList = new ArrayList();
        ArrayList<Student> c3List = new ArrayList();
        ArrayList<Student> cList = new ArrayList();
        ArrayList<Student> c1List = new ArrayList();
        ArrayList<Student> c2List = new ArrayList();
        ArrayList<Student> doublecourseStudentList = new ArrayList();
        Collections.addAll(allStudentList, s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        s.setAllStudList(allStudentList);
        Collections.addAll(cList, s, s1, s2, s3);
        Collections.addAll(c1List, s4, s5, s6);
        Collections.addAll(c2List, s, s7, s8, s9, s10);
        Collections.addAll(c3List, s9, s10);
        
        for (int i = 0; i < cList.size(); i++) {
            for (int j = 0; j < c1List.size(); j++) {
                if (cList.get(i).equals(c1List.get(j))) {
                    doublecourseStudentList.add(cList.get(i));
                }
            }
        }
        for (int i = 0; i < cList.size(); i++) {
            for (int j = 0; j < c2List.size(); j++) {
                if (cList.get(i).equals(c2List.get(j))) {
                    doublecourseStudentList.add(cList.get(i));
                }
                
            }
            
        }
        for (int i = 0; i < cList.size(); i++) {
            for (int j = 0; j < c3List.size(); j++) {
                if (cList.get(i).equals(c3List.get(j))) {
                    doublecourseStudentList.add(cList.get(i));
                }
                
            }
            
        }
        for (int i = 0; i < c1List.size(); i++) {
            for (int j = 0; j < c2List.size(); j++) {
                if (c1List.get(i).equals(c2List.get(j))) {
                    doublecourseStudentList.add(c1List.get(i));
                }
                
            }
            
        }
        for (int i = 0; i < c1List.size(); i++) {
            for (int j = 0; j < c3List.size(); j++) {
                if (c1List.get(i).equals(c3List.get(j))) {
                    doublecourseStudentList.add(c1List.get(i));
                }
                
            }
            
        }
        for (int i = 0; i < c2List.size(); i++) {
            for (int j = 0; j < c3List.size(); j++) {
                if (c2List.get(i).equals(c3List.get(j))) {
                    doublecourseStudentList.add(c2List.get(i));
                }
                
            }
            
        }
        ArrayList<Trainer> allTrainerList = new ArrayList();
        ArrayList<Trainer> cTrainerList = new ArrayList();
        ArrayList<Trainer> c1TrainerList = new ArrayList();
        ArrayList<Trainer> c2TrainerList = new ArrayList();
        ArrayList<Trainer> c3TrainerList = new ArrayList();
        Trainer t = new Trainer("Nikos", "Georgiou");
        Trainer t1 = new Trainer("Basilis", "Bassalos");
        Trainer t2 = new Trainer("Mixalis", "Giannakoudakis");
        Trainer t3 = new Trainer("Paris", "Bassalos");
        Trainer t4 = new Trainer("Niki", "Alexiou");
        Collections.addAll(allTrainerList, t, t1, t2, t3, t4);
        t.setAllTrainerList(allTrainerList);
        Collections.addAll(cTrainerList, t, t1, t2);
        Collections.addAll(c1TrainerList, t3, t4);
        Collections.addAll(c2TrainerList, t1, t2, t3);
        Collections.addAll(c3TrainerList, t, t4);
        ArrayList<Assignment> allAsList = new ArrayList();
        ArrayList<Assignment> cAsList = new ArrayList();
        ArrayList<Assignment> c1AsList = new ArrayList();
        ArrayList<Assignment> c2AsList = new ArrayList();
        ArrayList<Assignment> c3AsList = new ArrayList();
        Assignment as = new Assignment("individual project", "part a", LocalDate.parse("2021-03-31", DateTimeFormatter.ISO_DATE));
        Assignment as1 = new Assignment("individual project", "part b", LocalDate.parse("2021-03-31", DateTimeFormatter.ISO_DATE));
        Assignment as2 = new Assignment("team project", "part a", LocalDate.parse("2021-03-31", DateTimeFormatter.ISO_DATE));
        Assignment as3 = new Assignment("team project", "part b", LocalDate.parse("2021-03-31", DateTimeFormatter.ISO_DATE));
        ArrayList<Assignment> sList = new ArrayList();
        ArrayList<Assignment> s1List = new ArrayList();
        ArrayList<Assignment> s2List = new ArrayList();
        ArrayList<Assignment> s3List = new ArrayList();
        ArrayList<Assignment> s4List = new ArrayList();
        ArrayList<Assignment> s5List = new ArrayList();
        ArrayList<Assignment> s6List = new ArrayList();
        ArrayList<Assignment> s7List = new ArrayList();
        ArrayList<Assignment> s8List = new ArrayList();
        ArrayList<Assignment> s9List = new ArrayList();
        ArrayList<Assignment> s10List = new ArrayList();
        Collections.addAll(allAsList, as, as1, as2, as3);
        as.setAllAssList(allAsList);
        Collections.addAll(cAsList, as, as1, as2, as3);
        Collections.addAll(c1AsList, as, as1, as2, as3);
        Collections.addAll(c2AsList, as, as1, as2, as3);
        Collections.addAll(c3AsList, as, as1, as2, as3);
        Collections.addAll(sList, as, as1, as2, as3);
        Collections.addAll(s1List, as, as1, as2, as3);
        Collections.addAll(s2List, as, as1, as2, as3);
        Collections.addAll(s3List, as, as1, as2, as3);
        Collections.addAll(s4List, as, as1, as2, as3);
        Collections.addAll(s5List, as, as1, as2, as3);
        Collections.addAll(s6List, as, as1, as2, as3);
        Collections.addAll(s7List, as, as1, as2, as3);
        Collections.addAll(s8List, as, as1, as2, as3);
        Collections.addAll(s9List, as, as1, as2, as3);
        Collections.addAll(s10List, as, as1, as2, as3);
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to see the list with all the Courses press 'C'");
        
        System.out.println("If you want see the list with all the Students press 'S'");
        System.out.println("If you want see the list with all the Trainers press 'T'");
        System.out.println("If you want see the list with all the Assignments press 'A'");
        System.out.println("If you want see the list with all the Studens per Course press 'SPC'");
        System.out.println("If you want see the list with all the Assignments per Course press 'APC'");
        System.out.println("If you want see the list with all the Assignments per Student press 'APS'");
        System.out.println("If you want see the list with all the Trainers per Course press 'TPC'");
        System.out.print("Give answer here: ");
        String input = sc.next();
        System.out.println(" ");
        
        boolean bool = "C".equals(input) || "S".equals(input) || "T".equals(input) || "A".equals(input) || "SPC".equals(input) || "APC".equals(input) || "APS".equals(input) || "TPC".equals(input);
        
        if (!bool) {
            System.out.println("WRONG INPUT.TRY AGAIN");
            
        } else {
            
            while (bool) {
                if (null != input) {
                    switch (input) {
                        case "C":
                            System.out.println("COURSES");
                            for (int i = 0; i < c.getAllList().size(); i++) {
                                System.out.println(c.getAllList().get(i).getTitle() + " " + c.getAllList().get(i).getStream()
                                        + " " + c.getAllList().get(i).getType());
                            }
                            break;
                        case "S":
                            System.out.println("STUDENTS");
                            for (int i = 0; i < s.getAllStudList().size(); i++) {
                                System.out.println(s.getAllStudList().get(i).getFirstName() + " " + s.getAllStudList().get(i).getLastName());
                            }
                            break;
                        case "T":
                            System.out.println("TRAINERS");
                            for (int i = 0; i < t.getAllTrainerList().size(); i++) {
                                System.out.println(t.getAllTrainerList().get(i).getFirstName() + " " + t.getAllTrainerList().get(i).getLastName());
                            }
                            break;
                        case "A":
                            System.out.println("ASSIGNMENTS");
                            for (int i = 0; i < as.getAllAssList().size(); i++) {
                                System.out.println(as.getAllAssList().get(i).getTitle() + " " + as.getAllAssList().get(i).getDescription());
                            }
                            break;
                        case "SPC":
                            System.out.println("STUDENTS PER COURSE");
                            System.out.println(" double course ");
                            System.out.println("THE FOLLOWING STUDENTS BELONG TO MORE THAN ONE COURSES!!!!!!!!!!!!");
                            for (int i = 0; i < doublecourseStudentList.size(); i++) {
                                System.out.println(doublecourseStudentList.get(i).getFirstName() + " " + doublecourseStudentList.get(i).getLastName());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 JAVA COURSE(part time)");
                            for (int i = 0; i < cList.size(); i++) {
                                System.out.println(cList.get(i).getFirstName() + " " + cList.get(i).getLastName());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 C# COURSE(part time)");
                            for (int i = 0; i < c1List.size(); i++) {
                                System.out.println(c1List.get(i).getFirstName() + " " + c1List.get(i).getLastName());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 PYTHON COURSE(part time)");
                            for (int i = 0; i < c2List.size(); i++) {
                                System.out.println(c2List.get(i).getFirstName() + " " + c2List.get(i).getLastName());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 PYTHON COURSE(full time)");
                            for (int i = 0; i < c3List.size(); i++) {
                                System.out.println(c3List.get(i).getFirstName() + " " + c3List.get(i).getLastName());
                            }
                            break;
                        case "APC":
                            System.out.println("ASSIGNMENT PER COURSE");
                            System.out.println("CB13 JAVA COURSE(part time)");
                            for (int i = 0; i < cAsList.size(); i++) {
                                System.out.println(cAsList.get(i).getTitle() + " " + cAsList.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 C# COURSE(part time)");
                            for (int i = 0; i < c1AsList.size(); i++) {
                                System.out.println(c1AsList.get(i).getTitle() + " " + c1AsList.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 PYTHON COURSE(part time)");
                            for (int i = 0; i < c2AsList.size(); i++) {
                                System.out.println(c2AsList.get(i).getTitle() + " " + c2AsList.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 PYTHON COURSE(full time)");
                            for (int i = 0; i < c3AsList.size(); i++) {
                                System.out.println(c3AsList.get(i).getTitle() + " " + c3AsList.get(i).getDescription());
                            }
                            break;
                        case "APS":
                            System.out.println("ASSIGNMENTS PER STUDENT");
                            System.out.println(s.getFirstName() + " " + s.getLastName());
                            for (int i = 0; i < sList.size(); i++) {
                                System.out.println(sList.get(i).getTitle() + " " + sList.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s1.getFirstName() + " " + s1.getLastName());
                            for (int i = 0; i < s1List.size(); i++) {
                                System.out.println(s1List.get(i).getTitle() + " " + s1List.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s2.getFirstName() + " " + s2.getLastName());
                            for (int i = 0; i < s2List.size(); i++) {
                                System.out.println(s2List.get(i).getTitle() + " " + s2List.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s3.getFirstName() + " " + s3.getLastName());
                            for (int i = 0; i < s3List.size(); i++) {
                                System.out.println(s3List.get(i).getTitle() + " " + s3List.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s4.getFirstName() + " " + s4.getLastName());
                            for (int i = 0; i < s4List.size(); i++) {
                                System.out.println(s4List.get(i).getTitle() + " " + s4List.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s5.getFirstName() + " " + s5.getLastName());
                            for (int i = 0; i < s5List.size(); i++) {
                                System.out.println(s5List.get(i).getTitle() + " " + s5List.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s6.getFirstName() + " " + s6.getLastName());
                            for (int i = 0; i < s6List.size(); i++) {
                                System.out.println(s6List.get(i).getTitle() + " " + s6List.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s7.getFirstName() + " " + s7.getLastName());
                            for (int i = 0; i < s7List.size(); i++) {
                                System.out.println(s7List.get(i).getTitle() + " " + s7List.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s8.getFirstName() + " " + s8.getLastName());
                            for (int i = 0; i < s8List.size(); i++) {
                                System.out.println(s8List.get(i).getTitle() + " " + s8List.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s9.getFirstName() + " " + s9.getLastName());
                            for (int i = 0; i < s9List.size(); i++) {
                                System.out.println(s9List.get(i).getTitle() + " " + s9List.get(i).getDescription());
                            }
                            System.out.println(" ");
                            System.out.println(s10.getFirstName() + " " + s10.getLastName());
                            for (int i = 0; i < s10List.size(); i++) {
                                System.out.println(s10List.get(i).getTitle() + " " + s10List.get(i).getDescription());
                            }
                            break;
                        case "TPC":
                            System.out.println("TRAINERS PER COURSE");
                            System.out.println("CB13 JAVA COURSE (part time)");
                            for (int i = 0; i < cTrainerList.size(); i++) {
                                System.out.println(cTrainerList.get(i).getFirstName() + " " + cTrainerList.get(i).getLastName());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 C# COURSE (part time)");
                            for (int i = 0; i < c1TrainerList.size(); i++) {
                                System.out.println(c1TrainerList.get(i).getFirstName() + " " + c1TrainerList.get(i).getLastName());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 PYTHON COURSE (part time)");
                            for (int i = 0; i < c2TrainerList.size(); i++) {
                                System.out.println(c2TrainerList.get(i).getFirstName() + " " + c2TrainerList.get(i).getLastName());
                            }
                            System.out.println(" ");
                            System.out.println("CB13 PYTHON COURSE (full time)");
                            for (int i = 0; i < c3TrainerList.size(); i++) {
                                System.out.println(c3TrainerList.get(i).getFirstName() + " " + c3TrainerList.get(i).getLastName());
                            }
                            break;
                        default:
                            break;
                    }
                }
                
                System.out.print("Give answer here: ");
                input = sc.next();
                System.out.println(" ");
            }
            
        }
    }
    
    public static void yesMethod() {
        String input, title, stream, type, firstname, lastname, description;
        int fees;
        LocalDate dob, subd;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Give course title: ");
        input = scan.next();
        title = input;
        System.out.print("Give course stream: ");
        input = scan.next();
        stream = input;
        System.out.print("Give course type: ");
        input = scan.next();
        type = input;
        Course c1 = new Course(title, stream, type);
        ArrayList<Course> clist = new ArrayList();
        clist.add(c1);
        System.out.println(" ");
        System.out.print("Give course title: ");
        input = scan.next();
        title = input;
        System.out.println(" ");


        
        System.out.print("Give course stream: ");
        input = scan.next();
        stream = input;
        System.out.print("Give course type: ");
        input = scan.next();
        type = input;
        Course c2 = new Course(title, stream, type);
        clist.add(c2);
        Course c = new Course();
        c.setAllList(clist);
        System.out.println("Give trainer for course " + c1.getTitle() + " " + c1.getStream() + " " + c1.getType());
        System.out.print("give trainers firstname: ");
        input = scan.next();
        firstname = input;
        System.out.print("give trainers lastname: ");
        input = scan.next();
        lastname = input;        
        Trainer t1 = new Trainer(firstname, lastname);
        ArrayList<Trainer> tlist=new ArrayList();
        ArrayList<Trainer> tp1list=new ArrayList();
        ArrayList<Trainer> tp2list=new ArrayList();
        
       tp1list.add(t1);
       tlist.add(t1);
        System.out.println("Give trainer for course " + c2.getTitle() + " " + c2.getStream() + " " + c2.getType());
        System.out.print("give trainers firstname: ");
        input = scan.next();
        firstname = input;
        System.out.print("give trainers lastname: ");
        input = scan.next();
        lastname = input;
        Trainer t2 = new Trainer(firstname, lastname);
       tlist.add(t2);
       tp2list.add(t2);
        Trainer t = new Trainer();
        t.setAllTrainerList(tlist);
       
        Student s = new Student();
        System.out.println("Give students for course " + c1.getTitle() + " " + c1.getStream() + " " + c1.getType());
        System.out.print("give students firstname: ");
        input = scan.next();
        firstname = input;
        System.out.print("give students lastname: ");
        input = scan.next();
        lastname = input;
        System.out.print("give students tuition fees(int): ");
        input = scan.next();
        fees = Integer.parseInt(input);
        System.out.print("give students date of birth(yyyy-mm-dd): ");
        input = scan.next();
        dob = LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
        Student s1 = new Student(firstname, lastname, fees, dob);
        ArrayList<Student> slist=new ArrayList();
        ArrayList<Student> s1list=new ArrayList();
        ArrayList<Student> s2list=new ArrayList();
        slist.add(s1);
        s1list.add(s1);
        System.out.println("Give students for course " + c1.getTitle() + " " + c1.getStream() + " " + c1.getType());
        System.out.print("give students firstname: ");
        input = scan.next();
        firstname = input;
        System.out.print("give students lastname: ");
        input = scan.next();
        lastname = input;
        System.out.print("give students tuition fees(int): ");
        input = scan.next();
        fees = Integer.parseInt(input);
        System.out.print("give students date of birth(yyyy-mm-dd): ");
        input = scan.next();
        dob = LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
        Student s2 = new Student(firstname, lastname, fees, dob);
        slist.add(s2);
        s1list.add(s2);
        System.out.println("Give students for course " + c2.getTitle() + " " + c2.getStream() + " " + c2.getType());
        System.out.print("give students firstname: ");
        input = scan.next();
        firstname = input;
        System.out.print("give students lastname: ");
        input = scan.next();
        lastname = input;
        System.out.print("give students tuition fees(int): ");
        input = scan.next();
        fees = Integer.parseInt(input);
        System.out.print("give students date of birth(yyyy-mm-dd): ");
        input = scan.next();
        dob = LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
        Student s3 = new Student(firstname, lastname, fees, dob);
        slist.add(s3);
        s2list.add(s3);
        System.out.println("Give students for course " + c2.getTitle() + " " + c2.getStream() + " " + c2.getType());
        System.out.print("give students firstname: ");
        input = scan.next();
        firstname = input;
        System.out.print("give students lastname: ");
        input = scan.next();
        lastname = input;
        System.out.print("give students tuition fees(int): ");
        input = scan.next();
        fees = Integer.parseInt(input);
        System.out.print("give students date of birth(yyyy-mm-dd): ");
        input = scan.next();
        dob = LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
        Student s4 = new Student(firstname, lastname, fees, dob);
        slist.add(s4);
        s.setAllStudList(slist);
        s2list.add(s4);
        
        System.out.println("Give assignment for course " + c1.getTitle() + " " + c1.getStream() + " " + c1.getType());
        System.out.print("give assignment title: ");
        input = scan.next();
        title = input;
        System.out.print("give assignment description: ");
        input = scan.next();
        description = input;
        System.out.print("give assignment submission date: ");
        input = scan.next();
        subd = LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
        Assignment a1 = new Assignment(title, description, subd);
        ArrayList<Assignment> alist= new ArrayList();
        ArrayList<Assignment> a1list= new ArrayList();
        ArrayList<Assignment> a2list= new ArrayList();
        alist.add(a1);
        a1list.add(a1);
        
        System.out.println("Give assignment for course " + c2.getTitle() + " " + c2.getStream() + " " + c2.getType());
        System.out.print("give assignment title: ");
        input = scan.next();
        title = input;
        System.out.print("give assignment description: ");
        input = scan.next();
        description = input;
        System.out.print("give assignment submission date: ");
        input = scan.next();
        subd = LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
        Assignment a2 = new Assignment(title, description, subd);
          alist.add(a2);
        a2list.add(a2);
        Assignment a = new Assignment(title, description, subd);
        a.setAllAssList(alist);
       
        System.out.println("COURSES");
        for (int i = 0; i < c.getAllList().size(); i++) {
            System.out.println(c.getAllList().get(i).getTitle() + " " + c.getAllList().get(i).getStream() + " " + c.getAllList().get(i).getType());
            
        }
        System.out.println(" ");
        System.out.println("STUDENTS");
        for (int i = 0; i < s.getAllStudList().size(); i++) {
            System.out.println(s.getAllStudList().get(i).getFirstName() + " " + s.getAllStudList().get(i).getLastName());
        }
        System.out.println(" ");
        System.out.println("TRAINERS");
        for (int i = 0; i < t.getAllTrainerList().size(); i++) {
            System.out.println(t.getAllTrainerList().get(i).getFirstName() + " " + t.getAllTrainerList().get(i).getLastName());
        }
        System.out.println(" ");
        System.out.println("ASSIGNMENTS");
        for (int i = 0; i < a.getAllAssList().size(); i++) {
            System.out.println(a.getAllAssList().get(i).getTitle() + " " + a.getAllAssList().get(i).getDescription());
        }
         System.out.println(" ");
         System.out.println(" STUDENTS PER COURSE");
                         
            System.out.println(c.getAllList().get(0).getTitle() + " " + c.getAllList().get(0).getStream() + " " + c.getAllList().get(0).getType());
                            for (int i = 0; i < s1list.size(); i++) {
             System.out.println(s1list.get(i).getFirstName()+" "+s1list.get(i).getLastName());
            
        }
            System.out.println(c.getAllList().get(1).getTitle() + " " + c.getAllList().get(1).getStream() + " " + c.getAllList().get(1).getType());
                            for (int i = 0; i < s2list.size(); i++) {
             System.out.println(s2list.get(i).getFirstName()+" "+s2list.get(i).getLastName());
            
        }
                            System.out.println("TRAINERS PER COURSE");
                            
            System.out.println(c.getAllList().get(0).getTitle() + " " + c.getAllList().get(0).getStream() + " " + c.getAllList().get(0).getType());
                            for (int i = 0; i < tp1list.size(); i++) {
             System.out.println(tp1list.get(i).getFirstName()+" "+tp1list.get(i).getLastName());
            
        }
            System.out.println(c.getAllList().get(1).getTitle() + " " + c.getAllList().get(1).getStream() + " " + c.getAllList().get(1).getType());
                            for (int i = 0; i < tp2list.size(); i++) {
             System.out.println(tp2list.get(i).getFirstName()+" "+tp2list.get(i).getLastName());
            
        }
                            System.out.println("ASSIGNMENT PER COURSE");
                            
            System.out.println(c.getAllList().get(0).getTitle() + " " + c.getAllList().get(0).getStream() + " " + c.getAllList().get(0).getType());
                            for (int i = 0; i < a1list.size(); i++) {
             System.out.println(a1list.get(i).getTitle()+" "+a1list.get(i).getDescription());
            
        }
            System.out.println(c.getAllList().get(1).getTitle() + " " + c.getAllList().get(1).getStream() + " " + c.getAllList().get(1).getType());
                            for (int i = 0; i < a2list.size(); i++) {
             System.out.println(a2list.get(i).getTitle()+" "+a2list.get(i).getDescription());
            
        }
          System.out.println("ASSIGNMENT PER STUDENT");
          
                            for (int i = 0; i < s1list.size(); i++) {
             System.out.println(s1list.get(i).getFirstName()+" "+s1list.get(i).getLastName());
               for (int k = 0; k < a1list.size(); k++) {
             System.out.println(a1list.get(k).getTitle()+" "+a1list.get(k).getDescription());
            
        }
        }
          
                            for (int i = 0; i < s2list.size(); i++) {
             System.out.println(s2list.get(i).getFirstName()+" "+s2list.get(i).getLastName());
                 for (int l = 0; l < a2list.size(); l++) {
             System.out.println(a2list.get(l).getTitle()+" "+a2list.get(l).getDescription());
            
        }
        }
                           
                     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to insert data press 'Y'");
        System.out.println("if you dont want to insert data press 'N'");
        System.out.print("Give answer here: ");
        String input1 = scanner.next();
        if (null == input1) {
            System.out.println("wrong input");
        } else {
            switch (input1) {
                case "Y":
                    yesMethod();
                    break;
                case "N":
                    noMethod();
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
        }
    }
}
