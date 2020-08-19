package com.acmday.design.pattern.server.singleton;

/**
 * @author acmday.
 * @date 2020/8/19.
 */
/*********** 请求两个接口100000次耗时 ***********
网上有人说：
    访问 volatile 变量，需要保证一些执行顺序，所以的开销比较大。因此定义一个临时变量，在 sInst 不为空的时候（这是绝大部分的情况），
    只要在开始访问一次 volatile 变量，返回的是临时变量。如果没有此临时变量，则需要访问两次，而降低了效率。

 但是经过测试发现，在数据量很大的时候，效率不是很明显。不过测试数据为1万的时候貌似有点用。
    //Singleton.getInstanceCmp()
    005337948  100%
    004908584  100%
    003462143  100%
    003316871  100%
    002591447  100%
    002613757  100%
    002776181  100%
    002706412  100%

    //Singleton.getInstance()
    005847640  100%
    007585809  100%
    005145791  100%
    002932978  100%
    024408050  100%
    002888543  100%
    003874044  100%
    002649062  100%
     */
public class Singleton {

    private static volatile Instance instance = null;

    public static Instance getInstance() {
        Instance ins = instance;
        if(ins == null) {
            synchronized (Instance.class) {
                ins = instance;
                if(ins == null) {
                    ins = new Instance();
                    instance = ins;
                }
            }
        }
        return ins;
    }

    public static Instance getInstanceCmp() {
        if(instance == null) {
            synchronized (Instance.class) {
                if(instance == null) {
                    instance = new Instance();
                }
            }
        }
        return instance;
    }
}
