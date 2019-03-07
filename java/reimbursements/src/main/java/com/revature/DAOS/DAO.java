package com.revature.DAOS;

import java.util.List;

public interface DAO<T> {
	List<T> getAll();
	T add(T obj);
	T update(T updatedObj);
	boolean delete(T removedObj);
}
