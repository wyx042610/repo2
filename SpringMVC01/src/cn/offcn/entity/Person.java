package cn.offcn.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Person {

	String name;
	Integer age;
	String[] arr = new String[3];
	Dog dog;
	List<Dog> dogs;
	Map<String, Dog> mdogs;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the arr
	 */
	public String[] getArr() {
		return arr;
	}
	/**
	 * @param arr the arr to set
	 */
	public void setArr(String[] arr) {
		this.arr = arr;
	}
	/**
	 * @return the dog
	 */
	public Dog getDog() {
		return dog;
	}
	/**
	 * @param dog the dog to set
	 */
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	/**
	 * @return the dogs
	 */
	public List<Dog> getDogs() {
		return dogs;
	}
	/**
	 * @param dogs the dogs to set
	 */
	public void setDogs(List<Dog> dogs) {
		this.dogs = dogs;
	}
	/**
	 * @return the mdogs
	 */
	public Map<String, Dog> getMdogs() {
		return mdogs;
	}
	/**
	 * @param mdogs the mdogs to set
	 */
	public void setMdogs(Map<String, Dog> mdogs) {
		this.mdogs = mdogs;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", arr=" + Arrays.toString(arr) + ", dog=" + dog + ", dogs="
				+ dogs + ", mdogs=" + mdogs + "]";
	}
	
	
	
}
