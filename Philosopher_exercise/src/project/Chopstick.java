package project;

public class Chopstick {
	enum State{available, busy}
	State state;
	int id;
	public Chopstick(int id) {
		this.id=id;
		this.state= State.available;
		
	}
	
	public Boolean check_state() {
		
		return(this.state==State.available);
	}
	
	public void take() {
		
		this.state = State.busy;
	}
	
	public void leave() {
		
		this.state = State.available;
	}
	
	public int get_id() {
		return this.id;
	}
	
	public String get_name() {
		
		return ("chop"+id);
	}
}
