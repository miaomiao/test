package toilet;

public class WlSeatAdjustPolicy implements SeatAdjustPolicy {

	public String defaultStatus;
	
	public WlSeatAdjustPolicy(String status){
		this.defaultStatus = status;
	}

	@Override
	public String getDefaultStatus() {
		// TODO Auto-generated method stub
		return defaultStatus;
	}
	@Override
	public int count(String queue) {
		int c = 0;
		for(int i = 1 ;i<queue.length(); i++){
			if(needPreAdjust(String.valueOf(queue.charAt(i-1)), String.valueOf(queue.charAt(i))))
				c++;
			if(needAfterAdjust(String.valueOf(queue.charAt(i))))
				c++;
		}
		return c;
	}
	
	@Override
	public boolean needPreAdjust(String preStatus, String curPrefer) {
		
		return preStatus.equals(curPrefer)?false:true;
	}
	@Override
	public boolean needAfterAdjust(String curPrefer) {
		return false;
	}
	@Override
	public void doSomething() {
		
	}
}
