package tech.stackable.authentication.v1alpha1.authenticationclassspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ldap","oidc","static","tls"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Provider implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The [LDAP provider](https://docs.stackable.tech/home/nightly/concepts/authentication#_ldap). There is also the ["Authentication with LDAP" tutorial](https://docs.stackable.tech/home/nightly/tutorials/authentication_with_openldap) where you can learn to configure Superset and Trino with OpenLDAP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ldap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [LDAP provider](https://docs.stackable.tech/home/nightly/concepts/authentication#_ldap). There is also the [\"Authentication with LDAP\" tutorial](https://docs.stackable.tech/home/nightly/tutorials/authentication_with_openldap) where you can learn to configure Superset and Trino with OpenLDAP.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Ldap ldap;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Ldap getLdap() {
        return ldap;
    }

    public void setLdap(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Ldap ldap) {
        this.ldap = ldap;
    }

    /**
     * The OIDC provider can be used to configure OpenID Connect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oidc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The OIDC provider can be used to configure OpenID Connect.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Oidc oidc;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Oidc getOidc() {
        return oidc;
    }

    public void setOidc(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Oidc oidc) {
        this.oidc = oidc;
    }

    /**
     * The [static provider](https://https://docs.stackable.tech/home/nightly/concepts/authentication#_static) is used to configure a static set of users, identified by username and password.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("static")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [static provider](https://https://docs.stackable.tech/home/nightly/concepts/authentication#_static) is used to configure a static set of users, identified by username and password.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Static _static;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Static get_static() {
        return _static;
    }

    public void set_static(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Static _static) {
        this._static = _static;
    }

    /**
     * The [TLS provider](https://docs.stackable.tech/home/nightly/concepts/authentication#_tls). The TLS AuthenticationClass is used when users should authenticate themselves with a TLS certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [TLS provider](https://docs.stackable.tech/home/nightly/concepts/authentication#_tls). The TLS AuthenticationClass is used when users should authenticate themselves with a TLS certificate.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Tls tls;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Tls getTls() {
        return tls;
    }

    public void setTls(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.Tls tls) {
        this.tls = tls;
    }
}

