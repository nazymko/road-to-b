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
@Table(name = "driver_props", schema = "road_to_b_dev")
public class DriverProps implements Serializable {

	private static final long serialVersionUID = -2025632998;

	private Integer id;
	private Integer driverId;
	private String  prop;
	private String  value;

	public DriverProps() {}

	public DriverProps(DriverProps value) {
		this.id = value.id;
		this.driverId = value.driverId;
		this.prop = value.prop;
		this.value = value.value;
	}

	public DriverProps(
		Integer id,
		Integer driverId,
		String  prop,
		String  value
	) {
		this.id = id;
		this.driverId = driverId;
		this.prop = prop;
		this.value = value;
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

	@Column(name = "driver_id", nullable = false, precision = 10)
	@NotNull
	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	@Column(name = "prop", nullable = false, length = 1024)
	@NotNull
	@Size(max = 1024)
	public String getProp() {
		return this.prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

	@Column(name = "value", nullable = false, length = 1024)
	@NotNull
	@Size(max = 1024)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("DriverProps (");

		sb.append(id);
		sb.append(", ").append(driverId);
		sb.append(", ").append(prop);
		sb.append(", ").append(value);

		sb.append(")");
		return sb.toString();
	}
}
