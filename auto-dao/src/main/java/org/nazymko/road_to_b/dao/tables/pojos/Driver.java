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
@Table(name = "driver", schema = "road_to_b_dev")
public class Driver implements Serializable {

	private static final long serialVersionUID = 334290175;

	private Integer id;
	private String  firstName;
	private String  lastName;
	private Boolean isDisabled;
	private Integer driverType;

	public Driver() {}

	public Driver(Driver value) {
		this.id = value.id;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.isDisabled = value.isDisabled;
		this.driverType = value.driverType;
	}

	public Driver(
		Integer id,
		String  firstName,
		String  lastName,
		Boolean isDisabled,
		Integer driverType
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isDisabled = isDisabled;
		this.driverType = driverType;
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

	@Column(name = "first_name", nullable = false, length = 1024)
	@NotNull
	@Size(max = 1024)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 1024)
	@NotNull
	@Size(max = 1024)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "is_disabled", nullable = false)
	@NotNull
	public Boolean getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	@Column(name = "driver_type", nullable = false, precision = 10)
	@NotNull
	public Integer getDriverType() {
		return this.driverType;
	}

	public void setDriverType(Integer driverType) {
		this.driverType = driverType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Driver (");

		sb.append(id);
		sb.append(", ").append(firstName);
		sb.append(", ").append(lastName);
		sb.append(", ").append(isDisabled);
		sb.append(", ").append(driverType);

		sb.append(")");
		return sb.toString();
	}
}
