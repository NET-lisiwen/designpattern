package adapter;

/**
 * @ProjectName: designpattern
 * @ClassName: Adapter
 * @Description: 通过在内部包装一个Adaptee对象，把源接口改成目标接口
 * @Author: lisiwen
 * @Date: 2019/12/23 8:55
 **/
public class Adapter extends Adaptee implements Target{
    @Override
    public void Request(){
        super.SpecificRequest();
    }
}
