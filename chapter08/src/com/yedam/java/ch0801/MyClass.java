package com.yedam.java.ch0801;

public class MyClass {

	//π νλ
	// 1)
	// public int a = 1; μ΄λ°κ²μ²λΌ
	RemoteControl rc = new Television(); // μ°Έμ‘°νμ(rc)μ λ£μ΄μ€ κ²
	
	
	//π μμ±μ
	public MyClass() {
		
	}
	
	// μμ±μ μ€λ²λ‘λ©(κ°μ μ΄λ¦μ΄μ§λ§ λ§€κ°λ³μλ₯Ό λ¬λ¦¬ ν΄ μμ±)
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	// μΈν°νμ΄μ€κ° μλλΌ λ€λ₯Έ ν΄λμ€λ‘ λ§λ€μ΄μ§κ±Έ λΆλ¬μ¨λ€λ©΄, ν΄λΉ ν΄λμ€μ κ°μ turnOnμ΄ μ΄λ»κ² μ νμλμ§λ μμλ΄μΌ ν¨
	// (νΉμ turnonμ΄λΌκ³  μλ¬Έμλ‘ μ νκ² μλμ§.. μ΄λ€ λ©μλ μ΄λ¦μΌλ‘ λ§λ€μλμ§ νμΈνκ³ , κΈ°λ₯λ νμΈνκ³ ..)
	
	
	//π λ©μλ
	// λ©μλ νΈμΆ. κ±°κΈ°μ λ΄κ° μ μν΄ λ κ΅¬ν ν΄λμ€λ₯Ό μ¬μ©ν΄ μ€ν
	void methodA() {
		// μ νλμμ rcλ₯Ό μ μνλλ°, λ€λ₯Έ κ΅¬ν ν΄λμ€λ₯Ό μ¬μ©ν΄ λ κ΅¬ν κ°λ₯
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodC() {
		// μ νλμμ rcλ₯Ό μ μνλλ°, λ€λ₯Έ κ΅¬ν ν΄λμ€λ₯Ό μ¬μ©ν΄ λ κ΅¬ν κ°λ₯
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
	}
	
	// λ§€κ°λ³μ
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}
