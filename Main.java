import io.sentry.Sentry;

public class Main {
    public static void main(String[] args) {
        // Initialize Sentry for error tracking / 初始化 Sentry 以进行错误追踪
        Sentry.init(options -> {
            // DSN is loaded from sentry.properties on the classpath;
            // override here if needed: options.setDsn("https://your-dsn@sentry.io/project");
            options.setTracesSampleRate(1.0);
        });

        System.out.println("Hello, World!");
        System.out.println("名字：张三");
        System.out.println("学校：京大");

        // Introduce Azure as an agent for resource deployment / 将 Azure 作为 agent，介绍资源部署
        AzureAgent.introduce();
    }
}
