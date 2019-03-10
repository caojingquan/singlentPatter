package singletPatter;

/**
 *注册式单例（1.将单例对象放到一个容器中，用唯一标识来获取。 2.采用枚举值的方式，因为JDK源码里面做了控制） 
 */
public enum EnumSinglet {
	INSTANCE;
	
	private Object obj;
	
	public  void setData(Object obj){
		 this.obj = obj;
	}
	
	public Object getData(){
		return obj;
	}
	
	public static EnumSinglet getInstance(){
		return INSTANCE;
	}
	
	
	
}
