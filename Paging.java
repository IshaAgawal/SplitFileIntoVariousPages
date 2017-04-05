import java.util.HashMap;
import java.util.LinkedList;


public class Paging {
	
	public static void main(String args[]) {
		
		LinkedList<Retail> objects = Retail.getRetailObjects();
		
		int l = objects.size();
		
		System.out.println(l);
		
		// these many pages
		
		LinkedList<LinkedList<Retail>> pages = new 	LinkedList<LinkedList<Retail>>();
		
		int i = 0,k=0;
		HashMap<Integer,Integer> hm = new 	HashMap<Integer,Integer>();
		
		LinkedList<Retail> p = new LinkedList<Retail>();
		
		
		while(objects.size() > 0) {
			
			int j = 0;
			
			while(p.size() < 12 && j < objects.size()) {
				Retail obj = objects.get(j);
				if(hm.get(obj.getHostId()) == null) {
					p.add(obj);
					hm.put(obj.hostId, 1);
					objects.remove(j);
				} else{
					j++;
				}
			}
			
			pages.add(p);
			
			p = new LinkedList<Retail>();
			hm = new HashMap<Integer,Integer>();
	}
	
		for(LinkedList<Retail> r : pages) {
			for(Retail o : r) {
				System.out.println("Page " + o.getHostId() + " " + o.getListId() +" " + o.getScore() + " " + o.getLocation());
			}
			System.out.println();
		}
		
   }
}