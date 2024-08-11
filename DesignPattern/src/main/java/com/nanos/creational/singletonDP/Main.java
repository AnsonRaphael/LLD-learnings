package com.nanos.creational.singletonDP;

public class Main {
    public static void main(String[] args) {

        //When you are sure that the instance will be needed throughout the application lifecycle
        // and its creation is not resource-intensive.
        //The instance is created at the time of class loading,
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton.getData());
        //The instance is created even if it’s not used, which may
        // lead to unnecessary resource usage if the instance creation is costly or if it's never used.


        //The instance is created only when it is required, potentially saving resources.
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton.getData());
        //Not thread-safe; multiple threads may create multiple instances if the getInstance()
        // method is accessed simultaneously.

        //Ensures that only one instance is created even in a multi-threaded environment.
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton.getData());
        //The synchronized method can be a performance bottleneck
        // as it may lead to contention among threads, causing potential delays.


        //Reduces the performance impact of synchronized by only synchronizing the critical section
        // where the instance is created.
        DoubleCheckLockingSingleton doubleCheckLockingSingleton = DoubleCheckLockingSingleton.getInstance();
        System.out.println(doubleCheckLockingSingleton.getData());
        //Still requires the use of the volatile keyword to prevent issues related to
        // instruction reordering by the compiler. Other threads might not see the most recent updates to instance
        // if volatile is not used. Thread may take it from register or cache


        //Lazy initialization
        //Thread-safe without synchronization overhead.
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        System.out.println(billPughSingleton.getData());
        //Slightly more complex due to nested static class.

        // easy implementation
        EnumSingleton enumSingleton = EnumSingleton.ENUM_SINGLETON;
        System.out.println(enumSingleton.getData());
        //num values cannot be lazily initialized; the instance is created when the enum is loaded.
        //not abe parameter data

    }
}
