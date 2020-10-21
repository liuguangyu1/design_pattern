package design_pattern.Command;

public class RemoteControlTest {
	public static void main(String [] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(); // ��ʼ��һ��ң����
		Light light = new Light(); // ��ʼ��һ�����
		LightOnCommand lightOn = new LightOnCommand(light); // ��ʼ��һ���򿪵�Ƶ���������ƶ����
		
		remote.setCommand(lightOn); // �Ѵ򿪵��������ң������
		remote.buttonWasPressed();//ң������ť������������������ڲ��Ե��ִ�д򿪵�ָ�
	}
}
