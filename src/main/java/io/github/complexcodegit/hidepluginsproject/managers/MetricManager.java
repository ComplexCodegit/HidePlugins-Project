package io.github.complexcodegit.hidepluginsproject.managers;

import io.github.complexcodegit.hidepluginsproject.HidePluginsProject;
import io.github.complexcodegit.hidepluginsproject.external.Metrics;

public class MetricManager {
    public static void customMetrics(HidePluginsProject plugin, GroupManager groupManager){
        Metrics metrics = new Metrics(plugin, 5432);
        metrics.addCustomChart(new Metrics.SingleLineChart("groups", () -> groupManager.getGroups().size()));
    }
}