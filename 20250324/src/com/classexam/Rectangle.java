package com.classexam;

public class Rectangle {
	private  int x;
	private  int y;
	private  int widh;
	private  int height;
public Rectangle(int x , int y , int widh, int height) {
	this.x = x;
	this.y = y;
	this.widh = widh;
	this.height = height;			
}
public int squere() {
	return widh * height;
}
public void show() {
	System.out.print("(" +x  + "," + y +") 에서 크기가 " +  widh * height +  " 인 사각형 ");
}
public boolean contains(Rectangle r) {
		return 	this.x < r.x &&
				  	this.y < r.y &&
				  	this.x + this.widh > r.x +r.widh &&
				  	this.y + this.height > r.y +r.height;				
}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		r.show();
		System.out.println();
		System.out.println("s의 면적은 "+ s.squere());
		if(t.contains(r)) System.out.println("t는 r을 포함한다.");
		if(t.contains(s)) System.out.println("t는 s을 포함한다.");
	}
}
