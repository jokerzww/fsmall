package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ComponentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: component")
    public static final Component component = new Component();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_id")
    public static final SqlColumn<Integer> componentId = component.componentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_group_id")
    public static final SqlColumn<Integer> componentGroupId = component.componentGroupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: component.component_urn")
    public static final SqlColumn<String> componentUrn = component.componentUrn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: component")
    public static final class Component extends SqlTable {
        public final SqlColumn<Integer> componentId = column("component_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> componentGroupId = column("component_group_id", JDBCType.INTEGER);

        public final SqlColumn<String> componentUrn = column("component_urn", JDBCType.LONGVARCHAR);

        public Component() {
            super("component");
        }
    }
}