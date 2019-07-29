package serializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


	
	class test implements Serializable{
		
		
		int i=10;
		int j=20;
	}
		
	public class SerializationDeserializationDemo{
		
	
	
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//Serialization
		test t1=new test();
		
		FileOutputStream fos=new FileOutputStream("test.text");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(t1);
		
		//Deserialization
		
		FileInputStream fis=new FileInputStream("test.text");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		test t2=(test)ois.readObject();
		
		
		System.out.println(t2.i);

	}

	}
