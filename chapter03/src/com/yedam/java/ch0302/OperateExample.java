package com.yedam.java.ch0302;

public class OperateExample {
public static void main(String[] args) {
	// 자바에서만 이 main 쓰고, 자바스크립트에서는 안 씀.
	// class 만들 때 main 체크 안 하고 여기서 main 적고 ctrl + space해도 됨✨
	
	
	//✨ 부호연산자
	
	int a = -100; // 오른쪽의 값을 왼쪽에 대입한다
	int result1 = +a; // 변수의 부호 그대로 유지
	int result2 = -a; // 변수의 부호 바꿈
	System.out.println("result1 : " + result1);
	System.out.println("result2 : " + result2);
	
	
	//❗❗ 애초에 값을 가지고 있는 변수가 int 밑의 타입일 경우의 연산 -> 결과는 자동으로 int값이 됨
	// +-를 했을 때 값의 변화가 부호밖에 없지만(부호연산자니까) 담는 값은 반드시 int여야 함
	byte b = 100;
	int result3 = -b;
	byte result4 = (byte)-b; // byte에 담고싶다면 캐스팅 괄호를 사용해야 함
	// 실질적으로 값은 int인데 캐스팅 괄호를 만나 byte로 강제 타입 변환이 일어난 것.
	System.out.println("result3 : " + result3);
	
	// 노란색 밑줄 뜨는거 -> 오류는 아님. 진행하는데 문제는 없지만 warning이다.
	// 변수에 노란색 줄이 생긴건 선언은 했지만, 사용을 안 한 것. 사용을 안 하면 불필요한거니까 경고로 알려주는것.
	
		
	
	//✨ 증감연산자
	
	int x = 10;
	int y = 10;
	int z; // 아래에서 사용하기 위해 z는 선언만 해 줌
	System.out.println("------------");
	//🍋 단독 출력일 경우 증감 연산자의 위치는 크게 상관 없음
	x++; // 결과 11
	++x; // 결과 12 (위에서 x가 11이 됐으니까 거기에 1 또 증가하면 12)
	System.out.println(" x = " + x); // 결과 12
	
	System.out.println("------------");
	y--; // 결과 9
	--y; // 결과 8
	System.out.println(" y = " + y);
	
	System.out.println("------------");
	
	//🍑 이 식에는 증감연산자 하나, 대입연산자 하나가 있음 ( = <- 이것도 대입'연산자'임!!)
	// 대입연산자는 무조건 제일 마지막에 실행된다고 생각하자(우선순위가 제일 낮음)
	// x++은 다른 연산이 진행된 후 1이 증가되는 것. => 대입연산자를 처리한 후 1 증가하게 됨
	// 원래라면 대입연산자가 제일 마지막에 실행되는게 맞지만, x의 증감연산자가 뒤에 있으니 이게 우선순위가 제일 마지막이 되어 대입이 먼저 일어남
	z = x++;
	System.out.println(" z = " + z); // 결과 12
	System.out.println(" x = " + x); // 결과 13 (z에 대입한 후(연산 실행), 내 값을 하나 올려 13이 됨)
	
	System.out.println("------------");
	//🍑 지금 x값은 13 (위에서 연산 다 처리한 뒤 마지막 x 값이 13이니까 ㅎ)
	z = ++x;
	System.out.println(" z = " + z); // 결과 14
	System.out.println(" x = " + x); // 결과 14
	
	System.out.println("------------");
	
	//🍑 문제1
	// 현재 x = 14, y = 8
	z = ++x + y++; // 대입 , 증감, 산술, 증감 -> 4개의 연산자가 있음
	
	// 1) ++x 증감연산자가 단항연산자이기 때문에 우선순위가 제일 높음
	// 2) y++ 두개의 우선순위가 같으면 왼 -> 오 순으로 처리함
	// 3) + 산술연산자
	// 4) = 대입연산자

	// 연산자의 우선순위만 본다면 위 순서가 맞음! 근데 y++이 연산 후에 작동하게 되니까 순서가 아래처럼 바뀜
	
	// 1) ++x => 15
	// 2) +는 x + y임 => 15 + 8 => 23
	// 3) y++ => 9
	// 4) =는 z에 (x + y)한 것을 넣는 것 => 23
	
	System.out.println(" z = " + z); // 결과 23
	System.out.println(" x = " + x); // 결과 15
	System.out.println(" y = " + y); // 결과 9
		
	
	//🍑 문제2
	x = 5; // 초기화. 기존의 변수 값을 초기화해주는 값으로 덮어쓰기
	y = 5;
	
	System.out.println("------------");
	
	z = x++ + --y;
	// 여러개가 있을 때엔 내 앞 뒤의 연산 우선순위가 어떻게 되는지 확인하면 됨.
	// 그리고 내 우선순위에 맞게 앞뒤를 조절 -> 그 다음 연산자와 또 우선순위 비교 -> 이런 식으로 하나하나 진행
	// 1) x++        -> 3)
	// 2) --y        -> 1)
	// 3) x + y      -> 2)
	// 4) z = x + y  -> 4)
	
	// 1) --y =>
	// 2) x + y =>
	// 3) x++ =>
	// 4) z = x + y =>
	
	System.out.println(" z = " + z); // 결과 9
	System.out.println(" x = " + x); // 결과 6
	System.out.println(" y = " + y); // 결과 4
	
	
	//🍑 문제2-1
	System.out.println("------------");
	
	z = --x + y++;
	
	
	System.out.println(" z = " + z); // 결과 9
	System.out.println(" x = " + x); // 결과 5
	System.out.println(" y = " + y); // 결과 5
	
		
	
	// 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
	// 개발자는 내가 결과를 예상하고, 컴퓨터가 내 예상대로 보여주는지를 체크해야 하는 것!
	// 걍 컴퓨터가 만들어주는대로 내가 아 글쿤 ㅇㅋ하는게 아님!!!!
	
	
	// 논리 부정 연산자 !
	// 유일하게 단항으로 구분되는 논리 연산자
	boolean play = true;
	System.out.println(play);
	
	// play 변수를 토글해보자
	// 토글한다: 기존의 값을 바꾼다 (하나의 버튼으로 온오프하는것과 비슷)
	// 논리 부정 연산자는 토글 기능을 쓸 때 적합하다
	play = !play; // 논리연산자는 변수 앞에 붙음
	System.out.println(play);
	
	play = !play;
	System.out.println(play);
	
	
	// open되어있는걸 true로 본다고 만들어줌
	boolean isOpen = true;
	// 들어오는 값이 뭔지 모르겠지만, isOpen과 반대되는 경우엔 close를 실행하고 싶음.(?)
	// if는 close로 처리하고 싶음. 근데 변수는 isOpen하나뿐.
	// 어떻게 하면 될까? 변수를 반전시키면 됨!
	
	// open은 반드시 참이 나오도록 만들어 놨음.
	// 근데 쓰려고 보니 비활성화되는 상황을 체크해야 할 것 같음.
	
	// 조건식에서는 close를 판단(true인지)하고싶다
	
	// if문이 가질 수 있는 값은 true일 때 밖에 없음. 근데 난 false를 찾아야 함
	// (실제 값은 true지만) 강제로 반전시켜 값이 false일 때를 
	// 예외사항 다 필요없고 if만 필요해! 근데 내가 필요한 값은 false야. 그럼 기존 값을 반전시켜서 찾아야지 뭐
	if(!isOpen) {
		System.out.println("영업시간이 종료되었습니다.");
	}else {
		System.out.println("영업 중입니다.");
	}
	
	
	//✨ 산술연산자
	
	int v1 = 5;
	int v2 = 2;
	int result;
	
	result = v1 + v2; // 더하기
	System.out.println("result : " + result);
	
	result = v1 - v2; // 빼기
	System.out.println("result : " + result);
	
	result = v1 * v2; // 곱하기
	System.out.println("result : " + result);
	
	result = v1 / v2; // 나누기(몫)
	System.out.println("result : " + result);
	
	result = v1 % v2; // 나머지
	System.out.println("result : " + result);
	
	
	//✨ +문자열 결합 연산자는 어제 함
	
	
	//✨ 비교연산자
	
	int num1 = 10;
	int num2 = 10;
	boolean bResult;
	
	bResult = (num1 <= num2); // =이 뒤에 가야함! =< 이런 형태는 쓸 수 없음
	// 비교연산자는 <, > 이렇게는 잘 안 쓰고 <=, >= 이런식으로 =을 붙여서 씀
	System.out.println(">= : " + bResult);
	
	// 동등비교 (동등한지(같은지) 아닌지)
	bResult = (num1 == num2); // 자바는 === 이 없음 (js에서는 ==랑 ===가 둘 다 있음)
	System.out.println("== : " + bResult);
	
	// == 랑 반대. ==랑 !=는 배타적이라 두 값이 같을 수는 없음!
	bResult = (num1 != num2);
	System.out.println("!= : " + bResult);
	
	
	//✨ char 타입 비교
	// 보이는것만 문자로 보일 뿐 실제 값은 숫자임. 유니코드 -> 숫자를 비교하는 비교연산자도 사용 가능
	char char1 = 'A'; // 실제값은 65 
	char char2 = 'B'; // 실제값은 66
	System.out.println("문자 비교 : " + (char1 > char2));
	
	
	// 정수는 문제가 없음
	//✨ 실수 비교(float, double)는 문제가 좀 생김
	
	int v3 = 1;
	double v4 = 1.0;
	System.out.println("int VS double : " + (v3 == v4));
	// true라고 나옴
	
	float v5 = 0.1F;
	double v6 = 0.1;
	System.out.println("float VS double : " + (v5 == v6));
	// 같은 값을 넣었는데 false라고 뜸!
	// why? 정밀도가 다르기 때문. 우리가 보기엔 똑같은 0.1이라도 자바는 다르게 생각함
	System.out.println("v5 : " + v5);
	System.out.println("v6 : " + v6);
	
	// 따라서 float와 double을 비교할때는 타입을 맞춰줘야함 (정수는 관계없음)
	// 동일한 타입으로 바꾸고 비교하는게 제일 좋음
	System.out.println("float VS float : " + (v5 == (float)v6));
	
	
	//✨ 논리연산자
	// 양 쪽에 오는 연산식이 boolean을 도출할 수 있으면 사용 가능
	
	int charCode = 'A'; // char가 아니라 int임~ (바로 비교연산하려고. int가 char보다 크니까 바로 전환 가능하고, 유니코드도 숫자로 읽으니까 가능한 것)
	
	// 대문자인지 소문자인지 확인하는 작업 할 때 유니코드를 자주 씀.
	// 유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자 (두가지를 모두 만족해야 함)
	// 유니코드는 범위가 연달아서 있지 않음!
	// 논리연산자는 양 쪽에 오는 연산식이 boolean을 도출할 수 있으면 사용 가능
	
	//🍋 AND
	if(charCode >= 65 && charCode <= 90) { // & && 한번이든 두번이든 의미는 같음.
	// if((charCode >= 65) && (charCode <= 90)){} 이런 식으로!
		// 논리연산자는 연산자 우선순위를 너무 신경쓰지 말고... 먼저 실행하고 싶은 걸 괄호로 감싸라
		System.out.println("대문자");
	}
	
	// 유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
	if((charCode >= 97) & (charCode <= 122)) { 
		System.out.println("소문자");
		
		
		// &는 원래 비트연산자 (0, 1 값을 연산할 때 주로 사용)
		// && 논리비교로 사용하는건 주로 이거. 둘 다 의미는 같음!
		// & : 앞이 false라도 뒤를 확인함 (하나가 false면 무조건 false지만 어쨌든 둘 다 확인함)
		// && : 앞이 false면 뒤는 확인 안 하고 false 바로 반환
	}
	
	// 유니코드 중 48보다 크고 57보다 작으면 숫자 0~9
	// (숫자인데.. 걍 유니코드 0~9에 넣으면 더 편하지 않았을까 ㅎ)
	if ((charCode > 48) && (charCode < 57)) { // 문자로 입력된 것 중 숫자인지 확인하고 싶으면 유니코드를 비교해야 함
		System.out.println("숫자 0~9");}
	
	
	//🍋 OR
	// 어떤 변수가2의 배수인지, 3의 배수인지 확인
	int numValue = 6;
	
	// 어떤 배수인지 확인하는 법: 기준이 되는 값을 나눠서 나머지를 확인
	if((numValue % 2 == 0) || (numValue % 3 == 0)) {
		System.out.println("2 또는 3의 배수군요");
	}
	// | : 둘 다 검사
	// || : 앞이 true면 전부 true로 반환 (하나가 true면 만족하기 때문에)
	
	
	//✨ 복합 대입 연산자
	
	int resultA = 0;
	
	resultA += 10; // 정석은 resultA = resultA + 10
	// 피연산자로 사용되는 변수와 값을 실제로 받는 변수가 동일할 때, 중복이니까 생략이 가능하다는 말
	// += -> 첫번째 연산자(+)를 먼저 하고, 그 결과를 대입(=)하는 것
	System.out.println("+= : " + resultA);
	
	resultA -= 5; // resultA = resultA - 5
	System.out.println("-= : " + resultA);
	
	resultA *= 3; // resultA = resultA * 3
	System.out.println("*= : " + resultA);
	
	resultA /= 5; // resultA = resultA / 5
	System.out.println("/= : " + resultA);
	
	resultA %= 3; // resultA = resultA % 3
	System.out.println("%= : " + resultA);
	
	
	//✨ 삼항연산자
	// 자바, 자바스크립트에서 둘 다 가능
	// 아주 간단한 if문.
	// 단순 if 문과 달리(?) 기본적으로 '값을 반환'하는 조건문
	
	//🍑 내 점수가 어떤 등급인지 알고싶음
	int score = 85;
	// char grade = ? : ; <- 삼항연산자를 쓰려면 일단 이렇게 적어놓고 시작하자
	char grade = (score > 90) ? 'A' : 'B'; // 90보다 클 때 주고 싶은 값이 A, 아닐땐 B
	// 물음표 앞은 보통 식이 들어가는데, 길어져서 보기 헷갈리면 걍 괄호()로 묶어버려~
	
	System.out.printf("성적은 %d이고 등급은%c 입니다.\n", score, grade);
	// char가 원래 가지고 있는건 숫자값이라 그냥 출력하면 숫자가 나옴.
	// char를 유니코드 숫자가 아닌 문자 그대로 출력하고 싶을 땐 %c 사용
	// %s는 좀 더 큰 범위. %s를 쳤을 때 string으로 바로 변환해서 출력 가능하기 때문에 char를 %s 써서 출력해도 됨
	// println을 제외하고는 모두 자동 줄바꿈 안 됨. 마지막에 \n 치는걸 걍 외우자
	
	//🍑 성인인지 미성년자인지 알고싶음
	int age = 17;
	// 성인, 미성년자 는 문자니까 string으로 담아주기
	String message = (age >= 20)? "성인" : "미성년자" ;
	System.out.printf("나이는 %d살이며 %s입니다. \n", age, message); // 앞에 적은 값에 들어갈 값들을 뒤에 순서대로 적으면 됨
	
	
	
}
}
