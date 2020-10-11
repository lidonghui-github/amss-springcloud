package cn.hd.amss.controller;

import cn.hd.amss.entity.TUser;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * (TUser)表控制层
 *
 * @author makejava
 * @since 2020-10-09 23:02:53
 */
@RestController
@RequestMapping("rest")
public class TUserController {

    @Resource
    private RestTemplate restTemplate;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TUser selectOne(Long id) {
        return restTemplate.getForObject("http://localhost:8010/tUser/selectOne?id=" + id, TUser.class);

    }

    @PostMapping("/save")
    public TUser saveUser(@RequestBody TUser tUser) {
        return restTemplate.postForObject("http://localhost:8010/tUser/save", tUser, TUser.class);

    }


    @PutMapping("/update")
    public TUser updateUser(@RequestBody TUser tUser) {
        restTemplate.put("http://localhost:8010/tUser/update",tUser);
        return tUser;

    }

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteUserById(@PathVariable("id") long id) {
        restTemplate.delete("http://localhost:8010/tUser/deleteById/{id}",id);
        return true;
    }

}