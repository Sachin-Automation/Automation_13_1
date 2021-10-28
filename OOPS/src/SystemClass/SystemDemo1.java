package SystemClass;

public class SystemDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// checking specific property
		System.out.println("System user Dir:"+System.getProperty("user.home"));
		System.out.println("Current Working Dir: "+System.getProperty("user.dir"));
		// clearing this property
		System.clearProperty("user.home");//null
		System.out.println(System.getProperty("user.home"));

		// setting specific property
		System.setProperty("user country","IND");
		System.out.println(System.getProperty("user.country"));
		// checking property other than system property
	    // illustrating getProperty(String key, String def)
		System.out.println(System.getProperty("user.password", "none of your business"));
		System.out.println(" \"difference between the current time and midnight, January 1, 1970 UTC is:"+ System.currentTimeMillis());
		
		System.out.println("current time in " + "nano sec: " + System.nanoTime());

	}

}
