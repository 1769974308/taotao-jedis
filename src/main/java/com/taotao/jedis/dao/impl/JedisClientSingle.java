/**  
 * @Title:  JedisClientSingle.java   
 * @Package com.taotao.jedis.dao.impl   
 * @Description:       
 * @author: chenjuntao     
 * @date:   2018年5月5日 下午5:49:51   
 * @version V1.0 
 */
package com.taotao.jedis.dao.impl;

import com.taotao.jedis.dao.JedisClient;

import redis.clients.jedis.Jedis;

/**   
 * @ClassName:  JedisClientSingle   
 * @Description: 
 * @author: chenjuntao
 * @date:   2018年5月5日 下午5:49:51   
 * @version V1.0  
 */
public class JedisClientSingle implements JedisClient {
	
	private Jedis jedis;

	public JedisClientSingle() {
		super();
	}
	
	public JedisClientSingle(Jedis jedis) {
		super();
		this.jedis = jedis;
	}

	/* (non-Javadoc)
	 * @see com.taotao.jedis.dao.JedisClient#get(java.lang.String)
	 */
	public String get(String key) {
		String value = jedis.get(key);
		jedis.close();
		return value;
	}

	/* (non-Javadoc)
	 * @see com.taotao.jedis.dao.JedisClient#set(java.lang.String, java.lang.String)
	 */
	public String set(String key, String value) {
		String string = jedis.set(key, value);
		jedis.close();
		return string;
	}

	/* (non-Javadoc)
	 * @see com.taotao.jedis.dao.JedisClient#hget(java.lang.String, java.lang.String)
	 */
	public String hget(String hkey, String key) {
		String value = jedis.hget(hkey, key);
		jedis.close();
		return value;
	}

	/* (non-Javadoc)
	 * @see com.taotao.jedis.dao.JedisClient#hset(java.lang.String, java.lang.String, java.lang.String)
	 */
	public long hset(String hkey, String key, String value) {
		Long string = jedis.hset(hkey, key, value);
		jedis.close();
		return string;
	}

	/* (non-Javadoc)
	 * @see com.taotao.jedis.dao.JedisClient#incr(java.lang.String)
	 */
	public long incr(String key) {
		Long string = jedis.incr(key);
		jedis.close();
		return string;
	}

	/* (non-Javadoc)
	 * @see com.taotao.jedis.dao.JedisClient#expire(java.lang.String, int)
	 */
	public long expire(String key, int second) {
		Long string = jedis.expire(key, second);
		jedis.close();
		return string;
	}

	/* (non-Javadoc)
	 * @see com.taotao.jedis.dao.JedisClient#ttl(java.lang.String)
	 */
	public long ttl(String key) {
		Long string = jedis.ttl(key);
		jedis.close();
		return string;
	}

	/* (non-Javadoc)
	 * @see com.taotao.jedis.dao.JedisClient#del(java.lang.String)
	 */
	public long del(String key) {
		Long string = jedis.del(key);
		jedis.close();
		return string;
	}

	/* (non-Javadoc)
	 * @see com.taotao.jedis.dao.JedisClient#hdel(java.lang.String, java.lang.String)
	 */
	public long hdel(String hkey, String key) {
		Long string = jedis.hdel(hkey, key);
		jedis.close();
		return string;
	}

}
