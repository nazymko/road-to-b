/**
 * This class is generated by jOOQ
 */
package org.nazymko.road_to_b.dao.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.nazymko.road_to_b.dao.tables.Driver;
import org.nazymko.road_to_b.dao.tables.records.DriverRecord;


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
public class DriverDao extends DAOImpl<DriverRecord, org.nazymko.road_to_b.dao.tables.pojos.Driver, Integer> {

	/**
	 * Create a new DriverDao without any configuration
	 */
	public DriverDao() {
		super(Driver.DRIVER, org.nazymko.road_to_b.dao.tables.pojos.Driver.class);
	}

	/**
	 * Create a new DriverDao with an attached configuration
	 */
	public DriverDao(Configuration configuration) {
		super(Driver.DRIVER, org.nazymko.road_to_b.dao.tables.pojos.Driver.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.nazymko.road_to_b.dao.tables.pojos.Driver object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.nazymko.road_to_b.dao.tables.pojos.Driver> fetchById(Integer... values) {
		return fetch(Driver.DRIVER.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.nazymko.road_to_b.dao.tables.pojos.Driver fetchOneById(Integer value) {
		return fetchOne(Driver.DRIVER.ID, value);
	}

	/**
	 * Fetch records that have <code>first_name IN (values)</code>
	 */
	public List<org.nazymko.road_to_b.dao.tables.pojos.Driver> fetchByFirstName(String... values) {
		return fetch(Driver.DRIVER.FIRST_NAME, values);
	}

	/**
	 * Fetch records that have <code>last_name IN (values)</code>
	 */
	public List<org.nazymko.road_to_b.dao.tables.pojos.Driver> fetchByLastName(String... values) {
		return fetch(Driver.DRIVER.LAST_NAME, values);
	}

	/**
	 * Fetch records that have <code>is_disabled IN (values)</code>
	 */
	public List<org.nazymko.road_to_b.dao.tables.pojos.Driver> fetchByIsDisabled(Boolean... values) {
		return fetch(Driver.DRIVER.IS_DISABLED, values);
	}
}
