package fr.uvsq.pglp.Exercice5_1;

import java.io.Serializable;

public abstract class DAO<T> implements Serializable{
	
	public abstract T create(T obj);
	public abstract T find(String id);
	public abstract T update( T obj);
	public abstract void delete (T obj);

}
