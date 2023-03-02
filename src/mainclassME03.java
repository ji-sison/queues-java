public class mainclassME03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainQueue mainQ = new MainQueue();
		Integer inputarray[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		
		for (int i = 0; i < inputarray.length; i++) {
			mainQ.enqueue(inputarray[i]);
		}
		
		mainQ.dequeue();
		mainQ.dequeue();
		mainQ.dequeue();
		mainQ.dequeue();
		mainQ.printQ();
		mainQ.enqueue(9);
		mainQ.printQ();
		
	}

}//end mainclass