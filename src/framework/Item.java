package framework;

import static apidemo.common.HttpHelper.post;

/**
 * @author Fernando Scasserra @fersca
 */
public class Item {


	public static String listItem(String quantity, String title, String category, String price, String access_token) {
		
		String data="{\"site_id\": \"MLA\",\"title\": \""+title+"\",\"category_id\": \""+category+"\",\"price\": "+price+",\"currency_id\": \"ARS\",\"available_quantity\": "+quantity+",\"buying_mode\": \"buy_it_now\",\"listing_type_id\": \"bronze\",\"condition\":\"new\"}";
		
		System.out.println("data: "+data);
		System.out.println("URL: "+"https://api.mercadolibre.com/items?access_token="+access_token);
		String json = post("https://api.mercadolibre.com/items?access_token="+access_token,data,"application/json");
					
		return getItemId(json);
	
	}

	private static String getItemId(String json) {		
		return json;
	}	
	
}
