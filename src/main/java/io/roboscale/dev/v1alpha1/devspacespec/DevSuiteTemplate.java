package io.roboscale.dev.v1alpha1.devspacespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"devSpaceIDETemplate","devSpaceVDITemplate","ideEnabled","vdiEnabled"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DevSuiteTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configurational parameters of DevSpaceIDE. Applied if `.spec.ideEnabled` is set to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devSpaceIDETemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters of DevSpaceIDE. Applied if `.spec.ideEnabled` is set to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate.DevSpaceIDETemplate devSpaceIDETemplate;

    public io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate.DevSpaceIDETemplate getDevSpaceIDETemplate() {
        return devSpaceIDETemplate;
    }

    public void setDevSpaceIDETemplate(io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate.DevSpaceIDETemplate devSpaceIDETemplate) {
        this.devSpaceIDETemplate = devSpaceIDETemplate;
    }

    /**
     * Configurational parameters of DevSpaceVDI. Applied if `.spec.vdiEnabled` is set to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devSpaceVDITemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters of DevSpaceVDI. Applied if `.spec.vdiEnabled` is set to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate.DevSpaceVDITemplate devSpaceVDITemplate;

    public io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate.DevSpaceVDITemplate getDevSpaceVDITemplate() {
        return devSpaceVDITemplate;
    }

    public void setDevSpaceVDITemplate(io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate.DevSpaceVDITemplate devSpaceVDITemplate) {
        this.devSpaceVDITemplate = devSpaceVDITemplate;
    }

    /**
     * If `true`, a Cloud IDE will be provisioned inside development suite.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ideEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, a Cloud IDE will be provisioned inside development suite.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ideEnabled;

    public Boolean getIdeEnabled() {
        return ideEnabled;
    }

    public void setIdeEnabled(Boolean ideEnabled) {
        this.ideEnabled = ideEnabled;
    }

    /**
     * If `true`, a Cloud VDI will be provisioned inside development suite.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vdiEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, a Cloud VDI will be provisioned inside development suite.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean vdiEnabled;

    public Boolean getVdiEnabled() {
        return vdiEnabled;
    }

    public void setVdiEnabled(Boolean vdiEnabled) {
        this.vdiEnabled = vdiEnabled;
    }
}

