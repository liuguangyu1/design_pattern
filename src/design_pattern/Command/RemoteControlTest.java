package design_pattern.Command;

public class RemoteControlTest {
	public static void main(String [] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(); // 初始化一个遥控器
		Light light = new Light(); // 初始化一个电灯
		LightOnCommand lightOn = new LightOnCommand(light); // 初始化一个打开电灯的命令，并与电灯对象绑定
		
		remote.setCommand(lightOn); // 把打开电灯命令与遥控器绑定
		remote.buttonWasPressed();//遥控器按钮触发电灯命令，电灯命令内部对电灯执行打开的指令。
	}
}
