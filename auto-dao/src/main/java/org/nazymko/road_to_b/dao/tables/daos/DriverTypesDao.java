/**
 * This class is generated by jOOQ
 */
package org.nazymko.road_to_b.dao.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.nazymko.road_to_b.dao.tables.DriverTypes;
import org.nazymko.road_to_b.dao.tables.records.DriverTypesRecord;


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
public class DriverTypesDao extends DAOImpl<DriverTypesRecord, org.nazymko.road_to_b.dao.tables.pojos.DriverTypes, Integer> {

	/**
	 * Create a new DriverTypesDao without any configuration
	 */
	public DriverTypesDao() {
		super(DriverTypes.DRIVER_TYPES, org.nazymko.road_to_b.dao.tables.pojos.DriverTypes.class);
	}

	/**
	 * Create a new DriverTypesDao with an attached configuration
	 */
	public DriverTypesDao(Configuration configuration) {
		super(DriverTypes.DRIVER_TYPES, org.nazymko.road_to_b.dao.tables.pojos.DriverTypes.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.nazymko.road_to_b.dao.tables.pojos.DriverTypes object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.nazymko.road_to_b.dao.tables.pojos.DriverTypes> fetchById(Integer... values) {
		return fetch(DriverTypes.DRIVER_TYPES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.nazymko.road_to_b.dao.tables.pojos.DriverTypes fetchOneById(Integer value) {
		return fetchOne(DriverTypes.DRIVER_TYPES.ID, value);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public List<org.nazymko.road_to_b.dao.tables.pojos.DriverTypes> fetchByDescription(String... values) {
		return fetch(DriverTypes.DRIVER_TYPES.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public List<org.nazymko.road_to_b.dao.tables.pojos.DriverTypes> fetchByName(String... values) {
		return fetch(DriverTypes.DRIVER_TYPES.NAME, values);
	}

	/**
	 * Fetch records that have <code>is_disabled IN (values)</code>
	 */
	public List<org.nazymko.road_to_b.dao.tables.pojos.DriverTypes> fetchByIsDisabled(Boolean... values) {
		return fetch(DriverTypes.DRIVER_TYPES.IS_DISABLED, values);
	}
}
