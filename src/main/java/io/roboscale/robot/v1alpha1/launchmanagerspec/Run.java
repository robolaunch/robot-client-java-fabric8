package io.roboscale.robot.v1alpha1.launchmanagerspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"env","executable","namespacing","package","parameters","prelaunch","privileged","resources","selector","workspace"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Run implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Additional environment variables to set when launching ROS nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional environment variables to set when launching ROS nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.launchmanagerspec.run.Env> env;

    public java.util.List<io.roboscale.robot.v1alpha1.launchmanagerspec.run.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.roboscale.robot.v1alpha1.launchmanagerspec.run.Env> env) {
        this.env = env;
    }

    /**
     * Executable name in `ros2 run <package> <executable>`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executable")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Executable name in `ros2 run <package> <executable>`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String executable;

    public String getExecutable() {
        return executable;
    }

    public void setExecutable(String executable) {
        this.executable = executable;
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
     * Package name in `ros2 run <package> <executable>`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("package")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Package name in `ros2 run <package> <executable>`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String _package;

    public String get_package() {
        return _package;
    }

    public void set_package(String _package) {
        this._package = _package;
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
    private io.roboscale.robot.v1alpha1.launchmanagerspec.run.Prelaunch prelaunch;

    public io.roboscale.robot.v1alpha1.launchmanagerspec.run.Prelaunch getPrelaunch() {
        return prelaunch;
    }

    public void setPrelaunch(io.roboscale.robot.v1alpha1.launchmanagerspec.run.Prelaunch prelaunch) {
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
     * Launch container resource limits.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch container resource limits.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerspec.run.Resources resources;

    public io.roboscale.robot.v1alpha1.launchmanagerspec.run.Resources getResources() {
        return resources;
    }

    public void setResources(io.roboscale.robot.v1alpha1.launchmanagerspec.run.Resources resources) {
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

