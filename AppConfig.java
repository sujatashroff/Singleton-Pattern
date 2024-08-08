
public class AppConfig {
	private static AppConfig instance ;
	String mTradeType;
	String mLevel;
	
	private AppConfig(String tradeType, String level) 
	{
		mTradeType = tradeType;
		mLevel = level ;
		
	} ;
	
	public static AppConfig getInstance() {
		if(instance == null) {
			synchronized(AppConfig.class) {
			     instance = new AppConfig("A" , "Medium") ;
			}
		}
		return instance ;
	}
	
	

}
