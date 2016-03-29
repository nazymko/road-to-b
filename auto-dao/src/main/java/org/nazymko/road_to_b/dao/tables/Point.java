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
import org.nazymko.road_to_b.dao.tables.records.PointRecord;


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
public class Point extends TableImpl<PointRecord> {

	private static final long serialVersionUID = -1420084926;

	/**
	 * The reference instance of <code>road_to_b_dev.point</code>
	 */
	public static final Point POINT = new Point();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PointRecord> getRecordType() {
		return PointRecord.class;
	}

	/**
	 * The column <code>road_to_b_dev.point.id</code>.
	 */
	public final TableField<PointRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>road_to_b_dev.point.name</code>.
	 */
	public final TableField<PointRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>road_to_b_dev.point.longitude</code>.
	 */
	public final TableField<PointRecord, Double> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "");

	/**
	 * The column <code>road_to_b_dev.point.latitude</code>.
	 */
	public final TableField<PointRecord, Double> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "");

	/**
	 * The column <code>road_to_b_dev.point.is_disabled</code>.
	 */
	public final TableField<PointRecord, Boolean> IS_DISABLED = createField("is_disabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * Create a <code>road_to_b_dev.point</code> table reference
	 */
	public Point() {
		this("point", null);
	}

	/**
	 * Create an aliased <code>road_to_b_dev.point</code> table reference
	 */
	public Point(String alias) {
		this(alias, POINT);
	}

	private Point(String alias, Table<PointRecord> aliased) {
		this(alias, aliased, null);
	}

	private Point(String alias, Table<PointRecord> aliased, Field<?>[] parameters) {
		super(alias, RoadToBDev.ROAD_TO_B_DEV, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<PointRecord, Long> getIdentity() {
		return Keys.IDENTITY_POINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PointRecord> getPrimaryKey() {
		return Keys.KEY_POINT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PointRecord>> getKeys() {
		return Arrays.<UniqueKey<PointRecord>>asList(Keys.KEY_POINT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Point as(String alias) {
		return new Point(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Point rename(String name) {
		return new Point(name, null);
	}
}
