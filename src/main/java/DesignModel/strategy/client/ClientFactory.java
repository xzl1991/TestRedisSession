package DesignModel.strategy.client;

import DesignModel.strategy.MyClass;

public class ClientFactory {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.testFactoy(1);
		myClass.testFactoy(2);
		myClass.testFactoy(10);
		
	}

}