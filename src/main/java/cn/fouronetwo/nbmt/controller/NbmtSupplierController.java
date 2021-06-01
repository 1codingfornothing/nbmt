package cn.fouronetwo.nbmt.controller;

import cn.fouronetwo.nbmt.entity.NbmtSupplier;
import cn.fouronetwo.nbmt.service.NbmtSupplierService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 供应商表(NbmtSupplier)表控制层
 *
 * @author makejava
 * @since 2021-06-01 15:19:35
 */
@RestController
@RequestMapping("nbmtSupplier")
public class NbmtSupplierController {
    /**
     * 服务对象
     */
    @Resource
    private NbmtSupplierService nbmtSupplierService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NbmtSupplier selectOne(Long id) {
        return this.nbmtSupplierService.queryById(id);
    }

}
