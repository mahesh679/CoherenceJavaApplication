package com.nisum;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String key = "JavaHonk";
		String value = "Java Honk Hello World!";

		CacheFactory.ensureCluster();
		NamedCache cache = CacheFactory.getCache("javahonk-hello-world");

		cache.put(key, value);
		System.out.println((String) cache.get(key));

		CacheFactory.shutdown();
	}
}
