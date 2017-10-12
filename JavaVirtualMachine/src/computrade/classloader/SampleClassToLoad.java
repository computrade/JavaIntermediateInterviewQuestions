package computrade.classloader;

public class SampleClassToLoad {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//trying to explicitly load this class again using Extension class loader
	    Class.forName("computrade.classloader.SampleClassToLoad");
	    //trying to load class which doesn't exist.
	    Class.forName("computrade.classloader.NonExistClass");
	    //trying to explicitly load this class again using Extension class loader
	    Class.forName("computrade.classloader.SampleClassToLoad", true ,  SampleClassToLoad.class.getClassLoader().getParent());
	   
	}

}
