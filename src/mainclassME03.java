public class mainclassME03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainQueue mainQ = new MainQueue();
		Integer inputarray[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		
		mainQ.enqueue(inputarray[0]);
		mainQ.enqueue(inputarray[1]);
		mainQ.enqueue(inputarray[2]);
		mainQ.enqueue(inputarray[3]);
		mainQ.enqueue(inputarray[4]);
		mainQ.enqueue(inputarray[5]);
		mainQ.enqueue(inputarray[6]);
		
		mainQ.dequeue();
		mainQ.printQ();
		
	}

}//end mainclass
