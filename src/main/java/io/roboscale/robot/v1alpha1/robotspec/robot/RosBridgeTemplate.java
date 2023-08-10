package io.roboscale.robot.v1alpha1.robotspec.robot;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ingress","ros","ros2","serviceType"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RosBridgeTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * [*alpha*] ROSBridge will create an Ingress resource if `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] ROSBridge will create an Ingress resource if `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ingress;

    public Boolean getIngress() {
        return ingress;
    }

    public void setIngress(Boolean ingress) {
        this.ingress = ingress;
    }

    /**
     * Configurational parameters for ROS bridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ros")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters for ROS bridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robot.rosbridgetemplate.Ros ros;

    public io.roboscale.robot.v1alpha1.robotspec.robot.rosbridgetemplate.Ros getRos() {
        return ros;
    }

    public void setRos(io.roboscale.robot.v1alpha1.robotspec.robot.rosbridgetemplate.Ros ros) {
        this.ros = ros;
    }

    /**
     * Configurational parameters for ROS 2 bridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ros2")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters for ROS 2 bridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robot.rosbridgetemplate.Ros2 ros2;

    public io.roboscale.robot.v1alpha1.robotspec.robot.rosbridgetemplate.Ros2 getRos2() {
        return ros2;
    }

    public void setRos2(io.roboscale.robot.v1alpha1.robotspec.robot.rosbridgetemplate.Ros2 ros2) {
        this.ros2 = ros2;
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
     * Service type of ROSBridge. `ClusterIP` and `NodePort` is supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service type of ROSBridge. `ClusterIP` and `NodePort` is supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ServiceType serviceType;

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}

