package io.roboscale.robot.v1alpha2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"container","externalVolumes","ingress","port","remote","serviceType","tlsSecretName","version","volumeClaimTemplates"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CodeEditorSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configurational parameters for code editor container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("container")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters for code editor container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.Container container;

    public io.roboscale.robot.v1alpha2.codeeditorspec.Container getContainer() {
        return container;
    }

    public void setContainer(io.roboscale.robot.v1alpha2.codeeditorspec.Container container) {
        this.container = container;
    }

    /**
     * External volumes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalVolumes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("External volumes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.codeeditorspec.ExternalVolumes> externalVolumes;

    public java.util.List<io.roboscale.robot.v1alpha2.codeeditorspec.ExternalVolumes> getExternalVolumes() {
        return externalVolumes;
    }

    public void setExternalVolumes(java.util.List<io.roboscale.robot.v1alpha2.codeeditorspec.ExternalVolumes> externalVolumes) {
        this.externalVolumes = externalVolumes;
    }

    /**
     * CodeEditor will create an Ingress resource if `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CodeEditor will create an Ingress resource if `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ingress;

    public Boolean getIngress() {
        return ingress;
    }

    public void setIngress(Boolean ingress) {
        this.ingress = ingress;
    }

    /**
     * Port that code editor will use inside the container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port that code editor will use inside the container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer port = 9000;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * If `true`, code editor will be consumed remotely.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remote")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, code editor will be consumed remotely.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean remote;

    public Boolean getRemote() {
        return remote;
    }

    public void setRemote(Boolean remote) {
        this.remote = remote;
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
     * Service type of CodeEditor. `ClusterIP` and `NodePort` is supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service type of CodeEditor. `ClusterIP` and `NodePort` is supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ServiceType serviceType = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"ClusterIP\"", ServiceType.class);

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * Name of the TLS secret for ingress resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecretName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the TLS secret for ingress resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsSecretName;

    public String getTlsSecretName() {
        return tlsSecretName;
    }

    public void setTlsSecretName(String tlsSecretName) {
        this.tlsSecretName = tlsSecretName;
    }

    /**
     * App version of the code editor.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("App version of the code editor.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version = "4.22.0";

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Volume templates for ROS 2 workload.
     * For each volume template, operator will create a PersistentVolumeClaim
     * that can be mounted to the ROS 2 workload.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeClaimTemplates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Volume templates for ROS 2 workload.\nFor each volume template, operator will create a PersistentVolumeClaim\nthat can be mounted to the ROS 2 workload.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.codeeditorspec.VolumeClaimTemplates> volumeClaimTemplates;

    public java.util.List<io.roboscale.robot.v1alpha2.codeeditorspec.VolumeClaimTemplates> getVolumeClaimTemplates() {
        return volumeClaimTemplates;
    }

    public void setVolumeClaimTemplates(java.util.List<io.roboscale.robot.v1alpha2.codeeditorspec.VolumeClaimTemplates> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
    }
}

