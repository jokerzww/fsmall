package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.InnodbForeignColsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.InnodbForeignCols;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface InnodbForeignColsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    BasicColumn[] selectList = BasicColumn.columnList(id, forColName, refColName, pos);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=String.class)
    int insert(InsertStatementProvider<InnodbForeignCols> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbForeignColsResult")
    Optional<InnodbForeignCols> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbForeignColsResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOR_COL_NAME", property="forColName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REF_COL_NAME", property="refColName", jdbcType=JdbcType.VARCHAR),
        @Result(column="POS", property="pos", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbForeignCols> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbForeignCols, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbForeignCols, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    default int insert(InnodbForeignCols record) {
        return MyBatis3Utils.insert(this::insert, record, innodbForeignCols, c ->
            c.map(forColName).toProperty("forColName")
            .map(refColName).toProperty("refColName")
            .map(pos).toProperty("pos")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    default int insertSelective(InnodbForeignCols record) {
        return MyBatis3Utils.insert(this::insert, record, innodbForeignCols, c ->
            c.map(forColName).toPropertyWhenPresent("forColName", record::getForColName)
            .map(refColName).toPropertyWhenPresent("refColName", record::getRefColName)
            .map(pos).toPropertyWhenPresent("pos", record::getPos)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    default Optional<InnodbForeignCols> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbForeignCols, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    default List<InnodbForeignCols> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbForeignCols, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    default List<InnodbForeignCols> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbForeignCols, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbForeignCols, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbForeignCols record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(forColName).equalTo(record::getForColName)
                .set(refColName).equalTo(record::getRefColName)
                .set(pos).equalTo(record::getPos);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbForeignCols record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(forColName).equalToWhenPresent(record::getForColName)
                .set(refColName).equalToWhenPresent(record::getRefColName)
                .set(pos).equalToWhenPresent(record::getPos);
    }
}