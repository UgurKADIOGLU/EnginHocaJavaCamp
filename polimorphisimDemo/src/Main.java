public class Main {

    public static void main(String[] args) {
        BaseLogger[] baseLoggers = {new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()};
        for (BaseLogger logger : baseLoggers
        ) {
            logger.Log("Bu ilk loglama");
        }

        CustomerManager customerManager=new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
