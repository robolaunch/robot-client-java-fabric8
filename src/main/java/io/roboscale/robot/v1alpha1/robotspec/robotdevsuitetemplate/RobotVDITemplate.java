package io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"disableNvenc","ingress","nat1to1","privileged","resolution","resources","serviceType","webrtcPortRange"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RobotVDITemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If true, VDI uses plain h264 instead of nvh264enc.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableNvenc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If true, VDI uses plain h264 instead of nvh264enc.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disableNvenc;

    public Boolean getDisableNvenc() {
        return disableNvenc;
    }

    public void setDisableNvenc(Boolean disableNvenc) {
        this.disableNvenc = disableNvenc;
    }

    /**
     * [*alpha*] RobotIDE will create an Ingress resource if `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] RobotIDE will create an Ingress resource if `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ingress;

    public Boolean getIngress() {
        return ingress;
    }

    public void setIngress(Boolean ingress) {
        this.ingress = ingress;
    }

    /**
     * NAT1TO1 option for Cloud VDI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nat1to1")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NAT1TO1 option for Cloud VDI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nat1to1;

    public String getNat1to1() {
        return nat1to1;
    }

    public void setNat1to1(String nat1to1) {
        this.nat1to1 = nat1to1;
    }

    /**
     * If `true`, containers of RobotIDE will be privileged containers.
     * It can be used in physical instances where it's necessary to access
     * I/O devices on the host machine.
     * Not recommended to activate this field on cloud instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privileged")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, containers of RobotIDE will be privileged containers.\nIt can be used in physical instances where it's necessary to access\nI/O devices on the host machine.\nNot recommended to activate this field on cloud instances.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean privileged;

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public enum Resolution {

        @com.fasterxml.jackson.annotation.JsonProperty("2048x1152")
        _2048X1152("2048x1152"), @com.fasterxml.jackson.annotation.JsonProperty("1920x1080")
        _1920X1080("1920x1080"), @com.fasterxml.jackson.annotation.JsonProperty("1600x1200")
        _1600X1200("1600x1200");

        java.lang.String value;

        Resolution(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * VDI screen resolution options. Default is `2048x1152`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VDI screen resolution options. Default is `2048x1152`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Resolution resolution = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"2048x1152\"", Resolution.class);

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    /**
     * Resource limitations of Cloud IDE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resource limitations of Cloud IDE.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.robotvditemplate.Resources resources;

    public io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.robotvditemplate.Resources getResources() {
        return resources;
    }

    public void setResources(io.roboscale.robot.v1alpha1.robotspec.robotdevsuitetemplate.robotvditemplate.Resources resources) {
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

    /**
     * UDP port range to used in WebRTC connections.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("webrtcPortRange")
    @io.fabric8.generator.annotation.Pattern("^([0-9])+-([0-9])+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UDP port range to used in WebRTC connections.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String webrtcPortRange;

    public String getWebrtcPortRange() {
        return webrtcPortRange;
    }

    public void setWebrtcPortRange(String webrtcPortRange) {
        this.webrtcPortRange = webrtcPortRange;
    }
}

