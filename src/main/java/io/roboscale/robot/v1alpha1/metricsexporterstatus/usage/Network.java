package io.roboscale.robot.v1alpha1.metricsexporterstatus.usage;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"lastUpdateTimestamp","load"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Network implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * Loads values of network interfaces.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("load")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Loads values of network interfaces.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.network.Load> load;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.network.Load> getLoad() {
        return load;
    }

    public void setLoad(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.network.Load> load) {
        this.load = load;
    }
}

