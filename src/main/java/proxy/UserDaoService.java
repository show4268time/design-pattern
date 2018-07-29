package proxy;

/**
 * @program: design-pattern
 * @description: 用户Dao服务层
 * @author: showtime
 * @create: 2018-07-29 22:04
 **/
public interface UserDaoService {
    void findByUserName(String name);

    void deleteByUserName(String name);
}
