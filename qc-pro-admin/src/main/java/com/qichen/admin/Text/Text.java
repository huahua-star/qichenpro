package com.qichen.admin.Text;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.ds.DSFactory;
import cn.hutool.db.meta.Column;
import cn.hutool.db.meta.MetaUtil;
import cn.hutool.db.meta.Table;


import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public class Text {
    private static Db db = Db.use("mysql");

    public static void main(String[] args) throws SQLException {
        DataSource ds = DSFactory.get("mysql"); // 加载 Mysql 数据库
        Table table = MetaUtil.getTableMeta(ds, "employee");
        Collection<Column> columns= table.getColumns();
        /*for(Column column : columns){
            System.out.println(column);
        }*/
        //SqlBuilder builder = SqlBuilder.create().select().from("employee").where(new Condition("name", "= null"));
        //System.out.println(builder);
        employee ee=new employee();
        ee.setEid("222");
        ee.setEname("333");
        ee.setSalary("1002");
        ee.setDeptid("123");
        //db.insert(Entity.create().parseBean(ee));
        List<Entity> c=db.findAll("employee");
        for(Entity eb : c){
            System.out.println(eb.toBean(employee.class));
        }
    }

}
