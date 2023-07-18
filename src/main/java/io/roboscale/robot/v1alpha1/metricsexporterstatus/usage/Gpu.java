package io.roboscale.robot.v1alpha1.metricsexporterstatus.usage;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"lastUpdateTimestamp","utilization"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Gpu implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Last update time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Last update time.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String lastUpdateTimestamp;

    public String getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(String lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * Volatile GPU utilization. Shows a percentage gathered from `nvidia-smi` command.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("utilization")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Volatile GPU utilization. Shows a percentage gathered from `nvidia-smi` command.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String utilization;

    public String getUtilization() {
        return utilization;
    }

    public void setUtilization(String utilization) {
        this.utilization = utilization;
    }
}

