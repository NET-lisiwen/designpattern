package adapter;

/**
 * @ProjectName: designpattern
 * @ClassName: Main
 * @Description: 客户端代码
 * @Author: lisiwen
 * @Date: 2019/12/23 8:35
 **/
public class Main {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.Request();
    }
}
