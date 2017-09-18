package java入门第二季;

public class encapsulation {
	private float screen;
	private float cpu;

	// 可自动生成getter和setter
	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
		this.setScreen(5.9f);
	}

	public float getScreen() {
		return screen;
	}

	public void setScreen(float newScreen) {
		screen = newScreen;
	}
}
