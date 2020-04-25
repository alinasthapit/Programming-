import java.util.Scanner;
class Mobile {
void memory(){
	System.out.println("It has 32 GB");
    }
}
class Nokia extends Mobile{
	void nokiaFeatures(){
		System.out.println("Nokia features ");
	}
}
class Samsung extends Mobile{
	void samsungFeatures(){
		System.out.println("Samsung features ");
	}
}
class InheritanceDemo{
	public static void main(String[]args){
		Nokia x = new Nokia();
		x.memory();
		x.nokiaFeatures();
		Samsung y = new Samsung();
		y.memory();
		y.samsungFeatures();
	}
}
