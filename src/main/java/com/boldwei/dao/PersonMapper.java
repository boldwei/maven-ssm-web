/**
 * 
 */
/**
 * @author chenwei
 *
 */
package com.boldwei.dao;

import java.util.List;

import com.boldwei.model.Person;

public interface PersonMapper { /** * 插入一条记录
     * @param person */ 
	void insert(Person person); /** * 查询所有
     * @return */ 
	List<Person> queryAll();
}