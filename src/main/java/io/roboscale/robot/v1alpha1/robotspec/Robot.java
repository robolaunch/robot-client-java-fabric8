package io.roboscale.robot.v1alpha1.robotspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"discoveryServerTemplate","distributions","domainID","rmwImplementation","rosBridgeTemplate"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Robot implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Discovery server configurational parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryServerTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Discovery server configurational parameters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robot.DiscoveryServerTemplate discoveryServerTemplate;

    public io.roboscale.robot.v1alpha1.robotspec.robot.DiscoveryServerTemplate getDiscoveryServerTemplate() {
        return discoveryServerTemplate;
    }

    public void setDiscoveryServerTemplate(io.roboscale.robot.v1alpha1.robotspec.robot.DiscoveryServerTemplate discoveryServerTemplate) {
        this.discoveryServerTemplate = discoveryServerTemplate;
    }

    public enum Distributions {

        @com.fasterxml.jackson.annotation.JsonProperty("foxy")
        FOXY("foxy"), @com.fasterxml.jackson.annotation.JsonProperty("galactic")
        GALACTIC("galactic"), @com.fasterxml.jackson.annotation.JsonProperty("humble")
        HUMBLE("humble");

        java.lang.String value;

        Distributions(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * ROS 2 distributions to be used. You can select multiple distributions if they are supported in the same underlying OS. (eg. `foxy` and `galactic` are supported in Ubuntu Focal, so they can be used together but both cannot be used with `humble`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distributions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS 2 distributions to be used. You can select multiple distributions if they are supported in the same underlying OS. (eg. `foxy` and `galactic` are supported in Ubuntu Focal, so they can be used together but both cannot be used with `humble`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<Distributions> distributions;

    public java.util.List<Distributions> getDistributions() {
        return distributions;
    }

    public void setDistributions(java.util.List<Distributions> distributions) {
        this.distributions = distributions;
    }

    /**
     * ROS domain ID for robot. See https://docs.ros.org/en/foxy/Concepts/About-Domain-ID.html.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domainID")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Max(101.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS domain ID for robot. See https://docs.ros.org/en/foxy/Concepts/About-Domain-ID.html.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long domainID;

    public Long getDomainID() {
        return domainID;
    }

    public void setDomainID(Long domainID) {
        this.domainID = domainID;
    }

    public enum RmwImplementation {

        @com.fasterxml.jackson.annotation.JsonProperty("rmw_fastrtps_cpp")
        RMW_FASTRTPS_CPP("rmw_fastrtps_cpp");

        java.lang.String value;

        RmwImplementation(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * RMW implementation selection. Robot operator currently supports only FastRTPS. See https://docs.ros.org/en/foxy/How-To-Guides/Working-with-multiple-RMW-implementations.html.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rmwImplementation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RMW implementation selection. Robot operator currently supports only FastRTPS. See https://docs.ros.org/en/foxy/How-To-Guides/Working-with-multiple-RMW-implementations.html.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private RmwImplementation rmwImplementation;

    public RmwImplementation getRmwImplementation() {
        return rmwImplementation;
    }

    public void setRmwImplementation(RmwImplementation rmwImplementation) {
        this.rmwImplementation = rmwImplementation;
    }

    /**
     * ROS bridge configurational parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rosBridgeTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS bridge configurational parameters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.robot.RosBridgeTemplate rosBridgeTemplate;

    public io.roboscale.robot.v1alpha1.robotspec.robot.RosBridgeTemplate getRosBridgeTemplate() {
        return rosBridgeTemplate;
    }

    public void setRosBridgeTemplate(io.roboscale.robot.v1alpha1.robotspec.robot.RosBridgeTemplate rosBridgeTemplate) {
        this.rosBridgeTemplate = rosBridgeTemplate;
    }
}

