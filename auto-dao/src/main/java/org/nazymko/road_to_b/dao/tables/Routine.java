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
import org.nazymko.road_to_b.dao.tables.records.RoutineRecord;


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
public class Routine extends TableImpl<RoutineRecord> {

	private static final long serialVersionUID = 758371722;

	/**
	 * The reference instance of <code>road_to_b_dev.routine</code>
	 */
	public static final Routine ROUTINE = new Routine();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RoutineRecord> getRecordType() {
		return RoutineRecord.class;
	}

	/**
	 * The column <code>road_to_b_dev.routine.id</code>.
	 */
	public final TableField<RoutineRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>road_to_b_dev.routine.description</code>.
	 */
	public final TableField<RoutineRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

	/**
	 * The column <code>road_to_b_dev.routine.is_disabled</code>.
	 */
	public final TableField<RoutineRecord, Boolean> IS_DISABLED = createField("is_disabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * Create a <code>road_to_b_dev.routine</code> table reference
	 */
	public Routine() {
		this("routine", null);
	}

	/**
	 * Create an aliased <code>road_to_b_dev.routine</code> table reference
	 */
	public Routine(String alias) {
		this(alias, ROUTINE);
	}

	private Routine(String alias, Table<RoutineRecord> aliased) {
		this(alias, aliased, null);
	}

	private Routine(String alias, Table<RoutineRecord> aliased, Field<?>[] parameters) {
		super(alias, RoadToBDev.ROAD_TO_B_DEV, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<RoutineRecord, Integer> getIdentity() {
		return Keys.IDENTITY_ROUTINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RoutineRecord> getPrimaryKey() {
		return Keys.KEY_ROUTINE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RoutineRecord>> getKeys() {
		return Arrays.<UniqueKey<RoutineRecord>>asList(Keys.KEY_ROUTINE_PRIMARY, Keys.KEY_ROUTINE_UNIQUE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Routine as(String alias) {
		return new Routine(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Routine rename(String name) {
		return new Routine(name, null);
	}
}
