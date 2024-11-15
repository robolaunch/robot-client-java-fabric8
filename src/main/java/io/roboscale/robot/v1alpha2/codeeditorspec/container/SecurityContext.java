package io.roboscale.robot.v1alpha2.codeeditorspec.container;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allowPrivilegeEscalation","capabilities","privileged","procMount","readOnlyRootFilesystem","runAsGroup","runAsNonRoot","runAsUser","seLinuxOptions","seccompProfile","windowsOptions"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SecurityContext implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more
     * privileges than its parent process. This bool directly controls if
     * the no_new_privs flag will be set on the container process.
     * AllowPrivilegeEscalation is true always when the container is:
     * 1) run as Privileged
     * 2) has CAP_SYS_ADMIN
     * Note that this field cannot be set when spec.os.name is windows.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowPrivilegeEscalation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AllowPrivilegeEscalation controls whether a process can gain more\nprivileges than its parent process. This bool directly controls if\nthe no_new_privs flag will be set on the container process.\nAllowPrivilegeEscalation is true always when the container is:\n1) run as Privileged\n2) has CAP_SYS_ADMIN\nNote that this field cannot be set when spec.os.name is windows.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean allowPrivilegeEscalation;

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    /**
     * The capabilities to add/drop when running containers.
     * Defaults to the default set of capabilities granted by the container runtime.
     * Note that this field cannot be set when spec.os.name is windows.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The capabilities to add/drop when running containers.\nDefaults to the default set of capabilities granted by the container runtime.\nNote that this field cannot be set when spec.os.name is windows.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.Capabilities capabilities;

    public io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Run container in privileged mode.
     * Processes in privileged containers are essentially equivalent to root on the host.
     * Defaults to false.
     * Note that this field cannot be set when spec.os.name is windows.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privileged")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Run container in privileged mode.\nProcesses in privileged containers are essentially equivalent to root on the host.\nDefaults to false.\nNote that this field cannot be set when spec.os.name is windows.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean privileged;

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * procMount denotes the type of proc mount to use for the containers.
     * The default is DefaultProcMount which uses the container runtime defaults for
     * readonly paths and masked paths.
     * This requires the ProcMountType feature flag to be enabled.
     * Note that this field cannot be set when spec.os.name is windows.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("procMount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("procMount denotes the type of proc mount to use for the containers.\nThe default is DefaultProcMount which uses the container runtime defaults for\nreadonly paths and masked paths.\nThis requires the ProcMountType feature flag to be enabled.\nNote that this field cannot be set when spec.os.name is windows.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String procMount;

    public String getProcMount() {
        return procMount;
    }

    public void setProcMount(String procMount) {
        this.procMount = procMount;
    }

    /**
     * Whether this container has a read-only root filesystem.
     * Default is false.
     * Note that this field cannot be set when spec.os.name is windows.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnlyRootFilesystem")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether this container has a read-only root filesystem.\nDefault is false.\nNote that this field cannot be set when spec.os.name is windows.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnlyRootFilesystem;

    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    /**
     * The GID to run the entrypoint of the container process.
     * Uses runtime default if unset.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsGroup")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The GID to run the entrypoint of the container process.\nUses runtime default if unset.\nMay also be set in PodSecurityContext.  If set in both SecurityContext and\nPodSecurityContext, the value specified in SecurityContext takes precedence.\nNote that this field cannot be set when spec.os.name is windows.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long runAsGroup;

    public Long getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(Long runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    /**
     * Indicates that the container must run as a non-root user.
     * If true, the Kubelet will validate the image at runtime to ensure that it
     * does not run as UID 0 (root) and fail to start the container if it does.
     * If unset or false, no such validation will be performed.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsNonRoot")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicates that the container must run as a non-root user.\nIf true, the Kubelet will validate the image at runtime to ensure that it\ndoes not run as UID 0 (root) and fail to start the container if it does.\nIf unset or false, no such validation will be performed.\nMay also be set in PodSecurityContext.  If set in both SecurityContext and\nPodSecurityContext, the value specified in SecurityContext takes precedence.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean runAsNonRoot;

    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    /**
     * The UID to run the entrypoint of the container process.
     * Defaults to user specified in image metadata if unspecified.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The UID to run the entrypoint of the container process.\nDefaults to user specified in image metadata if unspecified.\nMay also be set in PodSecurityContext.  If set in both SecurityContext and\nPodSecurityContext, the value specified in SecurityContext takes precedence.\nNote that this field cannot be set when spec.os.name is windows.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long runAsUser;

    public Long getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(Long runAsUser) {
        this.runAsUser = runAsUser;
    }

    /**
     * The SELinux context to be applied to the container.
     * If unspecified, the container runtime will allocate a random SELinux context for each
     * container.  May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("seLinuxOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The SELinux context to be applied to the container.\nIf unspecified, the container runtime will allocate a random SELinux context for each\ncontainer.  May also be set in PodSecurityContext.  If set in both SecurityContext and\nPodSecurityContext, the value specified in SecurityContext takes precedence.\nNote that this field cannot be set when spec.os.name is windows.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.SeLinuxOptions seLinuxOptions;

    public io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.SeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.SeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    /**
     * The seccomp options to use by this container. If seccomp options are
     * provided at both the pod & container level, the container options
     * override the pod options.
     * Note that this field cannot be set when spec.os.name is windows.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("seccompProfile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The seccomp options to use by this container. If seccomp options are\nprovided at both the pod & container level, the container options\noverride the pod options.\nNote that this field cannot be set when spec.os.name is windows.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.SeccompProfile seccompProfile;

    public io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.SeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    public void setSeccompProfile(io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.SeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    /**
     * The Windows specific settings applied to all containers.
     * If unspecified, the options from the PodSecurityContext will be used.
     * If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is linux.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("windowsOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Windows specific settings applied to all containers.\nIf unspecified, the options from the PodSecurityContext will be used.\nIf set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.\nNote that this field cannot be set when spec.os.name is linux.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.WindowsOptions windowsOptions;

    public io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.WindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(io.roboscale.robot.v1alpha2.codeeditorspec.container.securitycontext.WindowsOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
    }
}

