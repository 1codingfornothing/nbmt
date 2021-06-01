package cn.fouronetwo.nbmt.controller;

import cn.fouronetwo.nbmt.entity.NbmtOrder;
import cn.fouronetwo.nbmt.service.NbmtOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 单据主表(NbmtOrder)表控制层
 *
 * @author makejava
 * @since 2021-06-01 15:19:33
 */
@RestController
@RequestMapping("nbmtOrder")
public class NbmtOrderController {
    /**
     * 服务对象
     */
    @Resource
    private NbmtOrderService nbmtOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NbmtOrder selectOne(Long id) {
        return this.nbmtOrderService.queryById(id);
    }

}
