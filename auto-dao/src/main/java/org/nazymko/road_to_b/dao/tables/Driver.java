/**
 * This class is generated by jOOQ
 */
package org.nazymko.road_to_b.dao.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.nazymko.road_to_b.dao.Keys;
import org.nazymko.road_to_b.dao.RoadToBDev;
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
public class Driver extends TableImpl<DriverRecord> {

	private static final long serialVersionUID = 1579687843;

	/**
	 * The reference instance of <code>road_to_b_dev.driver</code>
	 */
	public static final Driver DRIVER = new Driver();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DriverRecord> getRecordType() {
		return DriverRecord.class;
	}

	/**
	 * The column <code>road_to_b_dev.driver.id</code>.
	 */
	public final TableField<DriverRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>road_to_b_dev.driver.first_name</code>.
	 */
	public final TableField<DriverRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

	/**
	 * The column <code>road_to_b_dev.driver.last_name</code>.
	 */
	public final TableField<DriverRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

	/**
	 * The column <code>road_to_b_dev.driver.is_disabled</code>.
	 */
	public final TableField<DriverRecord, Boolean> IS_DISABLED = createField("is_disabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>road_to_b_dev.driver</code> table reference
	 */
	public Driver() {
		this("driver", null);
	}

	/**
	 * Create an aliased <code>road_to_b_dev.driver</code> table reference
	 */
	public Driver(String alias) {
		this(alias, DRIVER);
	}

	private Driver(String alias, Table<DriverRecord> aliased) {
		this(alias, aliased, null);
	}

	private Driver(String alias, Table<DriverRecord> aliased, Field<?>[] parameters) {
		super(alias, RoadToBDev.ROAD_TO_B_DEV, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<DriverRecord, Integer> getIdentity() {
		return Keys.IDENTITY_DRIVER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DriverRecord> getPrimaryKey() {
		return Keys.KEY_DRIVER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DriverRecord>> getKeys() {
		return Arrays.<UniqueKey<DriverRecord>>asList(Keys.KEY_DRIVER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Driver as(String alias) {
		return new Driver(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Driver rename(String name) {
		return new Driver(name, null);
	}
}