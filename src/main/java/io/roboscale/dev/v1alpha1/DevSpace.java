package io.roboscale.dev.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("dev.roboscale.io")
@io.fabric8.kubernetes.model.annotation.Singular("devspace")
@io.fabric8.kubernetes.model.annotation.Plural("devspaces")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DevSpace extends io.fabric8.kubernetes.client.CustomResource<io.roboscale.dev.v1alpha1.DevSpaceSpec, io.roboscale.dev.v1alpha1.DevSpaceStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

