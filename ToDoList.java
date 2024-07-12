package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList{
    static Scanner sc;
    static ArrayList<String> tasks;
    static ArrayList<String> helper;
    static ArrayList<ArrayList<String>> ListOfList;
    static ArrayList<String> ast;
    static int c;
    static int cnt;
    static int indx;
    static String t;



    public static void main(String[] args) {
        System.out.println("\ud83d\udc4b Welcome to your To Do Tasks manager!!");

        System.out.println("What do you want?? (Chahate kya hain aap)??");

        int choice;
        do {
            System.out.println("Please choose an option\n");
            System.out.println("1.Create a To Do List ");
            System.out.println("2.Use To Do List");
            System.out.println("3.Remove To Do list");
            System.out.println("4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ohh great! Let's create a new To Do List !! ");
                    ListOfList.add(cnt, create());
                    System.out.println(ListOfList);
                    break;
                case 2:
                    System.out.println("Which To-Do List you want to use:");
                    System.out.println(ListOfList);
                    System.out.println("Enter the Index of the list You want to use:");
                    indx = sc.nextInt();
                    ast = (ArrayList)ListOfList.get(indx);
                    System.out.println(ast);
                    call();
                    System.out.println(ListOfList);
                    break;
                case 3:
                    System.out.println("Enter the Index of the List You want to remove:");
                    System.out.println(ListOfList);
                    int ind = sc.nextInt();
                    ListOfList.remove(ind);
                    System.out.println(ListOfList);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ABEY BHADWE \ud83d\ude20 VALID CHOICE ENTER KR..SHURU ME NI PADHA GYA TUJHPE");
            }
        } while(choice >= 0);

    }

    public static void call() {
        label33:
        do {
            System.out.println("Please choose an option\n");
            System.out.println("1.Enter a task");
            System.out.println("2.Remove a task");
            System.out.println("3.Mark \u2705 the completed tasks");
            System.out.println("4.Exit the ToDoList App");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    sc.nextLine();
                    System.out.println(ast);
                    System.out.println("Enter the task You want to add in the list");
                    t = sc.nextLine();
                    ast.add(t);
                    ListOfList.set(indx, ast);
                    System.out.println(ListOfList);
                    break;
                case 2:
                    System.out.println(ast);
                    System.out.println("Enter the index of the task you want to remove");
                    int remIdx = sc.nextInt();
                    ast.remove(remIdx);
                    System.out.println(ast);
                    break;
                case 3:
                    System.out.println(ast);
                    System.out.println("Enter the index of the task you want to mark as complete \u2705: ");
                    int ix = sc.nextInt();

                    int i;
                    for(i = 0; i <= ix - 1; ++i) {
                        System.out.println((String)ast.get(i));
                    }

                    System.out.println((String)ast.get(ix) + " \u2705");
                    i = ix + 1;

                    while(true) {
                        if (i >= ast.size()) {
                            continue label33;
                        }

                        System.out.println((String)ast.get(i));
                        ++i;
                    }
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ABEY BHADWE \ud83d\ude20 VALID CHOICE ENTER KR..SHURU ME NI PADHA GYA TUJHPE");
            }
        } while(c >= 0);

    }

    public static ArrayList<String> create() {
        System.out.println("Enter the number of tasks");
        int no_of_tasks = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= no_of_tasks; ++i) {
            System.out.println("Add task number:" + i);
            String task_to_add = sc.nextLine();
            tasks.add(task_to_add);
        }

        helper = (ArrayList)tasks.clone();
        tasks.clear();
        ++cnt;
        return helper;
    }

    static {
        sc = new Scanner(System.in);
        tasks = new ArrayList();
        helper = new ArrayList();
        ListOfList = new ArrayList();
        ast = new ArrayList();
        c = 0;
        cnt = 0;
    }
}

