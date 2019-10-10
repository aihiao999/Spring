package com.lywgames.dao.impl;

import com.lywgames.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void insert() {
		System.out.println("插入User对象。");
	}

	@Override
	public void select() {
		System.out.println("查询User对象。");
	}

	@Override
	public void update() {
		System.out.println("更新User对象。");
	}

	@Override
	public void delete() {
		System.out.println("删除User对象。");
	}

}
