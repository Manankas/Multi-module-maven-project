package project.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code;
	
	@Column(length = 30)
	private String name;

	public Customer() {
		super();
	}
	public Customer(Long id, String name) {
		super();
		this.code = id;
		this.name = name;
	}
	
	

	public Customer(String name) {
		super();
		this.name = name;
	}



	public Long getId() {
		return code;
	}

	public void setId(Long id) {
		this.code = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
