/**  
 * @Title:  JedisClient.java   
 * @Package com.taotao.jedis.dao   
 * @Description:       
 * @author: chenjuntao     
 * @date:   2018年5月5日 下午5:48:10   
 * @version V1.0 
 */
package com.taotao.jedis.dao;

import java.util.List;
import java.util.Map;

/**   
 * @ClassName:  JedisClient   
 * @Description: 
 * @author: chenjuntao
 * @date:   2018年5月5日 下午5:48:10   
 * @version V1.0  
 */
public interface JedisClient {
	
	String get(String key);
	String set(String key,String value);
	String hget(String hkey,String key);
	Map<String, String> hgetAll(String hkey);
	long hset(String hkey,String key,String value);
	long incr(String key);
	long expire(String key,int second);
	long ttl(String key);
	long del(String key);
	long hdel(String hkey ,String key);
	Long lpush(String key,String value);
	List<String> lrange(String key,Long start,Long end);
	

}
