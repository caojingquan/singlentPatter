package singletPatter;

import java.lang.reflect.Constructor;

public class LazyTest {

	public static void main(String[] args) {
		try{
			Class<?> clazz = Class.forName(LazyPatterOne.class.getName());
			Constructor<?> cou = clazz.getDeclaredConstructor();
			cou.setAccessible(true);
			System.out.println("3");
			Object obj = cou.newInstance();
			System.out.println("4");
			Object obj2 = cou.newInstance();
			System.out.println("5");
			System.out.println(obj == obj2);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
