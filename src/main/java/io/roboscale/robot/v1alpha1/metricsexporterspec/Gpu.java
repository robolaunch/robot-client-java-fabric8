package io.roboscale.robot.v1alpha1.metricsexporterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"interval","track"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Gpu implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Watching latency.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Watching latency.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long interval;

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    /**
     * MetricsExporter watches volatile GPU usage in the host machine
     * if it's set to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("track")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MetricsExporter watches volatile GPU usage in the host machine\nif it's set to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean track;

    public Boolean getTrack() {
        return track;
    }

    public void setTrack(Boolean track) {
        this.track = track;
    }
}

