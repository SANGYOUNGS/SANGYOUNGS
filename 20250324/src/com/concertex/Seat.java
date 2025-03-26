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
	
	
