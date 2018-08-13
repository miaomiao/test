package toilet;

public class UpSeatAdjustPolicy implements SeatAdjustPolicy{

	public String defaultStatus;
	
	public UpSeatAdjustPolicy(String status){
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
			if(needPreAdjust(i==1?String.valueOf(queue.charAt(i-1)):getDefaultStatus(), String.valueOf(queue.charAt(i))))
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
		return curPrefer.equals(defaultStatus)?false:true;
	}
	@Override
	public void doSomething() {
		
	}

}
