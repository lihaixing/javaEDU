package java���ŵڶ���;

public class encapsulation {
	private float screen;
	private float cpu;

	// ���Զ�����getter��setter
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
