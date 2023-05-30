package org.system;
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktop size is 19 ");
	}

	public static void main(String[] args) {
		Desktop dec=new Desktop();
		dec.ComputerModal();
		dec.desktopSize();
	}
}
