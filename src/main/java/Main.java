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

		public static Time q2_a(Queue <Time> q) {
		q.insert(null);
		int hour = q.head().getHour();
		int min = q.head().getMinute();
		int sec = q.head().getSecond();
		Time difference = new Time(hour, min, sec);
		
		while(q.head() != null) {
			hour = q.head().getHour();
			min = q.head().getMinute();
			sec = q.head().getSecond();
			q.insert(q.remove());			
		}
		q.remove();
		
		difference.setHour(hour - difference.getHour());
		
		if(difference.getMinute() > min )
			difference.setMinute(60 - min);
		
		if (difference.getSecond() > sec)
			difference.setSecond(difference.getSecond() - sec);
		
		difference.setSecond(sec - difference.getSecond());
		return difference;
	}


  
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
