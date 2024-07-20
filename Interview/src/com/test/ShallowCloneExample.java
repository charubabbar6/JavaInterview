package com.test;

class Person implements Cloneable {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	public void setName(String name) {
		// TODO Auto-generated method stub
		 this.name = name;
	}

	
}

public class ShallowCloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("John", 25);

        // Shallow clone
        Person person2 = (Person) person1.clone();

        // Output the information of both instances
        System.out.println("Original Person: " + person1.getName() + ", " + person1.getAge());
        System.out.println("Cloned Person: " + person2.getName() + ", " + person2.getAge());

        // Modify the cloned object
        person2.setName("Jane");

        // Output the information again
        System.out.println("Original Person: " + person1.getName() + ", " + person1.getAge());
        System.out.println("Cloned Person: " + person2.getName() + ", " + person2.getAge());
    }
}