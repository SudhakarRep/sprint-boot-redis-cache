package com.concretepage;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableCaching
@EnableScheduling
//@PropertySource(value = { "classpath:/cache.properties" })
public class CacheSchedule {
	


	
	@CacheEvict(allEntries = true, cacheNames = { "articleCache","allArticlesCache"})
	@Scheduled(fixedDelay = 30000)
	//@Scheduled(fixedDelayString = "${cache.flush.fixed.delay1}")
	public void cacheEvict() {
		System.out.println("from cache Evict...");
	}

	@CacheEvict(allEntries = true, cacheNames = { "articleCache","allArticlesCache"})
	//@Scheduled(fixedDelay = 60000)
	//@Scheduled(fixedDelayString = "${cache.flush.fixed.delay2}")
	public void cacheEvict2() {
		System.out.println("from cache Evict 2...");
	}
	
}
