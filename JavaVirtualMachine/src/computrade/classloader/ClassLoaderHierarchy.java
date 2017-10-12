package computrade.classloader;

public class ClassLoaderHierarchy {


	public static void main(String[] args) throws ClassNotFoundException {

		ClassLoader cl = java.lang.String.class.getClassLoader();
		System.out.println("Class loader for String: "+ cl + " (null is bootstrap)");
		
		cl = com.sun.nio.zipfs.ZipFileSystem.class.getClassLoader();
		System.out.println("Class loader for ZipFileSystem: "+ cl);
		
		cl = org.junit.Assert.class.getClassLoader();
		System.out.println("Class loader for Assert class: " + cl );
		
		cl =  ClassLoaderHierarchy.class.getClassLoader();
		System.out.println("Class loader for this class: "+ cl);
		
	}

	

}
