package com.concertex;

public class Seat {
    
    private String name;
    
    public Seat() { // 생성자 목적은 초기화
        name = null;
    }

    public String getName() {
        return name;
    }

    public void cancel() {
        name = null;        
    }
    
    public void reserve(String name) {
        this.name = name;
    }
    
    public boolean isOccupied() {
        if(name == null) { // 좌석이 예약되어 있으면 true , 없으면 false
            return false;
        } else { // 좌석이 예약되어 있으면
            return true;
        }            
    }
    
    public boolean match(String name) {
        // 내가 입력한 이름이 클래스 저장된 이름이 같나
        return name.equals(this.name);
        // 같으면 이름을 입력한다.
    }
}
/*
 * 문제: 《GPT 윈터의 업무 과부하 판별기》 GPT 윈터는 오늘도 업무에 시달리고 있다. 업무량(workload)과
 * 스트레스(stress)를 입력받아, 과부하 여부를 boolean으로 판단하고 그 결과에 따라 출력 메시지를 다르게 보여주자.
 * 
 * 📦 클래스 이름: WinterGpt 🔐 멤버 변수 private String name = "윈터" (고정)
 * 
 * private int workload
 * 
 * int stress
 * 
 * 
 * boolean overload ← 내부에서 조건에 따라 판단
 * 
 * ✅ 조건 workload >= 75 && stress >= 65 → overload = true
 * 
 * 아니면 overload = false
 * 
 */