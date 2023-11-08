package io.roboscale.robot.v1alpha1.metricsexporterstatus.usage;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"lastUpdateTimestamp","usage"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Storage implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * Usage values of filesystems.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Usage values of filesystems.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.storage.Usage> usage;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.storage.Usage> getUsage() {
        return usage;
    }

    public void setUsage(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.storage.Usage> usage) {
        this.usage = usage;
    }
}

