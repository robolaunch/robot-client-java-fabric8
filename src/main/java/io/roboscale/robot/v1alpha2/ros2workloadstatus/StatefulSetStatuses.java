package io.roboscale.robot.v1alpha2.ros2workloadstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"containerStatuses","resource","status"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class StatefulSetStatuses implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Container statuses.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Container statuses.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.ContainerStatuses> containerStatuses;

    public java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.ContainerStatuses> getContainerStatuses() {
        return containerStatuses;
    }

    public void setContainerStatuses(java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.ContainerStatuses> containerStatuses) {
        this.containerStatuses = containerStatuses;
    }

    /**
     * Generic status for any owned resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic status for any owned resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.Resource resource;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.Resource resource) {
        this.resource = resource;
    }

    /**
     * Status of the ROS2Bridge instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of the ROS2Bridge instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.Status status;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.Status getStatus() {
        return status;
    }

    public void setStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.Status status) {
        this.status = status;
    }
}

