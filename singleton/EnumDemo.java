package singleton;

import singleton.SingletonEnum;

public class EnumDemo {

	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
        
        System.out.println(singleton2.getValue());
        singleton2.setValue(2);
        System.out.println(singleton2.getValue());
        
        System.out.println("Singleton :  " + singleton.hashCode());
        System.out.println("Singleton2 : " + singleton2.hashCode());
	}

}
