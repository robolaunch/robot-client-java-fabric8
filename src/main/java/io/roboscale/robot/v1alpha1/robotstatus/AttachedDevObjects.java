package io.roboscale.robot.v1alpha1.robotstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"reference","status"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AttachedDevObjects implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Reference to the RobotDevSuite instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference to the RobotDevSuite instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.Reference reference;

    public io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.Reference getReference() {
        return reference;
    }

    public void setReference(io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.Reference reference) {
        this.reference = reference;
    }

    /**
     * Status of attached RobotDevSuite.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of attached RobotDevSuite.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.Status status;

    public io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.Status getStatus() {
        return status;
    }

    public void setStatus(io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.Status status) {
        this.status = status;
    }
}

