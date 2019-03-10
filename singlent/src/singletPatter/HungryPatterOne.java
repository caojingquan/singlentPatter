package singletPatter;
/**
 * 饿汉式
 *在类加载的时候就已经完成了初始化，所以不存在线程安全问题
 *优点：1.线程安全。2.只有一个实例不会占用多余空间。
 *缺点：1.在类加载的时候就会初始化，如果一直没有使用就会占用空间，如果这种类多了以后会有内存溢出 
 */
public class HungryPatterOne {
	
	private static final HungryPatterOne hungry = new HungryPatterOne();
	
	private HungryPatterOne(){
		System.out.println(hungry);
//		if(hungry != null){
//			throw new RuntimeException("此类为单例模式，不能用此方法创建多个对象");
//		}
	}
	
	public static HungryPatterOne getInstance(){
		return hungry;
	}
	

}
