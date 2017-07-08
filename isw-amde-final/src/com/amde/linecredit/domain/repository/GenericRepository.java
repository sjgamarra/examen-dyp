package com.amde.linecredit.domain.repository;

public interface GenericRepository <T> {
	public void save(T entity);

	public void update(T entity);

	public void merge(T entity);
}