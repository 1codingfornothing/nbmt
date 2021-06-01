package cn.fouronetwo.nbmt.controller;

import cn.fouronetwo.nbmt.entity.NbmtUser;
import cn.fouronetwo.nbmt.service.NbmtUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表(NbmtUser)表控制层
 *
 * @author makejava
 * @since 2021-06-01 15:19:36
 */
@RestController
@RequestMapping("nbmtUser")
public class NbmtUserController {
    /**
     * 服务对象
     */
    @Resource
    private NbmtUserService nbmtUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NbmtUser selectOne(Long id) {
        return this.nbmtUserService.queryById(id);
    }

}
