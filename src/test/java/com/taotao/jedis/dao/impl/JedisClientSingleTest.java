/**  
 * @Title:  JedisClientSingleTest.java   
 * @Package com.taotao.jedis.dao.impl   
 * @Description:       
 * @author: chenjuntao     
 * @date:   2018年5月5日 下午6:19:18   
 * @version V1.0 
 */
package com.taotao.jedis.dao.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

/**   
 * @ClassName:  JedisClientSingleTest   
 * @Description: 
 * @author: chenjuntao
 * @date:   2018年5月5日 下午6:19:18   
 * @version V1.0  
 */
public class JedisClientSingleTest {
	
	private JedisClientSingle jedisClientSingle ;
	
	@Before
	public void newJedisClientSingle(){
		try {
			Jedis jedis = new Jedis("192.168.199.185", 6379);
			jedisClientSingle = new JedisClientSingle(jedis);
		} catch (Exception e) {
			System.out.println("Message:"+e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#get(java.lang.String)}.
	 */
	@Test
	public void testGet() {
		
		String string = jedisClientSingle.get("key");
		System.out.println("value="+string);
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#set(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSet() {
		
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#hget(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testHget() {
		
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#hset(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testHset() {
		
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#incr(java.lang.String)}.
	 */
	@Test
	public void testIncr() {
		
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#expire(java.lang.String, int)}.
	 */
	@Test
	public void testExpire() {
		
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#ttl(java.lang.String)}.
	 */
	@Test
	public void testTtl() {
		
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#del(java.lang.String)}.
	 */
	@Test
	public void testDel() {
		
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#hdel(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testHdel() {
		
	}

}
