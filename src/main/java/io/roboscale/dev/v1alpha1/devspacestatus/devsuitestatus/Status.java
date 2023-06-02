package io.roboscale.dev.v1alpha1.devspacestatus.devsuitestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"active","devSpaceIDEStatus","devSpaceVDIStatus","phase"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * [*alpha*] Indicates if DevSuite is attached to a DevSpace and actively provisioned it's resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Indicates if DevSuite is attached to a DevSpace and actively provisioned it's resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Status of DevSpaceIDE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devSpaceIDEStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of DevSpaceIDE.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.devsuitestatus.status.DevSpaceIDEStatus devSpaceIDEStatus;

    public io.roboscale.dev.v1alpha1.devspacestatus.devsuitestatus.status.DevSpaceIDEStatus getDevSpaceIDEStatus() {
        return devSpaceIDEStatus;
    }

    public void setDevSpaceIDEStatus(io.roboscale.dev.v1alpha1.devspacestatus.devsuitestatus.status.DevSpaceIDEStatus devSpaceIDEStatus) {
        this.devSpaceIDEStatus = devSpaceIDEStatus;
    }

    /**
     * Status of DevSpaceVDI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devSpaceVDIStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of DevSpaceVDI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.devsuitestatus.status.DevSpaceVDIStatus devSpaceVDIStatus;

    public io.roboscale.dev.v1alpha1.devspacestatus.devsuitestatus.status.DevSpaceVDIStatus getDevSpaceVDIStatus() {
        return devSpaceVDIStatus;
    }

    public void setDevSpaceVDIStatus(io.roboscale.dev.v1alpha1.devspacestatus.devsuitestatus.status.DevSpaceVDIStatus devSpaceVDIStatus) {
        this.devSpaceVDIStatus = devSpaceVDIStatus;
    }

    /**
     * Phase of DevSuite.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of DevSuite.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }
}

