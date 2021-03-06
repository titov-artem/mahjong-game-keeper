/*
 * This file is generated by jOOQ.
*/
package com.github.mahjong.league.repo.jdbc.generated.tables;


import com.github.mahjong.league.repo.jdbc.generated.Indexes;
import com.github.mahjong.league.repo.jdbc.generated.Keys;
import com.github.mahjong.league.repo.jdbc.generated.Public;
import com.github.mahjong.league.repo.jdbc.generated.tables.records.LeaguePlayerRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LeaguePlayer extends TableImpl<LeaguePlayerRecord> {

    private static final long serialVersionUID = -1902967870;

    /**
     * The reference instance of <code>public.league_player</code>
     */
    public static final LeaguePlayer LEAGUE_PLAYER = new LeaguePlayer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LeaguePlayerRecord> getRecordType() {
        return LeaguePlayerRecord.class;
    }

    /**
     * The column <code>public.league_player.league_id</code>.
     */
    public final TableField<LeaguePlayerRecord, Long> LEAGUE_ID = createField("league_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.league_player.player_id</code>.
     */
    public final TableField<LeaguePlayerRecord, Long> PLAYER_ID = createField("player_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.league_player</code> table reference
     */
    public LeaguePlayer() {
        this(DSL.name("league_player"), null);
    }

    /**
     * Create an aliased <code>public.league_player</code> table reference
     */
    public LeaguePlayer(String alias) {
        this(DSL.name(alias), LEAGUE_PLAYER);
    }

    /**
     * Create an aliased <code>public.league_player</code> table reference
     */
    public LeaguePlayer(Name alias) {
        this(alias, LEAGUE_PLAYER);
    }

    private LeaguePlayer(Name alias, Table<LeaguePlayerRecord> aliased) {
        this(alias, aliased, null);
    }

    private LeaguePlayer(Name alias, Table<LeaguePlayerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LEAGUE_PLAYER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LeaguePlayerRecord> getPrimaryKey() {
        return Keys.LEAGUE_PLAYER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LeaguePlayerRecord>> getKeys() {
        return Arrays.<UniqueKey<LeaguePlayerRecord>>asList(Keys.LEAGUE_PLAYER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LeaguePlayer as(String alias) {
        return new LeaguePlayer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LeaguePlayer as(Name alias) {
        return new LeaguePlayer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LeaguePlayer rename(String name) {
        return new LeaguePlayer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LeaguePlayer rename(Name name) {
        return new LeaguePlayer(name, null);
    }
}
