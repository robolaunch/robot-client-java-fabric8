package io.roboscale.dev.v1alpha1.devspacestatus.workspacemanagerstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"created","phase","reference"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Resource implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Shows if the owned resource is created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Shows if the owned resource is created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean created;

    public Boolean getCreated() {
        return created;
    }

    public void setCreated(Boolean created) {
        this.created = created;
    }

    /**
     * Phase of the owned resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of the owned resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Reference to the owned resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference to the owned resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.workspacemanagerstatus.resource.Reference reference;

    public io.roboscale.dev.v1alpha1.devspacestatus.workspacemanagerstatus.resource.Reference getReference() {
        return reference;
    }

    public void setReference(io.roboscale.dev.v1alpha1.devspacestatus.workspacemanagerstatus.resource.Reference reference) {
        this.reference = reference;
    }
}

