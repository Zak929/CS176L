import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupProject {

	public static void main(String[] args) throws IOException {
		final int arrayLength2022 = 130;
		final int arrayLength2021 = 132;
		final int arrayLength2020 = 142;
		ArrayList<String> array2022 = new ArrayList<String>(arrayLength2022);
		try {
			// fetch the document over HTTP
		    Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&page=1_130").get();
		    // get the page title
		    String title = doc.title();
		    //System.out.println("title: " + title);
		    
		    Elements links = doc.select("tbody");
		    String name;
		    int counter = 0;
		    for (Element link : links.select("td.grid_line_regular")) {
		    	name = link.select("a").text();
		    	if (name !="" && name.length() != 3) {
		    		//System.out.println(name);
		    		array2022.add(name);
		    		counter++;
		    	}
		    	if (counter == 130) {
		    		break;
		    	}	    	
		    }
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		ArrayList<String> array2021 = new ArrayList<String>(arrayLength2021);
		try {
			// fetch the document over HTTP
		    Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&page=1_132").get();
		    // get the page title
		    String title = doc.title();
		    //System.out.println("title: " + title);
		    
		    Elements links = doc.select("tbody");
		    String name;
		    int counter = 0;
		    for (Element link : links.select("td.grid_line_regular")) {
		    	name = link.select("a").text();
		    	if (name !="" && name.length() != 3) {
		    		array2021.add(name);
		    		counter++;
		    	}
		    	if (counter == 132) {
		    		break;
		    	}
		    }
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<String> array2020 = new ArrayList<String>(arrayLength2020);
		try {
			// fetch the document over HTTP
		    Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&page=1_142").get();
		    // get the page title
		    String title = doc.title();
		    //System.out.println("title: " + title);
		    
		    Elements links = doc.select("tbody");
		    String name;
		    int counter = 0;
		    for (Element link : links.select("td.grid_line_regular")) {
		    	name = link.select("a").text();
		    	if (name !="" && name.length() != 3) {
		    		array2020.add(name);
		    		counter++;
		    	}
		    	if (counter == 142) {
		    		break;
		    	}
		    }
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<String> repeat = new ArrayList<String>(142);
		ArrayList<String> all_repeat = new ArrayList<String>(142);
		ArrayList<Double> arrayList_AVG_POS = new ArrayList<Double>(9);
		for(int i = 0; i< array2022.size(); i++) {
			if(array2021.contains(array2022.get(i))) {
			//System.out.println(arrayList_2022.get(i));
			repeat.add(array2022.get(i));
			}
		}
			for(int i = 0; i< repeat.size(); i++) {
			if(array2020.contains(repeat.get(i))) {
			all_repeat.add(repeat.get(i));
			}
			}
			System.out.println();
			for(int i = 0; i< all_repeat.size(); i++) {
			arrayList_AVG_POS.add(((array2022.indexOf(all_repeat.get(i)) + 1) +
			(array2021.indexOf(all_repeat.get(i)) + 1) + (array2020.indexOf(all_repeat.get(i)) + 1))
			/ 3.0);
			}
			TreeMap<Double, String> ranks = new TreeMap<Double, String>();
			for(int i = 0; i< all_repeat.size(); i++) {
			ranks.put(arrayList_AVG_POS.get(i), all_repeat.get(i));
			}
			System.out.println("THE TOP TEN PLAYERS FROM 2022,2021,2020");
			System.out.println();
			for(int x = 0; x<11; x++) {
			Map.Entry<Double, String> namePLUSrank = ranks.pollFirstEntry();
			String names = namePLUSrank.getValue();
			Double rank = namePLUSrank.getKey();
			System.out.println(x+1 + " : " + names + " || " + rank);
			}
		
	}
}

