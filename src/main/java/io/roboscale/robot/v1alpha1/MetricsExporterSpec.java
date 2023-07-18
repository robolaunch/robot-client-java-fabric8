package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"gpu","network"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class MetricsExporterSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configurational parameters about GPU metrics collection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpu")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters about GPU metrics collection.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterspec.Gpu gpu;

    public io.roboscale.robot.v1alpha1.metricsexporterspec.Gpu getGpu() {
        return gpu;
    }

    public void setGpu(io.roboscale.robot.v1alpha1.metricsexporterspec.Gpu gpu) {
        this.gpu = gpu;
    }

    /**
     * Configurational parameters about network metrics collection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters about network metrics collection.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterspec.Network network;

    public io.roboscale.robot.v1alpha1.metricsexporterspec.Network getNetwork() {
        return network;
    }

    public void setNetwork(io.roboscale.robot.v1alpha1.metricsexporterspec.Network network) {
        this.network = network;
    }
}

