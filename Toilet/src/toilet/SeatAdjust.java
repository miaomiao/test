package toilet;

public class SeatAdjust {
	
	public static void main(String[] args){
		
		SeatAdjustPolicy policy;
		
		String q = "UUUDDUDU";
		policy = new UpSeatAdjustPolicy("U");
		System.out.println(policy.count(q));
		policy = new DownSeatAdjustPolicy("D");
		System.out.println(policy.count(q));
		policy = new WlSeatAdjustPolicy(null);
		System.out.println(policy.count(q));
	}
	
}
