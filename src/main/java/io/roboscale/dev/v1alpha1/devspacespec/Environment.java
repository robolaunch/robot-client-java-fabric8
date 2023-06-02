package io.roboscale.dev.v1alpha1.devspacespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"application","devspace","domain"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Environment implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Application properties.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("application")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Application properties.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.environment.Application application;

    public io.roboscale.dev.v1alpha1.devspacespec.environment.Application getApplication() {
        return application;
    }

    public void setApplication(io.roboscale.dev.v1alpha1.devspacespec.environment.Application application) {
        this.application = application;
    }

    /**
     * DevSpace image properties.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devspace")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DevSpace image properties.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.environment.Devspace devspace;

    public io.roboscale.dev.v1alpha1.devspacespec.environment.Devspace getDevspace() {
        return devspace;
    }

    public void setDevspace(io.roboscale.dev.v1alpha1.devspacespec.environment.Devspace devspace) {
        this.devspace = devspace;
    }

    /**
     * Domain of the environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Domain of the environment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}

