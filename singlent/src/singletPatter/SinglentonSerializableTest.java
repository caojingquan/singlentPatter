package singletPatter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SinglentonSerializableTest {

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("caojq.obj");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(SinglentonSerializable.getInstance());
		oos.flush();
		oos.close();
		out.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("caojq.obj"));
		SinglentonSerializable instance = (SinglentonSerializable)ois.readObject();
		System.out.println(instance == SinglentonSerializable.getInstance());
		
		Constructor constructor = Class.forName(SinglentonSerializable.class.getName()).getDeclaredConstructor();
		constructor.setAccessible(true);
		System.out.println(SinglentonSerializable.getInstance() == (SinglentonSerializable)constructor.newInstance());
	}

}
