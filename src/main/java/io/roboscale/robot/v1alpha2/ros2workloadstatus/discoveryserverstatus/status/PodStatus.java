package io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ip","resource"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PodStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * IP of the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IP of the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * Generic status for any owned resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic status for any owned resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.podstatus.Resource resource;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.podstatus.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.podstatus.Resource resource) {
        this.resource = resource;
    }
}

