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

	public static Queue <Ball> q4(String [] arr, int n){
		Queue <Ball> q = new Queue <Ball> ();
		boolean [] size = {true, false};
		for (int i = 0; i < n; i++) {
			int r = (int) (Math.random() * 4) + 1;
			int s = (int) (Math.random() * 1) + 1;
			Ball b = new Ball (arr[r], size[s]);
			q.insert(b);
		}
		return q;
	}

	
public static void q6_service(Queue <Job> q, int time) {
		Queue <String> done = new Queue <String> ();
		q.insert(null);
		while(q.head() != null) {
			if(time - q.head().getTime() >= 0) {
				time -= q.head().getTime();
				done.insert(q.head().getCode());
			}
			q.insert(q.remove());
		}
		System.out.println(done);
	}
	
	
	
	
	
	public static String q9_find(Queue <Wolter> q, int cc) {
		q.insert(null);
		String id = "not found";
		boolean find = false;
		while(q.head() != null) {
			if(q.head().getCc() >= cc && find == false) {
				find = true;
				id = q.head().getId();
				q.remove();
			}
			q.insert(q.remove());
		}
		return id;
	}

  
  public static void main(String[] args) {
    Queue <Wolter> q = new Queue <Wolter> ();
		q.insert(new Wolter ("1234768", 340));
		q.insert(new Wolter ("2345098", 456));
		q.insert(new Wolter ("3456264", 678));
		q.insert(new Wolter ("4567193", 891));
		//System.out.print(q9_find(q, 880));
		
		Queue <Job> j = new Queue <Job> ();
		j.insert(new Job ("math", 340));
		j.insert(new Job ("english", 450));
		j.insert(new Job ("litreture", 670));
		j.insert(new Job ("history", 100));		
		q6_service(j, 1000);
  }
}
