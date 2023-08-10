package io.roboscale.robot.v1alpha1.robotspec.robot.rosbridgetemplate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"distro","enabled"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Ros2 implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * ROS distribution for bridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distro")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS distribution for bridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Distro distro;

    public Distro getDistro() {
        return distro;
    }

    public void setDistro(Distro distro) {
        this.distro = distro;
    }

    /**
     * If `true`, resources and workloads are created by ROSBridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, resources and workloads are created by ROSBridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}

