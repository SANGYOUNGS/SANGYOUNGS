package com.array;
/*
 *  2차원 배열(다차원배열)
 * 
 * 	선언
 * 		자료형에[][] 배열명;
 * 또는 자료형 배열명[][];
 * 또는 자료형 [] 배열명[];
 * 
 * 초기화 
 * 		배열명 = new [행][열]
 * 		배열명 자료형[행][]; //가변 배열 , 레기드배열 , 비정형 배열
 * 		배열명 = {{1,2,},{3,4}}
 * 		
 */
public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test; // 배열선언
		test = new int[2][3];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		for(int i = 0 ; i < test.length; i++) { // 행 => i 
			for(int j = 0; j < test[i].length; j++) { //열 => j
				System.out.print(test[i][j]+"\t");
			}
			System.out.println();
		}
		/*  0 0 0 
		 *  0 0 0
		 *
		 * 
		 */
		
		
		
		
		
	
	}

}
