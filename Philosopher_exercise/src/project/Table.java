package project;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Table {
	static int chop_num = 5;

	
	public static void main(String[]Args) {
		
		Chopstick[] chop = new Chopstick[chop_num];
		Manager manager = new Manager();
		Executor exe = Executors.newCachedThreadPool();
		
		for(int i = 0; i< chop_num; i++) {
			chop[i]= new Chopstick(i+1);
			
		}
		
		for(int i = 0; i< chop_num; i++) {
			exe.execute(new Philosopher("Ph_"+i, manager, chop[i], chop[(i+1)%chop_num]));
		}
		
	}
}
