package io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.gpudevicestatuses;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fbMemoryFree","fbMemoryUsed","gpuUtil","memoryUtil","powerUsage","temp"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Metrics implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Framebuffer memory free (in MiB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fbMemoryFree")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Framebuffer memory free (in MiB).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> fbMemoryFree;

    public java.util.Map<java.lang.String, String> getFbMemoryFree() {
        return fbMemoryFree;
    }

    public void setFbMemoryFree(java.util.Map<java.lang.String, String> fbMemoryFree) {
        this.fbMemoryFree = fbMemoryFree;
    }

    /**
     * Framebuffer memory used (in MiB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fbMemoryUsed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Framebuffer memory used (in MiB).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> fbMemoryUsed;

    public java.util.Map<java.lang.String, String> getFbMemoryUsed() {
        return fbMemoryUsed;
    }

    public void setFbMemoryUsed(java.util.Map<java.lang.String, String> fbMemoryUsed) {
        this.fbMemoryUsed = fbMemoryUsed;
    }

    /**
     * GPU utilization (in %).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuUtil")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU utilization (in %).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> gpuUtil;

    public java.util.Map<java.lang.String, String> getGpuUtil() {
        return gpuUtil;
    }

    public void setGpuUtil(java.util.Map<java.lang.String, String> gpuUtil) {
        this.gpuUtil = gpuUtil;
    }

    /**
     * Memory utilization (in %).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUtil")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Memory utilization (in %).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> memoryUtil;

    public java.util.Map<java.lang.String, String> getMemoryUtil() {
        return memoryUtil;
    }

    public void setMemoryUtil(java.util.Map<java.lang.String, String> memoryUtil) {
        this.memoryUtil = memoryUtil;
    }

    /**
     * Power draw (in W).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("powerUsage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Power draw (in W).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> powerUsage;

    public java.util.Map<java.lang.String, String> getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(java.util.Map<java.lang.String, String> powerUsage) {
        this.powerUsage = powerUsage;
    }

    /**
     * GPU temperature (in C).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("temp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU temperature (in C).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> temp;

    public java.util.Map<java.lang.String, String> getTemp() {
        return temp;
    }

    public void setTemp(java.util.Map<java.lang.String, String> temp) {
        this.temp = temp;
    }
}

