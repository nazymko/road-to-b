/**
 * This class is generated by jOOQ
 */
package org.nazymko.road_to_b.dao.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.nazymko.road_to_b.dao.tables.Trip;


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
@Table(name = "trip", schema = "road_to_b_dev")
public class TripRecord extends UpdatableRecordImpl<TripRecord> implements Record8<Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Boolean, Integer> {

	private static final long serialVersionUID = 1393842267;

	/**
	 * Setter for <code>road_to_b_dev.trip.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>road_to_b_dev.trip.id</code>.
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 10)
	@NotNull
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>road_to_b_dev.trip.transport_id</code>.
	 */
	public void setTransportId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>road_to_b_dev.trip.transport_id</code>.
	 */
	@Column(name = "transport_id", nullable = false, precision = 10)
	@NotNull
	public Integer getTransportId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>road_to_b_dev.trip.driver_id</code>.
	 */
	public void setDriverId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>road_to_b_dev.trip.driver_id</code>.
	 */
	@Column(name = "driver_id", nullable = false, precision = 10)
	@NotNull
	public Integer getDriverId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>road_to_b_dev.trip.departure_date</code>.
	 */
	public void setDepartureDate(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>road_to_b_dev.trip.departure_date</code>.
	 */
	@Column(name = "departure_date", nullable = false)
	@NotNull
	public Timestamp getDepartureDate() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>road_to_b_dev.trip.arrival_date</code>.
	 */
	public void setArrivalDate(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>road_to_b_dev.trip.arrival_date</code>.
	 */
	@Column(name = "arrival_date", nullable = false)
	@NotNull
	public Timestamp getArrivalDate() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>road_to_b_dev.trip.created_at</code>.
	 */
	public void setCreatedAt(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>road_to_b_dev.trip.created_at</code>.
	 */
	@Column(name = "created_at", nullable = false)
	@NotNull
	public Timestamp getCreatedAt() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>road_to_b_dev.trip.is_disabled</code>.
	 */
	public void setIsDisabled(Boolean value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>road_to_b_dev.trip.is_disabled</code>.
	 */
	@Column(name = "is_disabled", nullable = false)
	@NotNull
	public Boolean getIsDisabled() {
		return (Boolean) getValue(6);
	}

	/**
	 * Setter for <code>road_to_b_dev.trip.routine_id</code>.
	 */
	public void setRoutineId(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>road_to_b_dev.trip.routine_id</code>.
	 */
	@Column(name = "routine_id", nullable = false, precision = 10)
	@NotNull
	public Integer getRoutineId() {
		return (Integer) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Boolean, Integer> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Boolean, Integer> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Trip.TRIP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Trip.TRIP.TRANSPORT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Trip.TRIP.DRIVER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return Trip.TRIP.DEPARTURE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return Trip.TRIP.ARRIVAL_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return Trip.TRIP.CREATED_AT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field7() {
		return Trip.TRIP.IS_DISABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Trip.TRIP.ROUTINE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getTransportId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getDriverId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getDepartureDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getArrivalDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getCreatedAt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value7() {
		return getIsDisabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getRoutineId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TripRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TripRecord value2(Integer value) {
		setTransportId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TripRecord value3(Integer value) {
		setDriverId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TripRecord value4(Timestamp value) {
		setDepartureDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TripRecord value5(Timestamp value) {
		setArrivalDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TripRecord value6(Timestamp value) {
		setCreatedAt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TripRecord value7(Boolean value) {
		setIsDisabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TripRecord value8(Integer value) {
		setRoutineId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TripRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5, Timestamp value6, Boolean value7, Integer value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TripRecord
	 */
	public TripRecord() {
		super(Trip.TRIP);
	}

	/**
	 * Create a detached, initialised TripRecord
	 */
	public TripRecord(Integer id, Integer transportId, Integer driverId, Timestamp departureDate, Timestamp arrivalDate, Timestamp createdAt, Boolean isDisabled, Integer routineId) {
		super(Trip.TRIP);

		setValue(0, id);
		setValue(1, transportId);
		setValue(2, driverId);
		setValue(3, departureDate);
		setValue(4, arrivalDate);
		setValue(5, createdAt);
		setValue(6, isDisabled);
		setValue(7, routineId);
	}
}
