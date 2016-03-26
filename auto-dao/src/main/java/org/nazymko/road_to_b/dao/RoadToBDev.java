/**
 * This class is generated by jOOQ
 */
package org.nazymko.road_to_b.dao;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.nazymko.road_to_b.dao.tables.Driver;
import org.nazymko.road_to_b.dao.tables.DriverProps;
import org.nazymko.road_to_b.dao.tables.Point;
import org.nazymko.road_to_b.dao.tables.Sits;
import org.nazymko.road_to_b.dao.tables.Transport;
import org.nazymko.road_to_b.dao.tables.TransportProps;
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
public class RoadToBDev extends SchemaImpl {

	private static final long serialVersionUID = 553400330;

	/**
	 * The reference instance of <code>road_to_b_dev</code>
	 */
	public static final RoadToBDev ROAD_TO_B_DEV = new RoadToBDev();

	/**
	 * No further instances allowed
	 */
	private RoadToBDev() {
		super("road_to_b_dev");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Driver.DRIVER,
			DriverProps.DRIVER_PROPS,
			Point.POINT,
			Sits.SITS,
			Transport.TRANSPORT,
			TransportProps.TRANSPORT_PROPS,
			Trip.TRIP);
	}
}
