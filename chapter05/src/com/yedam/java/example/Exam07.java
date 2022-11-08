package com.yedam.java.example;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// 로또 번호를 예측하는 프로그램
		// 1~45까지의 수 중 랜덤으로 6개를 가져올 것
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		// 로또는 실수가 없으니까 int배열인 numList를 만들고 크기는 아직 모르니까 null 하자
		int[] numList = null;
//		int indexOfList = -1; // 인덱스를 새로 만들땐 초기값이 -1인데 (증감을 앞에 처리하게 되면? 뒤인가..? 여튼 둘 중 하나일때 0이면 쓸 수가 없기 때문임)
		int count = 0; // 카운트는 왜 0부터일까?
		
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.새로고침 | 2.번호예측 | 3.번호삭제 | 4. 번호출력 | 5.분석 | 6.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) { // 로또 번호를 담을 수 있는 배열 초기화 (무조건 1번 실행해야함!)
				numList = new int[6]; // 기존에 다른 배열이 있든 말든 무시하고 새로운거 하나 생성~
				count = 0; // count를 0으로 초기화 해 줘야 메뉴에서 1.새로고침을 선택했을 때, 기존에 count수 차던게 유지 안 되고 리셋됨.
				// 기존의 객체가 사라지는건 아님! 그냥 덩그러니 있고(자바가 알아서 처리)
				// 새로 만든 객체가 자기의 주소를 numList한테 줌
			}else if(selectNo == 2) { // 1~45 중에 랜덤한 값을 하나씩 가져옴
				// 배열의 크기만큼 하나하나 값을 받아올 경우. 사용자가 많이 입력한다면 어느 순간 배열 크기보다 더 많은 값이 적힐 수 있음! 그런걸 제어하기 위한게 필요
				// count는 무한정 늘어날 수 없음.(배열 길이만큼만!) if문 하나 더 필요(이중if문)
				if(count < numList.length) { // count로 몇 개 들어갔는지 확인
					// count가 배열 크기보다 작을때만 이 if문이 동작해서 숫자를 받아와야 함 -> count가 더 커질 경우: else의 "더이상 숫자를~" 출력
					int num = (int)(Math.random() * 45) + 1; // 시작하는 값:1, 45내에서 가져와야하니까 * 45
	//				numList[] = num; // 값을 하나씩 받아와야 함
					numList[count++] = num; // 제일 처음은 설정해 둔 count의 초기값(0)을 count에 넣고, 대입이 끝나면 ++에 의해 count값이 1 증가함 0 -> 1 -> 2 ...
					System.out.println("현재 가져온 수의 개수: "+ count);
				}else {
					System.out.println("더이상 숫자를 가져올 수 없습니다.");
				}
			}else if(selectNo == 3) { // 기존 값들 중 가장 최근 값 1개 삭제
				// numList[] = 0; // int는 삭제가 안 되니까 값을 0으로 대체해버리겠다는 뜻. 1~45를 받아오니까 0은 필요없는 수라 대체 가능.
				// 몇번째까지 들어있는지는 모름
				// count = 6이라면 -> numList의 인덱스는 5까지 들어가있음
				// 따라서 index = count - 1 // (count-1) = (--count) 같은말임
				numList[--count] = 0; // 기존의 count 값에 -1을 해야 마지막을 삭제할 수 있음
				System.out.println("현재 가져온 수의 개수: " + count);
			}else if(selectNo == 4) { // 배열의 값을 전부 출력
				System.out.println("현재 가지고 있는 수의 개수: " + count);
				for(int i=0; i<count; i++) { // length해도 됨.
					// count까지 출력하는 이유: 무의미한 값인 0까지 출력하는건 글코.. 그래서 현재 가지고 있는 개수까지만 출력하기 위해.
					System.out.print(numList[i]+" ");
				}
				System.out.println();
			}else if(selectNo == 5) { // 중복유무와 중복된 값이 있다면 몇 번 중복되었는지
				int[] list = new int[45]; // 크기가 45인 새 배열 만들어버림
				// 45명의 후보를 두고, 6명의 유권자가 투표를 해서 실제로 누구에게 투표했는지 개표해보는거라 생각하면 됨
				// 3에 투표한 유권자가 2명이라면(로또 번호 두개가 3으로 같다면),
				// 3번 후보(list의 45개 칸 중 3번째 칸)에 두 표가 들어가는 것.
				
				// for문을 이용한 개표 ㅎ
				// 이 for문은: 각 값이 몇 개씩 존재하는지 체크
				for(int i=0; i<count; i++) { // 기존에 가지고 있는 값만큼만
					int index = numList[i] - 1;
					list[index]++;
					// numList[] = 랜덤함수를 통해 가지고 온 값. 1,2,3,4,...,45중의 수를 값으로 가지고 올 수 있음.
					// 인덱스도 0,1,2,3,...44임.
					// ex) numList가 가지고 있는 값 = 3, 2, 1, 5, 5, 4
					// list라는 배열을 만듦. 크기는 45. 이 list의 인덱스는 0~44까지임.
					// 내부에 진짜 값이 들어있는지는 관계없음
					// numList의 값들에 -1을 하면 = 2 1 0 4 4 3 (인덱스화 시키는거임)
					// list의 인덱스 칸과 numList-1 한 것들을 비교하면 중복을 찾을 수 있음
					// 인덱스를 numList가 가질 수 있는 값이라고 생각하는거임!
					// 우리가 가져오는 수가 1~45의 정수이고, 1씩 증가하는 성질을 이용한 것.
					// 0번칸에 하나, 1번칸에 하나, 2번칸 하나, 3번칸 하나, 4번칸에 두개가 된거임! 그래서 4번이 두개 중복된것.
					// 인덱스 구하기
				}
				
				// 이 for문은: 개표상황을 정리해서 보여줌
				boolean isChecked = false; // 중복이 안 될 경우도 출력하기 위해 boolean타입 선언
				for(int i=0; i<list.length; i++) {
					if(list[i] <= 1) continue; // 1보다 작거나 같은건 필요없음. 제끼면 됨! 중복이라면 2개 이상이 되어야 하기 때문
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n", (i+1), list[i]);
					isChecked = true;
					// printf 출력문이랑 isChecked가 true로 바뀌는건 세트임!
					// 중복이 있다면 printf를 출력하고, isChecked를 true로 바꿔서
					// 바로 밑의 if 문이 if(false)가 되어 "중복 값이 존재하지 않습니다."를 출력하지 않음!
				}
				// 중복이 존재하지 않는 경우 출력
				// if문은 false일 때 실행되지 않음!!!!! (true일때만 실행됨)
				// 중복이 없으면 printf세트는 실행 안 되고, isChecked는 처음 지정한 값 그대로 false니까
				// !isChecked라 반전에 의해 true가 되어 if문이 출력되는 것.
				if(!isChecked) { 
					System.out.println("중복 값이 존재하지 않습니다.");
				}
			}else if(selectNo == 6) { // 종료
				run = false;
			}else {
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 한 번 입력해 주세요.");
			}
		}
		
		
	}
}
