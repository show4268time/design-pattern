package Adapter.Interface;

import java.util.Map;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 适配器接口
 * @author: yaoweihao
 * @date: 2018/8/28
 * @time: 15:09
 * @modified by:
 */
public interface Target {
    void request(Map<String, String> body);
}
