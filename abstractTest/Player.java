package abstractTest;

public class Player {
	private PlayerLevel level; //PlayerLevel�� ������ level���� ����
	
	public Player() {
		level=new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) { //�Ű����� �ڷ����� ��� ������ ��ȯ ������ PlayerLevel
		this.level=level; //���� �ڽ��� level�� �Ű������� ���� level�� �����ϰ� ���� �޽��� ���
		level.showLevelMessage();
	}
	
	public void play(int count) { //PlayerLevel�� ���ø� �޼��� go()ȣ��
		level.go(count);
	}
	
}
