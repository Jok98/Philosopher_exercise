package project;

public class Philosopher extends Thread{
	
	String name;
	
	Chopstick chop_sx, chop_dx;
	Manager manager;
	
	
	public Philosopher(String name, Manager manager, Chopstick chop_sx, Chopstick chop_dx) {
		
		this.name = name;
		this.manager = manager;
		this.chop_sx = chop_sx;
		this.chop_dx = chop_dx;
		
	}
	
	public void run() {
		while(true) {
			try {
				System.out.println(name+ " sta pensando!");
				sleep(100);
				manager.take_2chop(chop_sx, chop_dx);
				System.out.println(name+ " sta mangiando!");
				sleep(100);
				manager.leave_2chop(chop_sx, chop_dx);
				System.out.println(name+ " ha finito di mangiare!");
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			
		}
		
	}
}
