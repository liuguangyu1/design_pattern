package design_pattern.Command;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}
	
	public void undo() {
		
	}
}
