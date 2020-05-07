package project;

public class Manager {
	
	public synchronized void take_2chop(Chopstick sx, Chopstick dx) throws InterruptedException {
		while(!(sx.check_state()&&dx.check_state())) {
			wait();
		}
		System.out.println(sx.get_name()+"&" +dx.get_name()+" disponibili!");
		sx.take();
		dx.take();
	}
	
	public synchronized void leave_2chop(Chopstick sx, Chopstick dx) throws InterruptedException {
		sx.leave();
		dx.leave();
		System.out.println(sx.get_name()+"&" +dx.get_name()+" lasciate!");
		notify();
		
	}
}
