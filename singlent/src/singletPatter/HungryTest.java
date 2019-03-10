package singletPatter;

import java.lang.reflect.Constructor;

public class HungryTest {

	public static void main(String[] args) {
		try{
			HungryPatterOne other = HungryPatterOne.getInstance();
			System.out.println(other);
			Class clazz = Class.forName(HungryPatterOne.class.getName());
			Constructor con = clazz.getDeclaredConstructor(null);
			con.setAccessible(true);
			HungryPatterOne hungry = (HungryPatterOne)con.newInstance(null);
			System.out.println(hungry);
			System.out.println(hungry == other);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
