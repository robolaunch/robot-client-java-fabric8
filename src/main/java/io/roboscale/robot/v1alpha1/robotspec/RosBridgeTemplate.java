package io.roboscale.robot.v1alpha1.robotspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"image","ros","ros2"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RosBridgeTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Image contains ROS/2 bridge packages.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image contains ROS/2 bridge packages.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Configurational parameters for ROS bridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ros")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters for ROS bridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.rosbridgetemplate.Ros ros;

    public io.roboscale.robot.v1alpha1.robotspec.rosbridgetemplate.Ros getRos() {
        return ros;
    }

    public void setRos(io.roboscale.robot.v1alpha1.robotspec.rosbridgetemplate.Ros ros) {
        this.ros = ros;
    }

    /**
     * Configurational parameters for ROS 2 bridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ros2")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters for ROS 2 bridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.rosbridgetemplate.Ros2 ros2;

    public io.roboscale.robot.v1alpha1.robotspec.rosbridgetemplate.Ros2 getRos2() {
        return ros2;
    }

    public void setRos2(io.roboscale.robot.v1alpha1.robotspec.rosbridgetemplate.Ros2 ros2) {
        this.ros2 = ros2;
    }
}

