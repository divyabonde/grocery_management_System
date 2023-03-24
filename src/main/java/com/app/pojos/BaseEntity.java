package com.app.pojos;

import javax.persistence.*;

/*
 *  BaseEntity is super type of all Entity types
 *  Id field is primary key of all the entities that inherits from this class
 *  The ID value is also assigned by strategy Identity equivalent to auto increment in MySQL
 */


@MappedSuperclass
public class BaseEntity {
	@Id  //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Auto-generated values
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
