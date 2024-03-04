package io.roboscale.robot.v1alpha2.ros2workloadstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"connection","resource","status"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Ros2BridgeStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Address of the robot service that can be reached from outside.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connection")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Address of the robot service that can be reached from outside.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String connection;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    /**
     * Generic status for any owned resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic status for any owned resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.Resource resource;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.Resource resource) {
        this.resource = resource;
    }

    /**
     * Status of the ROS2Bridge instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of the ROS2Bridge instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.Status status;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.Status getStatus() {
        return status;
    }

    public void setStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.Status status) {
        this.status = status;
    }
}

