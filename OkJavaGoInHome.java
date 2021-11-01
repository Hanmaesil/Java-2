import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

// import로 지정해 놓으면 org.opentutorials.iot.Elevator를 Elevator 만 적으면 된다
// 쉽게 하는 법 : ex) Light + ctrl + space 하면 경로를 알려주고 자동으로 작성됨.

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
		Lighting hallLamp = new Lighting(id+" / Hall Lamp"); //hallLamp 자리에 다른 램프를 적으면 다른 램프에 대해 작동한다.
		hallLamp.on();
		 
		Lighting floorLamp = new Lighting(id+" / floor Lamp"); //hallLamp 자리에 다른 램프를 적으면 다른 램프에 대해 작동한다.
		floorLamp.on();
		//디버깅을 하면 변수에대해 한줄한줄 실행되는 과정과 상태를를 볼수 있다.(오른쪽의 Variables에 표시)
		//디버깅 -> 1. 멈추고자 하는 곳에 더블클릭하면 점이 생김(break pointer) 2. 플레이버튼 옆의 디버깅 버튼 3. 왼쪽 상단의 Stepover(F6)을 누르면 한줄한줄 실행됨
		//원하는 구간까지 실행시키고 싶다면 브레이크 포인트를 두군데 지정하고 왼쪽상단의 resume을 실행하면 된다.
		//on이라는 메소드가 작동되는걸 보고싶다면 왼쪽상단의 stepinto(F5)를 누른다. 끝낼땐 step return
	}

}
