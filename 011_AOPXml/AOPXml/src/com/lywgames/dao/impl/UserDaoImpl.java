package com.lywgames.dao.impl;

import com.lywgames.dao.UserDao;

public class UserDaoImpl implements UserDao {

	public void insert() {
		System.out.println("插入数据");
	}

	public void select() {
		System.out.println("查询数据");
	}

	public void update() {
		System.out.println("更新数据");
		throw new RuntimeException();
	}

	public int delete() {
		System.out.println("删除数据");
		return 1;
	}

}
