package io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.gpudevicestatuses;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"device","model","uuid"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Devices implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * GPU device name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU device name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String device;

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * GPU device model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("model")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU device model.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * GPU device UUID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uuid")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU device UUID.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}

