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

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

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
		String string = jedisClientSingle.set("redis", "redis");
		System.out.println("string = "+string);
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#hget(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testHget() {
		String string = jedisClientSingle.hget("hset","key");
		System.out.println("string = "+string);
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#hset(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testHset() {
		Long string = jedisClientSingle.hset("hset", "key", "redis");
		System.out.println("string ="+string);
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#incr(java.lang.String)}.
	 */
	@Test
	public void testIncr() {
		Long string = jedisClientSingle.incr("key");
		System.out.println("string = "+ string);
		
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#expire(java.lang.String, int)}.
	 */
	@Test
	public void testExpire() {
		Long string = jedisClientSingle.expire("key", 2000);
		System.out.println("string = "+string);
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#ttl(java.lang.String)}.
	 */
	@Test
	public void testTtl() {
		Long string = jedisClientSingle.ttl("key");
		System.out.println("string = "+string);
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#del(java.lang.String)}.
	 */
	@Test
	public void testDel() {
		Long string = jedisClientSingle.del("key");
		System.out.println("string ="+string);
	}

	/**
	 * Test method for {@link com.taotao.jedis.dao.impl.JedisClientSingle#hdel(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testHdel() {
		Long string = jedisClientSingle.hdel("hset", "key");
		System.out.println("string ="+string);
	}

}
