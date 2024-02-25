class Main {
  	public static boolean q1(int num, Queue <Integer> q) {
		q.insert(null);
		boolean seq = false;
		
		while(q.head() != null) {
			if (q.head() == num) {
				q.insert(q.remove());
				if(q.head() == num)
					seq = true;
			}
			if(q.head() != null)
				q.insert(q.remove());	
		}
		q.remove();
		return seq;
	}


  
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
