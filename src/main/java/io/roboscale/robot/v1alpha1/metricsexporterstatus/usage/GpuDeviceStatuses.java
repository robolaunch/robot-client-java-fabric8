package io.roboscale.robot.v1alpha1.metricsexporterstatus.usage;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"dcgmEndpoint","devices","metrics"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class GpuDeviceStatuses implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DCGM endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dcgmEndpoint")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DCGM endpoint.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String dcgmEndpoint;

    public String getDcgmEndpoint() {
        return dcgmEndpoint;
    }

    public void setDcgmEndpoint(String dcgmEndpoint) {
        this.dcgmEndpoint = dcgmEndpoint;
    }

    /**
     * Available GPU devices.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devices")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Available GPU devices.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.gpudevicestatuses.Devices> devices;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.gpudevicestatuses.Devices> getDevices() {
        return devices;
    }

    public void setDevices(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.gpudevicestatuses.Devices> devices) {
        this.devices = devices;
    }

    /**
     * GPU device metrics from DCGM exporter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU device metrics from DCGM exporter.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.gpudevicestatuses.Metrics metrics;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.gpudevicestatuses.Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.gpudevicestatuses.Metrics metrics) {
        this.metrics = metrics;
    }
}

