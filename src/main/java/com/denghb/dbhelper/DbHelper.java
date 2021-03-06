package com.denghb.dbhelper;

import java.util.List;

import com.denghb.dbhelper.paging.Paging;
import com.denghb.dbhelper.paging.PagingResult;

/**
 * <pre>
 * 常用的一些数据库操作
 * </pre>
 *
 * https://github.com/deng-hb/dbhelper
 *
 * @author denghb
 */
public interface DbHelper {

    /**
     * 创建一条纪录
     *
     * @param object
     */
    public boolean insert(Object object);

    /**
     * 更新一条纪录
     *
     * @param object
     */
    public boolean updateById(Object object);

    /**
     * 执行一条SQL
     *
     * @param sql
     * @param args
     */
    public int execute(String sql, Object... args);

    /**
     * 查询列表
     *
     * @param sql
     * @param clazz
     * @param args
     */
    public <T> List<T> list(String sql, Class<T> clazz, Object... args);


    /**
     * 查询并分页
     *
     * @param sql
     * @param clazz
     * @param paging
     * @param <T>
     */
    public <T> PagingResult<T> list(StringBuffer sql, Class<T> clazz, Paging paging);

    /**
     * 指定参数查询返回对象
     *
     * @param sql
     * @param clazz
     * @param args
     */
    public <T> T queryForObject(String sql, Class<T> clazz, Object... args);

    /**
     * 查询一条纪录
     *
     * @param clazz
     * @param id
     */
    public <T> T queryById(Class<T> clazz, Object id);

    /**
     * 删除
     *
     * @param clazz
     * @param id
     */
    public <T> boolean deleteById(Class<T> clazz, Object id);

}
