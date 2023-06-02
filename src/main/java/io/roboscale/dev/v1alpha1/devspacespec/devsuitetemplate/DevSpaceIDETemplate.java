package io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"display","ingress","privileged","resources","serviceType"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DevSpaceIDETemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Cloud IDE connects an X11 socket if it's set to `true` and a target DevSpaceVDI resource is set in labels with key `robolaunch.io/target-vdi`. Applications that requires GUI can be executed such as rViz.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cloud IDE connects an X11 socket if it's set to `true` and a target DevSpaceVDI resource is set in labels with key `robolaunch.io/target-vdi`. Applications that requires GUI can be executed such as rViz.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean display;

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    /**
     * [*alpha*] DevSpaceIDE will create an Ingress resource if `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] DevSpaceIDE will create an Ingress resource if `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ingress;

    public Boolean getIngress() {
        return ingress;
    }

    public void setIngress(Boolean ingress) {
        this.ingress = ingress;
    }

    /**
     * If `true`, containers of DevSpaceIDE will be privileged containers. It can be used in physical instances where it's necessary to access I/O devices on the host machine. Not recommended to activate this field on cloud instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privileged")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, containers of DevSpaceIDE will be privileged containers. It can be used in physical instances where it's necessary to access I/O devices on the host machine. Not recommended to activate this field on cloud instances.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean privileged;

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * Resource limitations of Cloud IDE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resource limitations of Cloud IDE.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate.devspaceidetemplate.Resources resources;

    public io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate.devspaceidetemplate.Resources getResources() {
        return resources;
    }

    public void setResources(io.roboscale.dev.v1alpha1.devspacespec.devsuitetemplate.devspaceidetemplate.Resources resources) {
        this.resources = resources;
    }

    public enum ServiceType {

        @com.fasterxml.jackson.annotation.JsonProperty("ClusterIP")
        CLUSTERIP("ClusterIP"), @com.fasterxml.jackson.annotation.JsonProperty("NodePort")
        NODEPORT("NodePort");

        java.lang.String value;

        ServiceType(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Service type of Cloud IDE. `ClusterIP` and `NodePort` is supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service type of Cloud IDE. `ClusterIP` and `NodePort` is supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ServiceType serviceType = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"NodePort\"", ServiceType.class);

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}

