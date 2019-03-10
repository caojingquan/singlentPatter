package singletPatter;
/**
 *与前一个一样 
 */
public class HungryPatterTwo {
	private static final HungryPatterTwo hungry;
	static{
		hungry = new HungryPatterTwo();
	}
	private HungryPatterTwo(){}
	
	public HungryPatterTwo getInstance(){
		return hungry;
	}
}
