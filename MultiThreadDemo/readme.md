### Three ways to perform multi-threading:
1. Obj extends Thread and override run() -> call Obj.start() in main
2. Obj implements Runnable and override run() -> in main method: create a new thread: Thread t1 = new Thread(runnable) or: Thread t2 = new Thread(new Obj()) -> t1.start(); t2.start();
3. lambda expression: in main method: Thread t1 = new Thread(() -> {// the implementation of run() method in Runnable interface});  -> t1.start()

### Dead Lock
If threads are waiting for each other to finish, then the condition is known as Deadlock.Two locks are applied to both shared item s1 and s2, also s1 method test1 is waiting for s2 to release the lock and s2 method test2 is waiting for s1 to release the lock.