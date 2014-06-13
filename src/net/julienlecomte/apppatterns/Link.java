package net.julienlecomte.apppatterns;

import java.util.ArrayList;

public class Link {
	
	public String title;
	public String domain;
	public String tag1;
	public String tag2;
	public String tag3;
	
	public Link(String title, String domain, String tag1, String tag2, String tag3) {
		this.title = title;
		this.domain = domain;
		this.tag1 = tag1;
		this.tag2 = tag2;
		this.tag3 = tag3;
	}
	
	public static ArrayList<Link> getLinks() {
		ArrayList<Link> links = new ArrayList<Link>();
		links.add(new Link("Yahoo", "www.yahoo.com", "search", "news", "sports"));
		links.add(new Link("The Verge", "www.theverge.com", "news", "rumors", "technology"));
		links.add(new Link("Github", "www.github.com", "code", "iOS", "android"));
		return links;
	}

}
