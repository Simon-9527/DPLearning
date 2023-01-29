public class SingleObjectLazySafe {

    //创建一个对象
    private static SingleObjectLazySafe instance;

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObjectLazySafe(){}

    //获得唯一可用的对象
    public static synchronized SingleObjectLazySafe getInstance(){

        if(instance == null){
            return new SingleObjectLazySafe();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("懒汉式（线程安全）：Hello World!");
    }
}
