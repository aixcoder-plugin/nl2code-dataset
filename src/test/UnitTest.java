import java.util.concurrent.*;

public class UnitTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        /**
         * 往线程池中提交一个Callable，立刻返回Future对象，但是该Future对象里面的返回值目前还是null
         * 只有当你调用get方法时，才会阻塞地获取该任务真实的返回值
         */
        Future<Object> objectFuture = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println(Thread.currentThread().getName() + "========>正在执行！");
                Thread.sleep(2000); //执行耗时操作
                return "SUCCESS";
            }
        });

        Object result = objectFuture.get();
        System.out.println(result);
        executorService.shutdownNow();
    }
}
