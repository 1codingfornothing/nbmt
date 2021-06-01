package cn.fouronetwo.nbmt.dao;

import cn.fouronetwo.nbmt.entity.NbmtOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 单据主表(NbmtOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 15:19:33
 */
public interface NbmtOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NbmtOrder queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param nbmtOrder 实例对象
     * @return 对象列表
     */
    List<NbmtOrder> queryAll(NbmtOrder nbmtOrder);

    /**
     * 新增数据
     *
     * @param nbmtOrder 实例对象
     * @return 影响行数
     */
    int insert(NbmtOrder nbmtOrder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtOrder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<NbmtOrder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtOrder> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<NbmtOrder> entities);

    /**
     * 修改数据
     *
     * @param nbmtOrder 实例对象
     * @return 影响行数
     */
    int update(NbmtOrder nbmtOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

