package tech.stackable.authentication.v1alpha1.authenticationclassspec.provider;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"bindCredentials","hostname","ldapFieldNames","port","searchBase","searchFilter","tls"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Ldap implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * In case you need a special account for searching the LDAP server you can specify it here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bindCredentials")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("In case you need a special account for searching the LDAP server you can specify it here.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.BindCredentials bindCredentials;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.BindCredentials getBindCredentials() {
        return bindCredentials;
    }

    public void setBindCredentials(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.BindCredentials bindCredentials) {
        this.bindCredentials = bindCredentials;
    }

    /**
     * Hostname of the LDAP server, for example: `my.ldap.server`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hostname of the LDAP server, for example: `my.ldap.server`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * The name of the LDAP object fields.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ldapFieldNames")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the LDAP object fields.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.LdapFieldNames ldapFieldNames = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"uid\":\"uid\",\"group\":\"memberof\",\"givenName\":\"givenName\",\"surname\":\"sn\",\"email\":\"mail\"}", tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.LdapFieldNames.class);

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.LdapFieldNames getLdapFieldNames() {
        return ldapFieldNames;
    }

    public void setLdapFieldNames(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.LdapFieldNames ldapFieldNames) {
        this.ldapFieldNames = ldapFieldNames;
    }

    /**
     * Port of the LDAP server. If TLS is used defaults to 636 otherwise to 389.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port of the LDAP server. If TLS is used defaults to 636 otherwise to 389.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long port;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * LDAP search base, for example: `ou=users,dc=example,dc=org`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchBase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LDAP search base, for example: `ou=users,dc=example,dc=org`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String searchBase = "";

    public String getSearchBase() {
        return searchBase;
    }

    public void setSearchBase(String searchBase) {
        this.searchBase = searchBase;
    }

    /**
     * LDAP query to filter users, for example: `(memberOf=cn=myTeam,ou=teams,dc=example,dc=org)`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchFilter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LDAP query to filter users, for example: `(memberOf=cn=myTeam,ou=teams,dc=example,dc=org)`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String searchFilter = "";

    public String getSearchFilter() {
        return searchFilter;
    }

    public void setSearchFilter(String searchFilter) {
        this.searchFilter = searchFilter;
    }

    /**
     * Use a TLS connection. If not specified no TLS will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use a TLS connection. If not specified no TLS will be used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.Tls tls;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.Tls getTls() {
        return tls;
    }

    public void setTls(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.Tls tls) {
        this.tls = tls;
    }
}

