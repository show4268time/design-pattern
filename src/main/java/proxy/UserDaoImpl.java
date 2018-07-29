package proxy;

/**
 * @program: design-pattern
 * @description: 用户Dao实现层
 * @author: showtime
 * @create: 2018-07-29 22:05
 **/
public class UserDaoImpl implements UserDaoService{
    public void findByUserName(String name) {
        System.out.println("查询名称为" + name + "的用户信息成功！");
    }

    public void deleteByUserName(String name) {
        System.out.println("删除名称为" + name + "的用户信息成功！");

    }
}
