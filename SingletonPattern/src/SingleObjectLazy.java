public class SingleObjectLazy {

    //创建一个对象
    private static SingleObjectLazy instance;

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObjectLazy(){}

    //获得唯一可用的对象
    public static SingleObjectLazy getInstance(){

        if(instance == null){
            return new SingleObjectLazy();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("懒汉式（非线程安全）：Hello World!");
    }
}
