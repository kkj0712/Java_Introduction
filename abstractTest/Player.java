package abstractTest;

public class Player {
	private PlayerLevel level; //PlayerLevel이 가지는 level변수 선언
	
	public Player() {
		level=new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) { //매개변수 자료형은 모든 레벨로 변환 가능한 PlayerLevel
		this.level=level; //현재 자신의 level을 매개변수로 받은 level로 변경하고 레벨 메시지 출력
		level.showLevelMessage();
	}
	
	public void play(int count) { //PlayerLevel의 템플릿 메서드 go()호출
		level.go(count);
	}
	
}
