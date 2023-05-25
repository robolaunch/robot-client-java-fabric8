package io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"connection","resource"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RobotIDEStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
    private io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status.robotidestatus.Resource resource;

    public io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status.robotidestatus.Resource getResource() {
        return resource;
    }

    public void setResource(io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status.robotidestatus.Resource resource) {
        this.resource = resource;
    }
}

