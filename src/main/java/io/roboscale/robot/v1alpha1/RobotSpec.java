package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additionalConfigs","environment","robot","robotDevSuiteTemplate","rootDNSConfig","storage","tlsSecretRef","type","workspaceManagerTemplate"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RobotSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Key value pairs that operator uses to extend configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalConfigs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Key value pairs that operator uses to extend configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.robotspec.AdditionalConfigs> additionalConfigs;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.robotspec.AdditionalConfigs> getAdditionalConfigs() {
        return additionalConfigs;
    }

    public void setAdditionalConfigs(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.robotspec.AdditionalConfigs> additionalConfigs) {
        this.additionalConfigs = additionalConfigs;
    }

    /**
     * Holds environment's configuration. Applied if `.spec.type` is `Environment` and must be `nil` otherwise.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Holds environment's configuration. Applied if `.spec.type` is `Environment` and must be `nil` otherwise.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.Environment environment;

    public io.roboscale.robot.v1alpha1.robotspec.Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(io.roboscale.robot.v1alpha1.robotspec.Environment environment) {
        this.environment = environment;
    }

    /**
     * Holds robot's configuration. Applied if `.spec.type` is `Robot` and must be `nil` otherwise.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robot")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Holds robot's configuration. Applied if `.spec.type` is `Robot` and must be `nil` otherwise.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.Robot robot;

    public io.roboscale.robot.v1alpha1.robotspec.Robot getRobot() {
        return robot;
    }

    public void setRobot(io.roboscale.robot.v1alpha1.robotspec.Robot robot) {
        this.robot = robot;
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
     * Determines the object type. If "Environment", operator will provision an environment according to the specifications. (`.spec.environment`) If "Robot", operator will provision an environment specialized for ROS 2 according to the specifications. (`.spec.robot`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Determines the object type. If \"Environment\", operator will provision an environment according to the specifications. (`.spec.environment`) If \"Robot\", operator will provision an environment specialized for ROS 2 according to the specifications. (`.spec.robot`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

