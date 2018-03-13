package billar;

public class Hilobola implements Runnable {

	private Board billar;
	private Ball bola;
	public Hilobola(Ball bola, Board billar) {
		this.bola = bola;
		this.billar=billar;
	}

	@Override
	public void run() {
		
		try {
			while (true) {
			bola.move();
			billar.repaint();
			Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			
		}
		
	}

}
