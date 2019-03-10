package singletPatter;

public class ThreadLocalSinglent {
	private static final ThreadLocal<ThreadLocalSinglent> local =
			new ThreadLocal<ThreadLocalSinglent>(){

				@Override
				protected ThreadLocalSinglent initialValue() {
					return new ThreadLocalSinglent();
				}
		
	};
	
	private ThreadLocalSinglent(){}
	
	public static ThreadLocalSinglent getInstance(){
		return local.get();
	}

}
