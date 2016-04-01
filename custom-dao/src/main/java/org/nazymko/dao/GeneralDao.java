package org.nazymko.dao;

import lombok.Getter;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.UpdatableRecord;
import org.jooq.impl.DSL;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Timestamp;

/**
 * Created by nazymko.patronus@gmail.com.
 */
public abstract class GeneralDao<K, T> implements Dao<K, T> {
    @Getter
    @Resource
    DataSource source;

    protected DSLContext getDslContext() {
        return DSL.using(getSource(), SQLDialect.MYSQL);
    }

    protected Timestamp currentTimeStamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    protected void store(UpdatableRecord target) {
        DSLContext dslContext = getDslContext();
        dslContext.attach(target);
        target.store();
        dslContext.close();
    }
}
