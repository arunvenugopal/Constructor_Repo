package packfinal;

public class ParamConstructor {

	public ParamConstructor(int id, String name)    // Parametrized Constructor creation.   only 1 constructor creation
	{
		System.out.println();
		System.out.println("The ID is: "+id);
		System.out.println();
		System.out.println("The name is: "+name);
	}


	public static void main(String []args)
	{
		ParamConstructor s=new ParamConstructor(10,"Arun V");            // will give 10 students details
        ParamConstructor m=new ParamConstructor(11,"Mahesh C"); 		// calling the parametrized constructor. No need of any separate calling. While calling just passing the values
	}

}
