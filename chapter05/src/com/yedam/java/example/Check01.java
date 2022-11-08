package com.yedam.java.example;

public class Check01 {
	public static void main(String[] args) {
		
		// 배열 문제
		
		// 문제 1) 주어진 배열의 총합과 평균 구하기
		int[] array = {10, 53, 26, 85, 75};
		
		int sum = 0;
		
		// 첫번째 i는 배열의 모든 값을 가져올거라 시작값이 0이어야 함!
		// 두번째 i의 최대 크기는 배열이 가진 크기보다 하나 작아야 함.(인덱스와 배열의 크기는 항상 1 차이가 나기 때문)
		// 인덱스는 0부터 시작하고, 배열의 크기는 1부터 시작하니까 항상 1 차이가 나는 것!
		// <=를 쓰고 싶으면 배열의 크기에서 -1을 해야하고, <를 사용하면 그냥 array.length적으면 됨
		// for(int i=0; i<=(array.length-1)){}
		
		// for(int i(인덱스); i(크기); 증감식) -> 앞의 i에 들어가는 것과, 중간 i에 들어가는게 다름!!!!!!!
		for(int i=0; i<5; i++) { // index는 크기와 0 차이가 나기 때문에 부호 적을 때 = 포함해서 <= 이런 식으로 하면 안 됨
			sum += array[i];
//			avg =  sum / (array.length); // 이때는 바깥에 double avg = 0; 선언 필수!
//			// 이렇게 for문 안에 평균 구하는거 넣어도 되는데 그러면 쓸데없는 코드가 for문 계속 반복되는 것.
		}System.out.println("총합: " + sum);
		
		// 평균은 for문 안에 쓰면 안 됨!
		// 총합에 대한 평균이니까, 총합이 결졍되는 for문 다음에 평균을 구해야 함
		
		// 정수와 정수를 나눴을 때 모든 값이 정수일 수는 없기 때문에, 하나를 double로 만들어 줘야함
		double avg = sum / (double)array.length;
		// 프린트 할 때 소수점 어디까지 끊을지 꼭 해줘야 줄줄 길게 안 나옴!(보통은 2자리까지)
		System.out.printf("평균: %.2f\n", avg);
		
		
		
		// 문제 2) 배열의 최대값과 최소값을 구하세요.
		
		// 최대/최소를 구할 때, 얘들을 담을 선언하는 변수에는 웬만하면 임의의 값을 주면 안 됨!
		// 내가 생각하는 최대/최소값이 항상 유지되지는 않기 때문 (최소는 항상 0이고, 최대는 100이거나 그렇지 않음)
		// int는 음수를 가질 수 있는 타입임!
		// 배열에 음수값이 있는데 최소값 변수(min)에 초기화값으로 0을 주게 된다면 배열의 음수값은 제대로 들어오지 못 할 것!!
		
		// 배열에 있는 값을 아무거나 입력하면 됨! 어차피 for문으로 모든 인덱스의 값을 다 비교할거기 때문에!
		int max = array[array.length-1]; // 최대 인덱스 값도 상관없음~
		int min = array[0];
		
		// 최대값과 최소값은 다르기 때문에 둘을 같은 if문으로 묶으면 안 됨
		for(int i=0; i<array.length; i++) {
			// 최대값
			if(max < array[i]) {
				max = array[i];
			}
			
			// 최소값
			if(min > array[i]) {
				min = array[i];
			}
		} System.out.println("최대값: " + max + "최소값: " + min);
		
		
		// 다른내용이지만 참고) 정렬은 내부 값을 오름차순이든, 내림차순이든 완전히 새롭게 배치하는 것
		
		
		// 문제 3) 문제 2에서 구한 최대값과 최소값이 각각 몇 번째 값인지 구하세요.
		// '몇 번째 값인지' / '인덱스가 뭔지'는 다름!!!!!!!!!!
		
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i=0; i<array.length; i++) {
			if(max == array[i]) {
				maxIndex = i;
			}
			if(min == array[i]) {
				minIndex = i;
			}
		} System.out.println("최대값 " + max + "는 " + (maxIndex+1) + "번째입니다.");
		  System.out.println("최소값 " + min + "는 " + (minIndex+1) + "번째입니다.");
		  // minIndex에 1을 더하는 이유? 인덱스값은 0부터 시작하지만, 우리가 위치를 셀 때는 1부터 시작하기 때문
		
		
		


	}
}
