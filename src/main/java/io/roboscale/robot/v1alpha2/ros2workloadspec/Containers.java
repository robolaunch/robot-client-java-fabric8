package io.roboscale.robot.v1alpha2.ros2workloadspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"container","replicas"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Containers implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Single container configuration for stateful set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("container")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Single container configuration for stateful set.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.containers.Container container;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.containers.Container getContainer() {
        return container;
    }

    public void setContainer(io.roboscale.robot.v1alpha2.ros2workloadspec.containers.Container container) {
        this.container = container;
    }

    /**
     * Replica number of the stateful set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replica number of the stateful set.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }
}

