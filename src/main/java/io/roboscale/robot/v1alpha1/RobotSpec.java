package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"buildManagerTemplate","development","discoveryServerTemplate","distributions","launchManagerTemplates","rmwImplementation","robotDevSuiteTemplate","rootDNSConfig","rosBridgeTemplate","storage","tlsSecretRef","workspaceManagerTemplate"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RobotSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * [*alpha*] Build manager template for initial configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildManagerTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Build manager template for initial configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.BuildManagerTemplate buildManagerTemplate;

    public io.roboscale.robot.v1alpha1.robotspec.BuildManagerTemplate getBuildManagerTemplate() {
        return buildManagerTemplate;
    }

    public void setBuildManagerTemplate(io.roboscale.robot.v1alpha1.robotspec.BuildManagerTemplate buildManagerTemplate) {
        this.buildManagerTemplate = buildManagerTemplate;
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
     * Discovery server configurational parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryServerTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Discovery server configurational parameters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.DiscoveryServerTemplate discoveryServerTemplate;

    public io.roboscale.robot.v1alpha1.robotspec.DiscoveryServerTemplate getDiscoveryServerTemplate() {
        return discoveryServerTemplate;
    }

    public void setDiscoveryServerTemplate(io.roboscale.robot.v1alpha1.robotspec.DiscoveryServerTemplate discoveryServerTemplate) {
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
    @io.fabric8.generator.annotation.Required()
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
     * [*alpha*] Launch manager template for initial configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("launchManagerTemplates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Launch manager template for initial configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotspec.LaunchManagerTemplates> launchManagerTemplates;

    public java.util.List<io.roboscale.robot.v1alpha1.robotspec.LaunchManagerTemplates> getLaunchManagerTemplates() {
        return launchManagerTemplates;
    }

    public void setLaunchManagerTemplates(java.util.List<io.roboscale.robot.v1alpha1.robotspec.LaunchManagerTemplates> launchManagerTemplates) {
        this.launchManagerTemplates = launchManagerTemplates;
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
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RMW implementation selection. Robot operator currently supports only FastRTPS. See https://docs.ros.org/en/foxy/How-To-Guides/Working-with-multiple-RMW-implementations.html.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private RmwImplementation rmwImplementation = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"rmw_fastrtps_cpp\"", RmwImplementation.class);

    public RmwImplementation getRmwImplementation() {
        return rmwImplementation;
    }

    public void setRmwImplementation(RmwImplementation rmwImplementation) {
        this.rmwImplementation = rmwImplementation;
    }

    /**
     * Robot development suite template
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robotDevSuiteTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Robot development suite template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.RobotDevSuiteTemplate robotDevSuiteTemplate;

    public io.roboscale.robot.v1alpha1.robotspec.RobotDevSuiteTemplate getRobotDevSuiteTemplate() {
        return robotDevSuiteTemplate;
    }

    public void setRobotDevSuiteTemplate(io.roboscale.robot.v1alpha1.robotspec.RobotDevSuiteTemplate robotDevSuiteTemplate) {
        this.robotDevSuiteTemplate = robotDevSuiteTemplate;
    }

    /**
     * [*alpha*] Root DNS configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootDNSConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Root DNS configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.RootDNSConfig rootDNSConfig;

    public io.roboscale.robot.v1alpha1.robotspec.RootDNSConfig getRootDNSConfig() {
        return rootDNSConfig;
    }

    public void setRootDNSConfig(io.roboscale.robot.v1alpha1.robotspec.RootDNSConfig rootDNSConfig) {
        this.rootDNSConfig = rootDNSConfig;
    }

    /**
     * ROS bridge configurational parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rosBridgeTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS bridge configurational parameters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.RosBridgeTemplate rosBridgeTemplate;

    public io.roboscale.robot.v1alpha1.robotspec.RosBridgeTemplate getRosBridgeTemplate() {
        return rosBridgeTemplate;
    }

    public void setRosBridgeTemplate(io.roboscale.robot.v1alpha1.robotspec.RosBridgeTemplate rosBridgeTemplate) {
        this.rosBridgeTemplate = rosBridgeTemplate;
    }

    /**
     * Total storage amount to persist via Robot. Unit of measurement is MB. (eg. `10240` corresponds 10 GB) This amount is being shared between different components.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Total storage amount to persist via Robot. Unit of measurement is MB. (eg. `10240` corresponds 10 GB) This amount is being shared between different components.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.Storage storage;

    public io.roboscale.robot.v1alpha1.robotspec.Storage getStorage() {
        return storage;
    }

    public void setStorage(io.roboscale.robot.v1alpha1.robotspec.Storage storage) {
        this.storage = storage;
    }

    /**
     * [*alpha*] TLS secret reference.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] TLS secret reference.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.TlsSecretRef tlsSecretRef;

    public io.roboscale.robot.v1alpha1.robotspec.TlsSecretRef getTlsSecretRef() {
        return tlsSecretRef;
    }

    public void setTlsSecretRef(io.roboscale.robot.v1alpha1.robotspec.TlsSecretRef tlsSecretRef) {
        this.tlsSecretRef = tlsSecretRef;
    }

    /**
     * Workspace manager template to configure ROS 2 workspaces.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceManagerTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Workspace manager template to configure ROS 2 workspaces.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.WorkspaceManagerTemplate workspaceManagerTemplate;

    public io.roboscale.robot.v1alpha1.robotspec.WorkspaceManagerTemplate getWorkspaceManagerTemplate() {
        return workspaceManagerTemplate;
    }

    public void setWorkspaceManagerTemplate(io.roboscale.robot.v1alpha1.robotspec.WorkspaceManagerTemplate workspaceManagerTemplate) {
        this.workspaceManagerTemplate = workspaceManagerTemplate;
    }
}

