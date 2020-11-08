abstract class Animal{     // Abstract class doest not have a body,it is provided by Subclass
	abstract void sound();  //Abstract method 
    void animaSound(){      // Regular Method
    	System.out.println("This is animaSound");
    }
}

    class Dog extends Animal{
	void sound(){System.out.println("This is Dog");}
	public static void main(String[] args) {
		Animal obj=new Dog();
		Animal obj1=new Dog();
		       obj.sound();
		       obj1.animaSound();
	}
}


