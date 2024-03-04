package io.roboscale.robot.v1alpha2.ros2workloadstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"resource","status"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DiscoveryServerStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Generic status for any owned resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic status for any owned resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.Resource resource;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.Resource resource) {
        this.resource = resource;
    }

    /**
     * Status of the DiscoveryServer instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of the DiscoveryServer instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.Status status;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.Status getStatus() {
        return status;
    }

    public void setStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.Status status) {
        this.status = status;
    }
}

