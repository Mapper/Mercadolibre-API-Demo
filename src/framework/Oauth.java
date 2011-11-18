package framework;

import static apidemo.common.HttpHelper.post;

/**
 * @author Fernando Scasserra @fersca
 */
public class Oauth {

	static final String client_id="3105";
	static final String client_secret="QipYOtlbkQ1tRUOBGqXzC3f3W1FKULLa";
	static final String grant_type="authorization_code";
	static final String redirect_uri="http%3A%2F%2Fapi-demo-web.appspot.com%2Fapi_demo_web";
	
	public static String getAccessToken(String code) {
					
		String data="grant_type="+grant_type+"&client_id="+client_id+"&client_secret="+client_secret+"&redirect_uri="+redirect_uri+"&code="+code;
		
		String json = post("https://api.mercadolibre.com/oauth/token",data);
					
		return getAccessTokenJson(json);
	
	}	
	
	private static String getAccessTokenJson(String json){

		//Please do it professionally, using a json parser, this is only a demo.
		int pos1 = json.indexOf(":");
		int pos2 = json.indexOf(",", pos1+2);
				
		return json.substring(pos1+2, pos2-1);

	}
	
}
