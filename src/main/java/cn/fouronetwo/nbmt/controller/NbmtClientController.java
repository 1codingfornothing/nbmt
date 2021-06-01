package cn.fouronetwo.nbmt.controller;

import cn.fouronetwo.nbmt.entity.NbmtClient;
import cn.fouronetwo.nbmt.service.NbmtClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 客户表(NbmtClient)表控制层
 *
 * @author makejava
 * @since 2021-06-01 15:19:31
 */
@RestController
@RequestMapping("nbmtClient")
public class NbmtClientController {
    /**
     * 服务对象
     */
    @Resource
    private NbmtClientService nbmtClientService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NbmtClient selectOne(Long id) {
        return this.nbmtClientService.queryById(id);
    }

}
