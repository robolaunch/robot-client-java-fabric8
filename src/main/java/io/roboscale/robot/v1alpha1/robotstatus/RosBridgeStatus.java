package io.roboscale.robot.v1alpha1.robotstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"resource","status"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RosBridgeStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.Resource resource;

    public io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.Resource resource) {
        this.resource = resource;
    }

    /**
     * ROSBridgeStatus defines the observed state of ROSBridge
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROSBridgeStatus defines the observed state of ROSBridge")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.Status status;

    public io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.Status getStatus() {
        return status;
    }

    public void setStatus(io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.Status status) {
        this.status = status;
    }
}

