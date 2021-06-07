package com.crud.mapper;

import com.crud.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 注意这里并没有使用@Mapper注释，而是在CrudApplication上面新增了@MapperScan备注。直接扫描了整个包
 * https://www.cnblogs.com/JackpotHan/p/10286496.html
 * 不过不知道为啥，不加上这个好像是不行，没办法auto，稍微有那么点尴尬
 * **/
@Mapper
public interface UserMapper {
    List<User> getUsers();
    User getUserById(Integer id);
    boolean insertUser(User user);
    boolean deleteUserById(Integer id);
    boolean updateUser(User user);
}
