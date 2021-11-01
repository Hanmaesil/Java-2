import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

// import�� ������ ������ org.opentutorials.iot.Elevator�� Elevator �� ������ �ȴ�
// ���� �ϴ� �� : ex) Light + ctrl + space �ϸ� ��θ� �˷��ְ� �ڵ����� �ۼ���.

public class OkJavaGoInHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 303";
		
		// Elevator call
		Elevator  Elva = new Elevator(id);
		Elva.callForUp(1);
		
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp"); //hallLamp �ڸ��� �ٸ� ������ ������ �ٸ� ������ ���� �۵��Ѵ�.
		hallLamp.on();
		 
		Lighting floorLamp = new Lighting(id+" / floor Lamp"); //hallLamp �ڸ��� �ٸ� ������ ������ �ٸ� ������ ���� �۵��Ѵ�.
		floorLamp.on();
		//������� �ϸ� ���������� �������� ����Ǵ� ������ ���¸��� ���� �ִ�.(�������� Variables�� ǥ��)
		//����� -> 1. ���߰��� �ϴ� ���� ����Ŭ���ϸ� ���� ����(break pointer) 2. �÷��̹�ư ���� ����� ��ư 3. ���� ����� Stepover(F6)�� ������ �������� �����
		//���ϴ� �������� �����Ű�� �ʹٸ� �극��ũ ����Ʈ�� �α��� �����ϰ� ���ʻ���� resume�� �����ϸ� �ȴ�.
		//on�̶�� �޼ҵ尡 �۵��Ǵ°� ����ʹٸ� ���ʻ���� stepinto(F5)�� ������. ������ step return
	}

}
