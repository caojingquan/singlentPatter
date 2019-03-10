package singletPatter;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
	
	private static final Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

	public static Object getBean(String className){
		if(!ioc.containsKey(className)){
			synchronized(ContainerSingleton.class){
			try{
				if(!ioc.containsKey(className)){
					Class clazz = Class.forName(className);
					Constructor cou = clazz.getDeclaredConstructor();
					Object obj = cou.newInstance();
					ioc.put(className,obj);
					return obj;				}else{
					return ioc.get(className);
				}
		}catch (Exception e){
	//		e.printStackTrace();
		}
			return null;
		}
		}
		return ioc.get(className);
	}	
}
