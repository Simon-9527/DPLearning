public class SingleObjectDCL {

    //创建一个对象
    private volatile static SingleObjectDCL instance;

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObjectDCL(){}

    //获得唯一可用的对象
    public static SingleObjectDCL getInstance(){

        if (instance == null){
            //同步代码块
            synchronized (SingleObjectDCL.class) {
                if (instance == null){
                    instance = new SingleObjectDCL();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("双重校验锁：Hello World!");
    }
}
