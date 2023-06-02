package io.roboscale.dev.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"devSuiteTemplate","development","environment","rootDNSConfig","storage","tlsSecretRef","workspaceManagerTemplate"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DevSpaceSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DevSpace development suite template
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devSuiteTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DevSpace development suite template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.DevSuiteTemplate devSuiteTemplate;

    public io.roboscale.dev.v1alpha1.devspacespec.DevSuiteTemplate getDevSuiteTemplate() {
        return devSuiteTemplate;
    }

    public void setDevSuiteTemplate(io.roboscale.dev.v1alpha1.devspacespec.DevSuiteTemplate devSuiteTemplate) {
        this.devSuiteTemplate = devSuiteTemplate;
    }

    /**
     * [*alpha*] Switch to development mode if `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("development")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Switch to development mode if `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean development;

    public Boolean getDevelopment() {
        return development;
    }

    public void setDevelopment(Boolean development) {
        this.development = development;
    }

    /**
     * Environment properties. Supported options are listed in [robolaunch Platform Versioning Map](https://github.com/robolaunch/robolaunch/blob/main/platform.yaml).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environment")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Environment properties. Supported options are listed in [robolaunch Platform Versioning Map](https://github.com/robolaunch/robolaunch/blob/main/platform.yaml).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.Environment environment;

    public io.roboscale.dev.v1alpha1.devspacespec.Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(io.roboscale.dev.v1alpha1.devspacespec.Environment environment) {
        this.environment = environment;
    }

    /**
     * [*alpha*] Root DNS configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootDNSConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Root DNS configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.RootDNSConfig rootDNSConfig;

    public io.roboscale.dev.v1alpha1.devspacespec.RootDNSConfig getRootDNSConfig() {
        return rootDNSConfig;
    }

    public void setRootDNSConfig(io.roboscale.dev.v1alpha1.devspacespec.RootDNSConfig rootDNSConfig) {
        this.rootDNSConfig = rootDNSConfig;
    }

    /**
     * Total storage amount to persist via DevSpace. Unit of measurement is MB. (eg. `10240` corresponds 10 GB) This amount is being shared between different components.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Total storage amount to persist via DevSpace. Unit of measurement is MB. (eg. `10240` corresponds 10 GB) This amount is being shared between different components.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.Storage storage;

    public io.roboscale.dev.v1alpha1.devspacespec.Storage getStorage() {
        return storage;
    }

    public void setStorage(io.roboscale.dev.v1alpha1.devspacespec.Storage storage) {
        this.storage = storage;
    }

    /**
     * [*alpha*] TLS secret reference.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] TLS secret reference.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.TlsSecretRef tlsSecretRef;

    public io.roboscale.dev.v1alpha1.devspacespec.TlsSecretRef getTlsSecretRef() {
        return tlsSecretRef;
    }

    public void setTlsSecretRef(io.roboscale.dev.v1alpha1.devspacespec.TlsSecretRef tlsSecretRef) {
        this.tlsSecretRef = tlsSecretRef;
    }

    /**
     * Workspace manager template to configure ROS 2 workspaces.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceManagerTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Workspace manager template to configure ROS 2 workspaces.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.WorkspaceManagerTemplate workspaceManagerTemplate;

    public io.roboscale.dev.v1alpha1.devspacespec.WorkspaceManagerTemplate getWorkspaceManagerTemplate() {
        return workspaceManagerTemplate;
    }

    public void setWorkspaceManagerTemplate(io.roboscale.dev.v1alpha1.devspacespec.WorkspaceManagerTemplate workspaceManagerTemplate) {
        this.workspaceManagerTemplate = workspaceManagerTemplate;
    }
}

