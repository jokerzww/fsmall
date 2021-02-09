package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.PictureDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Picture;
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
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface PictureMapper extends CommonInsertMapper<Picture> {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    BasicColumn[] selectList = BasicColumn.columnList(id, itemId, url, absPath);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9881833+08:00", comments="Source Table: picture")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9881833+08:00", comments="Source Table: picture")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9881833+08:00", comments="Source Table: picture")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Picture> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9881833+08:00", comments="Source Table: picture")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PictureResult")
    Optional<Picture> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9881833+08:00", comments="Source Table: picture")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PictureResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="abs_path", property="absPath", jdbcType=JdbcType.VARCHAR)
    })
    List<Picture> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, picture, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, picture, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default int insert(Picture record) {
        return MyBatis3Utils.insert(this::insert, record, picture, c ->
            c.map(itemId).toProperty("itemId")
            .map(url).toProperty("url")
            .map(absPath).toProperty("absPath")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default int insertSelective(Picture record) {
        return MyBatis3Utils.insert(this::insert, record, picture, c ->
            c.map(itemId).toPropertyWhenPresent("itemId", record::getItemId)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(absPath).toPropertyWhenPresent("absPath", record::getAbsPath)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default Optional<Picture> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, picture, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default List<Picture> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, picture, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default List<Picture> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, picture, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default Optional<Picture> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9891802+08:00", comments="Source Table: picture")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, picture, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9901781+08:00", comments="Source Table: picture")
    static UpdateDSL<UpdateModel> updateAllColumns(Picture record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(itemId).equalTo(record::getItemId)
                .set(url).equalTo(record::getUrl)
                .set(absPath).equalTo(record::getAbsPath);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9901781+08:00", comments="Source Table: picture")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Picture record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(itemId).equalToWhenPresent(record::getItemId)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(absPath).equalToWhenPresent(record::getAbsPath);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9901781+08:00", comments="Source Table: picture")
    default int updateByPrimaryKey(Picture record) {
        return update(c ->
            c.set(itemId).equalTo(record::getItemId)
            .set(url).equalTo(record::getUrl)
            .set(absPath).equalTo(record::getAbsPath)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9901781+08:00", comments="Source Table: picture")
    default int updateByPrimaryKeySelective(Picture record) {
        return update(c ->
            c.set(itemId).equalToWhenPresent(record::getItemId)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(absPath).equalToWhenPresent(record::getAbsPath)
            .where(id, isEqualTo(record::getId))
        );
    }
}