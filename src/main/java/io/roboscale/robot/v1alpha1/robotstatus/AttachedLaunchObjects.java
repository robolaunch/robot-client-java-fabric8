package io.roboscale.robot.v1alpha1.robotstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"reference","status"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AttachedLaunchObjects implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Reference to the LaunchManager instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference to the LaunchManager instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.Reference reference;

    public io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.Reference getReference() {
        return reference;
    }

    public void setReference(io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.Reference reference) {
        this.reference = reference;
    }

    /**
     * Status of attached LaunchManager.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of attached LaunchManager.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.Status status;

    public io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.Status getStatus() {
        return status;
    }

    public void setStatus(io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.Status status) {
        this.status = status;
    }
}

