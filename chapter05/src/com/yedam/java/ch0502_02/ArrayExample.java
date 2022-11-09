package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {
		// 배열은 내가 들고 있는 값이 어떤건지에 따라 타입이 결정됨
		// int 값 여러개를 들고 있으면 그걸 담은 그릇(배열)은 당연히 int가 될 수 밖에 없음.
		
		
		
		//✨ 다차원 배열 (책 p190)
		// 1차원 배열을 기반으로 해서 배열을 하나 더 만드는 것
		
		
		// 같은 내용을 다른 표기법으로 나타내보자
		// 1. 변수 사용
		
		// mathScores는 하나의 배열임! 이 배열이 가지고 있는 값이 배열일 뿐. 그렇게 생각해라~
		int[][] mathScores = new int[2][3]; // int[](배열)이 값인 [](배열) (int[]의 배열)
		//new int[그 int배열을 2개 가짐][값으로 가진 int배열의 크기가 3]
		//new int[값으로 가진 int배열을 몇 개 들고있냐][내가 값으로 가진 int배열의 크기]
		//[2차원 배열의 크기][2차원 배열이 가지고 있는 값(여기선 int배열)의 크기]
		
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[] mathScore = mathScores[i];
			// mathScores라는 다차원 배열에서 i번째를 가지고 오면, 그건 int배열임
			// why? mathScores 다차원 배열이 가진 값이 int[]라는 배열들 여러개니까!
			
			// 배열의 값을 꺼내보니까 걔도 배열이네?? 그럼 그 안에 있는 배열이 가진 값도 하나하나 꺼내보고싶은뎅..
			// 다차원배열 int[] 안에 있는 '값'인 int[]를 사용하기 위해 이중for문 씀
			// 아래의 for문은 값으로 가지고 있는 int 배열임!
			for(int j=0; j<mathScore.length; j++) {
				System.out.print("\t mathScore[" + j + "]: ");
				System.out.println(mathScore[j]);
			}
		}
		
		System.out.println("---------------------------------");
		
		// 2. 변수 사용X
		
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
//			int[] mathScore = mathScores[i];
			// 임시로 정했던 mathScore를 빼고, 기존의 mathScores만 사용하려고 함!
			// mathScores[i]가 위에서 썼던 mathScore를 대체할거임
			
			// mathScores[i].length -> i번째의 크기를 각각 호출! 각각의 값인 int[]의 크기는 다를수도 있음!!
			// 지금 상황에서는 int[]의 크기가 다 똑같기 때문에 mathScores[0] 해서 첫 번째 int[]의 크기로 다 출력해도 괜찮지만, 각각의 크기가 다르면 오류날수있음!!
			for(int j=0; j<mathScores[i].length; j++) {
				// i를 그냥 문자로 출력할 필요는 없음. i를 변수로 돌리자!
				System.out.print("\t mathScores["+i+"][" + j + "]: ");
				System.out.println(mathScores[i][j]);
			}
		}
		
		int[][] scoreList = {
				// scoreList라는 배열 안에 값으로 배열이 2개 들어있는데, 각각의 배열 크기가 다르게 주어질 수 있음
								{ 86, 65 }, 
								{ 58, 95, 73 },
							};
		
		for(int i=0; i<scoreList.length; i++) {
			System.out.println(i + "번째 학생의 성적 =====");
			for(int j=0; j<scoreList[i].length; j++) {
				System.out.print(scoreList[i][j] + " ");
			}
			System.out.println(); // 이건 줄 띄워서 그냥 구분하는 용도로 씀
		}
		
		System.out.println("----------------------------");
		
		for(int i=0; i<scoreList.length; i++) {
			System.out.println(i + "번째 학생의 성적 =====");
			
			// 내부의 배열이 가진 값을 출력할 때, 0번째 배열 크기를 기준으로 출력한다면?
			// 1번째는 가진 값이 3개인데 0번째는 2개임. 1번째는 값이 하나 빠진 2개만 출력됨.
			// j<scoreList[1] 이라고 하면 정상 출력이 안 됨!!
			// why? 0번째 배열은 가진 값이 2개 뿐인데, 1번째가 가진 크기인 3개만큼 출력할 수가 없기 때문에 오류남.
			
			// 그니까 j<scoreList[i] 로 해서 각각의 내부 배열이 가진 고유의 크기를 사용하도록 하는게 좋음.
			for(int j=0; j<scoreList[0].length; j++) {
				System.out.print(scoreList[i][j] + " ");
			}
			System.out.println(); // 이건 줄 띄워서 그냥 구분하는 용도로 씀
		}

		
		System.out.println("-------------------------");
			
		
		//🍋 다차원 배열의 크기만 정하고, 값으로 가지는 배열의 크기는 정하지 않아도 됨!
		// 개발자: 나는 2칸짜리 서랍을 만들게.
		// 니가 한 서랍 내부에 칸막이 몇개를 넣어서 쓰든 나는 상관 안 할게~~~
		int[][] englishScore = new int[2][];
		
		// 사용자: 아 ㅇㅋㅇㅋ 그럼 난 첫번째 서랍은 칸막이 써서 3부분으로, 두번째 서랍은 2부분으로 쓸게
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];
		
		for(int i=0; i<englishScore.length; i++) {
			for(int j=0; j<englishScore[i].length; j++) { // 바깥 for문의 변수 i를 j<englishScore[i].length 여기 []안에 적는거 까먹지 말기!
				System.out.println("englishScore[" + i + "][" + j + "]: " + englishScore[i][j]);
			}
		}
		
		
		//✨ String배열 (책 p193)
		String[] strArray = new String[3]; // 스트링 배열을 만듦. 얘가 가지는 배열은 3개임
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		// 이거 좀 덜 적었다..ㅎ 집 가서 다시 확인하고 추가로 적어라 ㅠ
		// 동등비교 연산자(==) 사용. 둘은 값이 같을까?
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[1] == strArray[2]);
		// 셋 다 값은 Java로 같지만, String은 객체이기 때문에 변수가 값을 가지고 있지 않음!
		// String[] strArray는 string 배열임. 값으로도 string을 가짐.
		// strArray[0] = "Java";이렇게 Java라는 값을 주면 힙 영역에 새롭게 생성된 "Java"라는 객체를 찾아감. 
		// 내부의 객체를 다 확인하고, 기존에 값이 있다면, 그 객체의 주소를 가져와 표시함
		// 새롭게 new string을 해주면 걔는 기존에 힙 영역에 값이 있든말든 새로운 객체를 생성
		// strArray[0]을 하면 Java 라는 값이 아니라 그 값이 있는 객체의 주소를 들고옴!
		// strArray[1]도 Java 값을 가진 객체의 '주소'를 가져오기 때문에 0과 동일한 주소를 들고옴.
		// strArray[2]는 새로 생성된 Java 객체의 주소를 가져오기 때문에 0, 1과 다른 주소를 가져옴!!!
		// 동등비교는 이 주소들을 비교하기 때문에 0==1은 true, 1==2는 false가 나오는 것
		
		// 그럼 string타입에서 진짜 가지고 있는 값을 비교할 때는 어떻게 해야할까?
		System.out.println(strArray[1].equals(strArray[2]));
		// strArray[2] 니가 객체인지 뭔지는 모르겠고 그래서 니가 진짜로 들고 있는 값은 뭔데??
		// equals를 사용하면 주소가 아닌 그 주소 안에 들어있는 Java라는 찐 값을 찾아옴
		
		System.out.println();
		
		
		
		//✨ 배열 복사
		
		//🍋 for문으로 배열 복사
		// 작은 그릇에 있던걸 큰 그릇으로 옮기는 것
		
		int[] oldIntAry = {1, 2, 3};
		// 더 많은 값을 넣고 싶어.. 더 큰 새 배열을 만들어 위에 있는 값들을 가져오자(복사)
		int[] newIntAry = new int[5];
		
		// 복사를 할 때는 크기가 작은 애를 기준으로 해야 함.
		// why? 큰 애 기준으로 하면 newIntAry는 5까지 처리할 수 있지만, oldIntAry는 5라는 값을 처리 못 함! 얘는 가진 값이 3개뿐이기 때문
		for(int i=0; i < oldIntAry.length ; i++) {
			newIntAry[i] = oldIntAry[i]; // old에 있던 값들을 전부 new에서 old에 있던 곳과 같은 위치에 고대로 넣을래~
		}
		// newIntAry가 값을 제대로 잘 가져왔는지 보자
		for(int i=0; i<newIntAry.length; i++) {
			System.out.println(newIntAry[i]); // 기존 값 3개는 복사가 되고, 남아있는 2개에 대해서는 int배열의 기본값인 0을 가짐
		}
		
		// 둘 다 같은 자리에(0부터~) 순차적으로 값을 들어가게 한다면 for문 사용해서 쉽게 가능함
		// 근데 새 배열의 중간 자리부터 값을 복사해오려고 한다면..?
		// System.arraycopy()를 사용
		
		// 매개변수가 5개 필요함..!
		// System.arraycopy(원본 배열, 원본 배열에서 복사를 시작할 인덱스 위치, 
		// 복사할 값을 담을 새로운 배열, 새로운 배열의 몇 번째부터 값을 채워넣을건지(2번 매개변수와 같을수도 있고 다를수도 있음), 
		// 원본 데이터에서 몇 개를 복사할건지(길이)) <- 이거 책 p196 중간에 똑같이 적어줘 ㅠ
		
		
		//🍋 System.arraycopy()로 배열 복사 (자바에서 제공하는 메소드. 자주 쓰이진 않음)
		String[] oldStrAry = {"java", "array", "copy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);
		//(복사할 옛 배열, 옛 배열의 몇번째부터 복사할건지, 복사한걸 넣을 새 배열, 새 배열의 몇번째부터 복사해 온 값을 넣을건지, 엣 배열에서 몇개를 가져올건지)
		
		for(int i=0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		// String기반 배열이기 때문에 0, 1번에는 기본값(null)이 들어가고
		// 복사해 온 걸 넣겠다고 한 2번째부터는 옛 배열의 값이 하나씩 들어있을 것		
		
		
		// 다차원배열도 복사할 수 있지만, System.arraycopy()를 여러번 사용해야함.
		// 2차원 배열의 복사를 하고, 내부값도 복사해줘야함 (깊은 복사)
		// System.arraycopy()이건 1차원 배열을 복사할 때 주로 사용한다고 보면 됨
		
		
		
		//✨ 향상된 for문
		// for문임! 근데 요구하는 값이 3개가 아니라 2개뿐임
		// 기존 for문의 문법을 축소시켜, 배열의 모든 값을 다 가져온다는 전제 하에 사용하는 간단한 for문
		// 인덱스를 이용해야 할 때는 사용불가! for문 안에 인덱스와 관련된 어떠한 정보도 없기 때문
		// 인덱스를 사용하려면 새 변수를 만들어야함. 근데 그럼 굳이 향상된 for문을 사용할 필요가 있을까......?
		
		int[] scores = { 95, 71, 84, 93, 87 };
		// 평균을 구하고 싶다. 그럼 scores 안의 모든 값이 필요함
		// for( 해당 배열에서 가지고 온 값을 담을 임시 변수 생성 : 값을 가지고 오고 싶은 배열){}
		for(int score : scores) {
			System.out.println(score);
		} // for문이 한 번 돌때마다 값이 하나씩 담기면서 순환하고, 마지막 값까지 담기면 for문이 종료됨
		
		
		int sum = 0;
		int index = -1; // 인덱스를 사용하려면 새 변수 필요
		for(int score : scores) {
			sum += score;
			System.out.println("인덱스: " + ++index); // 인덱스 출력해보기
		}
		System.out.println("점수 총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균: " + avg);
		
		
		
	}
}
