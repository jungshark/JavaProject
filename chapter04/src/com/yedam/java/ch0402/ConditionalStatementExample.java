package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {

		// ✨ for문
		// 반복할 횟수가 정해져 있을 때

		// 내가 어디까지 출력하고 싶은지 경계선에 있는 값을 잘 체크해야 함!

		// for문은 따로 변수를 선언할 필요 X
		// for문 내부에서 가능한!

		// 🍋 for(초기화식; 조건식; 증감식);
		// for(for문에서 쓸 변수 초기화; 얼마나 반복할지 조건(이 조건을 만족하면 계속 반복됨); 한번 반복될때 i가 증감되는 범위){}

		// 1~10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// i = 1이고, i가 10보다 작으니까 프린트문 출력.
		// 한 바퀴 돌고 바로 조건식(i<=10)으로 가는게 아니라 증감식(i++)으로 가서 i 값을 변화시켜줌
		// 이제 i = 2이고, 아직 10보다 작으니까 또 프린트문 출력.
		// 계속 반복~
		// i가 10일때까지 반복하다가, i=11이 되면 프린트문 출력 안 하고 for문 종료
		// for문이 끝나고 난 후 i는 11을 가짐 why? i가 11이 되어 조건식이 false가 되기 때문에 for문을 빠져나오게 되는것

		// 🍋 for문도 무한루프 걸릴 수 있음..!
		// 필요하다면 초기화식, 조건식, 증감식 생략 가능
//		for(;;) {
//			System.out.println("루프 반복");
//		}

		// 🍋 증감식은 꼭 x++일 필요 없음!
		// x의 값을 변화시키기만 하면 어떤 식이든 다 들어갈 수 있음

		// 🍋 변수를 바깥에 선언, 그대로 for문에서 쓰려면 내부 초기화식에 안 쓰고 생략 가능
		// 조건식, 증감식도 필요하다면 생략 가능
		int x = 1;
		for (; x <= 100; x += 15) {
			System.out.println("출력");
		}
		// 반복문이 끝난 후, x가 최소 100보다는 크다는 사실을 알아야 함! (x가 100보다 이하일때까지는 계속 반복문이 도니까)
		System.out.println("x : " + x);

		// 🍋 초기화되는 값을 2개 사용할 수 있음. 그리고 두 변수가 특정 조건을 모두 만족해야만 동작하는 경우
		// 🍋 증감식은 말 그대로 '증감'이기 때문에 변수가 감소(j--)할 수도 있음!
		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 🍋 하나의 반복문으로 두개의 결과 출력하기
		// 🍑 1~100까지 출력, 동시에 1~100까지 합을 출력

		int sum = 0; // 누적되는 값을 가질 변수를 하나 선언하고, 반복문 안에서 i를 계속 더해주면 됨
		// 반복횟수니까 for문 안에서 선언하는 임시변수는 int인 경우가 대부분임!
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i; // 복합대입연산자 활용도 가능 sum += i;
		}
		System.out.println("1~100까지의 합계: " + sum);

		// 🍋 float타입 카운터 변수
		// 실수를 변수로 쓰는 것이 불가능하진 않지만 웬만하면 *10이나 *100이나 해서 정수로 만들어 쓰는것이 좋음.
		// 실수인 경우 내가 생각하는 그 값이 안 나올 수 있음
		for (float f = 0.1f; f <= 1.0f; f += 0.1f) {
			System.out.println(f);
			// 실수는 계속 누적되다 보면 정밀도가 깨짐
			// 0.1을 10번 더하면 값이 1.0이 아니라 1.0에 가까운 0.9.....어쩌구가 됨
		}

		// ✨ 중첩 반복문 (특히 이중 반복문)
		// 보통은 2번까지만 중첩함(이중)

		// 구구단 2~9단 출력하기 (이중 for문 사용)
		// 각 단이 1~9까지 반복, 단 안에서 표시되는 수도 1~9까지 또 반복
		// 이중for문은 각각의 for문이 제어하는 값이 무엇인지 잘 파악해야 함!

		// i가 단이니까 i=2를 해 줘야 2단부터 출력이 됨
		for (int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + "단 ***");
			// 바깥쪽 for문이 1번 돌 때, 안쪽 for문은 몇 번을 돌까?
			// 제일 처음의 경우, i=0일때 안의 for문이 전부 실행되어야 함

			// i가 선언된 중괄호 안쪽에 내부 for문이 있기 때문에 안에서도 i를 사용 가능
			// i를 사용해 내부 for문을 제어할 수 있음 (ex. j=i; j<=9; j++)
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
				// i=0, j=0
				// i=0, j=1
				// i=0, j=2...
			}
		}

		// ✨ while문
		// 특정 조건이 만족할 때 반복 실행
		// 조건식만 존재

		// 1~10까지 출력
		// while은 조건식만 존재! 몇 번을 돌 건지 카운트하는건 바깥에 선언해야 함
		// 넣을수는 있지만..
//		while(true) {
//			int count = 1;
//			if(count>10) break;
//		}

		// 증감식 위치 주의!!
		// if문과 비교했을 때, while문은 증감식을 내부에 따로 넣어줘야 함
		// 증감식을 어디에 넣어야 원하는 값이 출력될까?
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++; // 증감식은 여기 넣으면 됨! 일단 최초 값을 한 번 출력해야하니까 출력한 다음에~
			// 증감식은 보통 제일 마지막에 사용.
		}

		// 증감식이 출력문 위에 올라간다면, count의 초기화 값과 조건식이 -1씩 되어야 함
		// why? count <= 10이라면, count 10일때 조건식은 만족
		// -> while문 내부에서 count++에 의해 값이 11이 되어 출력은 11이 되어버림.
		count = 0; // 위에서 int count로 변수 선언했기 때문에 int 적을 필요 없이 값 초기화만 시켜주면 됨
		while (count <= 9) {
			count++;
			System.out.println(count);
		}

		// 🍑 1부터 100까지 출력, 동시에 1부터 100까지 합을 출력
		// 1~100 출력
