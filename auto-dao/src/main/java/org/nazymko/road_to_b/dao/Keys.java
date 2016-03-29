/**
 * This class is generated by jOOQ
 */
package org.nazymko.road_to_b.dao;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.nazymko.road_to_b.dao.tables.Driver;
import org.nazymko.road_to_b.dao.tables.DriverProps;
import org.nazymko.road_to_b.dao.tables.DriverTypes;
import org.nazymko.road_to_b.dao.tables.Order;
import org.nazymko.road_to_b.dao.tables.Point;
import org.nazymko.road_to_b.dao.tables.RoutPointMapping;
import org.nazymko.road_to_b.dao.tables.Routine;
import org.nazymko.road_to_b.dao.tables.Sits;
import org.nazymko.road_to_b.dao.tables.Transport;
import org.nazymko.road_to_b.dao.tables.TransportProps;
import org.nazymko.road_to_b.dao.tables.Trip;
import org.nazymko.road_to_b.dao.tables.User;
import org.nazymko.road_to_b.dao.tables.UserContact;
import org.nazymko.road_to_b.dao.tables.records.DriverPropsRecord;
import org.nazymko.road_to_b.dao.tables.records.DriverRecord;
import org.nazymko.road_to_b.dao.tables.records.DriverTypesRecord;
import org.nazymko.road_to_b.dao.tables.records.OrderRecord;
import org.nazymko.road_to_b.dao.tables.records.PointRecord;
import org.nazymko.road_to_b.dao.tables.records.RoutPointMappingRecord;
import org.nazymko.road_to_b.dao.tables.records.RoutineRecord;
import org.nazymko.road_to_b.dao.tables.records.SitsRecord;
import org.nazymko.road_to_b.dao.tables.records.TransportPropsRecord;
import org.nazymko.road_to_b.dao.tables.records.TransportRecord;
import org.nazymko.road_to_b.dao.tables.records.TripRecord;
import org.nazymko.road_to_b.dao.tables.records.UserContactRecord;
import org.nazymko.road_to_b.dao.tables.records.UserRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>road_to_b_dev</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<DriverRecord, Integer> IDENTITY_DRIVER = Identities0.IDENTITY_DRIVER;
	public static final Identity<DriverPropsRecord, Integer> IDENTITY_DRIVER_PROPS = Identities0.IDENTITY_DRIVER_PROPS;
	public static final Identity<PointRecord, Long> IDENTITY_POINT = Identities0.IDENTITY_POINT;
	public static final Identity<RoutineRecord, Integer> IDENTITY_ROUTINE = Identities0.IDENTITY_ROUTINE;
	public static final Identity<SitsRecord, Integer> IDENTITY_SITS = Identities0.IDENTITY_SITS;
	public static final Identity<TransportPropsRecord, Integer> IDENTITY_TRANSPORT_PROPS = Identities0.IDENTITY_TRANSPORT_PROPS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<DriverRecord> KEY_DRIVER_PRIMARY = UniqueKeys0.KEY_DRIVER_PRIMARY;
	public static final UniqueKey<DriverPropsRecord> KEY_DRIVER_PROPS_PRIMARY = UniqueKeys0.KEY_DRIVER_PROPS_PRIMARY;
	public static final UniqueKey<DriverTypesRecord> KEY_DRIVER_TYPES_PRIMARY = UniqueKeys0.KEY_DRIVER_TYPES_PRIMARY;
	public static final UniqueKey<DriverTypesRecord> KEY_DRIVER_TYPES_UNIQUE_ID = UniqueKeys0.KEY_DRIVER_TYPES_UNIQUE_ID;
	public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = UniqueKeys0.KEY_ORDER_PRIMARY;
	public static final UniqueKey<OrderRecord> KEY_ORDER_UNIQUE_ID = UniqueKeys0.KEY_ORDER_UNIQUE_ID;
	public static final UniqueKey<PointRecord> KEY_POINT_PRIMARY = UniqueKeys0.KEY_POINT_PRIMARY;
	public static final UniqueKey<RoutineRecord> KEY_ROUTINE_PRIMARY = UniqueKeys0.KEY_ROUTINE_PRIMARY;
	public static final UniqueKey<RoutineRecord> KEY_ROUTINE_UNIQUE_ID = UniqueKeys0.KEY_ROUTINE_UNIQUE_ID;
	public static final UniqueKey<SitsRecord> KEY_SITS_PRIMARY = UniqueKeys0.KEY_SITS_PRIMARY;
	public static final UniqueKey<TransportRecord> KEY_TRANSPORT_PRIMARY = UniqueKeys0.KEY_TRANSPORT_PRIMARY;
	public static final UniqueKey<TransportPropsRecord> KEY_TRANSPORT_PROPS_PRIMARY = UniqueKeys0.KEY_TRANSPORT_PROPS_PRIMARY;
	public static final UniqueKey<TripRecord> KEY_TRIP_PRIMARY = UniqueKeys0.KEY_TRIP_PRIMARY;
	public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
	public static final UniqueKey<UserRecord> KEY_USER_UNIQUE_ID = UniqueKeys0.KEY_USER_UNIQUE_ID;
	public static final UniqueKey<UserContactRecord> KEY_USER_CONTACT_PRIMARY = UniqueKeys0.KEY_USER_CONTACT_PRIMARY;
	public static final UniqueKey<UserContactRecord> KEY_USER_CONTACT_UNIQUE_ID = UniqueKeys0.KEY_USER_CONTACT_UNIQUE_ID;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<DriverRecord, DriverTypesRecord> DRIVER_IBFK_1 = ForeignKeys0.DRIVER_IBFK_1;
	public static final ForeignKey<DriverPropsRecord, DriverRecord> DRIVER_PROPS_IBFK_1 = ForeignKeys0.DRIVER_PROPS_IBFK_1;
	public static final ForeignKey<OrderRecord, SitsRecord> ORDER_IBFK_1 = ForeignKeys0.ORDER_IBFK_1;
	public static final ForeignKey<OrderRecord, TripRecord> ORDER_IBFK_2 = ForeignKeys0.ORDER_IBFK_2;
	public static final ForeignKey<OrderRecord, UserRecord> ORDER_IBFK_3 = ForeignKeys0.ORDER_IBFK_3;
	public static final ForeignKey<RoutPointMappingRecord, RoutineRecord> ROUT_POINT_MAPPING_IBFK_1 = ForeignKeys0.ROUT_POINT_MAPPING_IBFK_1;
	public static final ForeignKey<RoutPointMappingRecord, PointRecord> ROUT_POINT_MAPPING_IBFK_2 = ForeignKeys0.ROUT_POINT_MAPPING_IBFK_2;
	public static final ForeignKey<SitsRecord, TransportRecord> SITS_IBFK_1 = ForeignKeys0.SITS_IBFK_1;
	public static final ForeignKey<SitsRecord, TripRecord> SITS_IBFK_2 = ForeignKeys0.SITS_IBFK_2;
	public static final ForeignKey<TransportPropsRecord, TransportRecord> TRANSPORT_PROPS_IBFK_1 = ForeignKeys0.TRANSPORT_PROPS_IBFK_1;
	public static final ForeignKey<TripRecord, TransportRecord> TRIP_IBFK_1 = ForeignKeys0.TRIP_IBFK_1;
	public static final ForeignKey<TripRecord, DriverRecord> TRIP_IBFK_2 = ForeignKeys0.TRIP_IBFK_2;
	public static final ForeignKey<TripRecord, RoutineRecord> TRIP_IBFK_3 = ForeignKeys0.TRIP_IBFK_3;
	public static final ForeignKey<UserContactRecord, UserRecord> USER_CONTACT_IBFK_1 = ForeignKeys0.USER_CONTACT_IBFK_1;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<DriverRecord, Integer> IDENTITY_DRIVER = createIdentity(Driver.DRIVER, Driver.DRIVER.ID);
		public static Identity<DriverPropsRecord, Integer> IDENTITY_DRIVER_PROPS = createIdentity(DriverProps.DRIVER_PROPS, DriverProps.DRIVER_PROPS.ID);
		public static Identity<PointRecord, Long> IDENTITY_POINT = createIdentity(Point.POINT, Point.POINT.ID);
		public static Identity<RoutineRecord, Integer> IDENTITY_ROUTINE = createIdentity(Routine.ROUTINE, Routine.ROUTINE.ID);
		public static Identity<SitsRecord, Integer> IDENTITY_SITS = createIdentity(Sits.SITS, Sits.SITS.ID);
		public static Identity<TransportPropsRecord, Integer> IDENTITY_TRANSPORT_PROPS = createIdentity(TransportProps.TRANSPORT_PROPS, TransportProps.TRANSPORT_PROPS.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<DriverRecord> KEY_DRIVER_PRIMARY = createUniqueKey(Driver.DRIVER, Driver.DRIVER.ID);
		public static final UniqueKey<DriverPropsRecord> KEY_DRIVER_PROPS_PRIMARY = createUniqueKey(DriverProps.DRIVER_PROPS, DriverProps.DRIVER_PROPS.ID);
		public static final UniqueKey<DriverTypesRecord> KEY_DRIVER_TYPES_PRIMARY = createUniqueKey(DriverTypes.DRIVER_TYPES, DriverTypes.DRIVER_TYPES.ID);
		public static final UniqueKey<DriverTypesRecord> KEY_DRIVER_TYPES_UNIQUE_ID = createUniqueKey(DriverTypes.DRIVER_TYPES, DriverTypes.DRIVER_TYPES.ID);
		public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = createUniqueKey(Order.ORDER, Order.ORDER.ID);
		public static final UniqueKey<OrderRecord> KEY_ORDER_UNIQUE_ID = createUniqueKey(Order.ORDER, Order.ORDER.ID);
		public static final UniqueKey<PointRecord> KEY_POINT_PRIMARY = createUniqueKey(Point.POINT, Point.POINT.ID);
		public static final UniqueKey<RoutineRecord> KEY_ROUTINE_PRIMARY = createUniqueKey(Routine.ROUTINE, Routine.ROUTINE.ID);
		public static final UniqueKey<RoutineRecord> KEY_ROUTINE_UNIQUE_ID = createUniqueKey(Routine.ROUTINE, Routine.ROUTINE.ID);
		public static final UniqueKey<SitsRecord> KEY_SITS_PRIMARY = createUniqueKey(Sits.SITS, Sits.SITS.ID);
		public static final UniqueKey<TransportRecord> KEY_TRANSPORT_PRIMARY = createUniqueKey(Transport.TRANSPORT, Transport.TRANSPORT.ID);
		public static final UniqueKey<TransportPropsRecord> KEY_TRANSPORT_PROPS_PRIMARY = createUniqueKey(TransportProps.TRANSPORT_PROPS, TransportProps.TRANSPORT_PROPS.ID);
		public static final UniqueKey<TripRecord> KEY_TRIP_PRIMARY = createUniqueKey(Trip.TRIP, Trip.TRIP.ID);
		public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, User.USER.ID);
		public static final UniqueKey<UserRecord> KEY_USER_UNIQUE_ID = createUniqueKey(User.USER, User.USER.ID);
		public static final UniqueKey<UserContactRecord> KEY_USER_CONTACT_PRIMARY = createUniqueKey(UserContact.USER_CONTACT, UserContact.USER_CONTACT.ID);
		public static final UniqueKey<UserContactRecord> KEY_USER_CONTACT_UNIQUE_ID = createUniqueKey(UserContact.USER_CONTACT, UserContact.USER_CONTACT.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<DriverRecord, DriverTypesRecord> DRIVER_IBFK_1 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_DRIVER_TYPES_PRIMARY, Driver.DRIVER, Driver.DRIVER.DRIVER_TYPE);
		public static final ForeignKey<DriverPropsRecord, DriverRecord> DRIVER_PROPS_IBFK_1 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_DRIVER_PRIMARY, DriverProps.DRIVER_PROPS, DriverProps.DRIVER_PROPS.DRIVER_ID);
		public static final ForeignKey<OrderRecord, SitsRecord> ORDER_IBFK_1 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_SITS_PRIMARY, Order.ORDER, Order.ORDER.SIT_ID);
		public static final ForeignKey<OrderRecord, TripRecord> ORDER_IBFK_2 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_TRIP_PRIMARY, Order.ORDER, Order.ORDER.TRIP_ID);
		public static final ForeignKey<OrderRecord, UserRecord> ORDER_IBFK_3 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_USER_PRIMARY, Order.ORDER, Order.ORDER.USER_ID);
		public static final ForeignKey<RoutPointMappingRecord, RoutineRecord> ROUT_POINT_MAPPING_IBFK_1 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_ROUTINE_PRIMARY, RoutPointMapping.ROUT_POINT_MAPPING, RoutPointMapping.ROUT_POINT_MAPPING.ROUTINE_ID);
		public static final ForeignKey<RoutPointMappingRecord, PointRecord> ROUT_POINT_MAPPING_IBFK_2 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_POINT_PRIMARY, RoutPointMapping.ROUT_POINT_MAPPING, RoutPointMapping.ROUT_POINT_MAPPING.POINT_ID);
		public static final ForeignKey<SitsRecord, TransportRecord> SITS_IBFK_1 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_TRANSPORT_PRIMARY, Sits.SITS, Sits.SITS.TRANSPORT_ID);
		public static final ForeignKey<SitsRecord, TripRecord> SITS_IBFK_2 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_TRIP_PRIMARY, Sits.SITS, Sits.SITS.TRIP_ID);
		public static final ForeignKey<TransportPropsRecord, TransportRecord> TRANSPORT_PROPS_IBFK_1 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_TRANSPORT_PRIMARY, TransportProps.TRANSPORT_PROPS, TransportProps.TRANSPORT_PROPS.TRANSPORT_ID);
		public static final ForeignKey<TripRecord, TransportRecord> TRIP_IBFK_1 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_TRANSPORT_PRIMARY, Trip.TRIP, Trip.TRIP.TRANSPORT_ID);
		public static final ForeignKey<TripRecord, DriverRecord> TRIP_IBFK_2 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_DRIVER_PRIMARY, Trip.TRIP, Trip.TRIP.DRIVER_ID);
		public static final ForeignKey<TripRecord, RoutineRecord> TRIP_IBFK_3 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_ROUTINE_PRIMARY, Trip.TRIP, Trip.TRIP.ROUTINE_ID);
		public static final ForeignKey<UserContactRecord, UserRecord> USER_CONTACT_IBFK_1 = createForeignKey(org.nazymko.road_to_b.dao.Keys.KEY_USER_PRIMARY, UserContact.USER_CONTACT, UserContact.USER_CONTACT.USER_ID);
	}
}
