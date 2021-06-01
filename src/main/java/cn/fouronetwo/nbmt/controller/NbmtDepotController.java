package cn.fouronetwo.nbmt.controller;

import cn.fouronetwo.nbmt.entity.NbmtDepot;
import cn.fouronetwo.nbmt.service.NbmtDepotService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 仓库表(NbmtDepot)表控制层
 *
 * @author makejava
 * @since 2021-06-01 15:19:34
 */
@RestController
@RequestMapping("nbmtDepot")
public class NbmtDepotController {
    /**
     * 服务对象
     */
    @Resource
    private NbmtDepotService nbmtDepotService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NbmtDepot selectOne(Long id) {
        return this.nbmtDepotService.queryById(id);
    }

}
