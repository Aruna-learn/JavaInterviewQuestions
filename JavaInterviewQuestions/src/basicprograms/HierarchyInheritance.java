package basicprograms;

//hierarchy -parent having multiple childs and no relation between those childs
class Parent{
	int x;
	void shiva() {
		System.out.println(x);
	}
}


class child1 extends Parent{
	int y;
	void lord() {
		System.out.println(y);
	}
}


class child2 extends Parent{
	int z;
	void lordshoiva() {
		System.out.println(z);
	}
}









public class HierarchyInheritance {

	public static void main(String[] args) {
		child2 cc=new child2();
		cc.x=89;
		cc.z=90;
		cc.shiva();
		cc.lordshoiva();

		
		child1 c=new child1();
		c.x=89;
		c.y=900;
		c.shiva();
		c.lord();
		
	}

}
