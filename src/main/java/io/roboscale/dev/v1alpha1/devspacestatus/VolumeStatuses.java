package io.roboscale.dev.v1alpha1.devspacestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"etcDir","optDir","usrDir","varDir","workspaceDir"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class VolumeStatuses implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Holds PVC status of the `/etc` directory of underlying OS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("etcDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Holds PVC status of the `/etc` directory of underlying OS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.EtcDir etcDir;

    public io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.EtcDir getEtcDir() {
        return etcDir;
    }

    public void setEtcDir(io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.EtcDir etcDir) {
        this.etcDir = etcDir;
    }

    /**
     * Holds PVC status of the `/opt` directory of underlying OS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("optDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Holds PVC status of the `/opt` directory of underlying OS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.OptDir optDir;

    public io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.OptDir getOptDir() {
        return optDir;
    }

    public void setOptDir(io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.OptDir optDir) {
        this.optDir = optDir;
    }

    /**
     * Holds PVC status of the `/usr` directory of underlying OS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usrDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Holds PVC status of the `/usr` directory of underlying OS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.UsrDir usrDir;

    public io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.UsrDir getUsrDir() {
        return usrDir;
    }

    public void setUsrDir(io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.UsrDir usrDir) {
        this.usrDir = usrDir;
    }

    /**
     * Holds PVC status of the `/var` directory of underlying OS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("varDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Holds PVC status of the `/var` directory of underlying OS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.VarDir varDir;

    public io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.VarDir getVarDir() {
        return varDir;
    }

    public void setVarDir(io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.VarDir varDir) {
        this.varDir = varDir;
    }

    /**
     * Holds PVC status of the workspaces directory of underlying OS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Holds PVC status of the workspaces directory of underlying OS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.WorkspaceDir workspaceDir;

    public io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.WorkspaceDir getWorkspaceDir() {
        return workspaceDir;
    }

    public void setWorkspaceDir(io.roboscale.dev.v1alpha1.devspacestatus.volumestatuses.WorkspaceDir workspaceDir) {
        this.workspaceDir = workspaceDir;
    }
}

