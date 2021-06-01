package cn.fouronetwo.nbmt.controller;

import cn.fouronetwo.nbmt.entity.NbmtProduct;
import cn.fouronetwo.nbmt.service.NbmtProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 产品表(NbmtProduct)表控制层
 *
 * @author makejava
 * @since 2021-06-01 15:19:36
 */
@RestController
@RequestMapping("nbmtProduct")
public class NbmtProductController {
    /**
     * 服务对象
     */
    @Resource
    private NbmtProductService nbmtProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NbmtProduct selectOne(Long id) {
        return this.nbmtProductService.queryById(id);
    }

}
