package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.PicTbDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.PicTb;
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
public interface PicTbMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    BasicColumn[] selectList = BasicColumn.columnList(id, itemId, url, absPath);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source Table: pic_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source Table: pic_tb")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source Table: pic_tb")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<PicTb> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PicTbResult")
    Optional<PicTb> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PicTbResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="abs_path", property="absPath", jdbcType=JdbcType.VARCHAR)
    })
    List<PicTb> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, picTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, picTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default int insert(PicTb record) {
        return MyBatis3Utils.insert(this::insert, record, picTb, c ->
            c.map(itemId).toProperty("itemId")
            .map(url).toProperty("url")
            .map(absPath).toProperty("absPath")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default int insertSelective(PicTb record) {
        return MyBatis3Utils.insert(this::insert, record, picTb, c ->
            c.map(itemId).toPropertyWhenPresent("itemId", record::getItemId)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(absPath).toPropertyWhenPresent("absPath", record::getAbsPath)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default Optional<PicTb> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, picTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default List<PicTb> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, picTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default List<PicTb> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, picTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default Optional<PicTb> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, picTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    static UpdateDSL<UpdateModel> updateAllColumns(PicTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(itemId).equalTo(record::getItemId)
                .set(url).equalTo(record::getUrl)
                .set(absPath).equalTo(record::getAbsPath);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PicTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(itemId).equalToWhenPresent(record::getItemId)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(absPath).equalToWhenPresent(record::getAbsPath);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default int updateByPrimaryKey(PicTb record) {
        return update(c ->
            c.set(itemId).equalTo(record::getItemId)
            .set(url).equalTo(record::getUrl)
            .set(absPath).equalTo(record::getAbsPath)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2599513+08:00", comments="Source Table: pic_tb")
    default int updateByPrimaryKeySelective(PicTb record) {
        return update(c ->
            c.set(itemId).equalToWhenPresent(record::getItemId)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(absPath).equalToWhenPresent(record::getAbsPath)
            .where(id, isEqualTo(record::getId))
        );
    }
}