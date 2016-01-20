package pattern.behavioral.strategy.attack;

/* 공격 인터페이스를 상속받은 클래스를 계속 만들면 새로운 공격 기능을 추가할 수 있다.*/
public interface AttackStrategy {

	public void attack();
}

