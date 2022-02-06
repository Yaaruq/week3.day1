package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("My desktop size is : 43 inches");
	}
	public static void main(String[] args) {
		Computer c = new Computer();
		Desktop d = new Desktop();
		c.computerModel();
		d.desktopSize();
	}
}
