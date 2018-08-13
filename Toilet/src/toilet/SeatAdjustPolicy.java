package toilet;


public interface SeatAdjustPolicy {

	public String getDefaultStatus();
	
	public int count(String queue);
	public boolean needPreAdjust(String preStatus, String curPrefer);
	public boolean needAfterAdjust(String curPrefer);
	public void doSomething();
	
}
