package kr.co.greenart.testjson;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Saramin {
	private static String getInfo(String link) throws IOException {
		String url = "https://www.saramin.co.kr";
		Document doc = Jsoup.connect(url + link).timeout(5000).get();
		String info = doc.select("meta[name=description]").first().attr("content");
		return info;
	}
	
	public static void main(String[] args) {
		String url = "https://www.saramin.co.kr/zf_user/search?search_area=main&search_done=y&search_optional_item=n&searchType=recently&searchword=JAVA&loc_mcd=117000&recuitpage=3";
		
		try {
			Document doc = Jsoup.connect(url).timeout(5000).get();
			Elements elems = doc.select("a[href]");
			
			Set<String> links = new HashSet<>();
			for (Element e : elems) {
				String attr = e.attr("href");
				if (attr.startsWith("/zf_user/jobs/relay/view")) {
					links.add(attr);
				}
			}
			for (String l : links) {
				String info = getInfo(l);
				System.out.println(info);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
