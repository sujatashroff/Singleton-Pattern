
public class Singleton_Main {

	public static void main(String[] args) {
		AppConfig instance = AppConfig.getInstance();
		System.out.println(instance) ;
		System.out.println("Trade Type " + instance.mTradeType) ;
		System.out.println("Trade Level " + instance.mLevel) ;
		
		AppConfig instance2 = AppConfig.getInstance();
		System.out.println(instance2);
		System.out.println("Trade Type " + instance.mTradeType) ;
		System.out.println("Trade Level " + instance.mLevel) ;
	}
}
