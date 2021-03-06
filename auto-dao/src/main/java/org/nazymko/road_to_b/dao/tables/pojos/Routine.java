/**
 * This class is generated by jOOQ
 */
package org.nazymko.road_to_b.dao.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "routine", schema = "road_to_b_dev")
public class Routine implements Serializable {

	private static final long serialVersionUID = 514029109;

	private Integer id;
	private String  description;
	private Boolean isDisabled;

	public Routine() {}

	public Routine(Routine value) {
		this.id = value.id;
		this.description = value.description;
		this.isDisabled = value.isDisabled;
	}

	public Routine(
		Integer id,
		String  description,
		Boolean isDisabled
	) {
		this.id = id;
		this.description = description;
		this.isDisabled = isDisabled;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 10)
	@NotNull
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "description", nullable = false, length = 1024)
	@NotNull
	@Size(max = 1024)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "is_disabled", nullable = false)
	@NotNull
	public Boolean getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Routine (");

		sb.append(id);
		sb.append(", ").append(description);
		sb.append(", ").append(isDisabled);

		sb.append(")");
		return sb.toString();
	}
}
