package com.yedam.exam;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
	
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		

		
		
		// 🍑🍑🍑🍑🍑🍑🍑🍑 이 부분을 이해해야 이 문제를 풀 수 있음 🍑🍑🍑🍑🍑🍑🍑🍑
		
		// 주사위 숫자가 5까지 있는것도 있고, 최대 10까지 있는것도 있는거임..^^ 우리가 알고있는 1~6짜리 주사위가 아니라..
		
		// while문 돌리기 전에, 주사위 굴려서 나온 숫자를 담을 배열을 선언해야 함
		int[] dice = null; // dice[] -> 주사위의 각 숫자별로 몇 번씩 나왔는지를 기록
						   // 변동되는 건 무엇?
						   // index는 한 번 설정되면 이후로 변동X
						   // 각 index별로 가지는 값이 변동됨
		// index -> 주사위의 각 숫자와 연동시킴
		// index별로 가지는 값 -> 주사위의 각 숫자가 가지는 굴러간 횟수
		
		// 🍑🍑🍑🍑🍑🍑🍑🍑 이 부분을 이해해야 이 문제를 풀 수 있음 🍑🍑🍑🍑🍑🍑🍑🍑
		
		int size = 0; // selectNo 1, 2에서 사용됨
					  // 주사위 크기가 5, 7 등 어떻게 생성되느냐에 따라 가져올 수가 결정되기 때문에
		
		while(run) {
			System.out.println("=== 1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.print("메뉴> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) { // 1) 주사위 크기: 5~10의 숫자를 입력받고, 범위를 벗어날 경우 범위 안내 메세지 출력
			// 입력받은 만큼을 배열 크기로 선언
				size = Integer.parseInt(sc.nextLine());
				if(size >= 5 && size <= 10) {
					dice = new int[size];
				}else {
					System.out.println("주사위 크기는 5~10 사이만 가능합니다.");
				}
				
			// 1번에서 지정한 만큼 주사위 크기를 정하고
			// 2번으로 주사위 계속 굴리는 것! 그러다 5가 나오면 멈추고..
			}else if(selectNo == 2) { // 2) 주사위 굴리기(-> 주 기능!!) : 5가 나올 때까지 주사위를 몇 번 굴리는지 구하고 굴린 횟수 출력하기
				int count = 0;
				while(true) {
					int num = (int)(Math.random() * size) + 1; // 1번에서 생성된 크기와 같이 움직여야 하기 때문에 특정 숫자가 아니라 size라고 입력.
					count++;
					// 숫자와 인덱스는 시작점이 다름. num은 단순 숫자
					// 이걸 인덱스로 바꾸려면 num-1을 하면 됨
					// 인덱스 = 내가 말하는 숫자 - 1
					// 인덱스 + 1 = 내가 말하는 숫자
					
					dice[num-1] = dice[num-1] + 1; 
					// 각 숫자별로 나온 횟수를 저장하는 변수가 필요. 1~6이라면 6개가 필요.
					// 개별로 변수를 선언하는 것 보다는 배열로 처리하는게 좋음.
					// 근데 배열로 처리하니까 여기서 뭐가 1인지, 뭐가 2인지를 모르겠음.
					// 숫자 = 정수. 1씩 증가
					// 인덱스 = 0부터 시작하는 정수. 1씩 증가 -> 둘이 규칙이 비슷함
					
					// 몇 번 담았는지 체크하기 위한 용도. 3번이면 3번 자리에 +1 해주면 됨
					if(num == 5) break;
				}
				System.out.println("5가 나올 때까지 주사위를 "+count+"번 굴렸습니다.");
			}else if(selectNo == 3) { // 3) 메뉴 2에서 각 주사위 수별로 몇 번씩 나왔는지 결과 출력
				// for문을 이용해 해당 배열의 모든 값을 출력하면 됨
				for(int i=0; i<dice.length; i++) {
					System.out.println((i+1) + "은" + dice[i] + "번 나왔습니다.");
				}
			}else if(selectNo == 4) { // 4) 메뉴 2에서 가장 많이 나온 수가 몇인지 구하고 출력 (단, 가장 많이 나온 수가 여러개일 경우 가장 작은 수를 출력)
				// 최댓값을 찾으라는 말
				int maxCount = dice[0]; // 나온 횟수
				int maxIndex = 0; // 나온 수(인덱스로 구하는 것) (cm랑 m랑 본질적인 값은 같음. 인덱스랑 우리가 아는 숫자도 같은 넉김~)
				for(int i=0; i<dice.length; i++) {
					 // 가장 많이 나온 횟수 구하기
					if(maxCount < dice[i]) { // 3. <= 이 아니기 때문에 <는 나보다 큰 경우에만 돌아감.(?) 아래에 바로 maxIndex 써도 될 듯
						maxCount = dice[i]; 
						// 1. 횟수가 제일 많은 수들 중 가장 큰 숫자 출력
						maxIndex = i; // 이렇게 하면 인덱스가 0부터 시작해 큰 수로 올라가기 때문에 가장 마지막에 많이 나온 수가 maxIndex에 들어가게 됨(가장 작은 수 출력 불가능)
					}
				}
				System.out.println("가장 많이 나온 수는 " + (maxIndex+1) + "입니다.");
//				// 2. 횟수가 제일 많은 수들 중 가장 작은 숫자 출력
//				for(int i=0; i<dice.length; i++) {
//					if(maxCount == dice[i]) {
//						maxIndex = i; // 내 뒤에 같은 횟수를 가진 값이 있어도 제일 낮은 숫자가 출력되고 끝남(뒤까지 가지 않음!)
//						break;
//					}
//				}
			}else if(selectNo == 5) { // 5) 종료
				run = false;
			}else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				System.out.println("확인 후 다시 입력하시기 바랍니다.");
			}
		}
		System.out.println("프로그램 종료");
		
		
	}
}
