package io.roboscale.robot.v1alpha2.ros2workloadspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"discoveryServerRef","distro","ingress","serviceType","tlsSecretName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Ros2BridgeTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Object reference to DiscoveryServer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryServerRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Object reference to DiscoveryServer.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.ros2bridgetemplate.DiscoveryServerRef discoveryServerRef;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.ros2bridgetemplate.DiscoveryServerRef getDiscoveryServerRef() {
        return discoveryServerRef;
    }

    public void setDiscoveryServerRef(io.roboscale.robot.v1alpha2.ros2workloadspec.ros2bridgetemplate.DiscoveryServerRef discoveryServerRef) {
        this.discoveryServerRef = discoveryServerRef;
    }

    public enum Distro {

        @com.fasterxml.jackson.annotation.JsonProperty("foxy")
        FOXY("foxy"), @com.fasterxml.jackson.annotation.JsonProperty("galactic")
        GALACTIC("galactic"), @com.fasterxml.jackson.annotation.JsonProperty("humble")
        HUMBLE("humble");

        java.lang.String value;

        Distro(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Configurational parameters for ROS 2 bridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distro")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters for ROS 2 bridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Distro distro;

    public Distro getDistro() {
        return distro;
    }

    public void setDistro(Distro distro) {
        this.distro = distro;
    }

    /**
     * ROS2Bridge will create an Ingress resource if `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS2Bridge will create an Ingress resource if `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ingress;

    public Boolean getIngress() {
        return ingress;
    }

    public void setIngress(Boolean ingress) {
        this.ingress = ingress;
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
     * Service type of ROS2Bridge. `ClusterIP` and `NodePort` is supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service type of ROS2Bridge. `ClusterIP` and `NodePort` is supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ServiceType serviceType = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"ClusterIP\"", ServiceType.class);

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * Name of the TLS secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecretName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the TLS secret.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsSecretName;

    public String getTlsSecretName() {
        return tlsSecretName;
    }

    public void setTlsSecretName(String tlsSecretName) {
        this.tlsSecretName = tlsSecretName;
    }
}

