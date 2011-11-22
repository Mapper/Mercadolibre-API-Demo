package framework;

import static apidemo.common.HttpHelper.get;

/**
 * @author Fernando Scasserra @fersca
 */
public class Search {

	public static String getItemList(String word) {
		
		//Search for products in Argentina
		String publicJson = get("https://api.mercadolibre.com/sites/MLA/search?q="+word);			
		return publicJson;
		
	}
	
}
