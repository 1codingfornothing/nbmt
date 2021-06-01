package cn.fouronetwo.nbmt.dao;

import cn.fouronetwo.nbmt.entity.NbmtSupplier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 供应商表(NbmtSupplier)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 15:19:35
 */
public interface NbmtSupplierDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NbmtSupplier queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtSupplier> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param nbmtSupplier 实例对象
     * @return 对象列表
     */
    List<NbmtSupplier> queryAll(NbmtSupplier nbmtSupplier);

    /**
     * 新增数据
     *
     * @param nbmtSupplier 实例对象
     * @return 影响行数
     */
    int insert(NbmtSupplier nbmtSupplier);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtSupplier> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<NbmtSupplier> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtSupplier> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<NbmtSupplier> entities);

    /**
     * 修改数据
     *
     * @param nbmtSupplier 实例对象
     * @return 影响行数
     */
    int update(NbmtSupplier nbmtSupplier);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

