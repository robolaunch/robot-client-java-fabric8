package io.roboscale.robot.v1alpha1.metricsexporterstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"gpuDeviceStatuses","gpuInstanceUsage","network","storage"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Usage implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * GPU device information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDeviceStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU device information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.GpuDeviceStatuses gpuDeviceStatuses;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.GpuDeviceStatuses getGpuDeviceStatuses() {
        return gpuDeviceStatuses;
    }

    public void setGpuDeviceStatuses(io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.GpuDeviceStatuses gpuDeviceStatuses) {
        this.gpuDeviceStatuses = gpuDeviceStatuses;
    }

    /**
     * GPU virtual cores.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuInstanceUsage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU virtual cores.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.GpuInstanceUsage> gpuInstanceUsage;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.GpuInstanceUsage> getGpuInstanceUsage() {
        return gpuInstanceUsage;
    }

    public void setGpuInstanceUsage(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.GpuInstanceUsage> gpuInstanceUsage) {
        this.gpuInstanceUsage = gpuInstanceUsage;
    }

    /**
     * Network usage information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Network usage information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Network network;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Network getNetwork() {
        return network;
    }

    public void setNetwork(io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Network network) {
        this.network = network;
    }

    /**
     * Storage usage information
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Storage usage information")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Storage storage;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Storage getStorage() {
        return storage;
    }

    public void setStorage(io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Storage storage) {
        this.storage = storage;
    }
}

