package framework;

import static apidemo.common.HttpHelper.get;

/**
 * @author Fernando Scasserra @fersca
 */
public class User {

	public static String getUserInfo(String userId) {
		
		//Get the public user info (no access_token required)
		String publicJson = get("https://api.mercadolibre.com/users/"+userId);
		return publicJson;
	
	}

	public static String getMeInfo(String accessToken) {

		//Get the public user info (no access_token required)
		String publicJson = get("https://api.mercadolibre.com/users/me?access_token="+accessToken);
		return publicJson;
		
	}

}
