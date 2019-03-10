package singletPatter;

import java.io.Serializable;

public class SinglentonSerializable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final SinglentonSerializable instance = new SinglentonSerializable();
	
	private SinglentonSerializable(){}

	public static SinglentonSerializable getInstance(){
		return instance;
	}
	
	/**在底层的readObject会先调用反射来创建出一个此类的对象(并没有返回)，
	 *然后在后面会判断是否存在readResolve方法来给出返回的对象,
	 *如果这样的方式创建得多的话，那么垃圾回收也是个问题
	 */
	public Object readResolve(){
		return instance;
//		return new SinglentonSerializable();
	}
}
