package singletPatter;

/**
 * 懒汉式加载
 *采用静态内部类的方式获取单例模式
 *原因是因为：在JVM中的加载机制上只有在
 *调用getInstance方法的时候才会初始化静态内部类 
 */
public class LazyPatterOne {
	
	
	private LazyPatterOne(){
		System.out.println("调用了私有的无参构造方法");
//		System.out.println(inner.hungry);
//		if(null == inner.hungry){
//			System.out.println("hungry还没有初始化");
//		}else{
//			System.out.println("hungry已经初始化过了");
//		}
		if(inner.hungry != null)throw new RuntimeException("不允许用此方法创建更多实例");
	}
	
	public static LazyPatterOne getInstance(){
		return inner.hungry;
	}
	
	private static class inner{
		private static LazyPatterOne hungry = new LazyPatterOne();
	}
	
}
