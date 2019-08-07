package com.kiran.innerclass;

class Local {

	int j=90;

	public void myMethod() {
		class Access {

			int i = 0;

			public void myMethod3() {
				System.out.println(j);
			}
		}
		Access access = new Access();
		access.myMethod3();

	}
}

public class DemoLocalInnerClass {

	public static void main(String[] args) {

		Local local=new Local();
		local.myMethod();
		
	}

}
