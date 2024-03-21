package io.roboscale.robot.v1alpha2;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha2" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("robot.roboscale.io")
@io.fabric8.kubernetes.model.annotation.Singular("codeeditor")
@io.fabric8.kubernetes.model.annotation.Plural("codeeditors")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CodeEditor extends io.fabric8.kubernetes.client.CustomResource<io.roboscale.robot.v1alpha2.CodeEditorSpec, io.roboscale.robot.v1alpha2.CodeEditorStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