//		count = 1;
//		while(count <= 100) {
//			System.out.println(count);
//			count++;

		// 합까지 출력하려면 어떻게 할까
		sum = 0;
		count = 1;
		while (count <= 100) {
			System.out.println(count);
			sum += count;
			count++;
		}
		// 합계가 얼마인지 출력하려고 한다. 1~100까지라고 출력하고 싶을 때, count를 그대로 밖 출력문에 써도 될까?
		// nooooo...... while문이 다 돌고 나면 count는 실제로 101을 가지게 됨
		// why? while을 만족하지 못하는 순간 while문이 끝나는데, count 값이 101이 되어야 while문을 만족 못 하고 빠져나가게
		// 됨.
//		System.out.println("1~" + count + "까지 합: " + sum);
		System.out.println("1~" + (count - 1) + "까지 합: " + sum);

		//🍑 주사위 두개를 굴림. 합이 3이 나올때까지 계속 주사위를 굴리는 경우
		// 랜덤으로 돌기 때문에 몇 번을 돌려야 합이 3이 될 지 알 수 없음 -> while문 사용
		// for문 -> while문은 괜찮음. while -> for문은 어려울 때가 있음(물론 자주 사용함!)

		
		// ✨ do-while문
		// while문의 변형

		// ctrl + shift + f 이클립스 자동정렬
		
		
		//🍑 같은 조건으로 while, do-while문을 동작시켜보자
		
		// index가 1이 아닌 경우에만 실행되도록 함
		// true가 아니기 때문에 while문은 아예 실행되지 않음
		int index = 1;
		while (index != 1) {
			System.out.println("while 반복문이 " + index + "번 실행됩니다.");
		}
		
		// do-while은 while문의 조건 참거짓 유무와 관계없이 do 안의 실행문이 한 번은 꼭 실행됨.
		do {
			System.out.println("do~while 반복문이 " + index + "번 실행됩니다.");
		}while (index != 1);
		
		
		//✨ break로 while문 종료
		
		// while문에 바로 조건을 주기도 하지만
		// true로 무한루프 걸 수 있음 -> 무한루프 걸고 내부에서 if로 종료
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6) // 반복문 돌다가 num이 6이 되는 경우, break
				break;
		}
		
		
		// 보통 for문 하나일때는 반복 횟수가 정해져있기 때문에 break를 잘 안 씀
		//✨ 이중 for문에서 break문 사용
		
		// char타입에서 대문자가 A부터 Z까지 반복문 돌림
		// boolean을 사용해 바깥 for문까지 제어하는법... 머냐..ㅠ
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break;
				}
			}
			System.out.println("1) 안쪽 for문 종료");
//			if (lower == 'g') { // 바깥 for문까지 g에서 종료되게 하려면 이렇게 해야하는데 그러면 안에서 사용되고 소멸된 lower이 밖에는 존재하지 않으므로 오류가 남
//				break;
//			}
		}
		System.out.println("2) 바깥쪽 for문 종료");
		// 소문자는 g에서 스탑되지만, 대문자는 Z까지 감.
		// if문이 실행되는 for문이 안쪽 for문이기 때문에 if문이 가진 break가 안쪽만 제어하는 것.
		
		System.out.println("---------------------------");
		
		// boolean 사용해서 제어하기
		boolean result = false;
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					result = true;
					break;
				}
			}
			System.out.println("1) 안쪽 for문 종료");
			if(result) break;
//			if (lower == 'g') { // 바깥 for문까지 g에서 종료되게 하려면 이렇게 해야하는데 그러면 안에서 사용되고 소멸된 lower이 밖에는 존재하지 않으므로 오류가 남
//				break;
//			}
		}
		System.out.println("2) 바깥쪽 for문 종료");
		
		
		//🤷‍♀️❔❔❔❔❔❔❔❔ boolean 사용은 안쪽에서 stop 하고 바깥에서 한 번 더 if를 돌리는 것

		System.out.println("---------------------------");
		
		// 바깥 for문에 이름을 쓰고 내부 for 안의 if문에서 이름으로 바깥까지 제어할 수 있음.
		// 이렇게 하면 1)안쪽 for문~ 내용은 아예 프린트가 안 됨
		// 안쪽 for문을 제어해야 하는지, 바깥 for문을 제어해야하는지 상황에 맞게 사용하면 됨
		Outter:for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
			System.out.println("1) 안쪽 for문 종료");
		}
		System.out.println("2) 바깥쪽 for문 종료");
		
		
		
		//✨ continue를 사용한 for문
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { // 짝수가 아닌 값일때 출력
				System.out.println(i);
			}
		}
		
		// 위 for문을 continue 사용해서 표현해보기
		for(int i=1; i<=10; i++) {
			if(i%2 == 0)
				continue; // i가 짝수일 때 건너뛰기 (=짝수인 경우를 배제시키기)
			System.out.println(i); // 그러면 홀수일때만 출력하게 됨
		}
		
		// 코드가 많은데 특정 경우에는 실행시키면 안 될 때 continue를 자주 사용			
		
	}

}
