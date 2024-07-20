package com.test.clonning;

import java.io.*;

class Person implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
}

public class DeepCloneExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("John", 25);

        // Deep clone using serialization/deserialization
        Person person2 = deepClone(person1);

        // Output the information of both instances
        System.out.println("Original Person: " + person1.getName() + ", " + person1.getAge());
        System.out.println("Cloned Person: " + person2.getName() + ", " + person2.getAge());

        // Modify the cloned object
        person2.setName("Jane");

        // Output the information again
        System.out.println("Original Person: " + person1.getName() + ", " + person1.getAge());
        System.out.println("Cloned Person: " + person2.getName() + ", " + person2.getAge());
    }

    private static <T extends Serializable> T deepClone(T object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        oos.flush();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (T) ois.readObject();
    }
}