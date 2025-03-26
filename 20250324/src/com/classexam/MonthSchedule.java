package com.classexam;

import java.util.Scanner;

public class MonthSchedule {
    private int nDays;
    private Day[] days;
    private Scanner scanner;
    
    public MonthSchedule(int nDays) {
        this.nDays = nDays;
        this.days = new Day[nDays];
        for(int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
        this.scanner = new Scanner(System.in);
    }
    
    public void input() {
        System.out.print("날짜(1~30)? ");
        int day = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비
        
        System.out.print("할 일(빈칸없이입력) : ");
        String work = scanner.nextLine();
        
        day--;
        if(day < 0 || day >= nDays) {
            System.out.println("잘못된 날짜입니다.");
            return;
        }
        days[day].setWork(work);
    }
    
    public void view() {
        System.out.print("날짜(1~30)? ");
        int day = scanner.nextInt();
        day--;
        if(day < 0 || day >= nDays) {
            System.out.println("잘못된 날짜입니다.");
            return;
        }
        System.out.print((day +1) + "일의 할일은 : ");
        days[day].show();
    }
    
    public void finish() {
        scanner.close();
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }
    
    public void run() {
        System.out.println(" 스케줄 관리 프로그램");
        while(true) {
            System.out.print("할일 (입력:1, 보기:2, 종료:3) ");
            int menu = scanner.nextInt();
            
            switch(menu) {
                case 1: 
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3: 
                    finish();
                    break;
                default:
                    System.out.println("잘못입력하였습니다.");
            }
        }
    }
    
    public static void main(String[] args) {
        MonthSchedule ms = new MonthSchedule(30);
        ms.run();
    }
}
