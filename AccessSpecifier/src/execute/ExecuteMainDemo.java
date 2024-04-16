package execute;

import p1.IndependentClassInP1Package;
import p1.Protection;
import p1.SubClassInP1Package;
import p2.IndependentClassInP2Package;
import p2.SubClassInP2Package;

public class ExecuteMainDemo {

	public static void main(String[] args) {
		//Execute Protection class constructor
	//	Protection obj1=new Protection();
		//Execute SubClassInP1Package class constructor
	//	SubClassInP1Package obj2=new SubClassInP1Package();
		//Execute IndependentClassInP1Package class constructor
	//	IndependentClassInP1Package obj3=new IndependentClassInP1Package();
		//Execute SubClassInP2Package class constructor
	//	SubClassInP2Package obj4=new SubClassInP2Package();
		//Execute IndependentClassInP2Package class constructor
		IndependentClassInP2Package obj5=new IndependentClassInP2Package();
	}

}
