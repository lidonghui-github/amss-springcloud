package cn.hd.amss.controller;

import cn.hd.amss.entity.TUser;
import cn.hd.amss.service.TUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TUser)表控制层
 *
 * @author makejava
 * @since 2020-10-09 23:02:53
 */
@RestController
@RequestMapping("tUser")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TUser selectOne(Long id) {
        return this.tUserService.queryById(id);
    }

    @PostMapping("/save")
    public TUser saveUser(@RequestBody TUser tUser){
        return this.tUserService.insert(tUser);
    }


    @PutMapping("/update")
    public TUser updateUser(@RequestBody TUser tUser){
        return this.tUserService.update(tUser);
    }

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteUserById(@PathVariable("id") long id){
        return tUserService.deleteById(id);
    }

}