package org.example;

import com.statsig.sdk.Statsig;
import com.statsig.sdk.StatsigUser;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String apiKey;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        apiKey = "lolhahahahhahah";
        Future initFuture = Statsig.initializeAsync(apiKey);
        initFuture.get();
        testStatsig();
    }

    public static void testStatsig() {
        StatsigUser user = new StatsigUser("123");
        user.setEmail("weihao@statsig.com");
        System.out.println(Statsig.checkGateSync(user, "test_gate"));
        System.out.println(Statsig.getExperimentSync(user, "test_icon_types").getConfig(apiKey));
    }
}