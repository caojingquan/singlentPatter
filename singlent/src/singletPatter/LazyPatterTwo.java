package singletPatter;
/**
 *懒汉式
 *采用双重锁机制
 *但是采用了synchronized关键字会有性能问题，会有锁监听monitorenter和monitorexit的过程 
 */
public class LazyPatterTwo {
	private static  LazyPatterTwo lazy;
	
	private LazyPatterTwo(){
		if(lazy != null)throw new RuntimeException("不允许采用这种方式创建对象");
	}
	
	/**
	 * 每个类在加载的时候会创建一个类对象(类的元信息)
	 * 放在方法区，锁住的就是这个对象
	 */
	public static synchronized LazyPatterTwo getInstance(){
		if(lazy == null){
			lazy = new LazyPatterTwo();
		}
		return lazy;
	}
	
	/**
	 *采用双重锁可以让其他调用此方法的线程不用再等待获取此对象的锁直接可以进入此方法
	 *判断后就能够退出，性能上得到了提升 
	 */
	public static  LazyPatterTwo getInstanceTwo(){
		if(lazy == null){
			synchronized (lazy) {
				if(lazy == null){
					lazy = new LazyPatterTwo();
				}
			}
		}
		return lazy;
	}
}
