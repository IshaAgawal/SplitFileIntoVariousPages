import java.util.LinkedList;


public class Retail {
	
	int hostId;
	int listId;
	int score;
	int location;
	
	public Retail(int i, int j, int k, int l) {
		this.hostId = i;
		this.listId = j;
		this.score = k;
		this.location = l;	
	}
	
	public int getHostId() {
		return hostId;
	}
	public void setHostId(int hostId) {
		this.hostId = hostId;
	}
	public int getListId() {
		return listId;
	}
	public void setListId(int listId) {
		this.listId = listId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Retail [hostId=" + hostId + ", listId=" + listId + ", score="
				+ score + ", location=" + location + "]";
	}

	public static LinkedList<Retail> getRetailObjects() {
		LinkedList<Retail> r = new LinkedList<Retail>();
		
		Retail r1 = new Retail(123,100,99,1);
		Retail r2 = new Retail(123,100,98,1);
		Retail r3 = new Retail(124,100,97,1);
		Retail r4 = new Retail(125,100,96,1);
		Retail r5 = new Retail(125,100,95,1);
		Retail r6 = new Retail(126,100,94,1);
		
		Retail r7 = new Retail(127,100,99,1);
		Retail r8 = new Retail(128,100,98,1);
		Retail r9 = new Retail(129,100,97,1);
		Retail r10 = new Retail(130,100,96,1);
		Retail r11 = new Retail(131,100,95,1);
		Retail r12 = new Retail(132,100,94,1);
		
		
		r.add(r1);
		r.add(r2);
		r.add(r3);
		r.add(r4);
		r.add(r5);
		r.add(r6);
		
		r.add(r7);
		r.add(r8);
		r.add(r9);
		r.add(r10);
		r.add(r11);
		r.add(r12);
		
		return r;
	}
	
}
