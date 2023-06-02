package io.roboscale.dev.v1alpha1.devspacestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"reference","status"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AttachedDevObjects implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Reference to the DevSuite instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference to the DevSuite instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.Reference reference;

    public io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.Reference getReference() {
        return reference;
    }

    public void setReference(io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.Reference reference) {
        this.reference = reference;
    }

    /**
     * Status of attached DevSuite.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of attached DevSuite.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.Status status;

    public io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.Status getStatus() {
        return status;
    }

    public void setStatus(io.roboscale.dev.v1alpha1.devspacestatus.attacheddevobjects.Status status) {
        this.status = status;
    }
}

