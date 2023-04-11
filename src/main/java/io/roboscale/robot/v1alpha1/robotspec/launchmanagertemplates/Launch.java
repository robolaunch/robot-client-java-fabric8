package io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"env","launchFilePath","namespacing","parameters","prelaunch","privileged","repository","resources","selector","workspace"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Launch implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Additional environment variables to set when launching ROS nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional environment variables to set when launching ROS nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.Env> env;

    public java.util.List<io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.Env> env) {
        this.env = env;
    }

    /**
     * Path to launchfile in repository. (eg. `linorobot/linorobot_gazebo/launch.py`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("launchFilePath")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path to launchfile in repository. (eg. `linorobot/linorobot_gazebo/launch.py`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String launchFilePath;

    public String getLaunchFilePath() {
        return launchFilePath;
    }

    public void setLaunchFilePath(String launchFilePath) {
        this.launchFilePath = launchFilePath;
    }

    /**
     * Name of the repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespacing")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the repository.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean namespacing;

    public Boolean getNamespacing() {
        return namespacing;
    }

    public void setNamespacing(Boolean namespacing) {
        this.namespacing = namespacing;
    }

    /**
     * Launch parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch parameters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> parameters;

    public java.util.Map<java.lang.String, String> getParameters() {
        return parameters;
    }

    public void setParameters(java.util.Map<java.lang.String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Command or script to run just before node's execution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prelaunch")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Command or script to run just before node's execution.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.Prelaunch prelaunch;

    public io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.Prelaunch getPrelaunch() {
        return prelaunch;
    }

    public void setPrelaunch(io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.Prelaunch prelaunch) {
        this.prelaunch = prelaunch;
    }

    /**
     * Launch container privilege.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privileged")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch container privilege.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean privileged;

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * Name of the repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repository")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the repository.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repository;

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * Launch container resource limits.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch container resource limits.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.Resources resources;

    public io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.Resources getResources() {
        return resources;
    }

    public void setResources(io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.Resources resources) {
        this.resources = resources;
    }

    /**
     * Cluster selector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cluster selector.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> selector;

    public java.util.Map<java.lang.String, String> getSelector() {
        return selector;
    }

    public void setSelector(java.util.Map<java.lang.String, String> selector) {
        this.selector = selector;
    }

    /**
     * Name of the workspace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspace")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the workspace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String workspace;

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }
}

